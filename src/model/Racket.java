package model;

public class Racket extends Entity {
	public static enum Orient { VERTICAL, HORIZONTAL }
	public static final int L_DEFAULT = 5;
	private int l;

	public Racket(int x, int y, int l, Orient o) {
		super(x,y);
		this.l = l;
		switch(o) {
		case VERTICAL:
			setH(l);
			break;
		case HORIZONTAL:
			setW(l);
			break;
		}
		
	}

	public Racket(int x, int y, int l) {
		this(x, y, l, Orient.VERTICAL);
	}
	public Racket(int x, int y, Orient o) {
		this(x, y, L_DEFAULT);
	}
	public Racket(int x, int y) {
		this(x, y, Orient.VERTICAL);
	}

	public Racket() {
		this(0,0);
	}
	
	public int getL() { return l; }
}
