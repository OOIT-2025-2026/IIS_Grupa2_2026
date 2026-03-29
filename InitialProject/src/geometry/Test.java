package geometry;

public class Test {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		p.setSelected(true);
		
		System.out.println("Koordinata x: " + p.getX());
		System.out.println("Koordinata y: " + p.getY());
		System.out.println("Selected: " + p.isSelected());

	}

}
