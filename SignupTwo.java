package bank.management.system;
//Create classes
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    // Global declaration
    JTextField pannoTextField, aadharnoTextField;
    JComboBox religion, category, income, education;
    JRadioButton yes, no, govjob, pvtjob, other, yess, noo;
    JButton next;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);

        setTitle("ACCOUNT APPLICATION FORM");

        JLabel additionalDetails = new JLabel("Page 2 Additional Details");
        additionalDetails.setBounds(290, 80, 300, 30);
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        add(additionalDetails);

        JLabel cast = new JLabel("Reilgion : ");
        cast.setBounds(100, 140, 100, 30);
        cast.setFont(new Font("Raleway", Font.BOLD, 20));
        add(cast);

        String valreligion[] = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
        religion = new JComboBox(valreligion);
        religion.setBounds(300, 140, 300, 30);
        religion.setFont(new Font("Raleway", Font.BOLD, 15));
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel caste = new JLabel("Category : ");
        caste.setBounds(100, 190, 200, 30);
        caste.setFont(new Font("Raleway", Font.BOLD, 20));
        add(caste);

        String valcategory[] = { "OBC", "SC", "ST", "General", "Other" };
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 300, 30);
        category.setFont(new Font("Raleway", Font.BOLD, 15));
        category.setBackground(Color.WHITE);
        add(category);

        JLabel incometax = new JLabel("Income : ");
        incometax.setBounds(100, 240, 200, 30);
        incometax.setFont(new Font("Raleway", Font.BOLD, 20));
        add(incometax);

        String valincome[] = { "null", "<1, 50, 000", "<1, 50, 000", "<2, 50, 000", "<5, 50, 000", "About 10 Lakh" };
        income = new JComboBox(valincome);
        income.setBounds(300, 240, 300, 30);
        income.setFont(new Font("Raleway", Font.BOLD, 15));
        income.setBackground(Color.WHITE);
        add(income);

        JLabel eduqu = new JLabel("Educational : ");
        eduqu.setBounds(100, 290, 200, 30);
        eduqu.setFont(new Font("Raleway", Font.BOLD, 20));
        add(eduqu);

        JLabel quedu = new JLabel("Qualification : ");
        quedu.setBounds(100, 315, 200, 30);
        quedu.setFont(new Font("Raleway", Font.BOLD, 20));
        add(quedu);

        String valeducation[] = { "12th", "Graduation", "Post graduation", "Other" };
        education = new JComboBox(valeducation);
        education.setBounds(300, 315, 300, 30);
        education.setFont(new Font("Raleway", Font.BOLD, 15));
        education.setBackground(Color.WHITE);
        add(education);

        JLabel occupation = new JLabel("Occupation : ");
        occupation.setBounds(100, 390, 200, 30);
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        add(occupation);

        govjob = new JRadioButton("Gov Job");
        govjob.setBounds(300, 390, 100, 30);
        govjob.setFont(new Font("Raleway", Font.BOLD, 15));
        govjob.setBackground(Color.WHITE);
        govjob.setForeground(Color.BLACK);
        add(govjob);

        pvtjob = new JRadioButton("Pvt Job");
        pvtjob.setBounds(420, 390, 100, 30);
        pvtjob.setFont(new Font("Raleway", Font.BOLD, 15));
        pvtjob.setBackground(Color.WHITE);
        pvtjob.setForeground(Color.BLACK);
        add(pvtjob);

        other = new JRadioButton("Other");
        other.setBounds(525, 390, 100, 30);
        other.setFont(new Font("Raleway", Font.BOLD, 15));
        other.setBackground(Color.WHITE);
        other.setForeground(Color.BLACK);
        add(other);

        ButtonGroup jobgroup = new ButtonGroup();
        jobgroup.add(govjob);
        jobgroup.add(pvtjob);
        jobgroup.add(other);

        JLabel panno = new JLabel("PAN No : ");
        panno.setBounds(100, 440, 200, 30);
        panno.setFont(new Font("Raleway", Font.BOLD, 20));
        add(panno);

        pannoTextField = new JTextField();
        pannoTextField.setBounds(300, 440, 300, 30);
        pannoTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(pannoTextField);

        JLabel aadharno = new JLabel("Aadhar No : ");
        aadharno.setBounds(100, 490, 200, 30);
        aadharno.setFont(new Font("Raleway", Font.BOLD, 20));
        add(aadharno);

        aadharnoTextField = new JTextField();
        aadharnoTextField.setBounds(300, 490, 300, 30);
        aadharnoTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(aadharnoTextField);

        JLabel citizen = new JLabel("Senior Citizen : ");
        citizen.setBounds(100, 540, 200, 30);
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        add(citizen);

        yes = new JRadioButton("Yes");
        yes.setBounds(300, 540, 100, 30);
        yes.setFont(new Font("Raleway", Font.BOLD, 15));
        yes.setBackground(Color.WHITE);
        yes.setForeground(Color.BLACK);
        add(yes);

        no = new JRadioButton("No");
        no.setBounds(525, 540, 100, 30);
        no.setFont(new Font("Raleway", Font.BOLD, 15));
        no.setBackground(Color.WHITE);
        no.setForeground(Color.BLACK);
        add(no);

        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(yes);
        citizengroup.add(no);

        JLabel account = new JLabel("Extisiting Account : ");
        account.setBounds(100, 590, 200, 30);
        account.setFont(new Font("Raleway", Font.BOLD, 20));
        add(account);

        yess = new JRadioButton("Yes");
        yess.setBounds(300, 590, 100, 30);
        yess.setFont(new Font("Raleway", Font.BOLD, 15));
        yess.setBackground(Color.WHITE);
        yess.setForeground(Color.BLACK);
        add(yess);

        noo = new JRadioButton("No");
        noo.setBounds(525, 590, 100, 30);
        noo.setFont(new Font("Raleway", Font.BOLD, 15));
        noo.setBackground(Color.WHITE);
        noo.setForeground(Color.BLACK);
        add(noo);

        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(yes);
        accountgroup.add(no);

        next = new JButton("NEXT");
        next.setBounds(500, 650, 100, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 10));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        // Create form
        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String valreligion = (String) religion.getSelectedItem();
        String valcategory = (String) category.getSelectedItem();
        String valincome = (String) income.getSelectedItem();
        String valeducation = (String) education.getSelectedItem();
        String occupation = null;
        if (govjob.isSelected()) {
            occupation = "Gov Job";
        } else if (pvtjob.isSelected()) {
            occupation = "Pvt Job";
        } else if (other.isSelected()) {
            occupation = "Other";
        }
        String panno = pannoTextField.getText();
        String aadharno = aadharnoTextField.getText();
        String citizen = null;
        if (yes.isSelected()) {
            citizen = "Yes";
        } else if (no.isSelected()) {
            citizen = "No";
        }
        String account = null;
        if (yess.isSelected()) {
            account = "Yes";
        } else if (noo.isSelected()) {
            account = "No";
        }
        //Create Validation
        try {
            if (valreligion.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {

                // Connect to MySQL
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno + "', '" + valreligion + "', '" + valcategory + "', '" + valincome
                        + "', '" + valeducation + "', '" + occupation + "', '" + panno + "', '" + aadharno + "', '" + citizen
                        + "', '" + account + "')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }

}
