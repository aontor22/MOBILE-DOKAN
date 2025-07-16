package Login;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class Registration  {

    
    // ImageIcon icon, logo;
     JLabel label1, imgLabel;
     Font f1, f2, f3, f4, f5, f6;
     JTextField tf1, tf2, tf4, tf5;
     JComboBox securityQsn;
     JButton btn1, btn2, btn3, btn4, nBtn;
     JPasswordField tf3;
     Cursor cursor;
    private int a, b;

    Registration() {
        // Frame Layout
    	JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        f.setSize(900, 900);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Register Account");
        label1.setBounds(230, 25, 500, 50);
        label1.setFont(f2);
        f.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User Name");
        label1.setBounds(230, 75, 500, 50);
        f.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(230, 115, 160, 30);
        //tf1.setFont(f5);
        f.add(tf1);

        // Email
          label1 = new JLabel();
          label1.setText("Email");
          label1.setBounds(230, 150, 500, 50);
          f.add(label1);

         tf2 = new JTextField();
         tf2.setBounds(230, 190, 360, 30);
         //tf2.setFont(f5);
         f.add(tf2);

        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(430, 75, 500, 50);
        f.add(label1);

        tf3 = new JPasswordField();
        tf3.setBounds(430, 115, 160, 30);
        tf3.setEchoChar('*');
        f.add(tf3);

        label1 = new JLabel();
        label1.setText("Phone Number");
        label1.setBounds(230, 230, 500, 50);
        f.add(label1);

        tf4 = new JTextField();
        tf4.setBounds(230, 270, 360, 30);
        //tf4.setFont(f5);
        f.add(tf4);

        
        label1 = new JLabel();
        label1.setText("Already have an account?");
        label1.setBounds(340, 360, 500, 50);
        f.add(label1);
        
        label1 = new JLabel();
        label1.setText("If you already have an account with us, please login at the ");
        label1.setBounds(245, 400, 500, 50);
        f.add(label1);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);

        

        btn2 = new JButton("login");
        btn2.setBounds(245, 435, 70, 20);
        btn2.setCursor(cursor);
       //btn2.setForeground(Color.WHITE);
        //btn2.setBackground(Color.decode("#2E75B6"));
        f.add(btn2);
        
        btn1 = new JButton("Exit");
        btn1.setBounds(53, 325, 183, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        //f.add(btn1);

        btn4 = new JButton("Continue");
        btn4.setBounds(230, 325, 360, 35);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        f.add(btn4);

        btn3 = new JButton("Reset");
        btn3.setBounds(450, 325, 183, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
       // f.add(btn3);
        
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

               // setVisible(false);
                 new Home();
                f.dispose();
            }
        });

        // Reset Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

               // setVisible(false);
                 new Registration();
                f.dispose();
            }
        });

        // Register Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Email
                String textField3 = tf3.getText(); // Password
                String textField4 = tf4.getText(); // PhoneNumber
                //String textField5 = tf5.getText(); // Captcha
               // String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question
               // int result = 0;

                if (textField3.isEmpty()) {
                   // JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                           // JOptionPane.WARNING_MESSAGE);
                } else {
                    //result = Integer.parseInt(tf4.getText());
                    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty())
                             {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } 
                     else {

                        try {
                            File file = new File("data//userdata.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name : " + textField1);
                            pw.println("Password : " + textField3);
                            pw.println("Email : " + textField2);
                           // pw.println("Security Question : " + secQsn);
                            pw.println("Phone Number : " + textField4);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
                                "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        
                        new Home();
                        f.dispose();
                    }
                }
            }
        });
    }
}