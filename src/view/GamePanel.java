package view;

import java.awt.Graphics;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.*;
import controller.*;

public class GamePanel extends JPanel{
	
	
	Field f = new Field();
	EntityController droneController;
	
	public GamePanel(){
		droneController = new BallController();

		drone.setX(210);
		drone.setY(210);
	
		try{
		drone.setMe(ImageIO.read(new File("Pictures/Drone.jpg")));
		}catch(Exception e){e.printStackTrace();}
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(drone.getMe(), drone.getX(), drone.getY(), 50, 50,null);
	}
	
	public void moveDown(){
		drone.moveDown();
	}
	
	public void moveUp(){
		drone.setY(drone.getY() + 5);
	}
	
	public void moveLeft(){
		drone.setX(drone.getX() - 5);
	}
	
	public void moveRight(){
		drone.setX(drone.getX() + 5);
	}
	
	
	
	
	
	
	
}
