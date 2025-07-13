
package Admin;
import Login.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class AdminLogin extends JFrame {

   // private Container c;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1;
    private JButton btn1, btn2, btn3, nBtn;
    private JPasswordField tf2;
    private Cursor cursor;

   public AdminLogin() {
        // Frame Layout
    	JFrame f =new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Travel Agency");
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.decode("#FFFFFF"));

       

        // Icon
        imgLabel = new JLabel(new ImageIcon("image//admin.png"));
        imgLabel.setBounds(170, 100,500,100);
        f.add(imgLabel);
        // Logo
        //logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
       // imgLabel = new JLabel(logo);
       // imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
       // c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 30);
        f5 = new Font("Segoe UI", Font.PLAIN, 22);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

       
       

        // User Name
        label1 = new JLabel();
        label1.setText("Name");
        label1.setBounds(170, 250, 210, 35);
        label1.setFont(f2);
        f.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(270, 250, 210, 35);
        tf1.setFont(f5);
        f.add(tf1);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(120, 300, 210, 35);
        label1.setFont(f2);
        f.add(label1);

        tf2 = new JPasswordField();
        tf2.setBounds(270, 300, 210, 35);
        tf2.setFont(f2);
        tf2.setEchoChar('*');
        f.add(tf2);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(120, 450, 215, 30);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.RED);
        f.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(380, 450, 215, 30);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.BLACK);
        f.add(btn2);

        btn3 = new JButton("Login");
        btn3.setBounds(270, 380, 215, 30);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.BLUE);
        f.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        f.add(nBtn);

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
                f.dispose();
            }
        });

        // Login Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // Admin Name
                String textField2 = tf2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {

                        String userNameS = "Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader("data//admindata.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get("data//admindata.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get("data//admindata.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Admin Login Successful.",null ,
                                            JOptionPane.WARNING_MESSAGE);

                                    
                                    new Admin();
                                    f.dispose();
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
    }

    
}
