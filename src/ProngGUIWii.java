import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import wiiremotej.WiiRemote;
import wiiremotej.WiiRemoteExtension;
import wiiremotej.WiiRemoteJ;
import wiiremotej.event.WRAccelerationEvent;
import wiiremotej.event.WRButtonEvent;
import wiiremotej.event.WRCombinedEvent;
import wiiremotej.event.WRExtensionEvent;
import wiiremotej.event.WRIREvent;
import wiiremotej.event.WRStatusEvent;
import wiiremotej.event.WiiRemoteListener;
import de.yadrone.base.ARDrone;


public class ProngGUIWii extends JFrame{
	
	JTextArea display = new JTextArea();
	WiiRemote W;
	String Text = "Log:\n";
	ARDrone drone = new ARDrone();	
	
	public ProngGUIWii(){
		
		try{
			W = WiiRemoteJ.findRemote();
			}catch(Exception E){
				E.printStackTrace();
			}
		
		this.setLayout(new BorderLayout());
		this.add(display, BorderLayout.CENTER);
		display.setEditable(false);
		this.setSize(new Dimension(500,500));
		W.addWiiRemoteListener(new WiiListener());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initializeDrone();
		this.setVisible(true);
	}
	
	public void initializeDrone(){
		drone.start();
		drone.takeOff();
		drone.hover();
	}	
	
	private class WiiListener implements WiiRemoteListener{

		@Override
		public void IRInputReceived(WRIREvent arg0) {
			
		}

		@Override
		public void accelerationInputReceived(WRAccelerationEvent arg0) {
			
		}

		@Override
		public void buttonInputReceived(WRButtonEvent arg0) {
	
			if(arg0.isPressed(WRButtonEvent.LEFT)){
    			drone.goLeft();
				Text+="Go Left\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.RIGHT)){
				drone.goRight();
				Text+="Go Right\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.UP)){
				drone.up();
				Text+="Go Up\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.DOWN)){
				drone.down();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.ONE)){
				drone.landing();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.PLUS)){
				drone.spinRight();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.MINUS)){
				drone.spinLeft();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.A)){
				drone.forward();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.B)){
				drone.backward();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.HOME)){
				drone.stop();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
			}
			if(arg0.isPressed(WRButtonEvent.TWO)){
				drone.takeOff();
				Text+="Go Down\n";
				display.setText(Text);
				repaint();
			}
			
			}

		@Override
		public void combinedInputReceived(WRCombinedEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void disconnected() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void extensionConnected(WiiRemoteExtension arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void extensionDisconnected(WiiRemoteExtension arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void extensionInputReceived(WRExtensionEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void extensionPartiallyInserted() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void extensionUnknown() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void statusReported(WRStatusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	}
	
}
