package model;

public class Racket extends Entity{
	private int h;
	private int x;
	private int vx;

	public Racket(int x, int h){
		this.x = x;
		this.h = h;
		vx = 0;
	}
	
	public Racket(){
		this(0,0);
	}
}
