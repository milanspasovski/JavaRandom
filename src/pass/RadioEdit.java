package pass; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class RadioEdit extends JFrame{ 
	private JTextField tf; 
	private Font pf; 
	private Font bf; 
	private Font itf; 
	private Font bif; 
	private JRadioButton pb; 
	private JRadioButton bb; 
	private JRadioButton ib; 
	private JRadioButton bib; 
	private ButtonGroup group; 
	
	public RadioEdit() { 
		super("Hello!"); 
		setLayout(new FlowLayout()); 
		
		tf = new JTextField("Pigs on the wing", 25); 
		add(tf); 
		
		pb = new JRadioButton("plain", true);  
		bb = new JRadioButton("bold", false); 
		ib = new JRadioButton("italic", false); 
		bib = new JRadioButton("bold and italic", false); 
		add(pb); 
		add(bb); 
		add(ib); 
		add(bib); 
		
		group = new ButtonGroup(); 
		group.add(pb);
		group.add(bb); 
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14); 
		bf = new Font("serif", Font.BOLD, 14); 
		itf = new Font("serif", Font.ITALIC, 14); 
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14); 
		tf.setFont(pf); 
		
		pb.addItemListener(new Handler(pf));
		bb.addItemListener(new Handler(bf));
		ib.addItemListener(new Handler(itf));
		bib.addItemListener(new Handler(bif));
		
	} 
	
	private class Handler implements ItemListener{
		private Font font; 
		
		public Handler(Font f) { 
			font = f; 
			
		}
		public void itemStateChanged(ItemEvent event) { 
			tf.setFont(font);
		}
	
	}

}
