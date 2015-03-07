package view;

import java.awt.Graphics;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Ball;

public class GamePanel extends JPanel{
	
	Ball Drone = new Ball();	
	
	{
		Drone.setX(210);
		Drone.setY(210);
		
	try{
	Drone.setMe(ImageIO.read(new File("Pictures/Drone.jpg")));
	}catch(Exception e){e.printStackTrace();}
	}
	
	public GamePanel(){
		
	}
	
	public void paintComponent(Graphics g){
		g.fillOval(0, 0, 50, 50);
		g.fillOval(0, 400, 50, 50);
		g.fillOval(433, 0, 50, 50);
		g.fillOval(433, 400, 50, 50);
		g.drawImage(Drone.getMe(), Drone.getX(), Drone.getY(), 50, 50,null);
	}
	
	public void decrementY(){
		Drone.setY(Drone.getY() - 5);
	}
	
	public void incrementY(){
		Drone.setY(Drone.getY() + 5);
	}
	
	public void decrementX(){
		Drone.setX(Drone.getX() - 5);
	}
	
	public void incrementX(){
		Drone.setX(Drone.getX() + 5);
	}
	
	
	
	
	
	
	
}
