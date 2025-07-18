
package Mobile;

import Payment.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import java.awt.Color;
import java.util.*;
public class iPhone10{
	
	public iPhone10()
	{
		 JFrame f = new JFrame();
		 //f.setLocationRelativeTo(null);
		 
		 JLabel l1 = new JLabel(new ImageIcon("image//i10.jpg"),JLabel.CENTER);
	     l1.setBounds(0,0,800,800);
		 
	     
	        JButton b1=new JButton("<-previous page");
	        //b1.setBackground(new Color(0,70,0));		
	        b1.setBounds(0,110,150,20);  
			
	        b1.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					new Apple();
					
			        f.dispose();
					
					
				}
			});
	       
		   
		   
		   
		   
	        
	        String[] cb4Str = { "Number Item...","1", "2", "3", "4", "5", "6", "7" };
	        JComboBox cb4 = new JComboBox(cb4Str);
	        cb4.setBounds(580, 120, 250, 30);
	        cb4.setSelectedIndex(0);
	        //cb4.setFont(f5);
	        cb4.setBackground(Color.WHITE);
	        
	        
	        JButton b3=new JButton("Buy");
	        b3.setBackground(new Color(0,0,0));		
	        b3.setBounds(310,650,150,20); 
	        b3.setForeground(Color.WHITE);
			
	        b3.addActionListener(new ActionListener() {
	            
	            public void actionPerformed(ActionEvent ae) {
	               
	                if ((cb4.getSelectedIndex()) == 0) 
	                {
	                	 JOptionPane.showMessageDialog( null, "Please Select Quantity" , null, JOptionPane.INFORMATION_MESSAGE);
	                             //new iPhone10();
	                            // f.dispose();
	                }

                        if (cb4.getSelectedIndex() == 1) {
                        	JOptionPane.showMessageDialog(null, "Total Cost : 2000$" ,null, JOptionPane.INFORMATION_MESSAGE);
                        	 new Payment();
         			          f.dispose();
                        } 
                        else if (cb4.getSelectedIndex() == 2) {
                        	JOptionPane.showMessageDialog(null, "Total Cost : 3000$" ,null, JOptionPane.INFORMATION_MESSAGE);
                        	 new Payment();
         			        f.dispose();
                        } 
                        else if (cb4.getSelectedIndex() == 3) {
                        	JOptionPane.showMessageDialog(null, "Total Cost : 4000$" ,null, JOptionPane.INFORMATION_MESSAGE);
                        	 new Payment();
         			        f.dispose();
                        } 
                        else if (cb4.getSelectedIndex() == 4) {
                        	JOptionPane.showMessageDialog(null, "Total Cost : 5000$" ,null, JOptionPane.INFORMATION_MESSAGE);
                        	 new Payment();
         			        f.dispose();
                        }
                        else if (cb4.getSelectedIndex() == 5) {
                        	JOptionPane.showMessageDialog(null, "Total Cost : 6000$" ,null, JOptionPane.INFORMATION_MESSAGE);
                        	 new Payment();
         			        f.dispose();
                        }
	                   
                        
	                }
	            });
	        
	     
	     f.add(cb4);
	     f.add(b3);
	     f.add(l1);
	     f.add(b1);
	     //f.add(b2);
         f.setLayout(null);
	     f.setSize(800,800);
	     f.setVisible(true);
		 f.setLocationRelativeTo(null);
		 
	}
}