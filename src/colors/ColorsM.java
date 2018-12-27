package colors; 
import javax.swing.*;


public class ColorsM {

	public static void main(String[] args) {
		JFrame f = new JFrame("Title"); 
		ColorsC c = new ColorsC(); 
		f.add(c); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 300);
		f.setVisible(true);
		
		

	}

}
