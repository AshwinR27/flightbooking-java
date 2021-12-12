package Anston_P_Miranda;//USER DEFINED PACKAGES

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//IMPORTING USER DEFINED PACKAGES
import Ashwin_R_Prabhu.HomePage;

/**
 *
 * @author Anston Miranda 4SO19CS023
 */
public class Flight extends JFrame {

    //Variables to pass for my bookings part
    public static int adults, children;
    public static int flightnumber;
    public static float totalfare;
    public static int adFare, chFare;
    public static int BookingDone;
    public static String Time, FlType;
    public static int op;

    //Setting Color,Main Frame and Font
    protected Color c1 = new Color(0, 152, 152);
    protected Color c2 = new Color(0, 90, 90);
    protected Color c3 = new Color(230, 230, 230);
    protected Color c4 = new Color(240, 240, 240);
    protected JFrame Booking = new JFrame("Flight Booking");
    protected Font f = new Font("", Font.BOLD, 16);

    //Declaring Buttons to be accessible to inherited classes to get data.
    public static JRadioButton rdoEco = new JRadioButton("Economy 💺");//button for Economy class selection
    protected JRadioButton rdoFirst = new JRadioButton("Business Class 🥂");//button for First class selection

    //declaring string numbers for dropdown list for number of adults and children.
    protected String number[] = {"1", "2", "3", "4"};//atleast 1 adult, max 4 adults
    protected String number2[] = {"0", "1", "2", "3", "4"};//0-4 children
    public static String Date1[] = {"20/8/21", "21/8/21", "22/8/21", "23/8/21"};//hardcoded dates 
    protected JComboBox cmbadult = new JComboBox(number);//Combo box for no of adults
    protected JComboBox cmbchild = new JComboBox(number2);//Combo box for no of children
    public static JComboBox cmbdate = new JComboBox(Date1);

    //Declaring search button for all classes and inheritance
    protected JButton btnSearch = new JButton("Search Flights ✈");

