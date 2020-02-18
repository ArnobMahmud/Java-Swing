/*
  Author : Arnob Mahmud
  Mail : arnob.tech.me @ gmail.com
*/

package swing;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator_Font {

	public static void main(String[] args) {
           new newFrame();                        // Anonymous object //
	}
}

@SuppressWarnings("serial")
class newFrame extends JFrame{          //  newFrame class properties been connected with JFrame //

	JLabel l = new JLabel("LoveExtendsCode");               // Works like a paper  //
	
	public newFrame() {
		super("The calculator");                            // Title //   
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		setLocationRelativeTo(null);                        // Frames positioning //
		setSize(400,500);
		l.setText("Arnob Mahmud");
		Font font = new Font("Ariel", Font.ITALIC, 30);      // Links font with label  //
		l.setFont(font);
		add(l);                                               //Prints text on body //
		
	}
	
}