package GUI;

import java.awt.Container;
import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ApplicationWindow extends JFrame{
	
	public ApplicationWindow(){
		setTitle("Window");
	    setSize(300, 200);
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	    JFrame frame = new ApplicationWindow();
	    frame.show();
	  }
}
