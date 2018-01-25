package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.WindowConstants;

public class AplicationWindow extends Window implements IWindowImplementation,Runnable{
	String titlu;
	AplicationWindow(String titlu){
		this.titlu = titlu;
	}
	
	JFrame f = new JFrame(this.titlu);
	public void setSize(int x,int y)
	{
	//implementeaza jWindow	
	f.setSize(x,y);
		
	}
	public void hide() {
	f.setVisible(false);	
	}
	public void maximaze() {
		f.setVisible(true);
	}
	/*public void show() {
		 
        // Sets the behavior for when the window is closed
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Add a layout manager so that the button is not placed on top of the label
        f.setLayout(new FlowLayout());
        // Add a label and a button
       // f.add(new JLabel("Hello, world!"));
       // f.add(new JButton("Press me!"));
        // Arrange the components inside the window
        f.pack();
        // By default, the window is not visible. Make it visible.
        f.setVisible(true);
		
	}*/
	@Override
	public void run() {
		SwingImplementation sw = new SwingImplementation(this.titlu);
		//sw.hide();
		sw.show();
	}
}
