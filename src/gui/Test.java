package gui;

import javax.swing.SwingUtilities;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lab10
	   // AplicationWindow se = new AplicationWindow();
        // Schedules the application to be run at the correct time in the event queue.
       // SwingUtilities.invokeLater(se);
        
        Window w = new AplicationWindow("Doc Edit 0.1");
       /* Document doc = getDocument();//citeste din fisier un document
        w.setContent(doc);
        w.maximize();*/
        SwingUtilities.invokeLater(w);
        
        
      
        //w.maximize();
        
	}

}
