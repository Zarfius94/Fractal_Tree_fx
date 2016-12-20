package model;

public class Settings {

	private static int childrenCount = 2;

	private static double angle = 40;

	private static int maxDepth = 5;

	private static int height = 800;

	private static int width = 800;

	private static double LeafScale = 0.5;
	
	private static int RootLength = 100;

	private static double BrancheScale = 0.7;

	/**
	 * @return the rootLength
	 */
	public static final int getRootLength() {
		return RootLength;
	}

	/**
	 * @param rootLength
	 *            the rootLength to set
	 */
	public static final void setRootLength(int rootLength) {
		RootLength = rootLength;
	}

	/**
	 * @return the brancheScale
	 */
	public static final double getBrancheScale() {
		return BrancheScale;
	}

	/**
	 * @param brancheScale
	 *            the brancheScale to set
	 */
	public static final void setBrancheScale(double brancheScale) {
		BrancheScale = brancheScale;
	}

	/**
	 * @return the leafScale
	 */
	public static final double getLeafScale() {
		return LeafScale;
	}

	/**
	 * @param leafScale
	 *            the leafScale to set
	 */
	public static final void setLeafScale(double leafScale) {
		LeafScale = leafScale;
	}

	/**
	 * @return the height
	 */
	public static final int getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public static final void setHeight(int height) {
		Settings.height = height;
	}

	/**
	 * @return the width
	 */
	public static final int getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public static final void setWidth(int width) {
		Settings.width = width;
	}

	/**
	 * @return the maxDepth
	 */
	public static final int getMaxDepth() {
		return maxDepth;
	}

	/**
	 * @param maxDepth
	 *            the maxDepth to set
	 */
	public static final void setMaxDepth(int maxDepth) {
		Settings.maxDepth = maxDepth;
	}

	/**
	 * @return the childrenCount
	 */
	public static final int getChildrenCount() {
		return childrenCount;
	}

	/**
	 * @param childrenCount
	 *            the childrenCount to set
	 */
	public static final void setChildrenCount(int childrenCount) {
		Settings.childrenCount = childrenCount;
	}

	/**
	 * @return the angle
	 */
	public static final double getAngle() {
		return angle;
	}

	/**
	 * @param angle
	 *            the angle to set
	 */
	public static final void setAngle(double angle) {
		Settings.angle = angle;
	}

}
