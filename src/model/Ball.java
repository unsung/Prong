package model;

import java.awt.image.BufferedImage;

public class Ball extends Entity {
	BufferedImage me;
	
	public void setMe(BufferedImage me) { this.me = me; }
	
	public BufferedImage getMe() { return me; }
}
