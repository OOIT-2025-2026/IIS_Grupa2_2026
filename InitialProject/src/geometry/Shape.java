package geometry;

import java.awt.Graphics;

// kao neka vrsta ugovora
public abstract class Shape {
	
	// sa private na protected da ne bismo menjali implementaciju ostalih konstruktora
	protected boolean selected;
	
	// default konstruktor postoji ali cu ga napisati da skrene paznju
	public Shape() {
		
	}
	
	public abstract boolean contains(int x, int y);
	public abstract String toString();
	public abstract boolean equals(Object obj);
	public abstract void draw(Graphics g);
	
	// nema potrebe override ih
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	

}
