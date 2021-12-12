/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ashwin_R_Prabhu;//USER DEFINED PACKAGES

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DateFormat;
import java.util.Date;

//IMPORTING USER DEFINED PACKAGES
import Ashish_Kishore_Kumar.*;
import Anston_P_Miranda.*;
import Adithya_K_Shetty.*;

/**
 *
 * @author Ashwin R Prabhu 4SO19CS033
 */
public class HomePage {

    JFrame homefrm;
    JLabel titlelb, title1lb, title2lb, tbground, sure, textlb;
    private JLabel clock = new JLabel();
    JMenuBar mbar;
    Color FB = new Color(0, 152, 152);
    Color GR = new Color(219, 50, 54);
    Color c2 = new Color(0, 90, 90);
    Color c3 = new Color(230, 230, 230);//frame background

    public HomePage() {

        //Frame
        homefrm = new JFrame("Home");
        homefrm.setExtendedState(JFrame.MAXIMIZED_BOTH);//max window size
        homefrm.getContentPane().setBackground(c3); //background colour

        //Title
        //Label Declaration for QuadrA
        titlelb = new JLabel("QuadrA");
        titlelb.setBounds(145, 10, 3000, 70);
        titlelb.setForeground(Color.WHITE);
        titlelb.setFont(new Font("Segoe Script", Font.BOLD, 70));
        homefrm.add(titlelb);

        //Label For airlines
        title1lb = new JLabel(" Airlines");
        title1lb.setBounds(320, 62, 3000, 40);
        title1lb.setForeground(Color.WHITE);
        title1lb.setFont(new Font("", Font.BOLD, 30));
        homefrm.add(title1lb);

        //Label for motto
        JLabel CMotto = new JLabel("<html>...we make the sky, <br/>feel like home</html>");
        CMotto.setBounds(1185, 5, 300, 90);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));
        homefrm.add(CMotto);

        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(49, 10, 120, 80);
        Clogo2.setForeground(FB);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        homefrm.add(Clogo2);

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(20, 2, 130, 95);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        homefrm.add(Clogo3);

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(40, 10, 120, 80);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        homefrm.add(Clogo1);

        //clock
        tiktok();
        clock.setBounds(1170, 95, 300, 40);
        clock.setForeground(c2);
        clock.setFont(new Font("", Font.BOLD, 18));
        homefrm.add(clock);
        Timer timer = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tiktok();
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();

        //Title background
        tbground = new JLabel("");
        tbground.setBounds(0, 0, 5000, 100);
        tbground.setOpaque(true);
        tbground.setBackground(FB);
        homefrm.add(tbground);

        //news1
        JLabel ntext1 = new JLabel("□");
        ntext1.setForeground(Color.WHITE);
        ntext1.setBounds(60, 125, 200, 200);
        ntext1.setFont(new Font("", Font.BOLD, 170));
        homefrm.add(ntext1);

        JLabel ntext11 = new JLabel("🏝");
        ntext11.setForeground(FB);
        ntext11.setBounds(90, 175, 100, 100);
        ntext11.setFont(new Font("", Font.BOLD, 90));
        homefrm.add(ntext11);

        JLabel ntext12 = new JLabel("<html>Travel to many places has been restricted based on the Covid-19 protocol.<BR/>"
                + "Please be up-to-date on our guidelines regarding this.</html>");
        //ntext12.setForeground(FB);
        ntext12.setBounds(210, 25, 400, 400);
        ntext12.setFont(new Font("", Font.BOLD, 18));
        homefrm.add(ntext12);

        //news2
        JLabel ntext2 = new JLabel("□");
        ntext2.setForeground(Color.WHITE);
        ntext2.setBounds(60, 285, 200, 200);
        ntext2.setFont(new Font("", Font.BOLD, 170));
        homefrm.add(ntext2);

        JLabel ntext21 = new JLabel("🛫");
        ntext21.setForeground(FB);
        ntext21.setBounds(90, 335, 100, 100);
        ntext21.setFont(new Font("", Font.BOLD, 90));
        homefrm.add(ntext21);

        JLabel ntext22 = new JLabel("<html>The number of flights booked per account has been reduced to one.<BR/>"
                + "Please comply.</html>");
        //ntext12.setForeground(FB);
        ntext22.setBounds(210, 185, 400, 400);
        ntext22.setFont(new Font("", Font.BOLD, 18));
        homefrm.add(ntext22);

        //news3
        JLabel ntext3 = new JLabel("□");
        ntext3.setForeground(Color.WHITE);
        ntext3.setBounds(60, 445, 200, 200);
        ntext3.setFont(new Font("", Font.BOLD, 170));
        homefrm.add(ntext3);

        JLabel ntext31 = new JLabel("💰");
        ntext31.setForeground(FB);
        ntext31.setBounds(90, 495, 100, 100);
        ntext31.setFont(new Font("", Font.BOLD, 90));
        homefrm.add(ntext31);

        JLabel ntext32 = new JLabel("<html>The booking payment has  to be done at the counter in the airport.<BR/>"
                + "Remember to carry enough cash, we dont take cards.</html>");
        //ntext32.setForeground(FB);
        ntext32.setBounds(210, 345, 400, 400);
        ntext32.setFont(new Font("", Font.BOLD, 18));
        homefrm.add(ntext32);

        //news4
        JLabel ntext4 = new JLabel("□");
        ntext4.setForeground(Color.WHITE);
        ntext4.setBounds(60, 605, 200, 200);
        ntext4.setFont(new Font("", Font.BOLD, 170));
        homefrm.add(ntext4);

        JLabel ntext41 = new JLabel("😷");
        ntext41.setForeground(FB);
        ntext41.setBounds(90, 655, 100, 100);
        ntext41.setFont(new Font("", Font.BOLD, 90));
        homefrm.add(ntext41);

        JLabel ntext42 = new JLabel("<html>Its necessary you wear a mask for the entire flight duration.<BR/>"
                + "Failure to follow this rule can earn you a ban from travelling with us.</html>");
        //ntext42.setForeground(FB);
        ntext42.setBounds(210, 505, 400, 400);
        ntext42.setFont(new Font("", Font.BOLD, 18));
        homefrm.add(ntext42);

        //news5
        JLabel ntext5 = new JLabel("□");
        ntext5.setForeground(Color.WHITE);
        ntext5.setBounds(810, 125, 200, 200);
        ntext5.setFont(new Font("", Font.BOLD, 170));
        homefrm.add(ntext5);

        JLabel ntext51 = new JLabel("💉");
        ntext51.setForeground(FB);
        ntext51.setBounds(840, 175, 100, 100);
        ntext51.setFont(new Font("", Font.BOLD, 90));
        homefrm.add(ntext51);

        JLabel ntext52 = new JLabel("<html>It is required to get vaccinated for Covid-19 to board our flight.<BR/>"
                + "The health and safety of our customers is our highest priority.</html>");
        //ntext12.setForeground(FB);
        ntext52.setBounds(960, 25, 400, 400);
        ntext52.setFont(new Font("", Font.BOLD, 18));
        homefrm.add(ntext52);

        //news6
        JLabel ntext6 = new JLabel("□");
        ntext6.setForeground(Color.WHITE);
        ntext6.setBounds(810, 285, 200, 200);
        ntext6.setFont(new Font("", Font.BOLD, 170));
        homefrm.add(ntext6);

        JLabel ntext61 = new JLabel("▶");
        ntext61.setForeground(FB);
        ntext61.setBounds(873, 340, 100, 100);
        ntext61.setFont(new Font("", Font.BOLD, 40));
        homefrm.add(ntext61);
        JLabel ntext611 = new JLabel("▭");
        ntext611.setForeground(FB);
        ntext611.setBounds(840, 335, 100, 100);
        ntext611.setFont(new Font("", Font.BOLD, 90));
        homefrm.add(ntext611);

        JLabel ntext62 = new JLabel("<html>We will resume our normal booking services after the lockdowns are lifted.<BR/>"
                + "For now the booking is restricted.</html>");
        //ntext62.setForeground(FB);
        ntext62.setBounds(960, 185, 400, 400);
        ntext62.setFont(new Font("", Font.BOLD, 18));
        homefrm.add(ntext62);

        //news7
        JLabel ntext7 = new JLabel("□");
        ntext7.setForeground(Color.WHITE);
        ntext7.setBounds(810, 445, 200, 200);
        ntext7.setFont(new Font("", Font.BOLD, 170));
        homefrm.add(ntext7);

        JLabel ntext71 = new JLabel("👦");
        ntext71.setForeground(FB);
        ntext71.setBounds(840, 510, 100, 100);
        ntext71.setFont(new Font("", Font.BOLD, 90));
        homefrm.add(ntext71);

        JLabel ntext72 = new JLabel("<html>You can check your personal information  and booking details in My Account section.<BR/>"
                + "Your account password can also be updated here.</html>");
        //ntext72.setForeground(FB);
        ntext72.setBounds(960, 345, 400, 400);
        ntext72.setFont(new Font("", Font.BOLD, 18));
        homefrm.add(ntext72);

        //news8
        JLabel ntext8 = new JLabel("□");
        ntext8.setForeground(Color.WHITE);
        ntext8.setBounds(810, 605, 200, 200);
        ntext8.setFont(new Font("", Font.BOLD, 170));
        homefrm.add(ntext8);

        JLabel ntext81 = new JLabel("🛄");
        ntext81.setForeground(FB);
        ntext81.setBounds(840, 655, 100, 100);
        ntext81.setFont(new Font("", Font.BOLD, 90));
        homefrm.add(ntext81);

        JLabel ntext82 = new JLabel("<html>BAGGAGE LIMITATIONS <BR/> Domestic flight: 15kg/person.<br/>"
                + "International flight: 30kg/person.</html>");
        //ntext82.setForeground(FB);
        ntext82.setBounds(960, 505, 400, 400);
        ntext82.setFont(new Font("", Font.BOLD, 18));
        homefrm.add(ntext82);

        //partition line label
        JLabel Line = new JLabel("");
        Line.setBounds(730, 170, 3, 600);
        Line.setOpaque(true);
        Line.setBackground(FB);
        homefrm.add(Line);

        //Sign-out button & its Action Listener
        JButton soutbtn = new JButton("Sign Out");
        soutbtn.setBounds(1400, 100, 120, 30);
        soutbtn.setForeground(Color.WHITE);
        soutbtn.setFont(new Font("", Font.BOLD, 20));
        soutbtn.setBackground(GR);
        homefrm.add(soutbtn);

        soutbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(homefrm, "Are You Sure?", "Sign Out",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    new SignIn();
                    homefrm.setVisible(false);
                }
            }
        });

        //MenuBar
        mbar = new JMenuBar();
        mbar.setBounds(0, 100, 3000, 30);
        homefrm.add(mbar);

        //Booking menu with 2 items
        JMenu bookm = new JMenu("  Booking  ");
        bookm.setFont(new Font("", Font.BOLD, 20));
        mbar.add(bookm);

        //Booking menu item 1 -Domestic & its Action Listener
        JMenuItem domitem = new JMenuItem("Domestic");
        domitem.setFont(new Font("", Font.BOLD, 18));
        bookm.add(domitem);

        domitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new Domestic();
                homefrm.setVisible(false);
            }                                                                 //Anstons Part
        });

        //Booking menu item  -International & its Action Listener
        JMenuItem intitem = new JMenuItem("International");
        intitem.setFont(new Font("", Font.BOLD, 18));
        bookm.add(intitem);

        intitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new International();
                homefrm.setVisible(false);
            }
        });

        //Account menu with 2 items
        JMenu accm = new JMenu("  My Account  ");
        accm.setFont(new Font("", Font.BOLD, 20));
        mbar.add(accm);

        //Account menu item 1 -My Details & its Action Listener
        JMenuItem detitem = new JMenuItem("My Details");
        detitem.setFont(new Font("", Font.BOLD, 18));
        accm.add(detitem);

        detitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new MyAccount();
                homefrm.setVisible(false);
            }                                                               //Adityas Part
        });

        //Account menu item 2 -My Bookings & its Action Listener
        JMenuItem bookitem = new JMenuItem("My Bookings");
        bookitem.setFont(new Font("", Font.BOLD, 18));
        accm.add(bookitem);

        bookitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new BoardingPass();
                homefrm.setVisible(false);
            }
        });

        //About us menu with 3 items
        JMenu abtm = new JMenu("  About Us  ");
        abtm.setFont(new Font("", Font.BOLD, 20));
        mbar.add(abtm);

        //About us menu item 1 -Devs. & its Action Listener
        JMenuItem devitem = new JMenuItem("Devs.");
        devitem.setFont(new Font("", Font.BOLD, 18));
        abtm.add(devitem);

        devitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Devs d = new Devs();
                d.ShowDevs();
                homefrm.setVisible(false);
            }                                                              //Ashishs Part
        });

        //About us menu item 2 -Contact info. & its Action Listener
        JMenuItem contitem = new JMenuItem("Contact Info.");
        contitem.setFont(new Font("", Font.BOLD, 18));
        abtm.add(contitem);

        contitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                AboutUs a = new AboutUs();
                a.ShowAboutus();
                homefrm.setVisible(false);
            }
        });

        //About us menu item 3 -T&C & its Action Listener      
        JMenuItem tcitem = new JMenuItem("T&C");
        tcitem.setFont(new Font("", Font.BOLD, 18));
        abtm.add(tcitem);

        tcitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                TandC t = new TandC();
                t.ShowTandC();
                homefrm.setVisible(false);
            }
        });

        homefrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homefrm.setLayout(null);
        homefrm.setVisible(true);
    }

    public void tiktok()//function for clock
    {
        clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }

}
