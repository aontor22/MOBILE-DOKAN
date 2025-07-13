package Laptop;


import Payment.*;
import Login.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Page1 extends JFrame
{
	private JButton b1,b2,b3;
	private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	private JLabel l1,l2,l3;
	//private JRadioButton r1,r2,r3;
	private JTextArea ta1;
	private ImageIcon img;
	public Page1()
	{
		JFrame f =new JFrame();
			
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("HP");
		//c=f.getContentPane();
		f.setLayout(null);
		img= new ImageIcon("realme_logo.jpg");
		JLabel j= new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		f.add(j);
		c1=new JCheckBox("HP 240 G8");
		c1.setBounds(100,130,230,30);
		j.add(c1);
		c2=new JCheckBox("HP 240 G7 ");
		c2.setBounds(100,170,230,30);
		j.add(c2);
		c3=new JCheckBox("HP 14S");
		c3.setBounds(100,210,230,30);
		j.add(c3);
		c4=new JCheckBox("HP Pavilion 13");
		c4.setBounds(100,250,230,30);
		j.add(c4);
		c5=new JCheckBox("HP ProBook 445 G8 ");
		c5.setBounds(100,290,230,30);
		j.add(c5);
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		bg1.add(c3);
		bg1.add(c4);
		bg1.add(c5);
		
		l1=new JLabel("HP Laptops:");
		l1.setBounds(90,70,500,30);
		l1.setFont(new Font("Arial",Font.BOLD,23));
		f.add(l1);
		l1.setForeground(Color.BLACK);
		l1.setBackground(Color.BLACK);
		j.add(l1);
		
		/*r1=new JRadioButton("Price Range 10k-25k");
		r1.setBounds(100,100,230,30);*/
		
		c6=new JCheckBox("HP 250 G8 ");
		c6.setBounds(100,330,230,30);
		
		
		ta1=new JTextArea(10,10);
		ta1.setBounds(520,130,360,400);
		bg1.add(c6);
		
		
		j.add(c6);
		
	
		
		
		
		l2=new JLabel("Specifications");
		l2.setBounds(520,70,330,35);
		l2.setFont(new Font("Serif",Font.BOLD,25));
		f.add(l2);
		l2.setForeground(Color.BLACK);
		l2.setBackground(Color.BLACK);
		j.add(l2);
		
		//buy
		b1=new JButton("Buy");
		b1 =new JButton(new ImageIcon("image//buy5.png"));
		b1.setBounds(520,605,100,30);
		j.add(b1);
		
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
				ta1.setText("HP 240 G8\n\nProcessor:Intel Core I5-1135G7\n\nMemory:8 GB\n\nStorage: 1 TB 5400 SATA Rpm HDD \n\nOperating System:Windows 10\n\nGraphics:Intel Iris Xe Graphics\n\nRam:4 GB\n\nDisplay:Full HD\n\nWebCam:HP TrueVision HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:69000 Taka");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	    c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("HP 240 G7 \n\nProcessor:Intel Core I3-1005G1\n\nMemory:4GB\n\nStorage:1 TB 5400 SATA Rpm HDD\n\nOperating System:Windows 10\n\nGraphics:Intel Iris UHD Graphics 620\n\nDisplay:HD\n\nWebCam:HP TrueVision HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:49000 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
				
			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("HP 14S\n\nProcessor:Intel Core I5 12 Gen\n\nMemory:8GB\n\nStorage:512 GB PCIe NVMe M.2 SSD\n\nOperating System:Windows 10\n\nGraphics:Intel Iris Xe Graphics\n\nDisplay:Full HD\n\nWebCam:HP True Vision 720p HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:78500 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("HP Pavilion 13\n\nProcessor:Intel Core I5-1135G7 \n\nMemory:8GB\n\nStorage:512 GB PCIe NVMe M.2 SSD\n\nOperating System:Windows 10\n\nGraphics:Intel Iris Xe Graphics\n\nDisplay:Full HD\n\nWebCam:HP True Vision 720p HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:79000 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("HP ProBook 445 G8\n\nAMD Ryzen 5 5600U\n\nMemory:8GB\n\nStorage:512 GB PCIe NVMe M.2 SSD\n\nOperating System:Windows 10\n\nGraphics:AMD Radeon Graphics\n\nDisplay:Full HD\n\nWebCam:HP True Vision 720p HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:81000 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("HP 250 G8\n\nProcessor:Intel Core I3-1115G4\n\nMemory:8GB\n\nStorage:1 TB 5400 SATA Rpm HDD\n\nOperating System:Windows 10\n\nGraphics:Intel UHD Graphics\n\nDisplay:Full HD\n\nWebCam:HD Webcam\n\nWarranty:3 Years International Limited Warranty\n\nPrice:59500 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
                ta1.setEditable(false);				
			}
		});
		
		

	        l3 =new JLabel("Add Laptop");
	        l3.setBounds(300,570,120,50);
	        l3.setFont(new Font("Add Quantity", Font.BOLD,13));
	        f.add(l3);
	        
	        String[] cb4Str = { "Please Select Laptop","HP 240 G8", "HP 240 G7","HP 14S","HP Pavilion 13","HP ProBook 445 G8","HP 250 G8" };
	        JComboBox cb4 = new JComboBox(cb4Str);
	        cb4.setBounds(260,610,180,30);
	        cb4.setSelectedIndex(0);
	        //cb4.setFont(f5);
	        cb4.setBackground(Color.WHITE);
	        f.add(cb4);
	        
	       
	        
			
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