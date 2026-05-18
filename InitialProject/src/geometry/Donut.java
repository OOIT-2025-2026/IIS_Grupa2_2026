package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Donut extends Circle{
	
	private int innerRadius;
	
	public Donut() {
		// u pozadini poziva
		super(); // default konstruktor nadredjene klase i mora biti prva naredba
		// a dalje za innerRadius setuje 0 kao default vrednost
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center,radius); // mora biti prva naredba
		this.innerRadius = innerRadius;
		
		// this.center moze ukoliko je center u Circle protected a ne private
		// this.setCenter(center); // ili putem get/set metoda
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		this.setSelected(selected);
		// super.setSelected(selected); - moze i ovo ali super ne vidi innerRadius
		
		// 2.nacin
		// this() i super() moraju biti prve naredbe i ne mozemo ih obe pozivati
		/*super(center, radius, selected);
		this.innerRadius = innerRadius;*/
	}
	
	public String toString() {
		//return toString(); rekurzija kao i this.toString()
		return super.toString() + ", innerRadius = " + innerRadius;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			Donut pomocna = (Donut) obj;
			if (super.equals(pomocna) && innerRadius == pomocna.innerRadius)
				return true;
		} 
		return false;
	}
	
	public boolean contains(int x, int y) {
		return (super.contains(x, y) && 
				getCenter().distance(new Point(x,y))> innerRadius);
	}
	
	public double area() { 
		double area = super.area() - innerRadius*innerRadius*Math.PI;
		return area;
	}
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof Donut) {
			double povrsinaThis = this.area();
			double povrsinaParametar = ((Donut)o).area();
			return (int)(povrsinaThis-povrsinaParametar);
		}

		return 0;
	}
	
	// obim sami override
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(getCenter().getX()-innerRadius, super.getCenter().getY()-innerRadius,
				innerRadius*2, innerRadius*2);
		
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() - innerRadius - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() + innerRadius - 2, getCenter().getY() - 2, 4, 4);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() - innerRadius - 2, 4, 4);
			g.drawRect(getCenter().getX() - 2, getCenter().getY() + innerRadius - 2, 4, 4);
			g.setColor(Color.black);
		}
		
	}

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	// ostali getters/setters odgovaraju as is

}
