/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ashwin_R_Prabhu;//USER DEFINED PACKAGES

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//IMPORTING USER DEFINED PACKAGES
import Adithya_K_Shetty.MyAccount;

/**
 *
 * @author Ashwin R Prabhu 4SO19CS033
 */
public class SignIn implements ActionListener { //Implement part is because actionPerformed is a separate function

    static JFrame signfrm;
    JLabel unamelb, passlb, title1lb, titlelb, tbground, lbground, invalid, coverup;
    JTextField unametxt;
    JPasswordField passtxt;
    static JButton signbtn, supbtn;
    Color GG = new Color(60, 186, 84); //for sign in button color
    Color FB = new Color(0, 152, 152);
    Color supB = new Color(23, 107, 239);
    Font font = new Font("", Font.BOLD, 20);
    Color c2 = new Color(0, 90, 90);//for text field font
    Color c1 = new Color(0, 152, 152);//header
    Color c3 = new Color(230, 230, 230);//frame background
    public static String username1, password1;

    public SignIn() {

        //Frame
        signfrm = new JFrame("Sign In");
        signfrm.setExtendedState(JFrame.MAXIMIZED_BOTH);//max window size
        signfrm.getContentPane().setBackground(c3); //background colour

        //Title
        //Label Declaration for QuadrA
        titlelb = new JLabel("QuadrA");
        titlelb.setBounds(145, 10, 3000, 70);
        titlelb.setForeground(Color.WHITE);
        titlelb.setFont(new Font("Segoe Script", Font.BOLD, 70));
        signfrm.add(titlelb);

        //Label For airlines
        title1lb = new JLabel(" Airlines");
        title1lb.setBounds(320, 62, 3000, 40);
        title1lb.setForeground(Color.WHITE);
        title1lb.setFont(new Font("", Font.BOLD, 30));
        signfrm.add(title1lb);

        //Label for motto
        JLabel CMotto = new JLabel("<html>...we make the sky, <br/>feel like home</html>");
        CMotto.setBounds(1185, 5, 300, 90);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));
        signfrm.add(CMotto);

        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(49, 10, 120, 80);
        Clogo2.setForeground(FB);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        signfrm.add(Clogo2);

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(20, 2, 130, 95);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        signfrm.add(Clogo3);

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(40, 10, 120, 80);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        signfrm.add(Clogo1);

        //Title background
        tbground = new JLabel("");
        tbground.setBounds(0, 0, 5000, 100);
        tbground.setOpaque(true);
        tbground.setBackground(FB);
        signfrm.add(tbground);

        //Username Label & TextField
        unamelb = new JLabel("Username:");
        unamelb.setBounds(580, 300, 1000, 30);
        unamelb.setForeground(Color.WHITE);
        unamelb.setFont(new Font("", Font.BOLD, 20));
        signfrm.add(unamelb);

        unametxt = new JTextField();
        unametxt.setBounds(725, 300, 200, 40);
        unametxt.setFont(font);
        signfrm.add(unametxt);

        //Password Label & TextField
        passlb = new JLabel("Password:");
        passlb.setBounds(580, 400, 1000, 30);
        passlb.setForeground(Color.WHITE);
        passlb.setFont(new Font("", Font.BOLD, 20));
        signfrm.add(passlb);

        passtxt = new JPasswordField();
        passtxt.setBounds(725, 400, 200, 40);
        passtxt.setFont(font);
        signfrm.add(passtxt);

        //Sign-in button
        signbtn = new JButton("Sign In");
        signbtn.setFont(new Font("", Font.BOLD, 20));
        signbtn.setForeground(Color.WHITE);
        signbtn.setBackground(GG);
        signbtn.setBounds(555, 480, 400, 40);
        signfrm.add(signbtn);

        signbtn.addActionListener(this);//action listener defined outside constructor

        //Sign-up button & its Action Listener
        supbtn = new JButton("Create Account");
        supbtn.setFont(new Font("", Font.BOLD, 20));
        supbtn.setForeground(Color.WHITE);
        supbtn.setBackground(supB);
        supbtn.setBounds(1300, 110, 200, 40);
        signfrm.add(supbtn);
        supbtn.setVisible(true);

        supbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SignUp();
                supbtn.setVisible(false);

            }
        });

        //Show password checkbox & its Action Listener
        JCheckBox showpasstxt = new JCheckBox("Show Password");
        showpasstxt.setBounds(810, 450, 120, 20);
        showpasstxt.setBackground(FB);
        showpasstxt.setForeground(Color.WHITE);
        signfrm.add(showpasstxt);

        showpasstxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showpasstxt.isSelected()) {
                    passtxt.setEchoChar((char) 0);
                } else {
                    passtxt.setEchoChar('•');
                }
            }
        });

        //Background for signing in
        lbground = new JLabel("");
        lbground.setBounds(510, 250, 500, 300);
        lbground.setOpaque(true);
        lbground.setBackground(FB);
        signfrm.add(lbground);

        signfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signfrm.setLayout(null);
        signfrm.setVisible(true);
    }

    //Sign-in Action Listener
    public void actionPerformed(ActionEvent e) {
        username1 = unametxt.getText();
        password1 = passtxt.getText();

        if (SignUp.uname == null && SignUp.pass == null)//account not created
        {
            invalid = new JLabel("Please create a new Account");
            //invalid.setForeground(Color.RED);
            invalid.setFont(new Font("", Font.BOLD, 18));
            JOptionPane.showMessageDialog(signfrm, invalid, "INFO", JOptionPane.INFORMATION_MESSAGE);

        } else if (username1.equals("") || password1.equals(""))//empty username and password fields
        {
            invalid = new JLabel("Enter username and password");
            invalid.setForeground(Color.RED);
            invalid.setFont(new Font("", Font.BOLD, 18));
            JOptionPane.showMessageDialog(signfrm, invalid, "ERROR", JOptionPane.ERROR_MESSAGE);

        } else if (username1.equals(SignUp.uname) && password1.equals(SignUp.pass))//username and password matches
        {
            new HomePage();
            MyAccount.timerInit();
            signfrm.setVisible(false);

        } else if (username1 != SignUp.username || password1 != SignUp.password)//username and password does not match
        {
            invalid = new JLabel("Wrong Username and/or Password");
            invalid.setForeground(Color.RED);
            invalid.setFont(new Font("", Font.BOLD, 18));
            JOptionPane.showMessageDialog(signfrm, invalid, "Warning!", JOptionPane.WARNING_MESSAGE);

        }

    }

}
