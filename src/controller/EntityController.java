package controller;
import model.*;

public abstract class EntityController {

	private Entity e;
	private Field f;
	
	public EntityController(Field f, Entity e) {
		this.e = e;
		f.addEntity(e);
	}
	
	public Entity getEntity() { return e; }

	public boolean setPos(int x, int y) {
		if(x < 0 || y < 0 || x + e.getW() > f.getW() || y + e.getH() > f.getH())
			return false;
		e.setX(x);
		e.setY(y);
		return true;
	}
	
	public boolean moveUp() {
		return setPos(e.getX(), e.getY() + 1);
	}

	public boolean moveDown() {
		return setPos(e.getX(), e.getY() - 1);
	}

	public boolean moveRight() {
		return setPos(e.getX() + 1, e.getY());
	}

	public boolean moveLeft() {
		return setPos(e.getX() - 1, e.getY());
	}

}
