package Login;


import Mobile.*;
import Laptop.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class DefPackTypes {

     JFrame f= new JFrame();
     ImageIcon icon;
     JLabel label1, imgLabel,x1,x2;
     Font f1, f2, f3;
     ImageIcon logo;
     JButton btn1, btn2, btn3,btn4, nBtn;
     Cursor cursor;
     JRadioButton mobile, laptop;
     ButtonGroup radioButtonGroup;
     int defPack = 0;
    
    public DefPackTypes(String user) {
        // Frame Layout
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("4A-Tech");
        f.setSize(800,800);
        f.setLocationRelativeTo(null);
        f.setResizable(false);

        f.getContentPane();
        f.setLayout(null);
        f.setBackground(Color.decode("#F2F2F2"));
        f.getContentPane().setBackground(Color.decode("#FFFFFF"));

        // Icon
        //con = new ImageIcon(getClass().getResource("/images/Icon.png"));
        //this.setIconImage(icon.getImage());

        // Logo
        //logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        //imgLabel = new JLabel(logo);
        //imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
        //c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 30);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("Choose  Type");
        label1.setBounds(240,20, 500, 50);
        label1.setFont(f1);
        f.add(label1);

        // International Radio Button
          mobile = new JRadioButton("Mobile");
          x1 = new JLabel(new ImageIcon("image//logo mobile1.png"));
          x1.setBounds(30, 55,500,300);
          f.add(x1);
          mobile.setBounds(378, 150, 150, 50);
          mobile.setFont(f2);
          mobile.setCursor(cursor);
          mobile.setBackground(Color.decode("#F2F2F2"));
        f.add(mobile);

        // Domestic Radio Button
         laptop= new JRadioButton("Laptop");
         x2 = new JLabel(new ImageIcon("image//laptop logo.gif"));
         x2.setBounds(30, 260,500,300);
         f.add(x2);
        laptop.setBounds(378, 350, 300, 50);
        laptop.setFont(f2);
        laptop.setCursor(cursor);
        laptop.setBackground(Color.decode("#F2F2F2"));
        f.add(laptop);

        // To group radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(mobile);
        radioButtonGroup.add(laptop);

        // Jbuttons
        
        
        btn1 =new JButton(new ImageIcon("image//exit3.png")); 
       // btn1 = new JButton("Exit");
        btn1.setBounds(10, 680, 150, 60);
        
        //btn1.setFont(f3);
       // btn1.setCursor(cursor);
       // btn1.setForeground(Color.WHITE);
        //btn1.setBackground(Color.decode("#C00000"));
        f.add(btn1);

        //btn2 = new JButton("Back");
        btn2 =new JButton(new ImageIcon("image//xoxo.png"));   

        btn2.setBounds(300, 680, 150, 60);
        //btn2.setFont(f3);
        //btn2.setCursor(cursor);
        //btn2.setForeground(Color.WHITE);
        //btn2.setBackground(Color.decode("#2E75B6"));
        f.add(btn2);

        //btn3 = new JButton("Next");
        btn3 =new JButton(new ImageIcon("image//next1.png"));
        btn3.setBounds(560, 680, 150, 60);
        //btn3.setFont(f3);
        //btn3.setCursor(cursor);
        //btn3.setForeground(Color.WHITE);
        //btn3.setBackground(Color.decode("#2E75B6"));
        f.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        f.add(nBtn);

        Handler handler = new Handler();
        mobile.addActionListener(handler);
        laptop.addActionListener(handler);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                 new Home();
                //frame.setVisible(true);
               f. setVisible(false);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (defPack == 1) {
                     new Mobile();
                    //frame.setVisible(true);
                    f.setVisible(false);
                    f.dispose();
                } else if (defPack == 2) {
                     new MainPage ();
                    //frame.setVisible(true);
                    f.setVisible(false);
                    f.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select tour type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        //Profile
        label1 = new JLabel();
        label1.setText("Profile");
        label1.setBounds(550,10, 200, 50);
        label1.setFont(f3);
        f.add(label1);
        btn4 = new JButton(user);
        btn4.setBounds (650, 5, 100, 60);
        f.add(btn4);
         btn4.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
          if(ae.getSource() == btn4)
 		{
 			String user = btn4.getText();
 			new Profile(user);
 			f.setVisible(false);
 		}
             }
             });
		
		 f.setVisible(true);
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == mobile) {
                defPack = 1;
            } else if (e.getSource() == laptop) {
                defPack = 2;
            }
        }
    }
	

   
}