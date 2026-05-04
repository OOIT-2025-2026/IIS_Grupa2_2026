package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import geometry.Circle;
import geometry.Point;

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
	}
	
	

}
