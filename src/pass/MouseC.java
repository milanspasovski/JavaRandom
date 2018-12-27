package pass; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 


public class MouseC extends JFrame{ 
	private String details; 
	private JLabel status; 
	
	public MouseC() { 
		super("Title"); 
		
		status = new JLabel("Default"); 
		add(status, BorderLayout.SOUTH); 
		addMouseListener(new Mouseclass()); 
	} 
	
	private class Mouseclass extends MouseAdapter{ 
		public void mouseClicked(MouseEvent event) {  
			details = String.format("Mouse clicked %d ", event.getClickCount());
			
			if(event.isMetaDown()) 
				details += "With right mouse button"; 
			else 
				if(event.isAltDown())
				details += "With center mouse button"; 
			else 
				details +="With left mouse button"; 
			status.setText(details);
		}
	}

}
