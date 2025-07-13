package Laptop;


import Payment.*;
import Login.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Page3 extends JFrame
{
	private JButton b1,b2,b3;
	private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	private JLabel l1,l2,l3;
	//private JRadioButton r1,r2,r3;
	private JTextArea ta1;
	private ImageIcon img;
	public Page3()
	{
		JFrame f =new JFrame();
			
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Dell");
		//c=f.getContentPane();
		f.setLayout(null);
		img= new ImageIcon("realme_logo.jpg");
		JLabel j= new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		f.add(j);
		c1=new JCheckBox("Dell Vostro 14 3400 ");
		c1.setBounds(100,130,230,30);
		j.add(c1);
		c2=new JCheckBox("Dell Vostro 15 3500 ");
		c2.setBounds(100,170,230,30);
		j.add(c2);
		c3=new JCheckBox("Dell Inspiron 15 3501");
		c3.setBounds(100,210,230,30);
		j.add(c3);
		c4=new JCheckBox("Dell Inspiron 15 3505");
		c4.setBounds(100,250,230,30);
		j.add(c4);
		c5=new JCheckBox("Dell Vostro 14 3400 ");
		c5.setBounds(100,290,230,30);
		j.add(c5);
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		bg1.add(c3);
		bg1.add(c4);
		bg1.add(c5);
		
		l1=new JLabel("Dell Laptops:");
		l1.setBounds(90,70,500,30);
		l1.setFont(new Font("Arial",Font.BOLD,23));
		f.add(l1);
		l1.setForeground(Color.BLACK);
		l1.setBackground(Color.BLACK);
		j.add(l1);
		
		/*r1=new JRadioButton("Price Range 10k-25k");
		r1.setBounds(100,100,230,30);*/
		
		c6=new JCheckBox("Dell Inspiron 15 3501");
		c6.setBounds(100,330,230,30);
		
		
		ta1=new JTextArea(10,10);
		ta1.setBounds(520,130,360,400);
		bg1.add(c6);
		
		/*bg1.add(c7);
		bg1.add(c8);
		bg1.add(c9);
		bg1.add(c10);
		bg1.add(c11);*/
		j.add(c6);
		
	
		
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
				ta1.setText("Dell Vostro 14 3400 \n\nProcessor:Intel Core I3-1115G4\n\nMemory:4 GB 2666MHz DDR4 RAM\n\nStorage: 1 TB 5400 SATA Rpm HDD \n\nOperating System:Windows 10\n\nGraphics:Intel UHD Graphics\n\nDisplay:HD\n\nWebCam:HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:46800 Taka");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	    c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Dell Vostro 15 3500 \n\nProcessor:Intel Core I3-1115G4\n\nMemory:4GB 2666MHz DDR4 RAM\n\nStorage:1 TB 5400 SATA Rpm HDD\n\nOperating System:Windows 10\n\nGraphics:Intel UHD Graphics With The Shared Graphics Memory\n\nDisplay:Full HD\n\nWebCam:1280x720 Intergrated HD Webcam\n\nWarranty:3 Years International Limited Warranty\n\nPrice:51000 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
				
			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Dell Inspiron 15 3501\n\nProcessor:Intel Core I5-1135G7\n\nMemory:4GB 3200MHz DDR4 RAM\n\nStorage:1TB HDD\n\nOperating System:Windows 10\n\nGraphics:Intel Iris Xe Graphics\n\nDisplay:Full HD\n\nWebCam:Integrated Widescreen HD (720p) Webcam With Single Digital Microphone\n\nWarranty:3 Years International Limited Warranty\n\nPrice:57800 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Dell Inspiron 15 3505\n\nProcessor:AMD Ryzen 7 3700U \n\nMemory:8GB 3200MHz DDR4 RAM\n\nStorage:512 GB PCIe NVMe M.2 SSD\n\nOperating System:Windows 10\n\nGraphics:Radeon RX Vega 10 Graphics\n\nDisplay:Full HD\n\nWebCam: 720p HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:62990 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Dell Vostro 14 3400\n\nIntel Core I5-1135G7 Processor\n\nMemory:4GB\n\nStorage:1TB 5400 Rpm HDD\n\nOperating System:Windows 10\n\nGraphics:Intel Iris Xe Graphics\n\nDisplay:Full HD\n\nWebCam:HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:62500 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Dell Inspiron 15 3501\n\nProcessor:Intel Core I3-1115G4\n\nMemory:4GB\n\nStorage:1 TB 5400 SATA Rpm HDD\n\nOperating System:Windows 10\n\nGraphics:Intel UHD Graphics\n\nDisplay:Full HD\n\nWebCam:HD Webcam\n\nWarranty:3 Years International Limited Warranty\n\nPrice:47500 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
                ta1.setEditable(false);				
			}
		});
		
		

			l3 =new JLabel("Add Laptop");
	        l3.setBounds(300,570,120,50);
	        l3.setFont(new Font("Add Quantity", Font.BOLD,13));
	        f.add(l3);
		        
	        String[] cb4Str = { "Please Select Laptop","Dell Vostro 14 3400", "Dell Vostro 15 3500","Dell Inspiron 15 3501","Dell Inspiron 15 3505","Dell Vostro 14 3400" };
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