package model;

public abstract class Entity {
	private int x;
	private int y;
	private int vx;
	private int vy;
	private int width;
	private int height;
	
	public Entity(int x, int y)
	{
		this.x = x;
		this.y = y;
		vx = vy = 0;
		width = height = 1;
	}
	
	public Entity(){
		this(0,0);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getXVelocity(){
		return vx;
	}
	
	public int getYVelocity(){
		return vy;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setXVelocity(int vx){
		this.vx = vx;
	}
	
	public void setYVelocity(int vy){
		this.vy = vy;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	

}
