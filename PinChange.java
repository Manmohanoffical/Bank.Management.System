package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField pin, repin;
    JButton change, back;
    String pinnumber;

    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        text.setBounds(250, 280, 500, 35);
        image.add(text);

        JLabel pintext = new JLabel("New PIN: ");
        pintext.setFont(new Font("Raleway", Font.BOLD, 16));
        pintext.setForeground(Color.WHITE);
        pintext.setBounds(165, 320, 180, 25);
        image.add(pintext);

        pin = new JPasswordField();
        pin.setBounds(330, 320, 180, 25);
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        image.add(pin);

        JLabel repintext = new JLabel("Re-Entry New PIN");
        repintext.setFont(new Font("Raleway", Font.BOLD, 16));
        repintext.setForeground(Color.WHITE);
        repintext.setBounds(165, 360, 180, 25);
        image.add(repintext);

        repin = new JPasswordField();
        repin.setBounds(330, 360, 180, 25);
        repin.setFont(new Font("Raleway", Font.BOLD, 20));
        image.add(repin);

        change = new JButton("Change PIN");
        change.setBounds(355, 485, 150, 30);
        change.setFont(new Font("Raleway", Font.BOLD, 15));
        change.setBackground(Color.WHITE);
        change.setForeground(Color.BLACK);
        change.addActionListener(this);
        image.add(change);

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
        if (ae.getSource() == change) {
            try {
                String npin = pin.getText();
                String rpin = repin.getText();
                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }
                if (npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Entered New PIN ");
                    return;
                }
                if (npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Re-Entered New PIN");
                    return;
                }
                Conn conn = new Conn();
                String query = "update bank set pin = '"+rpin+"' where pin='"+pinnumber+"'";
                String query1 = "update login set pin = '"+rpin+"' where pin='"+pinnumber+"'";
                String query2 = "update signupthree set pin = '"+rpin+"' where pin='"+pinnumber+"'";
                conn.s.executeUpdate(query);
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "PIN Change Successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
