package geometry;

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
	
	// obim sami override

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	// ostali getters/setters odgovaraju as is

}
