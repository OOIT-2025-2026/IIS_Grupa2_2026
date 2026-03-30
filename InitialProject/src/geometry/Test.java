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
		// na vrednost y koordinate tacke point2


		// 2. Postaviti za pocetnu tacku linije l1 tacku p, a
		// za krajnju tacku linije l1 tacku p1

		// 3. Postaviti y koordinatu krajnje tacke l1 na 23
		// l1.getEndPoint().setY(23); - puca zbog NullPointerException
		// da ne bi bilo NullPointerException-a

		// 4. Inicijalizovati x koordinatu pocetne tacke linije l1
		// 4. Promeniti vrednost x koordinate pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1

		// 5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1
	}

}
