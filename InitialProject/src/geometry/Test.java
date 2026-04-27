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
		// prenos po vrednosti

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
		l1.getEndPoint().setX((int) (l1.lenght() - (l1.getStartPoint().getX() + l1.getStartPoint().getY())));

		// 6. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();

		r1.setUpperLeftPoint(p);
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setY(15);
		System.out.println("X of U.L.P of r1 = " + r1.getUpperLeftPoint().getX());
		System.out.println("Y of U.L.P of r1 = " + r1.getUpperLeftPoint().getY());

		// 7. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1

		c1.setCenter(r1.getUpperLeftPoint());
		System.out.println("X of center of c1 = " + c1.getCenter().getX());
		System.out.println("Y of center of c1 = " + c1.getCenter().getY());

		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1

		r1.setHeight(20);
		r1.setWidth(30);
		c1.getCenter().setX(r1.area() - l1.getStartPoint().getY());
		System.out.println("X of center of c1 = " + c1.getCenter().getX());

		// Vezbe 4
		/*
		 * 
		 * Postaviti x koordinatu centra ranije kreiranog kruga circle1 na vrednost
		 * zbira vrednosti poluprečnika kruga circle1 i vrednosti koja predstavlja
		 * udaljenost početne i krajnje tačke prethodno kreirane linije line1 (koristiti
		 * metodu distance(), a ne length()).
		 *
		 */
		Circle c2 = new Circle();
		c2.setRadius(10);
		c2.setCenter(new Point());
		c2.getCenter().setX((int)(c2.getRadius()+l1.getStartPoint().distance(l1.getEndPoint())));
	
		Point p3 = new Point(10,20,true);
		System.out.println(p3.getX());
		
		Point p4 = new Point(10,20,true);
		System.out.println(p3.toString());
		
		System.out.println(p3.equals(p4));
		System.out.println(p3==p4);
		
		// Donut
		Donut donut1 = new Donut(new Point(50,100), 100, 50);
		System.out.println(donut1.getRadius());
		Circle donut2 = new Donut(new Point(60,150), 120, 50);
		System.out.println(((Donut)donut2).getInnerRadius());
	}

}
