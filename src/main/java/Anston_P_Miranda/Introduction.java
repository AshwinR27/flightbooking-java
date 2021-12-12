package Anston_P_Miranda;//USER DEFINED PACKAGES

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

//IMPORTING USER DEFINED PACKAGES
import Adithya_K_Shetty.MyAccount;
import Ashwin_R_Prabhu.*;

/**
 *
 * @author Anston Miranda 4SO19CS023
 */
public class Introduction //Introduction class animation
{

    Introduction() throws InterruptedException//exception clause for constructor
    {
        SignUp.password = null;//first time password initailization

        //Intro JFrame 
        JFrame Intro = new JFrame("Welcome to QuadrA");
        Intro.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Intro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Intro.setLayout(null);
        Intro.getContentPane().setBackground(Color.BLACK);
        Intro.setVisible(true);

        //our colour scheme
        Color c1 = new Color(0, 152, 152);
        Color c2 = new Color(0, 90, 90);

        /**
         * **************Company Logo************
         */
        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(660, 10, 400, 400);
        Clogo2.setForeground(c1);
        Clogo2.setFont(new Font("", Font.BOLD, 200));

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(580, 2, 400, 400);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 400));

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(642, 10, 400, 400);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 240));

        //Label for logo layer 1
        JLabel Clogo4 = new JLabel("✥");
        Clogo4.setBounds(49, 10, 120, 80);
        Clogo4.setForeground(c1);
        Clogo4.setFont(new Font("", Font.BOLD, 60));

        //Label for logo layer 2
        JLabel Clogo5 = new JLabel("◇");
        Clogo5.setBounds(20, 2, 130, 95);
        Clogo5.setForeground(Color.white);
        Clogo5.setFont(new Font("", Font.PLAIN, 130));

        //Label for logo layer 2
        JLabel Clogo6 = new JLabel("❖");
        Clogo6.setBounds(40, 10, 120, 80);
        Clogo6.setForeground(c2);
        Clogo6.setFont(new Font("", Font.BOLD, 80));

        /**
         * ********Quadra Animation on Black Screen*********
         */
        //Label for animation
        JLabel Q = new JLabel("Q");
        Q.setBounds(40, 280, 1500, 300);
        Q.setForeground(Color.WHITE);
        Q.setFont(new Font("", Font.BOLD, 200));

        JLabel U = new JLabel("Q  U");
        U.setBounds(40, 280, 1500, 300);
        U.setForeground(Color.WHITE);
        U.setFont(new Font("", Font.BOLD, 200));

        JLabel a = new JLabel("Q  U  A");
        a.setBounds(40, 280, 1500, 300);
        a.setForeground(Color.WHITE);
        a.setFont(new Font("", Font.BOLD, 200));

        JLabel D = new JLabel("Q  U  A  D");
        D.setBounds(40, 280, 1500, 300);
        D.setForeground(Color.WHITE);
        D.setFont(new Font("", Font.BOLD, 200));

        JLabel R = new JLabel("Q  U  A  D  R");
        R.setBounds(40, 280, 1500, 300);
        R.setForeground(Color.WHITE);
        R.setFont(new Font("", Font.BOLD, 200));

        JLabel A = new JLabel("Q  U  A  D  R  A");
        A.setBounds(40, 280, 1500, 300);
        A.setForeground(Color.WHITE);
        A.setFont(new Font("", Font.BOLD, 200));

        JLabel A2 = new JLabel("Q U A D R A");
        A2.setBounds(180, 280, 1500, 300);
        A2.setForeground(c1);
        A2.setFont(new Font("", Font.BOLD, 200));

        JLabel A3 = new JLabel("QUADRA");
        A3.setBounds(320, 280, 1500, 300);
        A3.setForeground(c1);
        A3.setFont(new Font("", Font.BOLD, 200));

        /**
         * *************Black to Color Transition headers************
         */
        JLabel Header7 = new JLabel("");
        Header7.setBounds(700, 0, 100, 2000);
        Header7.setOpaque(true);
        Header7.setBackground(c1);

        JLabel Header8 = new JLabel("");
        Header8.setBounds(600, 0, 300, 2000);
        Header8.setOpaque(true);
        Header8.setBackground(c1);

        JLabel Header9 = new JLabel("");
        Header9.setBounds(500, 0, 500, 2000);
        Header9.setOpaque(true);
        Header9.setBackground(c1);

        JLabel Header10 = new JLabel("");
        Header10.setBounds(400, 0, 700, 2000);
        Header10.setOpaque(true);
        Header10.setBackground(c1);

        JLabel Header11 = new JLabel("");
        Header11.setBounds(300, 0, 900, 2000);
        Header11.setOpaque(true);
        Header11.setBackground(c1);

        JLabel Header12 = new JLabel("");
        Header12.setBounds(200, 0, 1100, 2000);
        Header12.setOpaque(true);
        Header12.setBackground(c1);

        JLabel Header13 = new JLabel("");
        Header13.setBounds(100, 0, 1300, 2000);
        Header13.setOpaque(true);
        Header13.setBackground(c1);

        JLabel Header14 = new JLabel("");
        Header14.setBounds(0, 0, 1500, 2000);
        Header14.setOpaque(true);
        Header14.setBackground(c1);

        JLabel Header15 = new JLabel("");
        Header15.setBounds(0, 0, 1700, 2000);
        Header15.setOpaque(true);
        Header15.setBackground(c1);

        /**
         * *********Actual Quadra written Style*********
         */
        //Label Declaration for QuadrA
        JLabel Cname = new JLabel("QuadrA");
        Cname.setBounds(320, 280, 1500, 300);
        Cname.setForeground(Color.WHITE);
        Cname.setFont(new Font("Segoe Script", Font.BOLD, 200));

        //Label For airlines
        JLabel Cname2 = new JLabel(" Airlines");
        Cname2.setBounds(800, 480, 1000, 100);
        Cname2.setForeground(Color.WHITE);
        Cname2.setFont(new Font("", Font.BOLD, 100));

        JLabel CMotto = new JLabel("<html>...we make the sky, feel like home</html>");
        CMotto.setBounds(1000, 5, 700, 100);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));

        /**
         * **************Loading bar status***********
         */
        JLabel Cname3 = new JLabel("INITIALIZING APPLICATION....");
        Cname3.setBounds(620, 730, 400, 60);
        Cname3.setForeground(Color.WHITE);
        Cname3.setFont(new Font("", Font.BOLD, 20));

        JLabel Cname4 = new JLabel("   UNPACKING CLASSES....");
        Cname4.setBounds(620, 730, 400, 60);
        Cname4.setForeground(Color.WHITE);
        Cname4.setFont(new Font("", Font.BOLD, 20));

        JLabel Cname5 = new JLabel("TRYING TO LOOK IMPRESSIVE....");
        Cname5.setBounds(620, 730, 400, 60);
        Cname5.setForeground(Color.WHITE);
        Cname5.setFont(new Font("", Font.BOLD, 20));

        JLabel Cname6 = new JLabel("   ACTUALLY LAUNCHING....");
        Cname6.setBounds(620, 730, 400, 60);
        Cname6.setForeground(Color.WHITE);
        Cname6.setFont(new Font("", Font.BOLD, 20));

        /**
         * ************Loading Bar Headers*************
         */
        JLabel Header1 = new JLabel("");
        Header1.setBounds(0, 780, 250, 10);
        Header1.setOpaque(true);
        Header1.setBackground(Color.WHITE);

        JLabel Header2 = new JLabel("");
        Header2.setBounds(0, 780, 500, 10);
        Header2.setOpaque(true);
        Header2.setBackground(Color.WHITE);

        JLabel Header3 = new JLabel("");
        Header3.setBounds(0, 780, 750, 10);
        Header3.setOpaque(true);
        Header3.setBackground(Color.WHITE);

        JLabel Header4 = new JLabel("");
        Header4.setBounds(0, 780, 1000, 10);
        Header4.setOpaque(true);
        Header4.setBackground(Color.WHITE);

        JLabel Header5 = new JLabel("");
        Header5.setBounds(0, 780, 1250, 10);
        Header5.setOpaque(true);
        Header5.setBackground(Color.WHITE);

        JLabel Header6 = new JLabel("");
        Header6.setBounds(0, 780, 1600, 10);
        Header6.setOpaque(true);
        Header6.setBackground(Color.WHITE);

        /**
         * *********QUADRA LOGO AND LETTER ANIMATION*********
         */
        Thread.sleep(900);
        Intro.add(Clogo2);
        Intro.add(Clogo3);
        Intro.add(Clogo1);
        Intro.repaint();

        Thread.sleep(180);
        Intro.repaint();

        Thread.sleep(900);
        Intro.add(Q);
        Intro.repaint();

        Thread.sleep(400);
        Intro.remove(Q);
        Intro.add(U);
        Intro.repaint();

        Thread.sleep(400);
        Intro.remove(U);
        Intro.add(a);
        Intro.repaint();

        Thread.sleep(400);
        Intro.remove(a);
        Intro.add(D);
        Intro.repaint();

        Thread.sleep(400);
        Intro.remove(D);
        Intro.add(R);
        Intro.repaint();

        Thread.sleep(400);
        Intro.remove(R);
        Intro.add(A);
        Intro.repaint();

        Thread.sleep(400);
        Intro.remove(A);
        A.setForeground(c1);
        Intro.add(A);
        Intro.repaint();

        Thread.sleep(500);
        Intro.remove(A);
        Intro.repaint();

        Thread.sleep(10);
        Intro.add(A2);
        Intro.repaint();

        Thread.sleep(10);
        Intro.remove(A2);
        Intro.repaint();

        Thread.sleep(10);
        Intro.add(A3);
        Intro.repaint();

        /**
         * **********CURTAIN FROM BLACK TO BLUE********
         */
        Thread.sleep(1000);
        Intro.add(Header7);
        Intro.repaint();

        Thread.sleep(20);
        Intro.remove(Header7);
        Intro.add(Header8);
        Intro.repaint();

        Thread.sleep(20);
        Intro.remove(Header8);
        Intro.add(Header9);
        Intro.repaint();

        Thread.sleep(20);
        Intro.remove(Header9);
        Intro.add(Header10);
        Intro.repaint();

        Thread.sleep(20);
        Intro.remove(Header10);
        Intro.add(Header11);
        Intro.repaint();

        Thread.sleep(20);
        Intro.remove(Header11);
        Intro.add(Header12);
        Intro.repaint();

        Thread.sleep(20);
        Intro.remove(Header12);
        Intro.add(Header13);
        Intro.repaint();

        Thread.sleep(20);
        Intro.remove(Header13);
        Intro.add(Header14);
        Intro.repaint();

        Thread.sleep(20);
        Intro.remove(Header14);
        Intro.add(Header15);
        Intro.repaint();

        Thread.sleep(200);
        Intro.remove(A3);
        Intro.remove(Header15);
        Intro.getContentPane().setBackground(c1);
        Intro.repaint();

        /**
         * *******QUADRA FROM LEFT AND AIRLINES FROM RIGHT*******
         */
        Thread.sleep(300);
        Intro.remove(Cname2);
        Intro.remove(Cname);
        Cname.setBounds(-480, 280, 1500, 300);
        Cname2.setBounds(1600, 480, 1000, 100);
        Intro.add(Cname2);
        Intro.add(Cname);
        Intro.repaint();

        Thread.sleep(30);
        Intro.remove(Cname2);
        Intro.remove(Cname);
        Cname.setBounds(-380, 280, 1500, 300);
        Cname2.setBounds(1500, 480, 1000, 100);
        Intro.add(Cname2);
        Intro.add(Cname);
        Intro.repaint();

        Thread.sleep(30);
        Intro.remove(Cname2);
        Intro.remove(Cname);
        Cname.setBounds(-280, 280, 1500, 300);
        Cname2.setBounds(1400, 480, 1000, 100);
        Intro.add(Cname2);
        Intro.add(Cname);
        Intro.repaint();

        Thread.sleep(30);
        Intro.remove(Cname2);
        Intro.remove(Cname);
        Cname.setBounds(-180, 280, 1500, 300);
        Cname2.setBounds(1300, 480, 1000, 100);
        Intro.add(Cname2);
        Intro.add(Cname);
        Intro.repaint();

        Thread.sleep(30);
        Intro.remove(Cname2);
        Intro.remove(Cname);
        Cname.setBounds(-80, 280, 1500, 300);
        Cname2.setBounds(1200, 480, 1000, 100);
        Intro.add(Cname2);
        Intro.add(Cname);
        Intro.repaint();

        Thread.sleep(30);
        Intro.remove(Cname2);
        Intro.remove(Cname);
        Cname.setBounds(20, 280, 1500, 300);
        Cname2.setBounds(1100, 480, 1000, 100);
        Intro.add(Cname2);
        Intro.add(Cname);
        Intro.repaint();

        Thread.sleep(30);
        Intro.remove(Cname2);
        Intro.remove(Cname);
        Cname.setBounds(120, 280, 1500, 300);
        Cname2.setBounds(1000, 480, 1000, 100);
        Intro.add(Cname2);
        Intro.add(Cname);
        Intro.repaint();

        Thread.sleep(30);
        Intro.remove(Cname2);
        Intro.remove(Cname);
        Cname.setBounds(220, 280, 1500, 300);
        Cname2.setBounds(900, 480, 1000, 100);
        Intro.add(Cname2);
        Intro.add(Cname);
        Intro.repaint();

        Thread.sleep(30);
        Intro.remove(Cname2);
        Intro.remove(Cname);
        Cname.setBounds(320, 280, 1500, 300);
        Cname2.setBounds(800, 480, 1000, 100);
        Intro.add(Cname2);
        Intro.add(Cname);
        Intro.repaint();

        /**
         * *********ANIMATION TO LOADING**********
         */
        Thread.sleep(1200);
        Intro.remove(Clogo1);
        Intro.remove(Clogo2);
        Intro.remove(Clogo3);
        Intro.remove(Cname);
        Intro.remove(Cname2);
        Intro.add(Clogo4);
        Intro.add(Clogo5);
        Intro.add(Clogo6);
        Intro.add(CMotto);

        Cname.setBounds(230, 180, 1500, 300);
        Cname.setFont(new Font("Segoe Script", Font.BOLD, 250));

        Cname2.setBounds(810, 400, 1000, 100);
        Cname2.setForeground(Color.WHITE);
        Cname2.setFont(new Font("", Font.BOLD, 125));

        Intro.add(Cname);
        Intro.add(Cname2);
        Intro.repaint();

        /**
         * *******LOADING BAR********
         */
        Thread.sleep(700);
        Intro.add(Cname3);
        Intro.add(Header1);
        Intro.repaint();

        Thread.sleep(700);
        Intro.remove(Header1);
        Intro.remove(Cname3);
        Intro.add(Cname4);
        Intro.add(Header2);
        Intro.repaint();

        Thread.sleep(700);
        Intro.remove(Header2);
        Intro.add(Header3);
        Intro.repaint();

        Thread.sleep(700);
        Intro.remove(Header3);
        Intro.remove(Cname4);
        Intro.add(Cname5);
        Intro.add(Header4);
        Intro.repaint();

        Thread.sleep(700);
        Intro.remove(Header4);
        Intro.add(Header5);
        Intro.repaint();

        Thread.sleep(700);
        Intro.remove(Header5);
        Intro.remove(Cname5);
        Intro.add(Cname6);
        Intro.add(Header6);
        Intro.repaint();

        /**
         * ****ACTUAL LAUNCH*******
         */
        Thread.sleep(800);
        new SignIn();
        Intro.setVisible(false);

    }

    public static void main(String[] args) throws InterruptedException {

        new Introduction();//Program start call
        MyAccount.starttime = System.currentTimeMillis();//Initializer for timer
        MyAccount.timer();//Call for timer function

    }
}
