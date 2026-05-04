package geometry;

import java.awt.Graphics;

public class Point extends Shape{

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		// u pozadini super(); i on setuje selected na false
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		this(x, y);
		this.selected = selected;
	}

	public double distance(Point point2) {
		double a = point2.x - x;
		double b = point2.y - y;
		double c = Math.sqrt(a * a + b * b);
		return c;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point secondPoint = (Point) obj;
			if(this.x == secondPoint.x && this.y == secondPoint.y) {
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		if (this.distance(new Point(x, y)) <= 2)
			return true;
		return false;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y-2, x, y+2);
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


}
