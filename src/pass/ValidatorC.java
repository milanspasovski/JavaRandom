package pass; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ValidatorC extends JFrame{ 
	
	private JLabel i1;  
	private JTextField i2;  
	private JLabel p1; 
	private JTextField p2;  
	private JLabel p3;
	private JList list; 
	private static String [] pol= {"Машко", "Женско"};  
	private JLabel g1; 
	private JTextField g2; 
	private JButton check; 
	private JLabel s1; 
	private JTextField s2; 
	private JCheckBox staz;
	
	public ValidatorC() { 
		super("Колку години до пензија?"); 
		setLayout(new FlowLayout()); 
		
		i1 = new JLabel("Име:"); 
		add(i1);  
		i2 = new JTextField(10);  
		add(i2);  
		
		p1 = new JLabel("Презиме:"); 
		add(p1);  
		p2 = new JTextField(10);  
		add(p2);  
		
		p3 = new JLabel("Пол:"); 
		add(p3);  
		
		list = new JList(pol); 
		list.setVisibleRowCount(2);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		add(new JScrollPane(list));
		
		g1 = new JLabel("Години:"); 
		add(g1);  
		g2 = new JTextField(3); 
		add(g2);  
		
		s1=new JLabel("Стаж:"); 
		add(s1); 
		s2=new JTextField(3); 
		add(s2); 
		
		staz=new JCheckBox("Бенифициран стаж"); 
		add(staz);
		
		
		check = new JButton("Провери!"); 
		check.addActionListener( 
			new ActionListener() { 
				public void actionPerformed(ActionEvent event) {  
					if((i2.getText().isEmpty())&&(p2.getText().isEmpty())&&(list.isSelectionEmpty())&&(g2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
						JOptionPane.showMessageDialog(null, "Немате внесено податоци!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					} 
					else
						if((p2.getText().isEmpty())&&(list.isSelectionEmpty())&&(g2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
							JOptionPane.showMessageDialog(null, "Немате внесено презиме, пол, години и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
						} 
						else
					if((i2.getText().isEmpty())&&(list.isSelectionEmpty())&&(g2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
						JOptionPane.showMessageDialog(null, "Немате внесено име, пол, години и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					}  
					else
					if((i2.getText().isEmpty())&&(p2.getText().isEmpty())&&(g2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
						JOptionPane.showMessageDialog(null, "Немате внесено име, презиме, години и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					}  
					else
					if((i2.getText().isEmpty())&&(p2.getText().isEmpty())&&(list.isSelectionEmpty())&&(s2.getText().isEmpty())) { 
						JOptionPane.showMessageDialog(null, "Немате внесено име, презиме, пол и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					}  
					else
						if((i2.getText().isEmpty())&&(p2.getText().isEmpty())&&(list.isSelectionEmpty())&&(g2.getText().isEmpty())) { 
							JOptionPane.showMessageDialog(null, "Немате внесено име, презиме, пол и години!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
						} 
					else
					if((i2.getText().isEmpty())&&(p2.getText().isEmpty())&&(list.isSelectionEmpty())) { 
						JOptionPane.showMessageDialog(null, "Внесете име, презиме и пол!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					}  
					else
					if((i2.getText().isEmpty())&&(p2.getText().isEmpty())&&(g2.getText().isEmpty())) { 
						JOptionPane.showMessageDialog(null, "Внесете име, презиме и години!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					} 
					else
					if((i2.getText().isEmpty())&&(p2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
						JOptionPane.showMessageDialog(null, "Внесете име, презиме и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					}   
					else
					if((p2.getText().isEmpty())&&(list.isSelectionEmpty())&&(g2.getText().isEmpty())) { 
						JOptionPane.showMessageDialog(null, "Внесете презиме, пол и години!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					}  
					else
					if((p2.getText().isEmpty())&&(list.isSelectionEmpty())&&(s2.getText().isEmpty())) { 
						JOptionPane.showMessageDialog(null, "Внесете презиме, пол и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					} 
					else
					if((list.isSelectionEmpty())&&(g2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
						JOptionPane.showMessageDialog(null, "Внесете пол, години и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					} 
					else
						if((i2.getText().isEmpty())&&(list.isSelectionEmpty())&&(s2.getText().isEmpty())) { 
							JOptionPane.showMessageDialog(null, "Внесете име, пол и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
						} 
						else
							if((p2.getText().isEmpty())&&(g2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
								JOptionPane.showMessageDialog(null, "Внесете презиме, години и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
							}   
							else
								if((i2.getText().isEmpty())&&(g2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
									JOptionPane.showMessageDialog(null, "Внесете име, години и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
								} 
								else
									if((i2.getText().isEmpty())&&(p2.getText().isEmpty())) { 
										JOptionPane.showMessageDialog(null, "Внесете име и презиме!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
									} 
									else
										if((i2.getText().isEmpty())&&(list.isSelectionEmpty())) { 
											JOptionPane.showMessageDialog(null, "Внесете име и пол!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
										} 
										else
											if((i2.getText().isEmpty())&&(g2.getText().isEmpty())) { 
												JOptionPane.showMessageDialog(null, "Внесете име и години!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
											} 
											else
												if((i2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
													JOptionPane.showMessageDialog(null, "Внесете име и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
												} 
												else
													if((p2.getText().isEmpty())&&(list.isSelectionEmpty())) { 
														JOptionPane.showMessageDialog(null, "Внесете презиме и пол!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
													}  
													else
														if((p2.getText().isEmpty())&&(g2.getText().isEmpty())) { 
															JOptionPane.showMessageDialog(null, "Внесете презиме и години!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
														}  
														else
															if((p2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
																JOptionPane.showMessageDialog(null, "Внесете презиме и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
															}    
															else
																if((list.isSelectionEmpty())&&(g2.getText().isEmpty())) { 
																	JOptionPane.showMessageDialog(null, "Внесете пол и години!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
																}    
																else
																	if((list.isSelectionEmpty())&&(s2.getText().isEmpty())) { 
																		JOptionPane.showMessageDialog(null, "Внесете пол и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
																	}  
																	else
																		if((g2.getText().isEmpty())&&(s2.getText().isEmpty())) { 
																			JOptionPane.showMessageDialog(null, "Внесете години и стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
																		} 
					
					else
					if(i2.getText().isEmpty()) { 
						JOptionPane.showMessageDialog(null, "Внесете име!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					}
					else
					if(p2.getText().isEmpty()) { 
						JOptionPane.showMessageDialog(null, "Внесете презиме!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					} 
					else
					if(list.isSelectionEmpty()) { 
						JOptionPane.showMessageDialog(null, "Изберете пол!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					}
					else
					if(g2.getText().isEmpty()) { 
						JOptionPane.showMessageDialog(null, "Внесете години!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
					} 
					else
						if(s2.getText().isEmpty()) { 
							JOptionPane.showMessageDialog(null, "Внесете стаж!", "Грешка!", JOptionPane.WARNING_MESSAGE);	
						}
					else
						if(list.isSelectedIndex(0)) { 
							String text = g2.getText();  
							int g3 = Integer.parseInt(text);  
							String text2 = s2.getText(); 
							int s3 = Integer.parseInt(text2); 
							if(staz.isSelected()) 
								s3*=2;
							
								if(g3<18)  {
									JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"сеуште сте малолетен!", "Пресметка", JOptionPane.WARNING_MESSAGE);	
								
								}
								else if((g3>=64)&&(s3>=15)) {  
									JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"веќе сте во пензија!", "Пресметка", JOptionPane.PLAIN_MESSAGE);
								} 
								else if((g3>=64)&&(s3<15)) { 
									int s4=15-s3;
									JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"имате доволно години за пензија, но ви фалат уште" + " "+ s4 +" "+"години стаж" , "Пресметка", JOptionPane.PLAIN_MESSAGE);
								} 
								else if((g3<64)&&(s3>=15)) { 
									int god=64-g3;
									JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"имате доволно стаж за пензија, но ви фалат уште" + " "+ god +" "+"години" , "Пресметка", JOptionPane.PLAIN_MESSAGE);
								}
								else if((g3<64)&&(s3<15)){
									int god = 64 - g3;  
									int s4 = 15 - s3;
							JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"ви фалат уште "+ god+" години и"+ " "+s4+" "+"години стаж до пензија!", "Пресметка", JOptionPane.PLAIN_MESSAGE);
								}
						}  
						
						else
						if(list.isSelectedIndex(1)) { 
							String text = g2.getText(); 
							int g3 = Integer.parseInt(text); 
							String text2 = s2.getText(); 
							int s3 = Integer.parseInt(text2); 
							if(staz.isSelected()) 
								s3*=2;
							if(g3<18)  {
								JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"сеуште сте малолетна!", "Пресметка", JOptionPane.WARNING_MESSAGE);	
							
							}
							else if((g3>=62)&&(s3>=15)) {  
								JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"веќе сте во пензија!", "Пресметка", JOptionPane.PLAIN_MESSAGE);
							} 
							else if((g3>=62)&&(s3<15)) { 
								int s4=15-s3;
								JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"имате доволно години за пензија, но ви фалат уште" + " "+ s4 +" "+"години стаж" , "Пресметка", JOptionPane.PLAIN_MESSAGE);
							} 
							else if((g3<62)&&(s3>=15)) { 
								int god=62-g3;
								JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"имате доволно стаж за пензија, но ви фалат уште" + " "+ god +" "+"години" , "Пресметка", JOptionPane.PLAIN_MESSAGE);
							}
							else if((g3<62)&&(s3<15)){
								int god = 62 - g3;  
								int s4 = 15 - s3;
						JOptionPane.showMessageDialog(null, i2.getText() + " " + p2.getText() +", " +"ви фалат уште "+ god+" години и"+ " "+s4+" "+"години стаж до пензија!", "Пресметка", JOptionPane.PLAIN_MESSAGE);
							}
							}
				}
				
			}
			);
			add(check, BorderLayout.SOUTH);

} 
}
