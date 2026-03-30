package geometry;

public class Circle {
	private Point center;
	private int radius;
	private boolean selected;

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
