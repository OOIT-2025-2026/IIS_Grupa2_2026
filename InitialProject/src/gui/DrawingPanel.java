package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import geometry.Circle;
import geometry.Donut;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;

public class DrawingPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public DrawingPanel() {
		
	}

	@Override
	public void paint(Graphics g) {
		// obavezno da ostane super.paint(g)
		super.paint(g);
		Circle circle1 = new Circle(new Point(100,150), 60);
		circle1.draw(g);
		
		// metoda paint se nigde eksplicitno ne poziva
		// vec samo otvaranjem Frame u kojem se JPanel sa metodom paint nalazi
		// moze eksplicitno kao repaint()
		
		Shape shape1 = new Rectangle(new Point(200,300), 500, 200);
		shape1.draw(g);
		Shape shape2 = new Donut(new Point(200,300), 40, 20);
		shape2.draw(g);
		System.out.println(((Donut)shape2).area());
		
		shape2.moveTo(50, 80);
		shape2.draw(g);
		
		Shape shape3 = new Donut(new Point(100,300), 50, 20);
		shape2.compareTo(shape3);
		
	}
	
	

}
