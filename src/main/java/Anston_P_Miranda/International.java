package Anston_P_Miranda;//USER DEFINED PACKAGES

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

//IMPORTING USER DEFINED PACKAGES
import Ashwin_R_Prabhu.HomePage;

/**
 *
 * @author Anston Miranda 4SO19CS023
 */
//Class for only international booking
public class International extends Flight {

    //public variables to pass through the project
    public static int AdultFare, ChildFare;
    public static String IntCities[] = {"Bangalore", "Wakanda", "Area 51", "Asgard", "Dust 2"};
    public static JComboBox cmbcities = new JComboBox(IntCities);
    public static JComboBox cmbDcities = new JComboBox(IntCities);

    //Variables through class use 
    private JLabel Submited = new JLabel("Showing Search Results...");
    private JButton Res = new JButton("🔄 Reset Search");
    private static int[] fno;
    private int[] fare = new int[4];
    private JLabel Header1 = new JLabel("");

    public International()//constructor for class
    {

        //Label for main title
        JLabel Tname = new JLabel("🌐 INTERNATIONAL FLIGHT BOOKING ");
        Tname.setBounds(20, 150, 600, 40);
        Tname.setForeground(Color.WHITE);
        Tname.setFont(new Font("", Font.BOLD, 30));
        Booking.add(Tname);

        //combo box for source city
        cmbcities.setFont(f);
        cmbcities.setBounds(130, 250, 120, 30);
        cmbcities.setForeground(c2);
        //cmbcities.setBackground(c2);
        Booking.add(cmbcities);

        //combo box for destination city
        cmbDcities.setFont(f);
        cmbDcities.setBounds(470, 250, 120, 30);
        cmbDcities.setForeground(c2);
        //cmbDcities.setBackground(c2);
        Booking.add(cmbDcities);

        //reset search button
        Res.setBounds(340, 435, 180, 25);
        Res.setFont(new Font("", Font.BOLD, 18));
        Res.setBackground(Color.white);
        Res.setForeground(c2);

        //Search button action listener
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cmbcities.getSelectedIndex() == cmbDcities.getSelectedIndex()) {
                    cmbDcities.setForeground(Color.red);
                    String msg = "Source and Destination cant be the same!!";
                    JOptionPane.showMessageDialog(Booking, msg, "Selection Error", JOptionPane.ERROR_MESSAGE);
                    cmbDcities.setForeground(c2);
                } else {
                    Booking.remove(btnSearch);
                    Booking.remove(Header1);
                    Submited.setBounds(40, 435, 300, 30);
                    Submited.setFont(f);
                    Submited.setForeground(Color.white);
                    Booking.add(Submited);
                    Booking.add(Header1);
                    Booking.repaint();
                    FlightGenerator();
                }
            }
        });

        //header color for title
        //color for title label bg
        JLabel Header = new JLabel("");
        Header.setBounds(5, 140, 590, 60);
        Header.setOpaque(true);
        Header.setBackground(c1);
        Booking.add(Header);

        //Reset search action listener
        Res.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Booking.setVisible(false);
                new International();
            }
        });

        //header color for title
        Header1.setBounds(5, 210, 590, 290);
        Header1.setOpaque(true);
        Header1.setBackground(c1);
        Booking.add(Header1);
    }

    //Buttons for Booking flights
    JButton btnBook1 = new JButton(" Book Ticket 🎫 ");
    JButton btnBook2 = new JButton(" Book Ticket 🎫 ");
    JButton btnBook3 = new JButton(" Book Ticket 🎫 ");

    //Generates different flight number and number of flights
    void FlightGenerator() {
        AdultFare = 0;
        ChildFare = 0;
        Random generator = new Random();//random number generator
        op = generator.nextInt(10);//for number of options
        if (op != 0) {
            Booking.remove(Header1);
            Booking.add(Res);
            Booking.add(Header1);
        }
        fno = new int[4];//flight numbers
        for (int i = 0; i < 3; i++) {
            fno[i] = generator.nextInt(999);//random flight number generator
        }

        if (op == 0)//when no options are available
        {

            //No flight line
            JLabel NoFlights = new JLabel("No Flights available due to COVID restrictions.");
            NoFlights.setBounds(800, 250, 650, 30);
            NoFlights.setFont(new Font("", Font.BOLD, 25));
            Booking.add(NoFlights);

            //try again button
            JButton btnTry = new JButton("🔄 Try Again");
            btnTry.setBounds(985, 350, 144, 25);
            btnTry.setFont(new Font("", Font.BOLD, 18));
            btnTry.setBackground(c1);
            btnTry.setForeground(Color.white);
            Booking.add(btnTry);
            Booking.repaint();//adjusting for changes

            //Try again action listener
            btnTry.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Booking.remove(btnTry);
                    Booking.remove(NoFlights);
                    Booking.remove(Submited);
                    Booking.remove(Header1);
                    Booking.add(btnSearch);
                    Booking.add(Header1);
                    Booking.repaint();//adjust for changes
                }
            });

        }

        if (op > 0)//when more than 1 option
        {

            //Flight1 number    
            JLabel Flight1 = new JLabel("Flight No: IQA" + String.valueOf(fno[0]));
            Flight1.setForeground(Color.BLACK);
            Flight1.setBounds(700, 150, 300, 30);
            Flight1.setFont(f);
            Booking.add(Flight1);

            //Flight1 type
            JLabel F1 = new JLabel("Flight Type : Boeing 797 ✈");
            F1.setForeground(Color.BLACK);
            F1.setBounds(1150, 150, 300, 30);
            F1.setFont(f);
            Booking.add(F1);

            //Flight1 source
            JLabel Fs1 = new JLabel("Source :  " + IntCities[cmbcities.getSelectedIndex()] + "  (11:55 IST)");
            Fs1.setForeground(Color.BLACK);
            Fs1.setBounds(700, 200, 500, 30);
            Fs1.setFont(f);
            Booking.add(Fs1);

            //Fligth1 Destination
            JLabel Fd1 = new JLabel("Destination :  " + IntCities[cmbDcities.getSelectedIndex()] + "  (18:40 IST)");
            Fd1.setForeground(Color.BLACK);
            Fd1.setBounds(1150, 200, 500, 30);
            Fd1.setFont(f);
            Booking.add(Fd1);

            //Flight1 arrow sign
            JLabel sign = new JLabel("⇒");
            sign.setBounds(1050, 200, 200, 30);
            sign.setFont(new Font("", Font.BOLD, 40));
            Booking.add(sign);

            fare[1] = 8780 * 3;//Flight1 fare

            if (rdoEco.isSelected()) {

            } else {
                fare[1] = 2 * fare[1];
            }
            //Flight1 fare per person
            JLabel Fr1 = new JLabel("Fare :  Rs " + String.valueOf(fare[1]) + " /👤");
            Fr1.setForeground(Color.BLACK);
            Fr1.setBounds(700, 250, 500, 30);
            Fr1.setFont(f);
            Booking.add(Fr1);

            //Button for booking FLight1
            btnBook1.setBounds(1150, 250, 180, 25);
            btnBook1.setFont(new Font("", Font.BOLD, 18));
            btnBook1.setBackground(c1);
            btnBook1.setForeground(Color.white);
            Booking.add(btnBook1);

            //Background for flight 1
            JLabel Header2 = new JLabel("");
            Header2.setBounds(670, 125, 780, 175);
            Header2.setOpaque(true);
            Header2.setBackground(c4);
            Booking.add(Header2);

            //Line between Flight1 and flight2
            JLabel Line1 = new JLabel("");
            Line1.setBounds(800, 320, 500, 2);
            Line1.setOpaque(true);
            Line1.setBackground(c1);
            Booking.add(Line1);

            Booking.repaint();
        }

        if (op > 1)//Options 2 or more
        {
            //Flight2 number
            JLabel Flight2 = new JLabel("Flight No: IQA" + String.valueOf(fno[1]));
            Flight2.setForeground(Color.BLACK);
            Flight2.setBounds(700, 370, 300, 30);
            Flight2.setFont(f);
            Booking.add(Flight2);

            //Flight2 type
            JLabel F2 = new JLabel("Flight Type : Airbus A380 ✈");
            F2.setForeground(Color.BLACK);
            F2.setBounds(1150, 370, 300, 30);
            F2.setFont(f);
            Booking.add(F2);

            //Flight2 Source
            JLabel Fs2 = new JLabel("Source :  " + IntCities[cmbcities.getSelectedIndex()] + "  (13:20 IST)");
            Fs2.setForeground(Color.BLACK);
            Fs2.setBounds(700, 420, 500, 30);
            Fs2.setFont(f);
            Booking.add(Fs2);

            //Flight2 Destination
            JLabel Fd2 = new JLabel("Destination :  " + IntCities[cmbDcities.getSelectedIndex()] + "  (21:05 IST)");
            Fd2.setForeground(Color.BLACK);
            Fd2.setBounds(1150, 420, 500, 30);
            Fd2.setFont(f);
            Booking.add(Fd2);

            //Flight2 arrow logo
            JLabel sign = new JLabel("⇒");
            sign.setBounds(1050, 4200, 200, 30);
            sign.setFont(new Font("", Font.BOLD, 40));
            Booking.add(sign);

            fare[2] = 7650 * 3;//Flight2 fare

            if (rdoEco.isSelected())//Economy selection check
            {

            } else//Business Selection check
            {
                fare[2] = 2 * fare[2];
            }
            //Flight2 fare per person
            JLabel Fr2 = new JLabel("Fare :  Rs " + String.valueOf(fare[2]) + " /👤");
            Fr2.setForeground(Color.BLACK);
            Fr2.setBounds(700, 470, 500, 30);
            Fr2.setFont(f);
            Booking.add(Fr2);

            //Flight2 booking button
            btnBook2.setBounds(1150, 470, 180, 25);
            btnBook2.setFont(new Font("", Font.BOLD, 18));
            btnBook2.setBackground(c1);
            btnBook2.setForeground(Color.white);
            Booking.add(btnBook2);

            //Background for flight 2
            JLabel Header3 = new JLabel("");
            Header3.setBounds(670, 345, 780, 175);
            Header3.setOpaque(true);
            Header3.setBackground(c4);
            Booking.add(Header3);

            //Line between Flight2 and 3
            JLabel Line2 = new JLabel("");
            Line2.setBounds(800, 540, 500, 2);
            Line2.setOpaque(true);
            Line2.setBackground(c1);
            Booking.add(Line2);

            Booking.repaint();//adjusting for changes
        }

        if (op > 2)//options are 3
        {
            //Flight3 number
            JLabel Flight3 = new JLabel("Flight No: IQA" + String.valueOf(fno[2]));
            Flight3.setForeground(Color.BLACK);
            Flight3.setBounds(700, 590, 300, 30);
            Flight3.setFont(f);
            Booking.add(Flight3);

            //Flight3 type
            JLabel F3 = new JLabel("Flight Type : Airbus A390 ✈");
            F3.setForeground(Color.BLACK);
            F3.setBounds(1150, 590, 300, 30);
            F3.setFont(f);
            Booking.add(F3);

            //Flight3 Source
            JLabel Fs3 = new JLabel("Source :  " + IntCities[cmbcities.getSelectedIndex()] + "  (04:35 IST)");
            Fs3.setForeground(Color.BLACK);
            Fs3.setBounds(700, 640, 500, 30);
            Fs3.setFont(f);
            Booking.add(Fs3);

            //Flight3 Destination
            JLabel Fd3 = new JLabel("Destination :  " + IntCities[cmbDcities.getSelectedIndex()] + "  (12:05 IST)");
            Fd3.setForeground(Color.BLACK);
            Fd3.setBounds(1150, 640, 500, 30);
            Fd3.setFont(f);
            Booking.add(Fd3);

            //FLight3 Arrow
            JLabel sign = new JLabel("⇒");
            sign.setBounds(1050, 640, 200, 30);
            sign.setFont(new Font("", Font.BOLD, 40));
            Booking.add(sign);

            fare[3] = 8110 * 3;//flight3 fare

            if (rdoEco.isSelected())//Economy Selection Check
            {

            } else//Business selection check
            {
                fare[3] = 2 * fare[3];
            }
            //Flight3 fare per person
            JLabel Fr3 = new JLabel("Fare :  Rs " + String.valueOf(fare[3]) + " /👤");
            Fr3.setForeground(Color.BLACK);
            Fr3.setBounds(700, 690, 500, 30);
            Fr3.setFont(f);
            Booking.add(Fr3);

            //Button for flight3 booking
            btnBook3.setBounds(1150, 690, 180, 25);
            btnBook3.setFont(new Font("", Font.BOLD, 18));
            btnBook3.setBackground(c1);
            btnBook3.setForeground(Color.white);
            Booking.add(btnBook3);

            //Background for flight 3
            JLabel Header4 = new JLabel("");
            Header4.setBounds(670, 565, 780, 175);
            Header4.setOpaque(true);
            Header4.setBackground(c4);
            Booking.add(Header4);

            //Line after flight 3
            JLabel Line3 = new JLabel("");
            Line3.setBounds(810, 760, 500, 2);
            Line3.setOpaque(true);
            Line3.setBackground(c1);
            Booking.add(Line3);

            Booking.repaint();//adjusting for changes
        }

        //Flight1 booking action listener
        btnBook1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Time = "11:55 IST";
                FlType = "Boeing 797 ✈";
                BookingDone = 2;
                AdultFare = fare[1];
                ChildFare = fare[1] / 2;
                flightnumber = fno[0];
                FareCalc();
            }
        });

        //Flight2 booking action listener
        btnBook2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Time = "13:20 IST";
                FlType = "Airbus A380 ✈";
                BookingDone = 2;
                AdultFare = fare[2];
                ChildFare = fare[2] / 2;
                flightnumber = fno[1];
                FareCalc();
            }
        });
        //Flight3 booking action listener
        btnBook3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Time = "04:35 IST";
                FlType = "Airbus A390 ✈";
                BookingDone = 2;
                AdultFare = fare[3];
                ChildFare = fare[3] / 2;
                flightnumber = fno[3];
                FareCalc();
            }
        });

    }

    void FareCalc()//Funtion to calculate total fare
    {
        adults = (cmbadult.getSelectedIndex() + 1);//number of adults
        children = (cmbchild.getSelectedIndex());//number of children
        totalfare = (AdultFare * adults) + (ChildFare * children);//total fare
        adFare = AdultFare;//fare per adult
        chFare = ChildFare;//fare per child

        //new Frame for successfully Booked
        JFrame Booking2 = new JFrame("Successfully Booked");
        Booking2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Booking2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Booking2.setLayout(null);
        Booking2.getContentPane().setBackground(c3);

        //Label for QuadrA
        JLabel Cname = new JLabel("QuadrA");
        Cname.setBounds(145, 10, 3000, 70);
        Cname.setForeground(Color.WHITE);
        Cname.setFont(new Font("Segoe Script", Font.BOLD, 70));
        Booking2.add(Cname);

        //Label For airlines
        JLabel Cname2 = new JLabel(" Airlines");
        Cname2.setBounds(320, 62, 3000, 40);
        Cname2.setForeground(Color.WHITE);
        Cname2.setFont(new Font("", Font.BOLD, 30));
        Booking2.add(Cname2);

        //Label for motto
        JLabel CMotto = new JLabel("<html>...we make the sky, <br/>feel like home</html>");
        CMotto.setBounds(1185, 5, 300, 90);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));
        Booking2.add(CMotto);

        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(49, 10, 120, 80);
        Clogo2.setForeground(c1);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        Booking2.add(Clogo2);

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(20, 2, 130, 95);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        Booking2.add(Clogo3);

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(40, 10, 120, 80);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        Booking2.add(Clogo1);

        //Label Declaration for coloured background only for the Header
        JLabel Header = new JLabel("");
        Header.setBounds(0, 0, 5000, 100);
        Header.setOpaque(true);
        Header.setBackground(c1);
        Booking2.add(Header);

        //Label Congrats
        JLabel Congo = new JLabel(" 🎊 CONGRATULATIONS 🎊");
        Congo.setBounds(370, 200, 1000, 100);
        Congo.setFont(new Font("", Font.BOLD, 60));
        //Congo.setForeground(c2);
        Booking2.add(Congo);

        //Label booked
        JLabel Congo1 = new JLabel(" Your Ticket has been successfully Booked");
        Congo1.setBounds(455, 300, 1000, 100);
        Congo1.setFont(new Font("", Font.BOLD, 30));
        //Congo1.setForeground(c2);
        Booking2.add(Congo1);

        //label for my account point
        JLabel Congo2 = new JLabel("  It can be viewed in MY ACCOUNT section");
        Congo2.setBounds(452, 350, 1000, 100);
        Congo2.setFont(new Font("", Font.BOLD, 30));
        //Congo2.setForeground(c2);
        Booking2.add(Congo2);

        //Home button to call HomePage
        JButton Home1 = new JButton("🏠 HOME");
        Home1.setBounds(490, 450, 115, 25);
        Home1.setFont(new Font("", Font.BOLD, 18));
        Home1.setBackground(c1);
        Home1.setForeground(Color.white);
        Booking2.add(Home1);

        //Cancel Booking Button
        JButton Re = new JButton("❌ Cancel/Reset Booking");
        Re.setBounds(740, 450, 300, 25);
        Re.setFont(new Font("", Font.BOLD, 18));
        Re.setBackground(c1);
        Re.setForeground(Color.white);
        Booking2.add(Re);

        Booking.setVisible(false);  //set visible     
        Booking2.setVisible(true);

        //Home button action listener
        Home1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                new HomePage();
                Booking2.setVisible(false);

            }
        });
        //Cancel booking button action listener
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
