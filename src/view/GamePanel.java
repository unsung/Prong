package view;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	BufferedImage Drone;
	int droneX = 210;
	int droneY = 210;
	
	
	{
	try{
	Drone = ImageIO.read(new File("Pictures/Drone.jpg"));
	}catch(Exception e){e.printStackTrace();}
	}
	
	public GamePanel(){
		
	}
	
	public void paintComponent(Graphics g){
		g.fillOval(0, 0, 50, 50);
		g.fillOval(0, 400, 50, 50);
		g.fillOval(433, 0, 50, 50);
		g.fillOval(433, 400, 50, 50);
		g.drawImage(Drone, droneX, droneY, 50, 50,null);
	}
	
	public void decrementY(){
		droneY-=5;
	}
	
	public void incrementY(){
		droneY+=5;
	}
	
	public void decrementX(){
		droneX-=5;
	}
	
	public void incrementX(){
		droneX+=5;
	}
	
	
	
	
	
	
	
}
