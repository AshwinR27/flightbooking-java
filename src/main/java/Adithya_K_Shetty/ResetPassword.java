/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty;//USER DEFINED PACKAGES

//IMPORTING STANDARD PACKAGES (LINE:8-14)
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.*;
//IMPORTING USER-DEFINED PACKAGES
import Ashwin_R_Prabhu.SignUp;

/**
 *
 * @author Adithya K Shetty 4SO19CS007
 */
//CLASS RESETPASSWORD
public class ResetPassword {

    JFrame resetPass;
    JLabel invalid;
    //COLORS USED IN RESET PASSWORD FRAME
    Color borderCol = new Color(0, 90, 90);
    Color c3 = new Color(230, 230, 230);
    Color c2 = new Color(0, 90, 90);
    //DEFINING VARIABLES USED FOR THE FUNCTIONALITY 
    String oPassword, nPassword, cPassword;

    //CONSTRUCTOR
    public ResetPassword() {
        //LAYOUT USED FOR RESET PASSWORD (LINE:37-103)
        resetPass = new JFrame("Reset Password");
        resetPass.setLocation(500, 125);
        resetPass.setSize(500, 400);
        resetPass.setLayout(null);
        resetPass.setAlwaysOnTop(true);

        JLabel oldPassword = new JLabel("OLD PASSWORD         :");
        oldPassword.setBounds(30, 40, 250, 30);
        oldPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
        oldPassword.setForeground(c2);
        resetPass.add(oldPassword);

        JPasswordField oldPasswordInput = new JPasswordField();
        oldPasswordInput.setBounds(280, 40, 180, 30);
        oldPasswordInput.setFont(new Font("", Font.BOLD, 20));
        oldPasswordInput.setForeground(c2);
        resetPass.add(oldPasswordInput);

        JLabel newPassword = new JLabel("NEW PASSWORD         :");
        newPassword.setBounds(30, 130, 250, 30);
        newPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
        newPassword.setForeground(c2);
        resetPass.add(newPassword);

        JPasswordField newPasswordInput = new JPasswordField();
        newPasswordInput.setBounds(280, 130, 180, 30);
        newPasswordInput.setFont(new Font("", Font.BOLD, 20));
        newPasswordInput.setForeground(c2);
        resetPass.add(newPasswordInput);

        JLabel confirmPassword = new JLabel("CONFIRM PASSWORD :");
        confirmPassword.setBounds(30, 220, 250, 30);
        confirmPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
        confirmPassword.setForeground(c2);
        resetPass.add(confirmPassword);

        JPasswordField confirmPasswordInput = new JPasswordField();
        confirmPasswordInput.setBounds(280, 220, 180, 30);
        confirmPasswordInput.setFont(new Font("", Font.BOLD, 20));
        confirmPasswordInput.setForeground(c2);
        resetPass.add(confirmPasswordInput);

        JButton save = new JButton("SAVE");
        save.setBounds(280, 290, 150, 30);
        save.setFont(new Font("", Font.BOLD, 20));
        save.setForeground(Color.white);
        Border buttonBorder = new LineBorder(borderCol, 2, true);
        save.setBorder(buttonBorder);
        save.setBackground(new Color(0, 152, 152));
        resetPass.add(save);

        JButton cancel = new JButton("CANCEL");
        cancel.setBounds(50, 290, 150, 30);
        cancel.setFont(new Font("", Font.BOLD, 20));
        cancel.setForeground(c2);
        cancel.setBorder(buttonBorder);
        cancel.setBackground(new Color(200, 200, 200));
        resetPass.add(cancel);

        JCheckBox showpasstxt = new JCheckBox("Show Passwords");
        showpasstxt.setBounds(280, 250, 180, 30);
        showpasstxt.setFont(new Font("", Font.BOLD, 14));
        showpasstxt.setBackground(c3);
        showpasstxt.setForeground(c2);
        resetPass.add(showpasstxt);
        //END OF PASSWORD LAYOUT
        //ACTION LISTENER USED FOR SHOWINF PASSWORD
        showpasstxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showpasstxt.isSelected()) {
                    oldPasswordInput.setEchoChar((char) 0);
                    newPasswordInput.setEchoChar((char) 0);
                    confirmPasswordInput.setEchoChar((char) 0);

                } else {
                    oldPasswordInput.setEchoChar('•');
                    newPasswordInput.setEchoChar('•');
                    confirmPasswordInput.setEchoChar('•');
                }

            }
        });

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame now = MyAccount.myAccount;
                new MyAccount();
                resetPass.dispose();
                now.setVisible(false);
            }
        });

        //SAVE BUTTON USED TO SAVE THE RESET PASSWORD 
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                oPassword = oldPasswordInput.getText();
                nPassword = newPasswordInput.getText();
                cPassword = confirmPasswordInput.getText();
                //ALL THE CONDITION USED WHILE RESETING PASSWORD (LINE : 144-192)
                if (oPassword.equals(SignUp.pass)) {
                    if (nPassword.equals("")) {
                        invalid = new JLabel("Please Fill New Password And Confirm Password Field!!");
                        invalid.setForeground(Color.RED);
                        invalid.setFont(new Font("", Font.BOLD, 18));
                        JOptionPane.showMessageDialog(resetPass, invalid, "Warning!", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (nPassword.equals(oPassword)) {
                            invalid = new JLabel("New Password Cannot Be Equal To OldPassword!!");
                            invalid.setForeground(Color.RED);
                            invalid.setFont(new Font("", Font.BOLD, 18));
                            JOptionPane.showMessageDialog(resetPass, invalid, "Warning!", JOptionPane.WARNING_MESSAGE);
                        } else {
                            if (nPassword.equals(cPassword)) {
                                SignUp.pass = cPassword;
                                JLabel valid = new JLabel("Password successfully changed!!");
                                valid.setForeground(Color.BLACK);
                                valid.setFont(new Font("", Font.BOLD, 18));
                                JOptionPane.showMessageDialog(resetPass, valid, "Warning!", JOptionPane.INFORMATION_MESSAGE);
                                JFrame now = MyAccount.myAccount;
                                new MyAccount();
                                resetPass.dispose();
                                now.setVisible(false);
                            } else {
                                invalid = new JLabel("Confirm Password Field Not Matching With New Passsword Field!!");
                                invalid.setForeground(Color.RED);
                                invalid.setFont(new Font("", Font.BOLD, 18));
                                JOptionPane.showMessageDialog(resetPass, invalid, "Warning!", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }

                } else {
                    invalid = new JLabel("Please Enter Valid Input to Old Password Field!!");
                    invalid.setForeground(Color.RED);
                    invalid.setFont(new Font("", Font.BOLD, 18));
                    JOptionPane.showMessageDialog(resetPass, invalid, "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        resetPass.getContentPane().setBackground(c3);
        resetPass.setResizable(false);
        resetPass.setVisible(true);
        resetPass.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

}
