package model;

import java.awt.image.BufferedImage;

public class Ball extends Entity {
	private int x;
	private int y;
	private int vx;
	private int vy;
	
	BufferedImage Me;
	
	
	public Ball(int x, int y)
	{
		this.x = x;
		this.y = y;
		vx = 0;
		vy = 0;
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return y;
	}
	
	public Ball()
	{
		this(0,0);
	}
	
	public void setMe(BufferedImage Me){
		this.Me = Me;
	}
	
	public BufferedImage getMe(){
		return Me;
	}
}
