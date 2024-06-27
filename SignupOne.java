package bank.management.system;
//Create classes
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {
    //Global declaration
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField,
            pincodeTextField;
    JDateChooser dateChooser;
    JRadioButton male, female, married, single, other;
    JButton next;

    SignupOne() {

        setLayout(null);

        Random ran = new Random();
        random = ((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FROM : " + random);
        formno.setBounds(140, 20, 600, 40);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        add(formno);

        JLabel personDetails = new JLabel("Page 1");
        personDetails.setBounds(290, 80, 200, 30);
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        add(personDetails);

        JLabel name = new JLabel("Name : ");
        name.setBounds(100, 140, 100, 30);
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(300, 140, 300, 30);
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(nameTextField);

        JLabel fname = new JLabel("Father's name : ");
        fname.setBounds(100, 190, 200, 30);
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setBounds(300, 190, 300, 30);
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Brith : ");
        dob.setBounds(100, 240, 200, 30);
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 300, 30);
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 15));
        add(dateChooser);

        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(100, 290, 200, 30);
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 100, 30);
        male.setFont(new Font("Raleway", Font.BOLD, 15));
        male.setBackground(Color.WHITE);
        male.setForeground(Color.BLACK);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(525, 290, 100, 30);
        female.setFont(new Font("Raleway", Font.BOLD, 15));
        female.setBackground(Color.WHITE);
        female.setForeground(Color.BLACK);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email : ");
        email.setBounds(100, 340, 200, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(300, 340, 300, 30);
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(emailTextField);

        JLabel marital = new JLabel("Maritel : ");
        marital.setBounds(100, 390, 100, 30);
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setFont(new Font("Raleway", Font.BOLD, 15));
        married.setBackground(Color.WHITE);
        married.setForeground(Color.BLACK);
        add(married);

        single = new JRadioButton("Single");
        single.setBounds(420, 390, 100, 30);
        single.setFont(new Font("Raleway", Font.BOLD, 15));
        single.setBackground(Color.WHITE);
        single.setForeground(Color.BLACK);
        add(single);

        other = new JRadioButton("Other");
        other.setBounds(525, 390, 100, 30);
        other.setFont(new Font("Raleway", Font.BOLD, 15));
        other.setBackground(Color.WHITE);
        other.setForeground(Color.BLACK);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(single);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address : ");
        address.setBounds(100, 440, 200, 30);
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        add(address);

        addressTextField = new JTextField();
        addressTextField.setBounds(300, 440, 300, 30);
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(addressTextField);

        JLabel city = new JLabel("City : ");
        city.setBounds(100, 490, 200, 30);
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        add(city);

        cityTextField = new JTextField();
        cityTextField.setBounds(300, 490, 300, 30);
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(cityTextField);

        JLabel state = new JLabel("State : ");
        state.setBounds(100, 540, 200, 30);
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        add(state);

        stateTextField = new JTextField();
        stateTextField.setBounds(300, 540, 300, 30);
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(stateTextField);

        JLabel pincode = new JLabel("PIN Code : ");
        pincode.setBounds(100, 590, 200, 30);
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(300, 590, 300, 30);
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 15));
        add(pincodeTextField);

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
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (single.isSelected()) {
            marital = "Single";
        } else if (other.isSelected()) {
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = stateTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        //Create Validation
        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {


                // Connect to MySQL
                Conn c = new Conn();
                String query = "insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + dob
                        + "', '" + email + "', '" + gender + "', '" + marital + "', '" + address + "', '" + city
                        + "', '" + state + "', '" + pincode + "')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupOne();
    }

}
