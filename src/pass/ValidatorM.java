package pass; 
import javax.swing.JFrame; 

public class ValidatorM {

	public static void main(String[] args) {
		ValidatorC val = new ValidatorC(); 
		val.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		val.setSize(750, 150);
		val.setVisible(true);

	}

}
