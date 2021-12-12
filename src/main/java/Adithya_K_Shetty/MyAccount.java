/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty;//USER DEFINED PACKAGES

//IMPORTING STANDARD PACKAGES (LINE:8-14)
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.border.Border;
import java.awt.Font;
import javax.swing.border.LineBorder;
//IMPORTING USER-DEFINED PACKAGE 
import Ashwin_R_Prabhu.*;

/**
 *
 * @author Adithya K Shetty 4SO19CS007
 */
//ACCOUNT CLASS
public class MyAccount {

    //JFRAME
    static JFrame myAccount;

    static JLabel second = new JLabel();
    static JLabel minute = new JLabel();
    static JLabel hour = new JLabel();
    static JLabel circle, CMotto;

    JTextArea chatArea;
    JTextField textBox;
    JScrollPane scrBar;

    JButton resetPassword = new JButton("🔑 RESET PASSWORD");
    JButton btnBack = new JButton("🏠 HOME");

    //VARIBLE DEFINATIONS FOR TIMER
    public static long starttime, elapsetime, second2;
    static long minute1, second1;
    static int i, j;

    int flag = 0;

    //COLOURS
    Color c1 = new Color(0, 152, 152);
    Color c2 = new Color(0, 90, 90);
    Color c3 = new Color(230, 230, 230);
    Color borderCol = new Color(0, 90, 90);
    Border border = new LineBorder(borderCol, 2, true);

    public static void timerInit() {
        starttime = System.currentTimeMillis();
        elapsetime = 0;
        second2 = 0;
        minute1 = 0;
        second1 = 0;
        i = 0;
        j = 0;
        minute.setText("00:");
        second.setText("00");
    }

    //FUNCTION USED TO DISPLAY TIMER IN ACCOUNT SECTION (LINE:65 - 95)
    public static void timer() {
        starttime = System.currentTimeMillis();
        for (i = 0; minute1 <= 59; i++) {

            elapsetime = System.currentTimeMillis() - starttime;
            second2 = elapsetime / 1000;
            second1 = second2 % 60;
            minute1 = second2 / 60;

            if (minute1 <= 9) {
                minute.setText("0" + String.valueOf(minute1) + ":");
            } else {
                minute.setText(String.valueOf(minute1) + ":");
            }

            for (j = 0; second1 < 59; j++) {
                elapsetime = System.currentTimeMillis() - starttime;
                second2 = elapsetime / 1000;
                second1 = second2 % 60;
                minute1 = second1 / 60;
                if (second1 <= 9) {
                    second.setText("0" + String.valueOf(second1));
                } else {
                    second.setText(String.valueOf(second1));
                }
            }

        }
    }

