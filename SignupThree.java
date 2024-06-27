package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener{

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton next, cancel;
    String formno;

    SignupThree(String formno) {
        this.formno = formno;
        setLayout(null);

        JLabel i1 = new JLabel("Page 3: Accoount Details");
        i1.setFont(new Font("Raleway", Font.BOLD, 22));
        i1.setBounds(200, 40, 400, 40);
        add(i1);

        JLabel accounttype = new JLabel("Account Type : ");
        accounttype.setFont(new Font("Raleway", Font.BOLD, 22));
        accounttype.setBounds(100, 140, 200, 30);
        add(accounttype);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(300, 180, 200, 20);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(520, 180, 200, 20);
        r2.setBackground(Color.WHITE);
        add(r2);

        r3 = new JRadioButton("Fixed Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(300, 250, 200, 20);
        r3.setBackground(Color.WHITE);
        add(r3);

        r4 = new JRadioButton("Reccurring Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(520, 250, 200, 20);
        r4.setBackground(Color.WHITE);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card Number : ");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel cardnumber = new JLabel("XXXX-XXXX-XXXX-1234");
        cardnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        cardnumber.setBounds(300, 300, 400, 30);
        add(cardnumber);

        JLabel cardno = new JLabel("(16 digit Account USER number)");
        cardno.setFont(new Font("Raleway", Font.BOLD, 11));
        cardno.setBounds(300, 315, 400, 30);
        add(cardno);

        JLabel pin = new JLabel("PIN Number : ");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinnumber.setBounds(300, 370, 400, 30);
        add(pinnumber);

        JLabel text = new JLabel("4 digit Password");
        text.setFont(new Font("Raleway", Font.BOLD, 11));
        text.setBounds(300, 385, 400, 30);
        add(text);

        JLabel services = new JLabel("Services : ");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 470, 400, 30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(300, 475, 200, 20);
        c1.setBackground(Color.WHITE);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(520, 475, 200, 20);
        c2.setBackground(Color.WHITE);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(300, 525, 200, 20);
        c3.setBackground(Color.WHITE);
        add(c3);

        c4 = new JCheckBox("Cheque Book");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(520, 525, 200, 20);
        c4.setBackground(Color.WHITE);
        add(c4);

        c5 = new JCheckBox("PassBook");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(300, 570, 200, 20);
        c5.setBackground(Color.WHITE);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(520, 570, 200, 20);
        c6.setBackground(Color.WHITE);
        add(c6);

        c7 = new JCheckBox("I herehy declares that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("Raleway", Font.BOLD, 11));
        c7.setBounds(100, 650, 550, 20);
        c7.setBackground(Color.WHITE);
        add(c7);

        next = new JButton("SUBMIT");
        next.setBounds(600, 700, 100, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 10));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        cancel = new JButton("CANCEL");
        cancel.setBounds(470, 700, 100, 30);
        cancel.setFont(new Font("Raleway", Font.BOLD, 10));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            String accounttype = null;
            if (r1.isSelected()) {
                accounttype = "Saving Account";
            } else if (r2.isSelected()) {
                accounttype = "Current Account";
            } else if (r3.isSelected()) {
                accounttype = "Fixed Account";
            }else if (r4.isSelected()) {
                accounttype = "Reccurring Account";
            }
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000) + 7249062000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000) + 1000L);
            String services = "";
            if (c1.isSelected()) {
                services = services + "ATM Card";
            } else if (c2.isSelected()) {
                services = services + "Internet Banking";
            } else if(c3.isSelected()) {
                services = services + "Mobile Banking";
            } else if(c4.isSelected()) {
                services = services + "Cheque Book";
            } else if(c5.isSelected()) {
                services = services + "PassBook";
            } else if(c6.isSelected()) {
                services = services + "E-Statement";
            }
            try {
                if (services.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please select atleast one service");
                } else {
                    Conn conn = new Conn();
                    String query = "insert into signupthree values('" + formno + "', '" + accounttype + "', '" + cardnumber + "', '" + pinnumber + "','" + services + "')";
                    String query1 = "insert into login values('" + formno + "', '" + cardnumber + "','" + pinnumber + "')";
                    conn.s.executeUpdate(query);
                    conn.s.executeUpdate(query1);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n PIN Number: " + pinnumber);
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }
}
