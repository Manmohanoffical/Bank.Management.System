package bank.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener {

    JTextField ammount;
    JButton withdrawl, back;
    String pinnumber;

    Withdrawl(String pinnumber) {
        this.pinnumber = pinnumber;

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter the ammount you want to Withdraw");
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        text.setBounds(170, 300, 400, 20);
        image.add(text);

        ammount = new JTextField();
        ammount.setBounds(170, 350, 320, 25);
        ammount.setFont(new Font("Raleway", Font.BOLD, 15));
        add(ammount);

        withdrawl = new JButton("Withdrawl");
        withdrawl.setBounds(355, 485, 150, 30);
        withdrawl.setFont(new Font("Raleway", Font.BOLD, 15));
        withdrawl.setBackground(Color.WHITE);
        withdrawl.setForeground(Color.BLACK);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
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
        if (ae.getSource() == withdrawl) {
            String number = ammount.getText();
            Date date = new Date();
            if (number.equals("")) {
                JOptionPane.showMessageDialog(null, "Jada rahisi mat jhad Paise le aur Dhafha ho ");
            } else {
                try {
                    Conn conn = new Conn();
                    String query = "insert into bank values('" + pinnumber + "', '" + date + "', 'Withdraw', '" + number
                            + "')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs " + number + " kar le muje Bhikari");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}