    // FUCTION USED FOR CHAT BOT APPLICATION (LINE:96-357)
    public void chatBot() {

        //LABEL1 USED WITH CHAT BOT (ON HOVER)
        JLabel help = new JLabel(" Need help? Ask ivA");
        help.setBounds(1225, 440, 210, 30);
        help.setOpaque(true);
        help.setBackground(c1);
        help.setFont(new Font("", Font.BOLD, 20));
        help.setForeground(Color.white);

        //LABEL2 USED WITH CHAT BOT
        JLabel ringLogo2 = new JLabel("Help");
        ringLogo2.setBounds(1443, 401, 440, 100);
        ringLogo2.setFont(new Font("", Font.BOLD, 16));
        ringLogo2.setForeground(Color.white);
        myAccount.add(ringLogo2);

        //LABEL3 USED WITH CHAT BOT
        JLabel ringLogo1 = new JLabel("💬");
        ringLogo1.setBounds(1434, 405, 440, 100);
        ringLogo1.setFont(new Font("", Font.BOLD, 50));
        ringLogo1.setForeground(c2);
        myAccount.add(ringLogo1);

        //LABEL3 USED WITH CHAT BOT
        JLabel ringLogo = new JLabel("⚫");
        ringLogo.setBounds(1415, 385, 140, 140);
        ringLogo.setFont(new Font("", Font.BOLD, 100));
        ringLogo.setForeground(c1);
        myAccount.add(ringLogo);

        //LABEL4 USED WITH CHAT BOT
        JLabel avi = new JLabel("🤖 I am ivA, how may I help you? ");
        avi.setBounds(1150, 110, 400, 30);
        avi.setFont(new Font("", Font.BOLD, 16));
        avi.setForeground(Color.white);

        //CHAT AREA WHICH USED TO COMMUNICATE WITH IVA
        chatArea = new JTextArea();
        chatArea.setBounds(1130, 128, 300, 300);
        chatArea.setBorder(border);
        chatArea.setFont(new Font("", Font.PLAIN, 18));
        chatArea.setLineWrap(true);
        //chatArea.setBackground(Color.white);
        chatArea.setEditable(false);
        scrBar = new JScrollPane(chatArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrBar.setBounds(1125, 140, 300, 250);

        //STARTER MESSAGE ON TEXT BOX
        JLabel starterMessage = new JLabel("Chat here....");
        starterMessage.setBounds(1130, 400, 200, 40);
        starterMessage.setFont(new Font("", Font.PLAIN, 20));

        //TEXTBOX TO ENTER CHAT
        textBox = new JTextField("    ");
        textBox.setBounds(1125, 395, 300, 50);
        Border borderTest = new LineBorder(borderCol, 4, true);
        //textBox.setBackground(Color.white);
        textBox.setBorder(borderTest);
        textBox.setFont(new Font("", Font.PLAIN, 18));

        //MOUSELISTENER1 USED TO REMOVE STARTER MESSAGE
        textBox.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                textBox.setText("");
            }

        });

        JLabel ChatBack = new JLabel();
        ChatBack.setOpaque(true);
        ChatBack.setBounds(1105, 110, 340, 350);
        ChatBack.setBackground(new Color(0, 152, 152));

        JButton Chat = new JButton();
        Chat.setOpaque(false);
        Chat.setBounds(1437, 435, 43, 45);
        myAccount.add(Chat);
        //MOUSE LISTENER2
        Chat.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                myAccount.add(help);
                myAccount.repaint();
            }

            public void mouseExited(MouseEvent evt) {
                myAccount.remove(help);
                myAccount.repaint();
            }

        });

        JButton Chat1 = new JButton();
        Chat1.setOpaque(false);
        Chat1.setBounds(1437, 435, 43, 45);

        //ACTION LISTENER USED TO DISPLAY THE CHAT BOT(IVA)
        Chat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                myAccount.remove(help);
                myAccount.remove(Chat);
                myAccount.add(avi);
                myAccount.add(starterMessage);
                myAccount.add(textBox);
                myAccount.add(scrBar);
                myAccount.add(ChatBack);
                myAccount.add(Chat1);
                myAccount.repaint();
            }
        });
        //ACTION LISTENER WHICH REMOVES THE CHAT BOT  
        Chat1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myAccount.remove(Chat1);
                myAccount.remove(ChatBack);
                myAccount.remove(textBox);
                myAccount.remove(starterMessage);
                myAccount.remove(scrBar);
                myAccount.remove(avi);
                myAccount.add(Chat);
                myAccount.repaint();

            }
        });

        //ACTION LISTENER WHICH MAKES THE AUTOMATION OF CHATS AND REPLYS
        textBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //avi.setVisible(false);
                String inputTextDisplay = textBox.getText();
                String inputText = inputTextDisplay.toLowerCase();
                if (!(inputText.equals(""))) {
                    chatArea.append("👤: " + inputTextDisplay + "\n");
                }
                textBox.setText("");
                //HARDCODED CHATS (LINE:244-356)
                if (inputText.contains("hi")
                        || inputText.contains("hello")
                        || inputText.contains("hey")
                        || inputText.contains("namasthe")
                        || inputText.contains("hi iva")
                        || inputText.contains("hey iva")
                        || inputText.contains("yo")) {
                    ++flag;
                    if (flag == 1) {
                        try {
                            Bot("Konnichiwa!! ,how can I help u ?");
                        } catch (Exception ex) {

                        }
                    } else if (flag == 2) {
                        try {
                            Bot("Hello I am iva, how can I help you");
                        } catch (Exception ex) {

                        }
                    } else {
                        flag = 0;
                        try {
                            Bot("Ok bro, what's next??");
                        } catch (Exception ex) {

                        }
                    }
                } else if (inputText.contains("where can i find my ticket")
                        || inputText.contains("ticket")
                        || inputText.contains("where is ticket")) {
                    try {
                        Bot("Check My Booking Section");
                    } catch (Exception ex) {

                    }

                } else if (inputText.contains("how to return to home page")
                        || inputText.contains("how to go back to home page")
                        || inputText.contains("how to return back to starting page")
                        || inputText.contains("how do i go back")
                        || inputText.contains("how to go back")) {
                    try {
                        Bot("Press Home Button");
                    } catch (Exception ex) {

                    }
                } else if (inputText.contains("forgot password")) {
                    try {
                        Bot("Try Creating a new Account Maybe");
                    } catch (Exception ex) {

                    }
                } else if (inputText.contains("what is your name ?")
                        || inputText.contains("what is your name?")
                        || inputText.contains("what is your name")
                        || inputText.contains("what's your name?")
                        || inputText.contains("what's your name ?")
                        || inputText.contains("what's your name")) {
                    try {
                        Bot("My Name Is ivA ");
                    } catch (Exception ex) {

                    }
                } else if (!(inputText.equals(""))) {
                    try {
                        Bot("I am still in Beta stage\n");
                    } catch (Exception ex) {

                    }

                }

            }
        });
    }

    //FUNCTION WHICH APPENDS MESSAGE TO CHAT AREA
    public void Bot(String message) throws Exception {
        //.SLEEP() FUNCTION USED TO INTRDUCE SOME DELAY DURING THE RESPONSE
        Thread.sleep(200);
        chatArea.append("🤖: " + message + "\n");
    }

    //CONSTRUCTOR 
    public MyAccount() {

        //COLOURS USED IN ACCOUNT PAGE
        Color color = new Color(72, 245, 191);
        Color col = new Color(183, 139, 255);
        Color borderColorHover = new Color(255, 255, 255);

        myAccount = new JFrame("Account Page");
        myAccount.setLayout(null);
        myAccount.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //HEADER
        JLabel Cname = new JLabel("QuadrA");
        Cname.setBounds(145, 10, 3000, 70);
        Cname.setForeground(Color.WHITE);
        Cname.setFont(new Font("Segoe Script", Font.BOLD, 70));
        myAccount.add(Cname);

        JLabel Cname3 = new JLabel(" Airlines");
        Cname3.setBounds(320, 62, 3000, 40);
        Cname3.setForeground(Color.WHITE);
        Cname3.setFont(new Font("", Font.BOLD, 30));
        myAccount.add(Cname3);

        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(49, 10, 120, 80);
        Clogo2.setForeground(c1);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        myAccount.add(Clogo2);

        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(20, 2, 130, 95);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        myAccount.add(Clogo3);

        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(40, 10, 120, 80);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        myAccount.add(Clogo1);

        CMotto = new JLabel("<html>...we make the sky, <br/>feel like</html>");
        CMotto.setBounds(1185, 5, 300, 90);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));
        myAccount.add(CMotto);

        btnBack.setBounds(1300, 60, 130, 25);
        btnBack.setFont(new Font("", Font.BOLD, 18));
        btnBack.setBackground(c2);
        btnBack.setForeground(Color.WHITE);
        myAccount.add(btnBack);

        JLabel Header = new JLabel("");
        Header.setBounds(0, 0, 5000, 100);
        Header.setOpaque(true);
        Header.setBackground(c1);
        myAccount.add(Header);

        //END OF HEADER
        //USER PROFILE
        JLabel userLogo = new JLabel("👤");
        userLogo.setBounds(620, 200, 280, 280);
        userLogo.setFont(new Font("", Font.BOLD, 250));
        userLogo.setForeground(c2);
        myAccount.add(userLogo);

        JLabel imgBackground = new JLabel();
        imgBackground.setBounds(570, 130, 350, 350);
        imgBackground.setOpaque(true);
        Border border1 = new LineBorder(borderCol, 2, true);
        imgBackground.setBorder(border1);
        imgBackground.setBackground(c1);
        myAccount.add(imgBackground);
        //END OF USER PROFILE

        //LINE SEPARATOR
        JLabel lineSeparator1 = new JLabel();
        lineSeparator1.setBounds(0, 500, 700, 3);
        lineSeparator1.setOpaque(true);
        lineSeparator1.setBackground(c2);
        myAccount.add(lineSeparator1);

        JLabel lineSeparator2 = new JLabel();
        lineSeparator2.setBounds(810, 500, 760, 3);
        lineSeparator2.setOpaque(true);
        lineSeparator2.setBackground(c2);
        myAccount.add(lineSeparator2);
        //END OF LINE SEPARATOR

        //USER INFO   (LINE:473 - 546)
        JLabel userFName = new JLabel("FIRSTNAME :");
        userFName.setBounds(60, 550, 170, 50);
        userFName.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        userFName.setForeground(c2);
        myAccount.add(userFName);

        JLabel userFNameDisplay = new JLabel("    " + SignUp.fname);
        userFNameDisplay.setBounds(230, 550, 260, 50);
        userFNameDisplay.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        userFNameDisplay.setForeground(c2);
        userFNameDisplay.setBorder(border);
        myAccount.add(userFNameDisplay);

        JLabel userLName = new JLabel("LASTNAME :");
        userLName.setBounds(570, 550, 160, 50);
        userLName.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        userLName.setForeground(c2);
        myAccount.add(userLName);

        JLabel userLNameDisplay = new JLabel("   " + SignUp.lname);
        userLNameDisplay.setBounds(730, 550, 260, 50);
        userLNameDisplay.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        userLNameDisplay.setForeground(c2);
        userLNameDisplay.setBorder(border);
        myAccount.add(userLNameDisplay);

        JLabel userName = new JLabel("USERNAME:");
        userName.setBounds(1060, 550, 160, 50);
        userName.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        userName.setForeground(c2);
        myAccount.add(userName);

        JLabel userNameDisplay = new JLabel("   " + SignUp.uname);
        userNameDisplay.setBounds(1220, 550, 260, 50);
        userNameDisplay.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        userNameDisplay.setForeground(c2);
        userNameDisplay.setBorder(border);
        myAccount.add(userNameDisplay);

        JLabel userEmail = new JLabel("USER EMAIL:");
        userEmail.setBounds(60, 700, 160, 50);
        userEmail.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        userEmail.setForeground(c2);
        myAccount.add(userEmail);

        JLabel userEmailDisplay = new JLabel("  " + SignUp.uname + "@xyz.com");
        userEmailDisplay.setBounds(230, 700, 350, 50);
        userEmailDisplay.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        userEmailDisplay.setForeground(c2);
        userEmailDisplay.setBorder(border);
        myAccount.add(userEmailDisplay);

        JLabel password = new JLabel("PASSWORD:");
        password.setBounds(680, 700, 160, 50);
        password.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        password.setForeground(c2);
        myAccount.add(password);

        JPasswordField passwordDisplay = new JPasswordField("  " + SignUp.pass);
        passwordDisplay.setBounds(840, 700, 260, 50);
        passwordDisplay.setFont(new Font("Bookman Old Style", Font.BOLD, 22));
        passwordDisplay.setForeground(c2);
        passwordDisplay.setBorder(border);
        passwordDisplay.setEditable(false);
        myAccount.add(passwordDisplay);

        resetPassword.setBounds(1160, 705, 200, 40);
        resetPassword.setFont(new Font("", Font.BOLD, 16));
        resetPassword.setForeground(Color.white);
        resetPassword.setBackground(c1);
        resetPassword.setBorder(border);
        myAccount.add(resetPassword);
        //END OF USER INFO

        //ACTION LISTENER USED TO CALL RESET PASSWORD FRAME
        resetPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetPassword.setForeground(Color.WHITE);
                resetPassword.setBackground(c1);
                CMotto.setText("<html>...we make the sky, <br/>feel like home</html>");
                myAccount.remove(resetPassword);
                myAccount.remove(btnBack);
                myAccount.repaint();
                new ResetPassword();

            }
        });

        //TIMER
        JLabel timerHeader = new JLabel("     SESSION TIME ");
        timerHeader.setBounds(30, 120, 180, 40);
        timerHeader.setFont(new Font("", Font.BOLD, 18));
        timerHeader.setForeground(Color.white);
        //Border border2 =  new LineBorder(borderCol, 2, true);
        //timerHeader.setBorder(border2);
        timerHeader.setOpaque(true);
        timerHeader.setBackground(c2);
        myAccount.add(timerHeader);

        hour.setText("00:");
        hour.setBounds(75, 160, 50, 30);
        hour.setFont(new Font("", Font.BOLD, 18));
        hour.setForeground(Color.WHITE);
        myAccount.add(hour);

        //minute  = new JLabel();
        minute.setBounds(105, 160, 50, 30);
        minute.setFont(new Font("", Font.BOLD, 18));
        minute.setForeground(Color.WHITE);
        myAccount.add(minute);

        //second  = new JLabel();
        second.setBounds(135, 160, 50, 30);
        second.setFont(new Font("", Font.BOLD, 18));
        second.setForeground(Color.WHITE);
        myAccount.add(second);

        JLabel timerContainer = new JLabel();
        timerContainer.setBounds(10, 110, 220, 80);
        timerContainer.setOpaque(true);
        timerContainer.setBackground(c1);
        //Border timerBorder =  new LineBorder(borderCol, 1, true);
        //timerContainer.setBorder(timerBorder);
        myAccount.add(timerContainer);

        //ANIMATIONS ON USER INFO
        userFNameDisplay.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                userFNameDisplay.setBounds(230, 550, 262, 50);
                userFNameDisplay.setOpaque(true);
                userFNameDisplay.setBackground(c1);
                userFNameDisplay.setForeground(Color.white);
            }

            public void mouseExited(MouseEvent evt) {
                userFNameDisplay.setBounds(230, 550, 260, 50);
                userFNameDisplay.setOpaque(false);
                userFNameDisplay.setForeground(c2);
            }
        });

        userLNameDisplay.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                userLNameDisplay.setBounds(730, 550, 262, 50);
                userLNameDisplay.setOpaque(true);
                userLNameDisplay.setBackground(c1);
                userLNameDisplay.setForeground(Color.white);
            }

            public void mouseExited(MouseEvent evt) {
                userLNameDisplay.setBounds(730, 550, 260, 50);
                userLNameDisplay.setOpaque(false);
                userLNameDisplay.setForeground(c2);
            }
        });

        userNameDisplay.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                userNameDisplay.setBounds(1220, 550, 262, 50);
                userNameDisplay.setOpaque(true);
                userNameDisplay.setBackground(c1);
                userNameDisplay.setForeground(Color.white);
            }

            public void mouseExited(MouseEvent evt) {
                userNameDisplay.setBounds(1220, 550, 260, 50);
                userNameDisplay.setOpaque(false);
                userNameDisplay.setForeground(c2);
            }
        });

        userEmailDisplay.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                userEmailDisplay.setBounds(230, 700, 352, 50);
                userEmailDisplay.setOpaque(true);
                userEmailDisplay.setBackground(c1);
                userEmailDisplay.setForeground(Color.white);
            }

            public void mouseExited(MouseEvent evt) {
                userEmailDisplay.setBounds(230, 700, 350, 50);
                userEmailDisplay.setOpaque(false);
                userEmailDisplay.setForeground(c2);
            }
        });

        passwordDisplay.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                passwordDisplay.setBounds(840, 700, 262, 50);
                passwordDisplay.setOpaque(true);
                passwordDisplay.setBackground(c1);
                passwordDisplay.setForeground(Color.white);
            }

            public void mouseExited(MouseEvent evt) {
                passwordDisplay.setBounds(840, 700, 260, 50);
                passwordDisplay.setOpaque(false);
                passwordDisplay.setForeground(c2);
            }
        });
        Border border3Hover = new LineBorder(c2, 6, true);

        //USER PROFILE HOVER EFFECT
        imgBackground.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {

                Border border1Hover = new LineBorder(borderColorHover, 4, true);

                userLogo.setBounds(610, 190, 280, 300);
                userLogo.setFont(new Font("", Font.BOLD, 270));
                userLogo.setForeground(borderColorHover);
                imgBackground.setBorder(border1Hover);

            }

            public void mouseExited(MouseEvent evt) {
                userLogo.setBounds(620, 200, 280, 280);
                userLogo.setFont(new Font("", Font.BOLD, 250));
                userLogo.setForeground(c2);
                imgBackground.setBorder(border1);
            }
        });
        //END OF USER PROFILE ON HOVER 

        //HOME PAGE
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new HomePage();
                myAccount.setVisible(false);
            }
        });

        //BACKGROUND        
        Color matcol = new Color(123, 123, 124);
        myAccount.getContentPane().setBackground(c3);

        //END OF BACKGROUND
        chatBot();//CALLING CHAT BOT FUNCTION
        myAccount.setVisible(true);
        myAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
