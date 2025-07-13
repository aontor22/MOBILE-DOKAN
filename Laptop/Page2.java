package Laptop;


import Payment.*;
import Login.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Page2 extends JFrame
{
	private JButton b1,b2,b3;
	private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	private JLabel l1,l2,l3;
	//private JRadioButton r1,r2,r3;
	private JTextArea ta1;
	private ImageIcon img;
	public Page2()
	{
		JFrame f = new JFrame();
			
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Apple");
		//c=f.getContentPane();
		f.setLayout(null);
		img= new ImageIcon("realme_logo.jpg");
		JLabel j= new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		f.add(j);
		c1=new JCheckBox("Apple Macbook Air M2");
		c1.setBounds(100,130,230,30);
		j.add(c1);
		c2=new JCheckBox("Apple MacBook Pro");
		c2.setBounds(100,170,230,30);
		j.add(c2);
		c3=new JCheckBox("Apple MacBook Air");
		c3.setBounds(100,210,230,30);
		j.add(c3);
		
		
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		bg1.add(c3);
		/*
		bg1.add(c4);
		bg1.add(c5);*/
		
		l1=new JLabel("Apple Laptops:");
		l1.setBounds(90,70,500,30);
		l1.setFont(new Font("Arial",Font.BOLD,23));
		f.add(l1);
		l1.setForeground(Color.BLACK);
		l1.setBackground(Color.BLACK);
		j.add(l1);
		
		
		
		ta1=new JTextArea(10,10);
		ta1.setBounds(520,130,360,400);
		bg1.add(c6);
		
		
		l2=new JLabel("Specifications");
		l2.setBounds(520,70,330,35);
		l2.setFont(new Font("Serif",Font.BOLD,25));
		f.add(l2);
		l2.setForeground(Color.BLACK);
		l2.setBackground(Color.BLACK);
		j.add(l2);
		
		//previous
		b2=new JButton("Previous");
		b2 =new JButton(new ImageIcon("image//previous1.png"));
		b2.setBounds(10,700,150,60);
		j.add(b2);
		
		//logout
		b3=new JButton("Logout");
		b3 =new JButton(new ImageIcon("image//logout1.png"));
		b3.setBounds(730,700,150,60);
		j.add(b3);
		
		/*j.add(c12);
		j.add(c13);
		j.add(c14);
		j.add(c15);*/
		ButtonGroup bg=new ButtonGroup();
		
	/*	bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		j.add(r1);
		j.add(r2);
		j.add(r3);*/
		
		j.add(ta1);
		f.setSize(900,900);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setVisible(true);
		
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				
				setVisible(false);
				new MainPage();
				
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				setVisible(false);
				new Home();
			}
		});
		c1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple Macbook Air M2\n\nProcessor:Apple M2 Chip 8-Core CPU With 4 Performance Cores And 4 Efficiency Cores\n\nMemory:8 GB\n\nStorage:512GB SSD\n\nOperating System:MacOS\n\nGraphics:8-Core GPU 16-Core Neural Engine\n\nDisplay:Liquid Retina Display\n\nWebCam:1080p FaceTime HD Camera\n\nWarranty:1 Years International Limited Warranty\n\nPrice:178000 Taka");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	    c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple MacBook Pro\n\nProcessor:Apple M1 Pro Chip\n\nMemory:16 GB\n\nStorage:1TB SSD\n\nOperating System:MacOS\n\nGraphics:16-Core GPU\n\nDisplay:Liquid Retina XDR Display\n\nWebCam:1080p FaceTime HD Camera\n\nWarranty:1 Years International Limited Warranty\n\nPrice:278000 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
				
			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Apple MacBook Air\n\nProcessor:Apple M1\n\nMemory:8 GB\n\nStorage:256GB SSD\n\nOperating System:MacOS\n\nGraphics:Integrated Graphics\n\nDisplay:IPS Display\n\nWebCam:720p FaceTime HD Camera\n\nWarranty:1 Years International Limited Warranty\n\nPrice:11200 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		
		

		  	l3 =new JLabel("Add Laptop");
	        l3.setBounds(300,570,120,50);
	        l3.setFont(new Font("Add Quantity", Font.BOLD,13));
	        f.add(l3);
	        
	        String[] cb4Str = { "Please Select Laptop","Apple Macbook Air M2", "Apple MacBook Pro","Apple MacBook Air","HP Pavilion 13" };
	        JComboBox cb4 = new JComboBox(cb4Str);
	        cb4.setBounds(260,610,180,30);
	        cb4.setSelectedIndex(0);
	        //cb4.setFont(f5);
	        cb4.setBackground(Color.WHITE);
	        f.add(cb4);
	        

	        
	        //buy
	        b1 =new JButton("Buy");
	        b1 =new JButton(new ImageIcon("image//buy5.png"));
			b1.setBounds(520,605,100,30);
	        b1.setForeground(Color.WHITE);
	        f.add(b1);
			
	        b1.addActionListener(new ActionListener() {
	            
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
	                        	JOptionPane.showMessageDialog(null, "Total Cost : 2000$" ,null, JOptionPane.INFORMATION_MESSAGE);
	                        	 new Payment();
	         			        f.dispose();
	                        }
	                        else if (cb4.getSelectedIndex() == 5) {
	                        	JOptionPane.showMessageDialog(null, "Total Cost : 4000$" ,null, JOptionPane.INFORMATION_MESSAGE);
	                        	 new Payment();
	         			        f.dispose();
	                        }
	                        else if (cb4.getSelectedIndex() ==6 ) {
	                        	JOptionPane.showMessageDialog(null, "Total Cost : 2000$" ,null, JOptionPane.INFORMATION_MESSAGE);
	                        	 new Payment();
	         			        f.dispose();
	                        }
	                        
		                }
		            });
		        
	     
	   
	}
}