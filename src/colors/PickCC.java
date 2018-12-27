package colors; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PickCC extends JFrame{ 
	
	private JButton b; 
	private Color color = (Color.WHITE); 
	private JPanel panel; 
	
	public PickCC() { 
		super("Title"); 
		panel = new JPanel(); 
		panel.setBackground(color);
		
		b = new JButton("Choose a color"); 
		b.addActionListener(
					new ActionListener() { 
						public void actionPerformed(ActionEvent event) { 
							color = JColorChooser.showDialog(null, "Pick a color", color); 
							if(color==null)
								color=(color.WHITE); 
							panel.setBackground(color);
						}
					}
				); 
		add(panel, BorderLayout.CENTER); 
		add(b, BorderLayout.SOUTH); 
		
				
	}

}
