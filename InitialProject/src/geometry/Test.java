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

		Point p2 = new Point();
		p2.setX(50);
		p2.setY(45);
		double distance = p.distance(p2);

		// 1. Promeniti vrednost x koordinate tacke p
		// na vrednost y koordinate tacke p2
		System.out.println("Koordinata x tacke p: " + p.getX());
		System.out.println("Koordinata y tacke p2: " + p2.getY());
		p.setX(p2.getY());
		System.out.println("Koordinata x tacke p: " + p.getX());
		System.out.println("Koordinata y tacke p2: " + p2.getY());
		p2.setY(35);
		System.out.println("Koordinata x tacke p: " + p.getX());
		System.out.println("Koordinata y tacke p2: " + p2.getY());
		//prenos po vrednosti
		

		// 2. Postaviti za pocetnu tacku linije l1 tacku p, a
		// za krajnju tacku linije l1 tacku p2
		Line l1 = new Line(); // po defaultu startPoint/endPoint su null 
		l1.setStartPoint(p);
		l1.setEndPoint(p2);
		// prenos po referenci - promena startPointa utice na promenu p i obrnuto

		// 3. Postaviti y koordinatu krajnje tacke l1 na 23
		l1.getEndPoint().setY(23);
		System.out.println(l1.getEndPoint().getY());
		// da nismo stavili l1.setEndPoint(p2) javio bi se null pointer exception
		// jer su po defaultu startPoint/endPoint null 
		
		// 4. Promeniti vrednost x koordinate pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1
		l1.getStartPoint().setX(l1.getEndPoint().getY());

		// 5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1
		l1.getEndPoint().setX((int)(l1.lenght() - (l1.getStartPoint().getX() 
				+ l1.getStartPoint().getY())));
	}

}
