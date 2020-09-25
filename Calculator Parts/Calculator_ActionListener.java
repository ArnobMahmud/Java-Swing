/*
  Author : Arnob Mahmud

  Mail : arnob.tech.me @ gmail.com
*/

package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("unused")
public class Calculator_ActionListener {
	
	public static void main(String[] args) {
		new Frame();
				
	}

}

@SuppressWarnings("serial")
class Frame extends JFrame {
	
	JLabel l = new JLabel();
	JButton b = new JButton("Click");

	public Frame() {	
		
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 400);
	setLocationRelativeTo(null);
	setResizable(false);
	setLayout(new FlowLayout());
	
	l.setBounds(10, 10, 100, 100);
	add(l);
	                  /// Button Work //
	
	b.setBounds(40, 40, 100, 100);
	add(b);
	
	Font font = new Font("Ariel", Font.BOLD, 20);
	b.setFont(font);
	
	b.setBackground(java.awt.Color.white);
	b.setForeground(java.awt.Color.blue);
	
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setTitle("Love Code");
		}
	});
	
  }
	
}
