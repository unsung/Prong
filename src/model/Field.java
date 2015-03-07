package model;
import java.util.List;
import java.util.ArrayList;

public class Field {
	private int w;
	private int h;
	private List<Entity> entities;
	
	public Field(int w, int h){
		this.w = w;
		this.h = h;
		entities = new ArrayList<Entity>();
	}
	
	public void addEntity(Entity e) { entities.add(e); }
	
	public List<Entity> getEntities() { return entities; }
	
	public int getH() { return h; }

	public int getW() { return w; }
	
	public void setW(int w) { this.w = w; }
	
	public void setH(int h) { this.h = h; }

}
