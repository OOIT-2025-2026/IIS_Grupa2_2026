package geometry;

public class Circle {
	private Point center;
	private int radius;
	private boolean selected;
	
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
	public String toString() {
		return "Center: " + center + ", radius = " + radius;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle secondCircle = (Circle) obj;
			if (this.center.equals(secondCircle.center) && this.radius == secondCircle.radius)
				return true;
			else
				return false;
		} else
			return false;
	}

	// Povrsina kruga P=r*r*PI
	// Math.PI
	public double area() {
		return radius * radius * Math.PI;
	}

	// Obim kruga O=2*r*PI
	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
