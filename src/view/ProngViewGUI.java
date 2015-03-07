package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class ProngViewGUI extends JFrame{
	GamePanel ViewPanel = new GamePanel();
	
	public ProngViewGUI(){
		this.setSize(new Dimension(500,500));
		
		this.add(ViewPanel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_LEFT){
					ViewPanel.moveLeft();
					ProngViewGUI.this.repaint();
				}
				
				if(arg0.getKeyCode() == KeyEvent.VK_RIGHT){
					ViewPanel.moveRight();
					ProngViewGUI.this.repaint();
				}
				
				if(arg0.getKeyCode() == KeyEvent.VK_UP){
					ViewPanel.moveDown();
					ProngViewGUI.this.repaint();
				}
				
				if(arg0.getKeyCode() == KeyEvent.VK_DOWN){
					ViewPanel.moveUp();
					ProngViewGUI.this.repaint();
				}
				
				
			}}
			);
		
		this.setVisible(true);
	}
	
	public void paintComponent(Graphics g){
		ViewPanel.repaint();
	}
	
}
