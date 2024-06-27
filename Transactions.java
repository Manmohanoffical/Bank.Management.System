package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {

    JButton deposit, withdrawl, fastcash, ministate, pinchange, balance, exit;
    String pinnumber;

    Transactions(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please select your Transactions");
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        text.setBounds(210, 300, 700, 35);
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        deposit.setFont(new Font("Raleway", Font.BOLD, 15));
        deposit.setBackground(Color.WHITE);
        deposit.setForeground(Color.BLACK);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawl = new JButton("Withdrawl");
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.setFont(new Font("Raleway", Font.BOLD, 15));
        withdrawl.setBackground(Color.WHITE);
        withdrawl.setForeground(Color.BLACK);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.setFont(new Font("Raleway", Font.BOLD, 15));
        fastcash.setBackground(Color.WHITE);
        fastcash.setForeground(Color.BLACK);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministate = new JButton("Mini Statement");
        ministate.setBounds(355, 450, 150, 30);
        ministate.setFont(new Font("Raleway", Font.BOLD, 15));
        ministate.setBackground(Color.WHITE);
        ministate.setForeground(Color.BLACK);
        ministate.addActionListener(this);
        image.add(ministate);

        pinchange = new JButton("PIN Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.setFont(new Font("Raleway", Font.BOLD, 15));
        pinchange.setBackground(Color.WHITE);
        pinchange.setForeground(Color.BLACK);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balance = new JButton("Balance");
        balance.setBounds(355, 485, 150, 30);
        balance.setFont(new Font("Raleway", Font.BOLD, 15));
        balance.setBackground(Color.WHITE);
        balance.setForeground(Color.BLACK);
        balance.addActionListener(this);
        image.add(balance);

        exit = new JButton("EXIT");
        exit.setBounds(265, 520, 150, 30);
        exit.setFont(new Font("Raleway", Font.BOLD, 15));
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        image.add(exit);

        getContentPane().setBackground(Color.WHITE);
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);
        } else if (ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if (ae.getSource() == withdrawl) {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        } else if (ae.getSource() == fastcash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if (ae.getSource() == pinchange) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        } else if (ae.getSource() == balance) {
            setVisible(false);
            new BalaneEnquiry(pinnumber).setVisible(true);
        } else if (ae.getSource() == ministate) {
            new MiniStatement(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Transactions("");
    }

}
