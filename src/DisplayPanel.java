import java.awt.Graphics;

import javax.swing.JTextArea;


public class DisplayPanel extends JTextArea{

	String Text = "Log:\n\n";
	
	public DisplayPanel(){
		this.setSize(500, 500);
	}
	
	public void addText(String S){
		Text+=S;
		repaint();
	}
	
	public void paintComponent(Graphics g){
		this.setText(Text);
	}
}
