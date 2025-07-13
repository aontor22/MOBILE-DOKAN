package Laptop;




import Login.*;
import Payment.Search;



import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import java.util.*;



public class MainPage {



   public MainPage()
     {



       JFrame frame = new JFrame();
        JLabel l3 = new JLabel(" HP ");
        l3.setBounds(80,420,100,20);
        JLabel l4 = new JLabel("MacBook");
        l4.setBounds(330,420,100,20);
        JLabel l5 = new JLabel("Dell");
        l5.setBounds(580,420,100,20);
        JLabel l6 = new JLabel("Lenovo");
        l6.setBounds(80,662,100,20);
       JLabel l7 = new JLabel("Acer");
       l7.setBounds(330,660,100,20);
      JLabel l8 = new JLabel("Asus ");
       l8.setBounds(580,660,100,20);



       JButton b2 = new JButton(new ImageIcon("image//apple.png"));
        b2.setBounds(270,220,200,200);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Page2();
                frame.setVisible(false);
               
            }
        });



       JButton b3 = new JButton(new ImageIcon("image//hp1.png"));
        b3.setBounds(20,220,200,200);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Page1();
                frame.setVisible(false);
                
            }
        });



       JButton b4 = new JButton(new ImageIcon("image//dell1.png"));
        b4.setBounds(500,220,200,200);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Page3();
                frame.setVisible(false);
            }
        });



       JButton b5 = new JButton(new ImageIcon("image//lenovo.png"));
        b5.setBounds(20,460,200,200);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Page4();
                frame.setVisible(false);
            }
        });



       JButton b6 = new JButton(new ImageIcon("image//acer.png"));
        b6.setBounds(270,460,200,200);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Page5();
                frame.setVisible(false);
            }
        });



       JButton b7 = new JButton(new ImageIcon("image//asus3.png"));
        b7.setBounds(500,460,200,200);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Page6();
                frame.setVisible(false);
            }
        });
        
        JButton b8 = new JButton("Back");
        b8 =new JButton(new ImageIcon("image//xoxo.png"));   
        b8.setBounds(10,20,150,60);
        b8.setForeground(Color.WHITE);
        b8.setBackground(new Color(80,80,80));
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Home();
                frame.setVisible(false);
               
            }
        });
        JButton b9 = new JButton("Logout");
        b9 =new JButton(new ImageIcon("image//logout1.png"));   
        b9.setBounds(620,15,150,60);
        b9.setForeground(Color.WHITE);
        b9.setBackground(new Color(80,80,80));
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Home();
                frame.setVisible(false);
               
            }
        });
        
        
       JLabel l2 = new JLabel("Search here");
       l2.setBounds(270,155,300,20);         
        
       JTextField tf1=new JTextField();  
        tf1.setBounds(180,150,300,30);
        JButton b1=new JButton("Search");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(80,80,80));        
        b1.setBounds(500,150,150,30);
        b1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {  
        
            String pass =tf1.getText();
           
                if(pass.equals("hp"))
                {
                    frame.setVisible(false);
                    new Page1();
                }
                if(pass.equals("dell"))
                {
                    frame.setVisible(false);
                    new Page3();
                }
                if(pass.equals("macbook"))
                {
                    frame.setVisible(false);
                    new Page2();
                }
                if(pass.equals("lenovo"))
                {
                    frame.setVisible(false);
                    new Page4();
                }
                if(pass.equals("acer"))
                {
                    frame.setVisible(false);
                    new Page5();
                }
                if(pass.equals("asus"))
                {
                    frame.setVisible(false);
                    new Page6();
                } 
                else
                {
                	JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
                 
            
            });
        frame.add(b1);
        frame.add(l2);
        frame.add(tf1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(b8);
        frame.add(b9);
        
        frame.setLayout(null);
        //frame.getContentPane().add(BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#FFFFFF"));
        frame.setSize(800,800);
        frame.setTitle("4A-Tech");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        }
    public static void main(String[] args) {  
         
         //new Profile("Test");
         //new Dashboard("Test");
         new MainPage();
        }
     }