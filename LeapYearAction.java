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
public class LeapYearAction {
	
	
	public static void main(String[] args) {
		new MyFrame();
				
	}

}

@SuppressWarnings("serial")

class MyFrame extends JFrame {

	JButton button1, button2;
	java.awt.Container c = getContentPane();
	
	public MyFrame() {	
	super("Leap year check");	
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(270, 400);
	setLocationRelativeTo(null);
	setResizable(false);
	setLayout(null);
	
	button1 = new JButton("2019");
	button2 = new JButton("2020");
	
	
	button1.setBounds(10, 10, 110, 80);
	button2.setBounds(130, 10, 120, 80);
	
	
	Font a = new Font("Ariel", Font.BOLD, 12);
	button1.setFont(a);
	Font b = new Font("Ariel", Font.BOLD, 12);
	button2.setFont(b);

	
	
	button1.setBackground(java.awt.Color.white);
	button2.setBackground(java.awt.Color.WHITE);
	
	
	button1.setForeground(java.awt.Color.RED);
	button2.setForeground(java.awt.Color.GREEN);
	
	
	
	add(button1);
	add(button2);
	
	
	button1.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e) {
			System.out.println("2019:29th february not found Arnob.");
			System.out.println("It's not leap year :(");
		}
	});
	
	button2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("2020 :29th february found Arnob.");
			System.out.println("It's a leap year! :)");
		}
		
	});

	
  }
	
}