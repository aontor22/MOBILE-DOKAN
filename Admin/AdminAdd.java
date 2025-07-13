
package Admin;
import Login.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class AdminAdd extends JFrame {


    private ImageIcon icon;
    private JLabel label1;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1, tf2, tf4;
    private JComboBox securityQsn;
    private JButton btn1, btn2, nBtn;
    private JPasswordField tf3;
    private Cursor cursor;

  public  AdminAdd() {
        // Frame Layout
    	JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(510, 400);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        f.setLayout(null);

      

      
        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Enter Information");
        label1.setBounds(100, 25, 500, 50);
        label1.setFont(f1);
        f.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User Name");
        label1.setBounds(45, 75, 500, 50);
        label1.setFont(f4);
        f.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(185, 85, 260, 30);
        tf1.setFont(f5);
        f.add(tf1);

        // Email
        label1 = new JLabel();
        label1.setText("Email");
        label1.setBounds(45, 110, 500, 50);
        label1.setFont(f4);
        f.add(label1);

        tf2 = new JTextField();
        tf2.setBounds(185, 120, 260, 30);
        tf2.setFont(f5);
        f.add(tf2);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(45, 145, 500, 50);
        label1.setFont(f4);
        f.add(label1);

        tf3 = new JPasswordField();
        tf3.setBounds(185, 155, 260, 30);
        tf3.setFont(f2);
        tf3.setEchoChar('*');
        f.add(tf3);

        
        label1 = new JLabel();
        label1.setText("Phone Number");
        label1.setBounds(15, 180, 500, 50);
        label1.setFont(f4);
        f.add(label1);

        tf4 = new JTextField();
        tf4.setBounds(185, 190, 260, 30);
        tf4.setFont(f5);
        f.add(tf4);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Back");
        btn1.setBounds(0, 280, 100, 30);
        //btn1.setFont(f2);
        btn1.setCursor(cursor);
        
        f.add(btn1);

        btn2 = new JButton("Add");
        btn2.setBounds(400, 280, 100, 30);
       //btn2.setFont(f2);
        btn2.setCursor(cursor);
        f.add(btn2);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        f.add(nBtn);

        // Back Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                f.dispose();
                 new UserData();
               
            }
        });

        // Register Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Email
                String textField3 = tf3.getText(); // Password
                String textField4 = tf4.getText(); // Phone NUmber
               // String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                        ) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

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

                        pw.println("             ## Added by Admin ##");
                        pw.println("User Name : " + textField1);
                        pw.println("Password : " + textField3);
                        pw.println("Email : " + textField2);
                        pw.println("===============================================");
                        pw.println("Phone Number : " + textField4);
                        pw.println("Time & Date : " + timeAndDate);
                        pw.println("===============================================");
                        pw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    JOptionPane.showMessageDialog(null, "User has been added.", "User Added",
                            JOptionPane.INFORMATION_MESSAGE);
                   
                     new AdminAdd();
                    f.dispose();
                }
            }
        });
    }

   
}
