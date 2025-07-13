
package Admin;
import Login.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class AdminPassword extends JFrame {

    
    private ImageIcon icon;
    private JLabel label1;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1;
    private JButton btn1, btn2, btn3, nBtn;
    private JPasswordField tf2;
    private Cursor cursor;

  public  AdminPassword() {
        // Frame Layout
    	JFrame f = new JFrame();
        f.setSize(520, 400);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        

        // Icon
        //icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        //this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f4 = new Font("Segoe UI", Font.PLAIN, 30);
        f5 = new Font("Segoe UI", Font.PLAIN, 22);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Change Admin Name");
        label1.setBounds(50, 5, 500, 90);
        label1.setFont(f2);
        f.add(label1);

        label1 = new JLabel();
        label1.setText("And Password");
        label1.setBounds(50, 50, 500, 90);
        label1.setFont(f2);
        f.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("Name");
        label1.setBounds(50, 140, 500, 50);
        label1.setFont(f4);
        f.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(210, 150, 250, 35);
        tf1.setFont(f5);
        f.add(tf1);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(50, 200, 500, 50);
        label1.setFont(f4);
        f.add(label1);

        tf2 = new JPasswordField();
        tf2.setBounds(210, 210, 250, 35);
        tf2.setFont(f2);
        tf2.setEchoChar('*');
        f.add(tf2);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Back");
        btn1.setBounds(31, 280, 108, 30);
        btn1.setCursor(cursor);


        f.add(btn1);

        btn2 = new JButton("Change");
        btn2.setBounds(400, 280, 108, 30);
        //btn2.setFont(f2);
        btn2.setCursor(cursor);
        f.add(btn2);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        f.add(nBtn);

        // Close Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	new Admin();
               f.setVisible(false);
            }
        });

        // Change Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    String adminFile = "data\\admindata.txt";
                    File oldFile = new File(adminFile);
                    oldFile.delete();
                    File dump = new File(adminFile);

                    try {

                        FileWriter fw = new FileWriter(adminFile, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        pw.println("==========================================");
                        pw.println("=== ###  Admin Data  ### ===");
                        pw.println("==========================================");
                        pw.println("Name : " + textField1);
                        pw.println("Password : " + textField2);
                        pw.println("==========================================");

                        pw.flush();
                        pw.close();
                        bw.close();
                        fw.close();

                        JOptionPane.showMessageDialog(null, "Admin Name and Password has been changed.",
                                "Admin Passowrd", JOptionPane.INFORMATION_MESSAGE);
                       f.setVisible(false);

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                }

            }
        });
    }

    
    
}
