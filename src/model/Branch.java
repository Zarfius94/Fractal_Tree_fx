package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Branch {

	protected Point2D start;
	protected Point2D end;

	private Branch[] children;
	
	private int lineWidth;

	public Branch(Point2D start, Point2D end) {
		this.start = start;
		this.end = end;
		this.children = new Branch[Settings.getChildrenCount()];
	}

	public Branch(double start_x, double start_y, double end_x, double end_y) {
		this(new Point2D(start_x, start_y), new Point2D(end_x, end_y));
	}

	protected void drawBranch(GraphicsContext gc) {
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(lineWidth);
		gc.strokeLine(start.getX(), start.getY(), end.getX(), end.getY());
		System.out.println("Start: " + start.toString());
		System.out.println("End: " + end.toString());
		System.out.println();
	}

	public void genTree(GraphicsContext gc) {
		branchOut(0, gc);
	}

	protected void branchOut(int depth, GraphicsContext gc) {
		lineWidth = Settings.getMaxDepth() - depth + 1;
		drawBranch(gc);
		for (int i = 0; i < children.length; i++) {
			int tmp = (i + (2 - children.length % 2)) / 2 * (int) Math.round(Math.pow(-1, (i % 2)));
			Point2D dirvec = Calculations.rotateDeg(end.subtract(start).multiply(Settings.getBrancheScale()),tmp * Settings.getAngle());
			/*System.out.println("Start: " + start.toString());
			System.out.println("End: " + end.toString());
			System.out.println("Direction: " + dirvec.toString());*/
			Point2D childEnd = end.add(dirvec);
			Branch child;
			if (depth < Settings.getMaxDepth()) {
				child = new Branch(end, childEnd);
			} else {
				child = new Leaf(end, childEnd);
			}
			children[i] = child;
			child.branchOut(depth + 1, gc);
		}
	}

}
