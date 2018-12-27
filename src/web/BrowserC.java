package web; 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class BrowserC extends JFrame{ 
	
	private JTextField adressBar; 
	private JEditorPane display; 
	
	public BrowserC() { 
		super("Milan's browser"); 
		
		adressBar = new JTextField(""); 
		adressBar.addActionListener(
				new ActionListener() { 
					public void actionPerformed(ActionEvent event) { 
						loadCrap(event.getActionCommand());
					}
				}
				); 
		add(adressBar, BorderLayout.NORTH); 
		
		display = new JEditorPane(); 
		display.setEditable(false);
		display.addHyperlinkListener(
				new HyperlinkListener() { 
					public void hyperlinkUpdate(HyperlinkEvent event) { 
						if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED) {
							loadCrap(event.getURL().toString());
						}
					}
				}
				); 
		add(new JScrollPane(display), BorderLayout.CENTER); 
		setSize(500, 300); 
		setVisible(true); 
		
	} 
	
	private void loadCrap(String userText) { 
		try {
			display.setPage(userText);
			adressBar.setText(userText);
		}catch(Exception e) { 
			System.out.println("Spelling mistake!");
		}
	}

}
