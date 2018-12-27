package pass; 
import java.awt.FlowLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JFrame; 
import javax.swing.JTextField; 
import javax.swing.JPasswordField; 
import javax.swing.JOptionPane;

public class Build extends JFrame{ 
	private JTextField item1;  
	private JTextField item2; 
	private JTextField item3; 
	private JPasswordField password;

	public Build() { 
		super("Hello"); 
		setLayout(new FlowLayout());  
		
		item1 = new JTextField("Here's your text:"); 
		add(item1); 
		 
		item2 = new JTextField(10);  
		add(item2); 
		
		item3 = new JTextField("Uneditable"); 
		item3.setEditable(false);
		add(item3); 
		
		password = new JPasswordField("pass"); 
		add(password); 
		
		TheHandler handler = new TheHandler(); 
		item1.addActionListener(handler); 
		item2.addActionListener(handler); 
		item3.addActionListener(handler); 
		password.addActionListener(handler);
	} 
	private class TheHandler implements ActionListener{ 
		public void actionPerformed(ActionEvent event) { 
			String string = ""; 
			if(event.getSource()==item1) 
				string=String.format("Field 1: %s", event.getActionCommand()); 
			if(event.getSource()==item2)
				string=String.format("Field 2: %s", event.getActionCommand());
			if(event.getSource()==item3) 
				string=String.format("Field 2: %s", event.getActionCommand());
			if(event.getSource()==password)
				string=String.format("Password is: %s", event.getActionCommand());
			JOptionPane.showMessageDialog(null, string);
		}
	}
}
