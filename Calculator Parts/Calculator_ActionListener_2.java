/*
  Author : Arnob Mahmud
  Mail : arnob.tech.me @ gmail.com
*/

package swing;

import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.xml.internal.ws.api.server.Container;

import javafx.scene.paint.Color;

@SuppressWarnings("unused")
public class Calculator_ActionListener_2 {
	
	public static void main(String[] args) {
		new MyFrame();
				
	}

}

@SuppressWarnings("serial")
class MyFrame extends JFrame {

	JButton button1, button2, button3;
	java.awt.Container c = getContentPane();
	
	public MyFrame() {	
		
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(270, 400);
	setLocationRelativeTo(null);
	setResizable(false);
	setLayout(null);
	
	button1 = new JButton("RED");
	button2 = new JButton("GREEN");
	button3 = new JButton("BLUE");
	
	button1.setBounds(10, 10, 60, 60);
	button2.setBounds(80, 10, 80, 60);
	button3.setBounds(180, 10, 70, 60);
	
	
	Font a = new Font("Ariel", Font.BOLD, 12);
	button1.setFont(a);
	Font b = new Font("Ariel", Font.BOLD, 12);
	button2.setFont(b);
	Font c = new Font("Ariel", Font.BOLD, 12);
	button2.setFont(c);

	button1.setBackground(java.awt.Color.WHITE);
	button2.setBackground(java.awt.Color.WHITE);
	button3.setBackground(java.awt.Color.WHITE);
	
	button1.setForeground(java.awt.Color.RED);
	button2.setForeground(java.awt.Color.GREEN);
	button3.setForeground(java.awt.Color.BLUE);
	
	
	add(button1);
	add(button2);
	add(button3);
	
	button1.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e) {
			setBackground(java.awt.Color.RED);
		}
	});
	
	button2.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			setBackground(java.awt.Color.GREEN);
		}
	});
	
	button3.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
	       setBackground(java.awt.Color.BLUE);
			
		}
 
	});
	
  }
	
}