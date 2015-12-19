import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import wiiusej.WiiUseApiManager;
import wiiusej.Wiimote;
import wiiusej.wiiusejevents.physicalevents.*;
import wiiusej.wiiusejevents.utils.WiimoteListener;
import wiiusej.wiiusejevents.wiiuseapievents.*;
import de.yadrone.base.ARDrone;


public class ProngGUI extends JFrame{
	
	JTextArea display = new JTextArea();
	String Text = "Log:\n";
	ARDrone drone = new ARDrone();
	Wiimote wiimote = null;
	
	public ProngGUI(){
        Wiimote[] wiimotes = WiiUseApiManager.getWiimotes(1, true);
        System.out.println(wiimotes.length);
        wiimote = wiimotes[0];
        wiimote.activateMotionSensing();
        wiimote.addWiiMoteEventListeners(new WMLImpl());
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
	}	
	
	private class KeyClickListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()){
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

		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
	}
	
	private class WMLImpl implements WiimoteListener {
		public void onExpansionEvent(ExpansionEvent e) {
			if(e instanceof NunchukEvent) {
				NunchukEvent ne = (NunchukEvent)e;
				NunchukButtonsEvent nbe = ne.getButtonsEvent();
				if(ne.isThereNunchukJoystickEvent()&&nbe.isButtonCHeld()) {
					JoystickEvent je = ne.getNunchukJoystickEvent();
					drone.move3D(
							(int)(50*je.getMagnitude()*Math.cos(Math.PI/180*je.getAngle())),
							-(int)(50*je.getMagnitude()*Math.sin(Math.PI/180*je.getAngle())),
							0,
							10);
					System.out.println(je.getAngle());
				}
				/*
				if(ne.isThereNunchukJoystickEvent()) {

					JoystickEvent je = ne.getNunchukJoystickEvent();
					
				}
				if(nbe.isButtonZeHeld()) {
						drone.down();
						Text+="Down\n";
						repaint();
				} else if(nbe.isButtonCJustReleased()||nbe.isButtonZJustReleased()) {
					drone.hover();
					repaint();
				}
				*/
				if(nbe.isButtonZJustPressed()||nbe.isButtonCJustReleased()){
					drone.hover();
					repaint();
				}
			}
		}
		public void onButtonsEvent(WiimoteButtonsEvent e) {
			if (e.isButtonHomeJustPressed()) {
	        	drone.takeOff();
	        	Text+="Take Off\n";
	        	repaint();
	        } else if (e.isButtonOneJustPressed()) {
	        	drone.landing();
	        	Text+="Landing\n";
	        	repaint();
	        } else if (e.isButtonTwoJustPressed()) {
	        	drone.stop();
	        	Text+="Stopping\n";
	        	repaint();
	        } else if (e.isButtonPlusHeld()) {
	        	drone.spinRight();
	        	Text+="Turn Right\n";
	        	repaint();
	        } else if (e.isButtonMinusHeld()) {
	        	drone.spinLeft();
	        	Text+="Turn Left\n";
	        	repaint();
	        } else if (e.isButtonAHeld()) {
	        	drone.up();
	        	Text+="Up\n";
	        	repaint();
	        } else if (e.isButtonBHeld()) {
	        	drone.down();
	        	Text+="Going down\n";
	        	repaint();
	        } else if (e.isButtonRightHeld()) {
	        	drone.goRight();
	        	Text+="Going right\n";
	        	repaint();
	        } else if (e.isButtonLeftHeld()) {
	        	drone.goLeft();
	        	Text+="Going left\n";
	        	repaint();
	        } else if (e.isButtonUpHeld()) {
	        	drone.forward();
	        	Text+="Going Forward\n";
	        	repaint();
	        } else if (e.isButtonDownHeld()) {
	        	drone.backward();
	        	Text+="Going Back\n";
	        	repaint();
	        } else if (
	        		e.isButtonLeftJustReleased()||
	        		e.isButtonRightJustReleased()||
	        		e.isButtonDownJustReleased()||
	        		e.isButtonUpJustReleased()) {
	        	drone.hover();
	        	repaint();
	        }

	    }
	
	    public void onIrEvent(IREvent e) {}
	    public void onMotionSensingEvent(MotionSensingEvent e) {}
	    public void onStatusEvent(StatusEvent e) {}
	    public void onDisconnectionEvent(DisconnectionEvent e) {}
	    public void onNunchukInsertedEvent(NunchukInsertedEvent e) {}
	    public void onNunchukRemovedEvent(NunchukRemovedEvent e) {}
		public void onClassicControllerInsertedEvent(ClassicControllerInsertedEvent e) {}
		public void onClassicControllerRemovedEvent(ClassicControllerRemovedEvent e) {}
		public void onGuitarHeroInsertedEvent(GuitarHeroInsertedEvent e) {}
		public void onGuitarHeroRemovedEvent(GuitarHeroRemovedEvent e) {}
	
	}
}
