package Payment;
import Login.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Payment  {

    

   public  Payment() {
        // Frame Layout
    	// Container c;
        // ImageIcon icon;
         //JLabel label1, label2, label3, imgLabel;
         Font f1, f2, f3, f4, f5, f6;
         //ImageIcon logo, img1, img2;
         JTextField tf1, tf2, tf3;
         JPasswordField pf;
         JButton btn1, btn2, btn3, nBtn;
         Cursor cursor;
         
         
         JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("4A-Tech");
        f.setSize(800,800 );
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.decode("#FFFFFF"));



       // c = this.getContentPane();
        //c.setLayout(null);
       // c.setBackground(Color.decode("#F2F2F2"));

        // Icon
       // icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        //this.setIconImage(icon.getImage());

        // Logo and Images
       // logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
       // imgLabel = new JLabel(logo);
       // imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
       // c.add(imgLabel);

       // img1 = new ImageIcon(getClass().getResource("/images/VisaCard.png"));
       // imgLabel = new JLabel(img1);
       // imgLabel.setBounds(620, 90, img1.getIconWidth(), img1.getIconHeight());
       // c.add(imgLabel);

       // img2 = new ImageIcon(getClass().getResource("/images/MasterCard.png"));
      //  imgLabel = new JLabel(img2);
       // imgLabel.setBounds(705, 90, img2.getIconWidth(), img2.getIconHeight());
       // c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);
        f4 = new Font("Segoe UI", Font.PLAIN, 15);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 15);
        f6 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
      JLabel  label1 = new JLabel();
        label1.setText("Complete Your Payment");
        label1.setBounds(200, 20, 500, 50);
        label1.setFont(f1);
        f.add(label1);

       JLabel label2 = new JLabel("We Accept Only");
        label2.setBounds(200, 85, 500, 50);
        label2.setFont(f2);
        f.add(label2);

        label2 = new JLabel("Card Details");
        label2.setBounds(200, 140, 500, 50);
        label2.setFont(f2);
        f.add(label2);

        // Name On Card
       JLabel label3 = new JLabel("Name On Card");
        label3.setBounds(200, 180, 500, 50);
        label3.setFont(f3);
        f.add(label3);

        tf1 = new JTextField();
        tf1.setBounds(350, 190, 235, 30);
        tf1.setFont(f4);
        f.add(tf1);

        // Card Number
        label3 = new JLabel("Card Number");
        label3.setBounds(200, 220, 500, 50);
        label3.setFont(f3);
        f.add(label3);

        tf2 = new JTextField();
        tf2.setBounds(350, 230, 235, 30);
        tf2.setFont(f4);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        f.add(tf2);

        // Valid On
        label3 = new JLabel("Valid On");
        label3.setBounds(200, 260, 500, 50);
        label3.setFont(f3);
        f.add(label3);

        tf3 = new JTextField();
        tf3.setBounds(350, 270, 90, 30);
        tf3.setFont(f4);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        f.add(tf3);

        // CVV Code
        label3 = new JLabel("CVV");
        label3.setBounds(450, 260, 500, 50);
        label3.setFont(f3);
        f.add(label3);

        pf = new JPasswordField();
        pf.setBounds(520, 270, 80, 30);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        pf.setEchoChar('*');
        pf.setFont(f5);
        f.add(pf);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Exit");
        btn1 =new JButton(new ImageIcon("image//exit3.png")); 
        btn1.setBounds(10, 650, 190, 50);
        btn1.setFont(f6);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        f.add(btn1);

        btn2 = new JButton("Back");
        btn2 =new JButton(new ImageIcon("image//xoxo.png"));   
        btn2.setBounds(270, 650, 190, 50);
        btn2.setFont(f6);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
       // btn2.setEnabled (false);
        f.add(btn2);

        btn3 = new JButton("Confirm Payment");
        btn3 =new JButton(new ImageIcon("image//confirm payment.png"));
        btn3.setBounds(560,650, 210, 50);
        btn3.setFont(f6);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.BLACK);
        f.add(btn3);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        f.add(nBtn);

        // To limit characters
        tf1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf1.getText().length() >= 10 )
                    e.consume();
            }
        });

        tf2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf2.getText().length() >= 19 )
                    e.consume();
            }
        });

        tf3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf3.getText().length() >= 7 )
                    e.consume();
            }
        });

        pf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (pf.getText().length() >= 3 )
                    e.consume();
            }
        });

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new DefPackTypes();
                f.dispose();
            }
        });

        // Confirm Payment Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String nameOnCard = tf1.getText();
                String cardNumber = tf2.getText();
                String validOn = tf3.getText();
                String cvvCode = pf.getText();
                
                if (nameOnCard.isEmpty() || cardNumber.isEmpty() || validOn.isEmpty() || cvvCode.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                   // setVisible(false);
                    new PaySuccess();
                    f.dispose();
                }
                
           		 try {
                        File file = new File("data//PaymentSlip.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                        String timeAndDate = myDateObj.format(myFormatObj);
                        Random random = new Random();
                        long x = random.nextLong(); 
                        pw.println(" Name on the card  : " +tf1.getText());
                        pw.println("Product code :" + x);
                        pw.println("Our Contact Email : holatech@gmail.com" );
                        pw.println("Card Number : " +tf2.getText());
                        //pw.println("Answer : " + textField4);
                        pw.println("Payment Time & Date : " + timeAndDate);
                        pw.println("===============================================");
                        pw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
            }
            }
        });
    
        
   // public static void main(String[] args) {

       // new Payment();
       // frame.setVisible(true);
  // }
}
}
