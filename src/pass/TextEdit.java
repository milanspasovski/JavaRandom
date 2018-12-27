package pass; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class TextEdit extends JFrame{ 
	private JTextField tf; 
	private JCheckBox boldbox; 
	private JCheckBox italicbox; 
	
	public TextEdit() { 
		super("Hello"); 
		setLayout(new FlowLayout()); 
		
		tf = new JTextField("Hello world", 20); 
		tf.setFont(new Font("Serif", Font.PLAIN, 14)); 
		add(tf);  
		
		boldbox = new JCheckBox("bold"); 
		italicbox = new JCheckBox("italic"); 
		add(boldbox); 
		add(italicbox); 
		
		Handler handler = new Handler(); 
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
		
		
	}  
	private class Handler implements ItemListener{  
		public void itemStateChanged(ItemEvent event) { 
			Font font = null ; 
			
			if(boldbox.isSelected() && italicbox.isSelected()) 
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14); 
			else if(boldbox.isSelected()) 
				font = new Font("Serif", Font.BOLD, 14);  
			else if(italicbox.isSelected()) 
				font = new Font("Serif", Font.ITALIC, 14); 
			else 
				font = new Font("Serif", Font.PLAIN, 14); 
			
			tf.setFont(font); 
			
		}
		
	}

}
