package geometry;

import java.awt.Graphics;

public class Line extends Shape{

	private Point startPoint;
	private Point endPoint;

	public Line() {

	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}

	public double lenght() {
		return startPoint.distance(endPoint);
	}
	
	public String toString() {
		return startPoint.toString() + " --> " + endPoint.toString();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line secondLine = (Line)obj;
			if(this.startPoint.equals(secondLine.startPoint) &&
					this.endPoint.equals(secondLine.endPoint)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		Point sadrziTacku = new Point(x, y);
		return this.startPoint.distance(sadrziTacku) + 
				this.endPoint.distance(sadrziTacku) - lenght() <= 2;
	}
	
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(),
				endPoint.getX(), endPoint.getY());
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

}
