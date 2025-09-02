package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Signup extends JFrame implements ActionListener {
    Choice loginAsCho;
    TextField meterText,employerText,userNameText,nameText,passwordText;
    JButton create,back;
    Signup(){
        super("SignUp Page");
        getContentPane().setBackground(new Color(168,203,255));

        JLabel createacc=new JLabel("Create New Account");
        createacc.setBounds(10,10,150,20);
        add(createacc);

        JLabel createAs=new JLabel("Create Account As");
        createAs.setBounds(30,50,125,20);
        add(createAs);

        loginAsCho=new Choice();
        loginAsCho.add("Admin");
        loginAsCho.add("Customer");
        loginAsCho.setBounds(170,50,120,20);
        add(loginAsCho);

        JLabel meterNo=new JLabel("Meter Number");
        meterNo.setBounds(30,100,125,20);
        meterNo.setVisible(false);
        add(meterNo);

        meterText=new TextField();
        meterText.setBounds(170,100,120,20);
        meterText.setVisible(false);
        add(meterText);

        JLabel employer=new JLabel("Employer Id");
        employer.setBounds(30,100,125,20);
        employer.setVisible(true);
        add(employer);

        employerText=new TextField();
        employerText.setBounds(170,100,120,20);
        employerText.setVisible(true);
        add(employerText);

        JLabel userName=new JLabel("UserName");
        userName.setBounds(30,140,125,20);
        add(userName);

        userNameText=new TextField();
        userNameText.setBounds(170,140,120,20);
        add(userNameText);

        JLabel name=new JLabel("Name");
        name.setBounds(30,180,125,20);
        add(name);

        nameText=new TextField();
        nameText.setBounds(170,180,120,20);
        add(nameText);

        JLabel password=new JLabel("Password");
        password.setBounds(30,220,125,20);
        add(password);

        passwordText=new TextField();
        passwordText.setBounds(170,220,120,20);
        add(passwordText);

        loginAsCho.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String user=loginAsCho.getSelectedItem();//item by choice
                if(user.equals("Customer")){
                    employer.setVisible(false);
                    employerText.setVisible(false);
                    meterNo.setVisible(true);
                    meterText.setVisible(true);
                }else{
                    employer.setVisible(true);
                    employerText.setVisible(true);
                    meterNo.setVisible(false);
                    meterText.setVisible(false);
                }
            }
        });

        create=new JButton("Create");
        create.setBackground(new Color(66,127,219));
        create.setForeground(Color.black);
        create.setBounds(50,285,100,25);
        create.addActionListener(this);
        add(create);

        back=new JButton("Back");
        back.setBackground(new Color(66,127,219));
        back.setForeground(Color.black);
        back.setBounds(180,285,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon boyIcon=new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image boyImg=boyIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon boyIcon2=new ImageIcon(boyImg);
        JLabel boyLabel=new JLabel(boyIcon2);
        boyLabel.setBounds(320,30,250,250);
        add(boyLabel);


        setSize(600,380);
        setLocation(500,200);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {//for click events
        if (e.getSource()==create){//getSource indicates action click and save on e.
            String sloginAs = loginAsCho.getSelectedItem();//getSelectedItem for save info in sloginAs.
            String susername=userNameText.getText();
            String sname=nameText.getText();
            String spassword=passwordText.getText();
            String smeter=meterText.getText();
            try{
                database c=new database();
                String query=null;
                query = "insert into signup value('"+smeter+"','"+susername+"','"+sname+"','"+spassword+"','"+sloginAs+"')";
                c.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Account Created");
                setVisible(false);
                new Login();

            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource()==back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
