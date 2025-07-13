
package Admin;
import Login.*;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin  {

     //Container c;
    //ImageIcon icon, logo;
    JLabel label1, imgLabel;
    Font f1, f2;
    JButton btn1, btn2, btn3, btn4, nBtn;
    Cursor cursor;

   public Admin() {
        // Frame Layout
    	JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("4A-Tech");
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.decode("#FFFFFF"));

        imgLabel = new JLabel(new ImageIcon("image//adminpanel.png"));
        imgLabel.setBounds(170, 100,500,300);
        f.add(imgLabel);
        // Logo
       // logo = new ImageIcon(getClass().getResource("/images/Admin.png"));
       // imgLabel = new JLabel(logo);
        //imgLabel.setBounds(127, 20, logo.getIconWidth(), logo.getIconHeight());
       // c.add(imgLabel);

        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
       

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("User Data");
        btn1 =new JButton(new ImageIcon("image//user data4.png"));   
        btn1.setBounds(350, 380, 150, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.BLACK);
        f.add(btn1);

        btn2 = new JButton("Back");
        btn2 =new JButton(new ImageIcon("image//xoxo.png"));   
        btn2.setBounds(10, 700, 150, 60);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.BLACK);
        f.add(btn2);

        btn3 = new JButton("Exit");
        btn3 =new JButton(new ImageIcon("image//exit3.png")); 
        btn3.setBounds(630, 700, 150, 60);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.RED);
        f.add(btn3);

        btn4 = new JButton("Admin Password");
        btn4 =new JButton(new ImageIcon("image//admin password.png"));
        btn4.setBounds(320, 465, 200, 60);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.BLACK);
        f.add(btn4);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        f.add(nBtn);

        // User Data
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                
                new UserData();
                f.dispose();
            }
        });

        // Exit Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                
                new Home();
                f.dispose();
            }
        });

        // Admin Password
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new AdminPassword();
                f.dispose();
            }
        });
    }

     
}
