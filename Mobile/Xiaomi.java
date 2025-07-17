package Mobile;
import Login.*;
import Payment.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import java.awt.Color;
import java.util.*;
import javax.swing.ImageIcon;

public class  Xiaomi{

	public  Xiaomi()
     {

        JFrame frame = new JFrame();
       
	   JLabel l3 = new JLabel("Xiaomi 12");
	   l3.setBounds(80,420,100,20);
       JLabel l4 = new JLabel("Xiaomi 13");
	   l4.setBounds(330,420,100,20);
       JLabel l5 = new JLabel("Xiaomi 11");
	   l5.setBounds(580,420,100,20);
	   JLabel l6 = new JLabel("Xiaomi 10");
	   l6.setBounds(80,662,100,20);
	   JButton b8 = new JButton("Oppo");
        b8.setBounds(90,110,80,20);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Oppo();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });
		
		
		JButton b9 = new JButton("Vivo");
        b9.setBounds(190,110,80,20);
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Vivo();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });
		
		JButton b11 = new JButton("Apple");
        b11.setBounds(290,110,80,20);
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Apple();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });
		
		
		JButton b12 = new JButton("Xiaomi");
        b12.setBounds(390,110,80,20);
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Xiaomi();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });
		
		JButton b13 = new JButton("Oneplus");
        b13.setBounds(490,110,80,20);
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new OnePlus();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });
		
		JButton b14 = new JButton("LogOut");
        b14.setBounds(590,110,80,20);
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Home();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });
		JButton b15 = new JButton("1 - 30,000");
        b15.setBounds(170,150,200,20);
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new  Oppo();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });
		
		JButton b16 = new JButton(" 30,000+ ");
        b16.setBounds(390,150,200,20);
        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Apple();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });
		
		
	   

        JButton b2 = new JButton(new ImageIcon("image//Xiaomi13.jpg"));
        b2.setBounds(270,220,200,200);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new Xiaomi13 ();
            	frame.setVisible(false);
               // JOptionPane.showMessageDialog(frame, "Calendar clicked");
            }
        });

        JButton b3 = new JButton(new ImageIcon("image//Xiaomi12.jpg"));
        b3.setBounds(20,220,200,200);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(frame, "Clock clicked");
				
				new Xiaomi12();
            	frame.setVisible(false);
				
            }
        });

        JButton b4 = new JButton(new ImageIcon("image//Xiaomi11.jpg"));
        b4.setBounds(500,220,200,200);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(frame, "Contact clicked");
				
				new Xiaomi11();
            	frame.setVisible(false);
				
            }
        });

        JButton b5 = new JButton(new ImageIcon("image//Xiaomi10.jpg"));
        b5.setBounds(20,460,200,200);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(frame, "Mail clicked");
				new Xiaomi10();
            	frame.setVisible(false);
				
				
            }
        });

        
       JLabel l2 = new JLabel("Search here");
	   l2.setBounds(270,50,300,20); 		
		
       JTextField tf1=new JTextField();  
        tf1.setBounds(180,50,300,30);
        JButton b1=new JButton("Search"); 
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(80,80,80));		
        b1.setBounds(500,50,150,30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(frame, "Messages clicked");
				//JOptionPane.showMessageDialog(frame, "Mail clicked");
				new Search();
            	frame.setVisible(false);
				
				
            }
        });
        frame.add(b1);
        frame.add(l2);
        frame.add(tf1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
		frame.add(b8);
		frame.add(b9);
		frame.add(b11);
		frame.add(b12);
		frame.add(b13);
		frame.add(b14);
		frame.add(b15);
		frame.add(b16);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		
       // frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        //frame.getContentPane().add(BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#FFFFFF"));
		
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        }
	public static void main(String[] args) {  
		 
		 //new Profile("Test");
		 //new Dashboard("Test");
		 new Xiaomi();
		} 
     }
    