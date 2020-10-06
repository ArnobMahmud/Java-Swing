package Form;
import javax.swing.JFrame;

   class MyWindow extends JFrame {
       private static final long serialVersionUID = 1L;
    
       public MyWindow() {
        super.setTitle("My Form");
        super.setSize(400,400);
        super.setLocation(100,100);
        super.setVisible(true);
    }
}
