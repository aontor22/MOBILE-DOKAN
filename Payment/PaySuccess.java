package Payment;
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
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PaySuccess extends Payment
{
	
	PaySuccess()
	{
		JFrame f = new JFrame();
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setTitle("Hola-Tech");
	        f.setSize(900, 450);
	        f.setLocationRelativeTo(null);
	        f.setResizable(false);
	        f.setVisible(true);
	        f.setLayout(null);
	        
	        Font f1,f2,f3,f4,f5,f6;
	        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
	        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 25);
	        f3 = new Font("Segoe UI", Font.PLAIN, 20);
	        f4 = new Font("Segoe UI", Font.PLAIN, 15);
	        f5 = new Font("Segoe UI Black", Font.PLAIN, 15);
	        f6 = new Font("Segoe UI Black", Font.PLAIN, 25);
	        
	        
	        
	        
	        JLabel  label1 = new JLabel();
	        label1.setText("Payment Successful");
	        label1.setBounds(200, 20, 500, 50);
	        label1.setFont(f1);
	        f.add(label1);
	        
	        
	        
	        
	    JButton b1 = new JButton("Download Payment Slip");
	    b1.setBounds(300, 325, 190, 50);
	    b1.setBackground(Color.decode("#2E75B6"));
	    f.add(b1);
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
		 
		 JOptionPane.showMessageDialog(null, "Payment slip Has been downloaded SuccessFully.",
                 null, 0);
		          new DefPackTypes();
		          f.dispose();
		}
	});
}
}