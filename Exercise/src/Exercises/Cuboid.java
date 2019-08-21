package Exercises;

public class Cuboid {
	private int width;
	private int height;
	private int depth;

	public Cuboid(int width, int height, int depth) {
		this.width=Math.abs(width);
		this.height=Math.abs(height);
		this.depth=Math.abs(depth);
	}
	public int getVolume() {
		return width*height*depth;
	}
	public int getwidth() {
		return width;
	}
	public int getheight() {
		return height;
	}
	public int getdepth() {
		return depth;
	}
	

}
