package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{
	private Point center; //komponovanje nikako nasledjivanje
	private int radius;
	
	public Circle() {
	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected = selected;
	}
	
	public double area() { 
		return radius*radius*Math.PI;
	}
	public double circumference() { 
		return 2*radius*Math.PI;
	}
	
	public String toString() {
		//return "Center: " + center.toString() + ", radius = " + radius;
		return "Center: " + center + ", radius = " + radius;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocna = (Circle) obj;
			if (this.center.equals(pomocna.center) && this.radius == pomocna.radius)
				return true;
		} 
		return false;
	}
	
	public boolean contains(int x, int y) {
		Point sadrziTacku = new Point(x, y);
		return (this.center.distance(sadrziTacku) <= this.radius);
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX()-radius, center.getY()-radius,
				radius*2, radius*2);
		
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX() - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() + radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() - radius - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() + radius - 2, 4, 4);
			g.setColor(Color.black);
		}
		
	}
	
	// u Donut ne moramo override metode vec cemo koristiti iz Circle
	@Override
	public void moveTo(int x, int y) {
		center.moveTo(x, y);
	}

	@Override
	public void moveBy(int x, int y) {
		center.moveBy(x, y);
	}
	
	// moramo override i u Donut zbog poziva metode area
	@Override
	public int compareTo(Object o) {
		if (o instanceof Circle) {
			double povrsinaThis = this.area();
			double povrsinaParametar = ((Circle)o).area();
			return (int)(povrsinaThis-povrsinaParametar);
		}

		return 0;
	}
	
	//metode pristupa 
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) throws Exception {
		if(radius < 0) {
			Exception e = new Exception("Radius mora biti veci od 0");
			throw e;
		}
		
		this.radius = radius;
	}
}