/* Author : Arnob Mahmud

   Mail : arnob.tech.me @ gmail.com
*/

package swing; 
import javax.swing.JOptionPane;

public class InputDialog  {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is your name ?");
		JOptionPane.showMessageDialog(null, name + " You are welcome", "Welcome" , JOptionPane.INFORMATION_MESSAGE);	

	}

}
