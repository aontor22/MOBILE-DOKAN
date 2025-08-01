package Admin;
import Login.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

import Laptop.MainPage;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;

public class UserData extends JFrame {

    
   // private ImageIcon icon;
    private JLabel label1;
    private Font f1, f2, f3;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private JButton btn1, btn2, btn3, btn4, btn5, nBtn;
    private Cursor cursor;

    private String[] column = { "User Name", "Password", "Email", "Phone Number", "Date and Time" };
    private String[] rows = new String[7];

   public UserData() {
        // Frame Layout
    	JFrame f =new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 1000);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.decode("#FFFFFF"));
        

        // Icon
       // icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
       // this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("User Data");
        label1.setBounds(270, 10, 400, 80);
        label1.setFont(f1);
        f.add(label1);

        // JButtons
        btn1 = new JButton("Refresh");
        btn1.setBounds(290, 570, 184, 30);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.BLACK);
        f.add(btn1);

        btn2 = new JButton("Delete");
        btn2.setBounds(0, 150, 150, 30);
        //btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.RED);
        f.add(btn2);

        btn3 = new JButton("Add");
        btn3.setBounds(0, 100, 150, 30);
        //btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.BLACK);
        f.add(btn3);

        btn4 = new JButton("Exit");
        btn4.setBounds(500, 630, 284, 30);
        //btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.RED);
        f.add(btn4);
        
        btn5 = new JButton("Back");
        btn5.setBounds(0, 630, 278, 30);
       // btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.BLACK);
        f.add(btn5);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        f.add(nBtn);

        // JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f3);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(180);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        //table.getColumnModel().getColumn(5).setPreferredWidth(220);

        scroll = new JScrollPane(table);
        scroll.setBounds(150, 100, 600, 400);
        scroll.setBackground(Color.WHITE);
        f.add(scroll);

        String file = "data//userdata.txt";
        String temp = "data//temp.txt";

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // User Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Password
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); // Email
                   // rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(20); // Security Question
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(9); // Answer
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(14); // Date and Time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }

        // Refresh Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                f.setVisible(false);
                 new UserData();
                

            }
        });

        // Delete Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("User")) {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(12).equals(removeUser)) {
                                    q = i;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        return;
                    }

                    try {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) )) {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                   f.setVisible(false);
                    new UserData();
                    
                }

            }
        });

        // Add Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
                new AdminAdd();
               
            }
        });

        // Exit Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.setVisible(false);
                 new Admin();
               
            }
        });
    }

   
}
