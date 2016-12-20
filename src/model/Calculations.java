package model;

import javafx.geometry.Point2D;

public class Calculations {
	
	public static final Point2D rotateDeg(Point2D vec, double angle) {
		return rotateRad(vec, Math.toRadians(angle));
	}
	
	public static final Point2D rotateRad(Point2D vec, double angle) {
		double x = vec.getX() * Math.cos(angle) - vec.getY() * Math.sin(angle);
		double y = vec.getX() * Math.sin(angle) + vec.getY() * Math.cos(angle);
		return new Point2D(x, y);
	}

}
