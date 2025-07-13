package Laptop;


import Payment.*;
import Login.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Page6 extends JFrame
{
	private JButton b1,b2,b3;
	private JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	private JLabel l1,l2,l3;
	//private JRadioButton r1,r2,r3;
	private JTextArea ta1;
	private ImageIcon img;
	public Page6()
	{
		JFrame f = new JFrame();
			
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Asus");
		//c=f.getContentPane();
		f.setLayout(null);
		img= new ImageIcon("realme_logo.jpg");
		JLabel j= new JLabel("",img,JLabel.CENTER);
		j.setBounds(0,0,900,900);
		f.add(j);
		c1=new JCheckBox("ASUS X515MA");
		c1.setBounds(100,130,230,30);
		j.add(c1);
		c2=new JCheckBox("ASUS VivoBook 15 X515EA ");
		c2.setBounds(100,170,230,30);
		j.add(c2);
		c3=new JCheckBox("ASUS VivoBook X515EP");
		c3.setBounds(100,210,230,30);
		j.add(c3);
		c4=new JCheckBox("Asus VivoBook Pro 15 M3500QC");
		c4.setBounds(100,250,230,30);
		j.add(c4);
		c5=new JCheckBox("Asus VivoBook Pro 15 K3500PA ");
		c5.setBounds(100,290,230,30);
		j.add(c5);
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		bg1.add(c3);
		bg1.add(c4);
		bg1.add(c5);
		
		l1=new JLabel("Asus Laptops:");
		l1.setBounds(90,70,500,30);
		l1.setFont(new Font("Arial",Font.BOLD,23));
		f.add(l1);
		l1.setForeground(Color.BLACK);
		l1.setBackground(Color.BLACK);
		j.add(l1);
		
		/*r1=new JRadioButton("Price Range 10k-25k");
		r1.setBounds(100,100,230,30);*/
		
		c6=new JCheckBox("Asus VivoBook 14 X415FA ");
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
				ta1.setText("ASUS X515MA\n\nProcessor:Intel Celeron N4020 Processor 1.1 GHz\n\nMemory:4GB 2400MHz DDR4 SDRAM\n\nStorage:1 TB 5400 SATA Rpm HDD \n\nOperating System:Windows 10\n\nGraphics:Intel UHD Graphics 605\n\nDisplay:HD\n\nWebCam:Vga\n\nWarranty:3 Years International Limited Warranty\n\nPrice:45000 Taka");
			    ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
	    c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("ASUS VivoBook 15 X515EA\n\nProcessor:Intel Core I3-1115G4 Processor\n\nMemory:8GB DDR4 RAM\n\nStorage:512GB PCI-E G3 SSD\n\nOperating System:Windows 11\n\nGraphics:Intel UHD Graphics \n\nDisplay:Full HD\n\nWebCam:Vga Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:64000 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
				
			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("ASUS VivoBook X515EP\n\nProcessor:Intel Core I5 11 Gen\n\nMemory:8GB 3200 MHz\n\nStorage:512 GB PCIe NVMe M.2 SSD\n\nOperating System:Windows 11\n\nGraphics:NVIDIA GeForce MX330, 2GB GDDR5\n\nDisplay:Full HD\n\nWebCam:Vga Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:81500 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Asus VivoBook Pro 15 M3500QC\n\nProcessor:AMD Ryzen 7 5800H \n\nMemory:16GB DDR4 \n\nStorage:512 GB PCIe NVMe M.2 SSD\n\nOperating System:Windows 11\n\nGraphics:NVIDIA GeForce RTX 3050 4GB\n\nDisplay:Full HD\n\nWebCam:720p HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:122000 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Asus VivoBook Pro 15 K3500PA\n\nIntel Core I7-11370HProcessor 3.3 GHz\n\nMemory:8GB DDR4 3200MHz Onboard\n\nStorage:512 GB PCIe NVMe M.2 SSD\n\nOperating System:Windows 10\n\nGraphics:Intel Iris Xe Graphics\n\nDisplay:Full HD\n\nWebCam:720p HD Camera\n\nWarranty:3 Years International Limited Warranty\n\nPrice:107000 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
				ta1.setEditable(false);
			}
		});
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
            {
				ta1.setText("Asus VivoBook 14 X415FA\n\nProcessor:Intel Core I3-10110U\n\nMemory:4GB\n\nStorage:1 TB 5400 SATA Rpm HDD\n\nOperating System:Windows 10\n\nGraphics:Intel UHD Graphics\n\nDisplay:Full HD\n\nWebCam:Vga Webcam\n\nWarranty:3 Years International Limited Warranty\n\nPrice:50000 Taka");
				ta1.setFont(new Font("Arial", Font.BOLD,13));
                ta1.setEditable(false);				
			}
		});
		
		

			l3 =new JLabel("Add Laptop");
	        l3.setBounds(300,570,120,50);
	        l3.setFont(new Font("Add Quantity", Font.BOLD,13));
	        f.add(l3);
	        
	        String[] cb4Str = { "Please Select Laptop","ASUS X515MA", "ASUS VivoBook 15 X515EA","ASUS VivoBook X515EP","Asus VivoBook Pro 15 M3500QC","Asus VivoBook Pro 15 K3500PA" };
	        JComboBox cb4 = new JComboBox(cb4Str);
	        cb4.setBounds(260,610,180,30);
	        cb4.setSelectedIndex(0);
	        //cb4.setFont(f5);
	        cb4.setBackground(Color.WHITE);
	        f.add(cb4);
	        
	        
	      //buy
			b1=new JButton("Buy");
			b1 =new JButton(new ImageIcon("image//buy5.png"));
			b1.setBounds(520,605,100,30);
			j.add(b1);

			
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