import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import de.yadrone.base.ARDrone;


public class ProngGUI extends JFrame{
	
	JTextArea display = new JTextArea();
	String Text = "Log:\n";
	ARDrone drone = new ARDrone();
	
	public ProngGUI(){
		this.setLayout(new BorderLayout());
		this.add(display, BorderLayout.CENTER);
		display.setEditable(false);
		this.setSize(new Dimension(500,500));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		display.addKeyListener(new KeyClickListener());
		initializeDrone();
		this.setVisible(true);
	}
	
	public void initializeDrone(){
		drone.start();
		drone.takeOff();
		drone.hover();
	}	
	
	private class KeyClickListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent arg0) {
			System.out.println("kjsfhdah");
			switch(arg0.getKeyCode()){
			case KeyEvent.VK_LEFT:
    			drone.goLeft();
				Text+="Go Left\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_RIGHT:
				drone.goRight();
				Text+="Go Right\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_UP:
				drone.up();
				Text+="Go Up\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_DOWN:
				drone.down();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_0:
				drone.landing();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_R:
				drone.spinRight();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_L:
				drone.spinLeft();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_F:
				drone.forward();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_B:
				drone.backward();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_S:
				drone.stop();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
				break;
			case KeyEvent.VK_T:
				drone.takeOff();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
				break;
			default: break;
			
			
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
}
