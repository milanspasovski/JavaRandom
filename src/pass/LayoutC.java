package pass; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class LayoutC extends JFrame{ 
	private JButton plus; 
	private JButton minus; 
	private JButton time;  
	private JButton divide;
	private FlowLayout layout; 
	private Container container; 
	private JLabel status;
	
	public LayoutC() { 
		super("Calculator"); 
		layout = new FlowLayout(); 
		container=getContentPane();  
		setLayout(layout); 
		
		status = new JLabel("Choose an operation"); 
		add(status, BorderLayout.SOUTH);
		
		plus = new JButton("+"); 
		add(plus); 
		plus.addActionListener(
				 new ActionListener() { 
					 public void actionPerformed(ActionEvent event) { 
						 String fn = JOptionPane.showInputDialog("Enter first number");
							String sn = JOptionPane.showInputDialog("Enter second number");

							int num1 = Integer.parseInt(fn); 
							int num2 = Integer.parseInt(sn); 
							int sum = num1+num2;
							JOptionPane.showMessageDialog(null, "The answer is:\t"+ sum, "Plus", JOptionPane.PLAIN_MESSAGE);
							
					 }
				 }
				); 
		
		minus = new JButton("-"); 
		add(minus); 
		minus.addActionListener(
				 new ActionListener() { 
					 public void actionPerformed(ActionEvent event) { 
						 String fn = JOptionPane.showInputDialog("Enter first number");
							String sn = JOptionPane.showInputDialog("Enter second number");

							int num1 = Integer.parseInt(fn); 
							int num2 = Integer.parseInt(sn); 
							int sum = num1-num2;
							JOptionPane.showMessageDialog(null, "The answer is:\t"+ sum, "Minus", JOptionPane.PLAIN_MESSAGE);
							
					 }
				 }
				); 
		
		time = new JButton("*"); 
		add(time); 
		time.addActionListener(
				 new ActionListener() { 
					 public void actionPerformed(ActionEvent event) { 
						 String fn = JOptionPane.showInputDialog("Enter first number");
							String sn = JOptionPane.showInputDialog("Enter second number");

							int num1 = Integer.parseInt(fn); 
							int num2 = Integer.parseInt(sn); 
							int sum = num1*num2;
							JOptionPane.showMessageDialog(null, "The answer is:\t"+ sum, "Multiplication", JOptionPane.PLAIN_MESSAGE);
							
					 }
				 }
				); 
		divide = new JButton("/"); 
		add(divide); 
		divide.addActionListener(
				 new ActionListener() { 
					 public void actionPerformed(ActionEvent event) {  
						 try {
						 String fn = JOptionPane.showInputDialog("Enter first number");
							String sn = JOptionPane.showInputDialog("Enter second number");

							int num1 = Integer.parseInt(fn); 
							int num2 = Integer.parseInt(sn); 
							int sum = num1/num2;
							JOptionPane.showMessageDialog(null, "The answer is:\t"+ sum, "Divide", JOptionPane.PLAIN_MESSAGE);
						 } 
						 catch(Exception e) {
							 JOptionPane.showMessageDialog(null, "Can't divide with 0", "Alert!", JOptionPane.WARNING_MESSAGE);
						 }
					 }
				 }
				); 
		
	}

}
