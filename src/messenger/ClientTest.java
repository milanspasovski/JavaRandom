package messenger; 
import javax.swing.JFrame;

public class ClientTest {

	public static void main(String[] args) {
		Client cli; 
		
		cli = new Client("192.168.0.110"); 
		cli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cli.startRunning(); 
		

	}

}
