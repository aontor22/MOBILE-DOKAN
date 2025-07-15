
package Payment;
import Mobile.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import java.awt.Color;
import java.util.*;
import javax.swing.ImageIcon;

public class  Search{

	public  Search()
     {

        JFrame frame = new JFrame();
       
	   JButton b2=new JButton("Mobile Page");
	        //b1.setBackground(new Color(0,70,0));		
	        b2.setBounds(170,200,150,20);  
			
	        b2.addActionListener( new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					new Mobile();
					
			        frame.dispose();
					
					
				}
			});
       JLabel l2 = new JLabel("Search here");
	   l2.setBounds(170,150,300,20); 		
		
       JTextField tf1=new JTextField();  
        tf1.setBounds(80,150,300,30);
        JButton b1=new JButton("Search"); 
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(80,80,80));		
        b1.setBounds(400,150,150,30);
        b1.addActionListener( new ActionListener()
        { 
        	public void actionPerformed(ActionEvent e){  
        
            String pass =tf1.getText();
           
                if(pass.equals("oppof21Pro"))
    			{
    				frame.setVisible(false);
    				new OppoF21Pro();
    			}
    			else if(pass.equals("vivox70Pro"))
    			{
    				frame.setVisible(false);
    				new VivoX70Pro();
    			}
				else if(pass.equals("vivox60Pro"))
    			{
    				frame.setVisible(false);
    				new VivoX60Pro();
    			}
				else if(pass.equals("iphone11"))
    			{
    				frame.setVisible(false);
    				new iPhone11();
    			}
				else if(pass.equals("iphone12"))
    			{
    				frame.setVisible(false);
    				new iPhone12();
    			}
				else if(pass.equals("iphone13"))
    			{
    				frame.setVisible(false);
    				new iPhone13();
    			}
				else if(pass.equals("iphoneX"))
    			{
    				frame.setVisible(false);
    				new iPhone10();
    			}
				else if(pass.equals("oppoA95"))
    			{
    				frame.setVisible(false);
    				new OppoA95();
    			}
				else if(pass.equals("OppoA16e"))
    			{
    				frame.setVisible(false);
    				new OppoA16e();
    			}
				else if(pass.equals("OppoReno5"))
    			{
    				frame.setVisible(false);
    				new OppoReno5();
    			}
				
    		}
        	
        });
        frame.add(b1);
		frame.add(b2);
        frame.add(l2);
        frame.add(tf1);
       // frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        //frame.getContentPane().add(BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#FFFFFF"));
		
        frame.setSize(600,500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        }
	public static void main(String[] args) {  
		 
		 //new Profile("Test");
		 //new Dashboard("Test");
		 new Search();
		} 
     }
    