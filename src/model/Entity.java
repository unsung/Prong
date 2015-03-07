package model;

public abstract class Entity {
	private int x;
	private int y;
	private int vx;
	private int vy;
	private int w;
	private int h;
	
	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
		vx = vy = 0;
		w = h = 1;
	}
	
	public Entity() {
		this(0,0);
	}
	
	public int getX() { return x; }
	
	public int getY() { return y; }
	
	public int getVx() { return vx; }
	
	public int getVy() { return vy; }
	
	public int getW() { return w; }
	
	public int getH() { return h; }
	
	public void setX(int x) { this.x = x; }
	
	public void setY(int y) { this.y = y; }
	
	public void setVx(int vx) {this.vx = vx; }
	
	public void setVy(int vy){ this.vy = vy; }
	
	protected void setW(int w){ this.w = w; }
	
	protected void setH(int h){ this.h = h; }

}
