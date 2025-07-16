package Login;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Welcome  
{
	JFrame f= new JFrame();
    ImageIcon icon, logo, welcome;
    Font f1;
    JButton btn1, btn2, btn3, nBtn;
    Cursor cursor;

    public Welcome() {
		
		f= new JFrame(); 
		ImageIcon img =new ImageIcon("image//welcome1.png");
		JLabel c=new JLabel("",img,JLabel.CENTER);
	    c.setBounds(0,0,800,800);
		f.add(c);
		
        // Frame Layout
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("4.A");
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);
        f.setResizable(false);

        f .getContentPane();
        f.setLayout(null);
        f.setBackground(Color.decode("#F2F2F2"));
		f.setVisible(true);
        

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 25);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        //btn1 = new JButton("Exit");
        btn1 =new JButton(new ImageIcon("image//exit3.png")); 
        btn1.setBounds(10, 680, 150, 60);
        //btn1.setFont(f1);
        //btn1.setCursor(cursor);
        //btn1.setForeground(Color.WHITE);
        //btn1.setBackground(Color.decode("#0d0c0c"));
        c.add(btn1);

        btn2 =new JButton(new ImageIcon("image//contribution.png"));
        btn2.setBounds(300, 680, 150, 60);
        

        btn3 =new JButton(new ImageIcon("image//next1.png"));
        btn3.setBounds(560, 680, 150, 60);
        btn3.setFont(f1);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#0d0c0c"));
        c.add(btn3);

        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Contribution Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Contribution f = new Contribution();
                f.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                //f.setVisible(false);
                new Home();
                f.setVisible(false);
            }
        });
    }

    
        
}
