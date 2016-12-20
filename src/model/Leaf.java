package model;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Leaf extends Branch {

	public Leaf(Point2D stem, Point2D tip) {
		super(stem, tip);
	}

	protected void drawBranch(GraphicsContext gc) {
		Point2D dir = end.subtract(start);
		double size = dir.magnitude() * Settings.getLeafScale();
		Point2D center = start.add(dir.multiply(0.5 * Settings.getLeafScale()));
		/*
		System.out.println("Start: " + start.toString());
		System.out.println("End: " + end.toString());
		System.out.println("Direction: " + dir.toString());
		System.out.println("Corner1: " + center.toString());
		System.out.println();*/
		gc.setFill(Color.GREEN);
		gc.setLineWidth(5);
		gc.fillOval(center.getX() - size / 2, center.getY() - size / 2, size, size);
	}

	@Override
	protected void branchOut(int depth, GraphicsContext gc) {
		drawBranch(gc);
	}

}