    Flight()//Class Flight Conastructor
    {

        //Main JFrame specifications
        Booking.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Booking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Booking.setLayout(null);
        Booking.getContentPane().setBackground(c3);

        //Declaring and specifying Button to go to HomeScreen
        JButton Home = new JButton("🏠 HOME");
        Home.setBounds(1300, 60, 130, 25);
        Home.setFont(new Font("", Font.BOLD, 18));
        Home.setBackground(c2);
        Home.setForeground(Color.white);
        Booking.add(Home);

        //Action Listner for Home button that calls Homepage constructor       
        Home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new HomePage();
                Booking.setVisible(false);
            }
        });

        //Label Declaration for QuadrA
        JLabel Cname = new JLabel("QuadrA");
        Cname.setBounds(145, 10, 3000, 70);
        Cname.setForeground(Color.WHITE);
        Cname.setFont(new Font("Segoe Script", Font.BOLD, 70));
        Booking.add(Cname);

        //Label For airlines
        JLabel Cname2 = new JLabel(" Airlines");
        Cname2.setBounds(320, 62, 3000, 40);
        Cname2.setForeground(Color.WHITE);
        Cname2.setFont(new Font("", Font.BOLD, 30));
        Booking.add(Cname2);

        //Label for motto
        JLabel CMotto = new JLabel("<html>...we make the sky, <br/>feel like</html>");
        CMotto.setBounds(1185, 5, 300, 90);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));
        Booking.add(CMotto);

        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(49, 10, 120, 80);
        Clogo2.setForeground(c1);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        Booking.add(Clogo2);

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(20, 2, 130, 95);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        Booking.add(Clogo3);

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(40, 10, 120, 80);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        Booking.add(Clogo1);

        //Label Declaration for coloured background only for the Header
        JLabel Header = new JLabel("");
        Header.setBounds(0, 0, 5000, 100);
        Header.setOpaque(true);
        Header.setBackground(c1);
        Booking.add(Header);

        //To check if any type of Booking is done
        if (BookingDone != 1 && BookingDone != 2) {
            //Label Declaration for Source 
            JLabel Source = new JLabel("🛫 Source:");
            Source.setBounds(20, 250, 200, 30);
            Source.setFont(new Font("", Font.BOLD, 20));
            Source.setForeground(Color.white);
            Booking.add(Source);

            //Label Declaration for Sign between Source and Destination        
            JLabel sign = new JLabel("⇒");
            sign.setBounds(270, 248, 200, 30);
            sign.setFont(new Font("", Font.BOLD, 30));
            sign.setForeground(Color.white);
            Booking.add(sign);

            //Label Declaration for Destination        
            JLabel Destination = new JLabel("🛬 Destination:");
            Destination.setBounds(320, 250, 200, 30);
            Destination.setFont(new Font("", Font.BOLD, 20));
            Destination.setForeground(Color.white);
            Booking.add(Destination);

            //Label Declaration for Adult numbers        
            JLabel Adults = new JLabel("No. of Adults :");
            Adults.setBounds(30, 310, 200, 30);
            Adults.setFont(f);
            Adults.setForeground(Color.white);
            Booking.add(Adults);

            //Label Declaration for Adult Symbol
            JLabel Adultsign = new JLabel("👤");
            Adultsign.setBounds(190, 312, 200, 30);
            Adultsign.setFont(new Font("", Font.PLAIN, 20));
            Adultsign.setForeground(Color.white);
            Booking.add(Adultsign);

            //Combo Box specification for no of adults
            cmbadult.setBounds(145, 315, 40, 25);
            cmbadult.setFont(f);
            //cmbadult.setBackground(c2);
            cmbadult.setForeground(c2);
            Booking.add(cmbadult);

            //Label Declaration for Children number
            JLabel Children = new JLabel("No. of children :");
            Children.setBounds(270, 310, 200, 30);
            Children.setFont(f);
            Children.setForeground(Color.white);
            Booking.add(Children);

            //Combo Box Declaration for Children number
            cmbchild.setBounds(400, 315, 40, 25);
            cmbchild.setFont(f);
            cmbchild.setForeground(c2);
            //cmbchild.setBackground(c2);
            Booking.add(cmbchild);

            //Label for Child symbol
            JLabel childsign = new JLabel("🚼  *");
            childsign.setBounds(445, 312, 200, 30);
            childsign.setFont(new Font("", Font.PLAIN, 20));
            childsign.setForeground(Color.white);
            Booking.add(childsign);

            //Radio Button for Economy specs     
            rdoEco.setBounds(30, 375, 150, 30);
            rdoEco.setFont(f);
            rdoEco.setSelected(true);//statement to check if economy is selected
            rdoEco.setBackground(c1);
            rdoEco.setForeground(Color.white);
            Booking.add(rdoEco);

            //Radio Button for First class specs
            rdoFirst.setBounds(190, 375, 200, 30);
            rdoFirst.setFont(f);
            rdoFirst.setBackground(c1);
            rdoFirst.setForeground(Color.white);
            Booking.add(rdoFirst);

            //Grouping button Economy and First class
            ButtonGroup bgGender = new ButtonGroup();
            bgGender.add(rdoEco);
            bgGender.add(rdoFirst);

            //Label Declaration for Date        
            JLabel Date = new JLabel("Date :");
            Date.setBounds(405, 375, 100, 30);
            Date.setFont(f);
            Date.setForeground(Color.white);
            Booking.add(Date);

            //Label Declaration for Calendar Symbol
            JLabel Datesign = new JLabel("📆");
            Datesign.setBounds(540, 375, 200, 30);
            Datesign.setFont(new Font("", Font.PLAIN, 20));
            Datesign.setForeground(Color.white);
            Booking.add(Datesign);

            //Combo Box specification for date selection.
            cmbdate.setBounds(455, 378, 80, 25);
            cmbdate.setFont(f);
            cmbdate.setForeground(c2);
            Booking.add(cmbdate);

            //Search button specs
            btnSearch.setBounds(30, 435, 190, 25);
            btnSearch.setFont(new Font("", Font.BOLD, 18));
            btnSearch.setForeground(c2);
            btnSearch.setBackground(Color.white);
            Booking.add(btnSearch);

            //Label declaration for Children condition fine print
            JLabel Childrencond = new JLabel("*All Children below the age of 12 "
                    + "must be accompanied by an adult,after all we are an airline "
                    + "and not babysitters :)");
            Childrencond.setBounds(20, 500, 700, 60);
            Childrencond.setFont(new Font("", Font.PLAIN, 8));
            Booking.add(Childrencond);

            //Label for condition 2 (joke)!!
            JLabel cond1 = new JLabel("- Why are u reading this, "
                    + "you know there is a reason this text is small, right ??"
                    + " You are not supposed to read this !!!");
            cond1.setBounds(20, 520, 700, 60);
            cond1.setFont(new Font("", Font.PLAIN, 8));
            Booking.add(cond1);

            //Label to add verticle line to divide the page
            JLabel Line = new JLabel("");
            Line.setBounds(600, 0, 3, 5000);
            Line.setOpaque(true);
            Line.setBackground(c1);
            Booking.add(Line);

            //Set visible for main JFrame
            Booking.setVisible(true);
        } else//When Booking is Done
        {
            //Creating a new frame for the booking done window
            JFrame Booking2 = new JFrame("Existing Booking");
            Booking2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            Booking2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Booking2.setLayout(null);
            Booking2.getContentPane().setBackground(c3);

            //Label for QuadrA
            JLabel Cname3 = new JLabel("QuadrA");
            Cname3.setBounds(145, 10, 3000, 70);
            Cname3.setForeground(Color.WHITE);
            Cname3.setFont(new Font("Segoe Script", Font.BOLD, 70));
            Booking2.add(Cname3);

            //Label For airlines
            JLabel Cname4 = new JLabel(" Airlines");
            Cname4.setBounds(320, 62, 3000, 40);
            Cname4.setForeground(Color.WHITE);
            Cname4.setFont(new Font("", Font.BOLD, 30));
            Booking2.add(Cname4);

            //Label for motto
            JLabel CMotto2 = new JLabel("<html>...we make the sky, <br/>feel like home</html>");
            CMotto2.setBounds(1185, 5, 300, 90);
            CMotto2.setForeground(Color.WHITE);
            CMotto2.setFont(new Font("Segoe Script", Font.PLAIN, 25));
            Booking2.add(CMotto2);

            //Label for logo layer 1
            JLabel Clogo4 = new JLabel("✥");
            Clogo4.setBounds(49, 10, 120, 80);
            Clogo4.setForeground(c1);
            Clogo4.setFont(new Font("", Font.BOLD, 60));
            Booking2.add(Clogo4);

            //Label for logo layer 2
            JLabel Clogo5 = new JLabel("◇");
            Clogo5.setBounds(20, 2, 130, 95);
            Clogo5.setForeground(Color.white);
            Clogo5.setFont(new Font("", Font.PLAIN, 130));
            Booking2.add(Clogo5);

            //Label for logo layer 2
            JLabel Clogo6 = new JLabel("❖");
            Clogo6.setBounds(40, 10, 120, 80);
            Clogo6.setForeground(c2);
            Clogo6.setFont(new Font("", Font.BOLD, 80));
            Booking2.add(Clogo6);

            //Label Declaration for coloured background only for the Header
            JLabel Header2 = new JLabel("");
            Header2.setBounds(0, 0, 5000, 100);
            Header2.setOpaque(true);
            Header2.setBackground(c1);
            Booking2.add(Header2);

            //Label for Main title
            JLabel Congo = new JLabel(" Your Ticket has Already been Booked");
            Congo.setBounds(300, 200, 1000, 100);
            Congo.setFont(new Font("", Font.BOLD, 50));
            //Congo.setForeground(c2);
            Booking2.add(Congo);

            //Label for making other booking
            JLabel Congo1 = new JLabel("  Another Booking can be made by cancelling the existing booking");
            Congo1.setBounds(510, 350, 1000, 100);
            Congo1.setFont(f);
            //Congo1.setForeground(c2);
            Booking2.add(Congo1);

            //Label for how to view booking
            JLabel Congo2 = new JLabel("   It can be viewed in MY ACCOUNT section");
            Congo2.setBounds(510, 300, 1000, 100);
            Congo2.setFont(new Font("", Font.BOLD, 25));
            //Congo2.setForeground(c2);
            Booking2.add(Congo2);

            //Home button on Screen
            JButton Home1 = new JButton("🏠 HOME");
            Home1.setBounds(490, 450, 130, 25);
            Home1.setFont(new Font("", Font.BOLD, 18));
            Home1.setBackground(c1);
            Home1.setForeground(Color.white);
            Booking2.add(Home1);

            //Cancel Booking Button
            JButton Re = new JButton("❌ Cancel/Reset Booking");
            Re.setBounds(770, 450, 300, 25);
            Re.setFont(new Font("", Font.BOLD, 18));
            Re.setBackground(c1);
            Re.setForeground(Color.white);
            Booking2.add(Re);

            //Set visible for existing booking window    
            Booking2.setVisible(true);

            //Home Button Action listener call HomePage
            Home1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    new HomePage();
                    Booking2.setVisible(false);
                }
            });

            //Cancel Booking Action listener, sets BookingDOne=0 and calls HomePage
            Re.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String msg = "Your Booking has been successfully Cancelled.";
                    int result = JOptionPane.showConfirmDialog(Booking2, "Are You Sure You Want to Cancel You Booking?", "Cancellation",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (result == JOptionPane.YES_OPTION) {
                        Flight.BookingDone = 0;
                        new HomePage();
                        Booking2.setVisible(false);
                    }
                }
            });
        }
    }
}
