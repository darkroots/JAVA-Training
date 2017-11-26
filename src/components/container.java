package components;

import java.awt.*;
import javax.swing.*;


public class container {
	
	private static void createAndShowGUI(){
		//Create and set up the window.
        JFrame frame = new JFrame("Trade Master");//content inside 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create the menu bar.  Make it have a green background.
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(0, 0, 150));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));
 
        //Create a yellow label to put in the content pane.
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(255, 255, 255));
        yellowLabel.setPreferredSize(new Dimension(400, 400));
        
        //Set the menu bar and add the label to the content pane.
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane();
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}

	public static void main(String[] args) {
		//schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}

}
