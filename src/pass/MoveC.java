package pass;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 

public class MoveC extends JFrame { 
	private JPanel mouse;  
	private JLabel status; 
	
	public MoveC(){
		super("Title"); 
		
		mouse = new JPanel(); 
		mouse.setBackground(Color.WHITE); 
		add(mouse, BorderLayout.CENTER); 
		
		status = new JLabel("default"); 
		add(status, BorderLayout.SOUTH); 
		
		Handler handler = new Handler(); 
		mouse.addMouseListener(handler);
		mouse.addMouseMotionListener(handler);
		
	} 
	
	private class Handler implements MouseListener, MouseMotionListener{ 
		public void mouseClicked(MouseEvent event) {
			
		
			status.setText(String.format("Clicked at %d %d", event.getX(), event.getY()));
		}
			public void mousePressed(MouseEvent event) { 
				status.setText("Pressed"); 
				
			} 
			public void mouseReleased(MouseEvent event) { 
				status.setText("Released");
						
			} 
			public void mouseEntered(MouseEvent event) { 
				status.setText("Entered"); 
				mouse.setBackground(Color.RED);
				
			}  
			public void mouseExited(MouseEvent event) { 
				status.setText("Exited");
				mouse.setBackground(Color.WHITE);
			}
			public void mouseDragged(MouseEvent event) { 
				status.setText("Dragging");
			}
		public void mouseMoved(MouseEvent evnt) { 
			status.setText("Moved");
		}
		
	}
	
}