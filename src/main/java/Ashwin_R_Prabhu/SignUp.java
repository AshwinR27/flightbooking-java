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
import Anston_P_Miranda.Flight;
import static Ashwin_R_Prabhu.SignIn.supbtn;

/**
 *
 * @author Ashwin R Prabhu 4SO19CS033
 */
public class SignUp implements ActionListener { //Implement part is because actionPerformed is a separate function

    JFrame supfrm;
    JLabel fnamelb, lnamelb, unamelb, passlb, lbground, invalid;
    JTextField unametxt, fnametxt, lnametxt;
    JPasswordField passtxt;
    JButton savebtn, closebtn;
    Color GG = new Color(60, 186, 84); //for sign in button color
    Color FB = new Color(0, 152, 152);
    Color GB = new Color(66, 133, 244);
    Font font = new Font("", Font.BOLD, 20); //for text field font
    public static String username, password, fname, lname, uname, pass;
    Color c2 = new Color(0, 90, 90);
    Color GR = new Color(219, 50, 54);
    Color c3 = new Color(230, 230, 230);
    Color c4 = new Color(240, 240, 240);

    public SignUp() {

        //Frame
        supfrm = new JFrame("Sign Up");
        supfrm.setBounds(500, 230, 520, 410);//window size
        supfrm.setResizable(false);
        supfrm.getContentPane().setBackground(c4); //background colour

        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(409, 100, 120, 110);//y=105
        Clogo2.setForeground(FB);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        supfrm.add(Clogo2);

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(380, 92, 130, 125);//y=97
        Clogo3.setForeground(Color.WHITE);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        supfrm.add(Clogo3);

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(400, 100, 120, 110);//y=105
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        supfrm.add(Clogo1);

        //Firstname Label & TextField
        fnamelb = new JLabel("Firstname  :");
        fnamelb.setBounds(30, 20, 1000, 30);
        fnamelb.setForeground(c2);
        fnamelb.setFont(new Font("", Font.BOLD, 20));
        supfrm.add(fnamelb);

        JLabel fnamelb1 = new JLabel("*");
        fnamelb1.setBounds(127, 20, 1000, 30);
        fnamelb1.setForeground(GR);
        fnamelb1.setFont(new Font("", Font.BOLD, 20));
        supfrm.add(fnamelb1);

        fnametxt = new JTextField();
        fnametxt.setBounds(150, 20, 200, 40);
        fnametxt.setFont(font);
        supfrm.add(fnametxt);

        //Lastname Label & TextField
        lnamelb = new JLabel("Lastname :");
        lnamelb.setBounds(30, 100, 1000, 30);
        lnamelb.setForeground(c2);
        lnamelb.setFont(new Font("", Font.BOLD, 20));
        supfrm.add(lnamelb);

        lnametxt = new JTextField();
        lnametxt.setBounds(150, 100, 200, 40);
        lnametxt.setFont(font);
        supfrm.add(lnametxt);

        //Username Label & TextField
        unamelb = new JLabel("Username  :");
        unamelb.setBounds(30, 180, 1000, 30);
        unamelb.setForeground(c2);
        unamelb.setFont(new Font("", Font.BOLD, 20));
        supfrm.add(unamelb);

        JLabel unamelb1 = new JLabel("*");
        unamelb1.setBounds(127, 180, 1000, 30);
        unamelb1.setForeground(GR);
        unamelb1.setFont(new Font("", Font.BOLD, 20));
        supfrm.add(unamelb1);

        unametxt = new JTextField();
        unametxt.setBounds(150, 180, 200, 40);
        unametxt.setFont(font);
        supfrm.add(unametxt);

        //Password Label & TextField
        passlb = new JLabel("Password  :");
        passlb.setBounds(30, 260, 1000, 30);
        passlb.setForeground(c2);
        passlb.setFont(new Font("", Font.BOLD, 20));
        supfrm.add(passlb);

        JLabel passlb1 = new JLabel("*");
        passlb1.setBounds(127, 260, 1000, 30);
        passlb1.setForeground(GR);
        passlb1.setFont(new Font("", Font.BOLD, 20));
        supfrm.add(passlb1);

        passtxt = new JPasswordField();
        passtxt.setBounds(150, 260, 200, 40);
        passtxt.setFont(font);
        supfrm.add(passtxt);

        //Save button
        savebtn = new JButton("Save");
        savebtn.setFont(new Font("", Font.BOLD, 20));
        savebtn.setForeground(Color.WHITE);
        savebtn.setBackground(GB);
        savebtn.setBounds(275, 318, 200, 40);
        supfrm.add(savebtn);

        savebtn.addActionListener(this); //action listener defined outside constructor

        //Close button & its Action Listener
        closebtn = new JButton("Close");
        closebtn.setFont(new Font("", Font.BOLD, 20));
        closebtn.setForeground(GB);
        closebtn.setBackground(Color.WHITE);
        closebtn.setBounds(30, 318, 200, 40);
        supfrm.add(closebtn);

        closebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                supfrm.setVisible(false);
                supbtn.setVisible(true);

            }
        });

        //show password & its Action Listener
        JCheckBox showpasstxt = new JCheckBox("Show Password");
        showpasstxt.setBounds(350, 280, 120, 20);
        showpasstxt.setForeground(c2);
        supfrm.add(showpasstxt);

        showpasstxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showpasstxt.isSelected()) {
                    passtxt.setEchoChar((char) 0);
                } else {
                    passtxt.setEchoChar('•');
                }
            }
        });

        supfrm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        supfrm.setLayout(null);
        supfrm.setVisible(true);
        supfrm.setAlwaysOnTop(true);
    }

    //Sign-up Action Listener
    public void actionPerformed(ActionEvent e) {
        fname = fnametxt.getText();
        lname = lnametxt.getText();
        username = unametxt.getText();
        password = passtxt.getText();

        if (fname.equals("") || username.equals("") || password.equals(""))//if the fields are empty
        {
            invalid = new JLabel("Please fill all the information");
            invalid.setForeground(Color.RED);
            invalid.setFont(new Font("", Font.BOLD, 18));
            JOptionPane.showMessageDialog(supfrm, invalid, "Warning!", JOptionPane.WARNING_MESSAGE);
            password = null;
            username = null;

        } else {
            invalid = new JLabel("Account successfully created!");
            Flight.BookingDone = 0;//initalization for Flight clas
            invalid.setFont(new Font("", Font.BOLD, 18));
            JOptionPane.showMessageDialog(supfrm, invalid, "INFO", JOptionPane.INFORMATION_MESSAGE);
            supfrm.setVisible(false);
            supbtn.setVisible(true);
            uname = username;
            pass = password;

        }

    }

}
