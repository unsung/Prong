package model;

public class Field {
	private int width;
	private int height;
	
	public Field(int w, int h){
		this.width = w;
		this.height = h;
	}
	
<<<<<<< HEAD
	public Field(){
		this(500, 500);
	}
	public void addEntity(Entity e) { entities.add(e); }
	
	public List<Entity> getEntities() { return entities; }
	
	public int getH() { return h; }

	public int getW() { return w; }
	
	public void setW(int w) { this.w = w; }
=======
	public void setWidth(int w){
		this.width = w;
	}
>>>>>>> parent of 267c0ac... added controllers
	
	public void setHeight(int h){
		this.height = h;
	}

}
