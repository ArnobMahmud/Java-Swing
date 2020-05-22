/*
  Author : Arnob Mahmud

  Mail : arnob.tech.me @ gmail.com
*/

package swing;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Calculator_Button {
	
	
	public static void main(String[] args) {
		new myFrame();
				
	}

}
class myFrame extends JFrame {
	
	JLabel l = new JLabel();
	JButton b = new JButton("Click");

	public myFrame() {	
	super("Calculator");
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 400);
	setLocationRelativeTo(null);
	setResizable(false);
	setLayout(new FlowLayout());
	
	add(l);
    add(b);
    
    b.setBounds(40, 40, 100, 100);
	l.setBounds(10, 10, 100, 100);
    
	Font font = new Font("Ariel", Font.BOLD, 20);
	b.setFont(font);
	
	b.setBackground(java.awt.Color.white);
	b.setForeground(java.awt.Color.blue);
	
  }
	
}
