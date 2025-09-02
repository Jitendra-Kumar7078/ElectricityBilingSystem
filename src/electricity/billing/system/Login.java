package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField userText,userPassword;
    Choice loginChoice;
    JButton loginButton,cancelButton,signupButton;
    Login(){
        super("Login");
        getContentPane().setBackground(Color.white);
        JLabel username =new JLabel("UserName");
        username.setBounds(300,60,100,20);
        add(username);

        userText=new JTextField();
        userText.setBounds(400,60,100,20);
        add(userText);

        JLabel password =new JLabel("Password");
        password.setBounds(300,100,100,20);
        add(password);

        userPassword=new JTextField();
        userPassword.setBounds(400,100,100,20);
        add(userPassword);

        JLabel Login= new JLabel("Login in As");
        Login.setBounds(300,140,100,20);
        add(Login);

        loginChoice=new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400,140,100,20);
        add(loginChoice);

        loginButton=new JButton("Login");
        loginButton.setBounds(330,180,100,20);
        loginButton.addActionListener(this);
        add(loginButton);

        cancelButton=new JButton("Cancel");
        cancelButton.setBounds(460,180,100,20);
        cancelButton.addActionListener(this);
        add(cancelButton);

        signupButton=new JButton("SignUp");
        signupButton.setBounds(400,215,100,20);
        signupButton.addActionListener(this);
        add(signupButton);

        ImageIcon profileOne=new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profileTwo= profileOne.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon fprofileOne=new ImageIcon(profileTwo);
        JLabel profileLabel=new JLabel(fprofileOne);
        profileLabel.setBounds(5,5,250,250);
        add(profileLabel);

        setSize(640,300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loginButton){

        } else if (e.getSource()==cancelButton) {
            setVisible(false);
        } else if (e.getSource()==signupButton) {
            setVisible(false);
            new Signup();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
