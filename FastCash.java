package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton hundred, five, thousand, two, fivethousand, tenthousand, back;
    String pinnumber;

    FastCash(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        text.setBounds(210, 300, 700, 35);
        image.add(text);

        hundred = new JButton("RS 100");
        hundred.setBounds(170, 415, 150, 30);
        hundred.setFont(new Font("Raleway", Font.BOLD, 15));
        hundred.setBackground(Color.WHITE);
        hundred.setForeground(Color.BLACK);
        hundred.addActionListener(this);
        image.add(hundred);

        five = new JButton("RS 500");
        five.setBounds(355, 415, 150, 30);
        five.setFont(new Font("Raleway", Font.BOLD, 15));
        five.setBackground(Color.WHITE);
        five.setForeground(Color.BLACK);
        five.addActionListener(this);
        image.add(five);

        thousand = new JButton("RS 1000");
        thousand.setBounds(170, 450, 150, 30);
        thousand.setFont(new Font("Raleway", Font.BOLD, 15));
        thousand.setBackground(Color.WHITE);
        thousand.setForeground(Color.BLACK);
        thousand.addActionListener(this);
        image.add(thousand);

        two = new JButton("RS 2000");
        two.setBounds(355, 450, 150, 30);
        two.setFont(new Font("Raleway", Font.BOLD, 15));
        two.setBackground(Color.WHITE);
        two.setForeground(Color.BLACK);
        two.addActionListener(this);
        image.add(two);

        fivethousand = new JButton("RS 5000");
        fivethousand.setBounds(170, 485, 150, 30);
        fivethousand.setFont(new Font("Raleway", Font.BOLD, 15));
        fivethousand.setBackground(Color.WHITE);
        fivethousand.setForeground(Color.BLACK);
        fivethousand.addActionListener(this);
        image.add(fivethousand);

        tenthousand = new JButton("RS 10000");
        tenthousand.setBounds(355, 485, 150, 30);
        tenthousand.setFont(new Font("Raleway", Font.BOLD, 15));
        tenthousand.setBackground(Color.WHITE);
        tenthousand.setForeground(Color.BLACK);
        tenthousand.addActionListener(this);
        image.add(tenthousand);

        back = new JButton("BACK");
        back.setBounds(265, 520, 150, 30);
        back.setFont(new Font("Raleway", Font.BOLD, 15));
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        image.add(back);

        getContentPane().setBackground(Color.WHITE);
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+ pinnumber +"'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Blance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ amount + " Debited Sucessfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }

}
