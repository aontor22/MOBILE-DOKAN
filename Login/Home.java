package Login;




import Admin.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Home 
 {
	 JFrame f =new JFrame();

     
     ImageIcon icon, logo;
     JLabel label1, imgLabel;
     Font f1, f2;
     JButton btn1, btn2, btn3, btn4, nBtn;
     Cursor cursor;
	 JTextField tf1;
	 JPasswordField tf2;

   public Home() 
	{
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("4A-Tech");
        f.setSize(900, 900);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
		f.setVisible(true);

        f.getContentPane();
        f.setLayout(null);
        f.setBackground(Color.decode("#F2F2F2"));


        f1 = new Font("Tahoma", Font.BOLD, 48);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons
        
        JLabel l6=new JLabel("Account Login");
        l6.setBounds(300, 50, 500, 50);
        l6.setFont(f2);
        f.add(l6);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
		JLabel l2 = new JLabel();
        l2.setText("User Name");
        l2.setBounds(300, 100, 500, 50);
        //l2.setFont(f4);
        f.add( l2);

        tf1 = new JTextField();
        tf1.setBounds(300, 135, 350, 35);
        //tf1.setFont(f5);
        f.add(tf1);

        // Password
        JLabel l3 = new JLabel();
        l3.setText("Password");
        l3.setBounds(300, 160, 500, 50);
        //l3.setFont(f4);
        f.add(l3);

        tf2 = new JPasswordField();
        tf2.setBounds(300, 195, 350, 35);
        //tf2.setFont(f2);
        tf2.setEchoChar('*');
        f.add(tf2);
		 

       

        btn1 = new JButton("Login");
        btn1.setBounds(300, 250, 350, 35);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        f.add(btn1);

        JLabel l5=new JLabel("Don't have an account?");
        l5.setBounds(400, 300, 500, 50);
        f.add(l5);
        
        btn2 = new JButton("Create Your Account");
        btn2.setBounds(300, 350, 350, 35);
        //btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.BLACK);
        //btn2.setBackground(Color.decode("#2E75B6"));
        f.add(btn2);

        btn3 = new JButton("<previous");
        btn3.setBounds(0, 500, 100, 30);
        //btn3.setFont(f2);
        //btn3.setCursor(cursor);
       // btn3.setForeground(Color.WHITE);
        //btn3.setBackground(Color.decode("#C00000"));
        f.add(btn3);

        btn4 = new JButton("Admin Login");
        btn4.setBounds(750, 500, 150, 30);
        //btn4.setFont(f2);
        //btn4.setCursor(cursor);
        //btn4.setForeground(Color.WHITE);
        //btn4.setBackground(Color.decode("#2E75B6"));
        f.add(btn4);
        
        
	   
	   
	  
	  cursor = new Cursor(Cursor.HAND_CURSOR);
	  
	  btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                new Registration();
                f.dispose();
             
            }
        });

        // Exit
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Admin Login
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                new AdminLogin();
                f.dispose();
                JOptionPane.showMessageDialog(null, "By default, Admin Name and Password is : 'admin'", "Information!",
                                JOptionPane.INFORMATION_MESSAGE);
            }
        });
		 // Login Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name 
                String textField2 = tf2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader("data//userdata.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get("data//userdata.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get("data//userdata.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", null,
                                            JOptionPane.WARNING_MESSAGE);

                                    
                                     new DefPackTypes(textField1);
                                    f.dispose();
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
        });
		
		
		
		 
	}
	
	
	
    
}