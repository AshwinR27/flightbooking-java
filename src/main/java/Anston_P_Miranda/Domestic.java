package Anston_P_Miranda;//USER DEFINED PACKAGES

//All the required imports
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
//Class for domestic booking only, inheritence from Flight 
public class Domestic extends Flight {

    //Public declarations for My Account part
    public static int AdultFare, ChildFare;

    //cities for Domestic part
    public static String DomCities[] = {"Mangalore", "Dholakpur", "Khandala", "Banteshpur", "Kamleshgad"};
    public static JComboBox cmbcities = new JComboBox(DomCities);
    public static JComboBox cmbDcities = new JComboBox(DomCities);

    //Declared private components for class usage
    private JLabel Submited = new JLabel("Showing Search Results...");//shown after hitting search
    private JButton Res = new JButton("🔄 Reset Search"); //resets search and goes back to Domestic main page   
    private static int[] fno;//for flight number in class
    private int[] fare = new int[4];//fare selection
    private JLabel Header1 = new JLabel("");

    public Domestic()//constructor
    {
        //Main title label            
        JLabel Tname = new JLabel(" ₹ DOMESTIC FLIGHT BOOKING ");
        Tname.setBounds(70, 150, 500, 40);
        Tname.setForeground(Color.white);
        Tname.setFont(new Font("", Font.BOLD, 30));
        Booking.add(Tname);

        //color for title label bg
        JLabel Header = new JLabel("");
        Header.setBounds(5, 140, 590, 60);
        Header.setOpaque(true);
        Header.setBackground(c1);
        Booking.add(Header);

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

        //specs for reset search button
        Res.setBounds(340, 435, 180, 25);
        Res.setFont(new Font("", Font.BOLD, 18));
        Res.setForeground(c2);
        Res.setBackground(Color.white);

        //header color for title        
        Header1.setBounds(5, 210, 590, 290);
        Header1.setOpaque(true);
        Header1.setBackground(c1);
        Booking.add(Header1);

        //action listener for Search button
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //show error if source and destination are same
                if (cmbcities.getSelectedIndex() == cmbDcities.getSelectedIndex()) {
                    cmbDcities.setForeground(Color.red);
                    String msg = "Source and Destination cant be the same!!";
                    JOptionPane.showMessageDialog(Booking, msg, "Selection Error", JOptionPane.ERROR_MESSAGE);
                    cmbDcities.setForeground(c2);
                } //normal functioning
                else {
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

        //action listener for Reset search button
        Res.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Booking.setVisible(false);
                new Domestic();
            }
        });
    }

    //Buttons for Different buttons according to flight options    
    JButton btnBook1 = new JButton(" Book Ticket 🎫 ");
    JButton btnBook2 = new JButton(" Book Ticket 🎫 ");
    JButton btnBook3 = new JButton(" Book Ticket 🎫 ");

    //this function generates different number of flights with different flight numbers
    void FlightGenerator() {
        Random generator = new Random();//random generator
        op = generator.nextInt(10);//go decide the number of flights that will available
        if (op != 0) {
            Booking.remove(Header1);
            Booking.add(Res);
            Booking.add(Header1);//add reset search button only when there is flights available
        }
        fno = new int[3];//flight number array
        for (int i = 0; i < 3; i++) {
            fno[i] = generator.nextInt(999);//generates different flight numbers
        }

        if (op == 0)//when zero flights are available
        {
            //to say that no flights are available for this route
            JLabel NoFlights = new JLabel("No Flights Available For The Selected Route.");
            NoFlights.setBounds(800, 250, 650, 30);
            NoFlights.setFont(new Font("", Font.BOLD, 25));
            Booking.add(NoFlights);

            //try again button to search again
            JButton btnTry = new JButton("🔄 Try Again");
            btnTry.setBounds(985, 350, 145, 25);
            btnTry.setFont(new Font("", Font.BOLD, 18));
            btnTry.setBackground(c1);
            btnTry.setForeground(Color.white);
            Booking.add(btnTry);

            //Repainting the frame to update for the changes done to it
            Booking.repaint();

            //action listener for Try again button
            btnTry.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Booking.remove(btnTry);
                    Booking.remove(NoFlights);
                    Booking.remove(Submited);
                    Booking.remove(Header1);
                    Booking.add(btnSearch);
                    Booking.add(Header1);
                    Booking.repaint();
                }
            });

        }

        if (op > 0)//when there is 1 flight only or more
        {
            //flight1 number label                 
            JLabel Flight1 = new JLabel("Flight No: QAD" + String.valueOf(fno[0]));
            Flight1.setForeground(Color.BLACK);
            Flight1.setBounds(700, 150, 300, 30);
            Flight1.setFont(f);
            Booking.add(Flight1);

            //flight1 type
            JLabel F1 = new JLabel("Flight Type : Boeing 787 ✈");
            F1.setForeground(Color.BLACK);
            F1.setBounds(1150, 150, 300, 30);
            F1.setFont(f);
            Booking.add(F1);

            //flight1 source
            JLabel Fs1 = new JLabel("Source :  " + DomCities[cmbcities.getSelectedIndex()] + "  (11:10 IST)");
            Fs1.setForeground(Color.BLACK);
            Fs1.setBounds(700, 200, 500, 30);
            Fs1.setFont(f);
            Booking.add(Fs1);

            //flight1 destination
            JLabel Fd1 = new JLabel("Destination :  " + DomCities[cmbDcities.getSelectedIndex()] + "  (14:35 IST)");
            Fd1.setForeground(Color.BLACK);
            Fd1.setBounds(1150, 200, 500, 30);
            Fd1.setFont(f);
            Booking.add(Fd1);

            //flight1 logo from source to destination
            JLabel sign = new JLabel("⇒");
            sign.setBounds(1050, 200, 200, 30);
            sign.setFont(new Font("", Font.BOLD, 30));
            Booking.add(sign);

            fare[1] = 8780;//fare for flight 1

            if (rdoEco.isSelected())//economy selection check
            {

            } else//first class selection check
            {
                fare[1] = 2 * fare[1];
            }

            //flight1 Fare per person
            JLabel Fr1 = new JLabel("Fare :  Rs " + String.valueOf(fare[1]) + " /👤");
            Fr1.setForeground(Color.BLACK);
            Fr1.setBounds(700, 250, 500, 30);
            Fr1.setFont(f);
            Booking.add(Fr1);

            //booking button for flight one
            btnBook1.setBounds(1150, 250, 180, 25);
            btnBook1.setFont(new Font("", Font.BOLD, 18));
            btnBook1.setBackground(c1);
            btnBook1.setForeground(Color.white);
            Booking.add(btnBook1);

            //White background for flight1
            JLabel Header2 = new JLabel("");
            Header2.setBounds(670, 125, 780, 175);
            Header2.setOpaque(true);
            Header2.setBackground(c4);
            Booking.add(Header2);

            //line between flight 1 and flight 2
            JLabel Line1 = new JLabel("");
            Line1.setBounds(810, 320, 500, 2);
            Line1.setOpaque(true);
            Line1.setBackground(c1);
            Booking.add(Line1);

            Booking.repaint(); //adjusting for changes in frame
        }

        if (op > 1)//flights are 2 or more
        {
            //flight2 number
            JLabel Flight2 = new JLabel("Flight No: QAD" + String.valueOf(fno[1]));
            Flight2.setForeground(Color.BLACK);
            Flight2.setBounds(700, 370, 300, 30);
            Flight2.setFont(f);
            Booking.add(Flight2);

            //flight2 type
            JLabel F2 = new JLabel("Flight Type : Boeing 757 ✈");
            F2.setForeground(Color.BLACK);
            F2.setBounds(1150, 370, 300, 30);
            F2.setFont(f);
            Booking.add(F2);

            //flight2 source
            JLabel Fs2 = new JLabel("Source :  " + DomCities[cmbcities.getSelectedIndex()] + "  (13:20 IST)");
            Fs2.setForeground(Color.BLACK);
            Fs2.setBounds(700, 420, 500, 30);
            Fs2.setFont(f);
            Booking.add(Fs2);

            //flight2 destination
            JLabel Fd2 = new JLabel("Destination :  " + DomCities[cmbDcities.getSelectedIndex()] + "  (17:05 IST)");
            Fd2.setForeground(Color.BLACK);
            Fd2.setBounds(1150, 420, 500, 30);
            Fd2.setFont(f);
            Booking.add(Fd2);

            //arrow symbol
            JLabel sign = new JLabel("⇒");
            sign.setBounds(1050, 420, 200, 30);
            sign.setFont(new Font("", Font.BOLD, 40));
            Booking.add(sign);

            fare[2] = 7650;//flight2 fare per person

            if (rdoEco.isSelected())//economy selection check
            {

            } else//first class selection check
            {
                fare[2] = 2 * fare[2];
            }

            //flight2 fare
            JLabel Fr2 = new JLabel("Fare :  Rs " + String.valueOf(fare[2]) + " /👤");
            Fr2.setForeground(Color.BLACK);
            Fr2.setBounds(700, 470, 500, 30);
            Fr2.setFont(f);
            Booking.add(Fr2);

            //button to book flight2
            btnBook2.setBounds(1150, 470, 180, 25);
            btnBook2.setFont(new Font("", Font.BOLD, 18));
            btnBook2.setBackground(c1);
            btnBook2.setForeground(Color.white);
            Booking.add(btnBook2);

            //White background for flight2
            JLabel Header3 = new JLabel("");
            Header3.setBounds(670, 345, 780, 175);
            Header3.setOpaque(true);
            Header3.setBackground(c4);
            Booking.add(Header3);

            //line between flight2 and 3
            JLabel Line2 = new JLabel("");
            Line2.setBounds(810, 540, 500, 2);
            Line2.setOpaque(true);
            Line2.setBackground(c1);
            Booking.add(Line2);

            Booking.repaint();//adjust for changes in frame
        }

        if (op > 2)//flights are 3 
        {
            //flight3 number
            JLabel Flight3 = new JLabel("Flight No: QAD" + String.valueOf(fno[2]));
            Flight3.setForeground(Color.BLACK);
            Flight3.setBounds(700, 590, 300, 30);
            Flight3.setFont(f);
            Booking.add(Flight3);

            //flight3 type
            JLabel F3 = new JLabel("Flight Type : Airbus A320 ✈");
            F3.setForeground(Color.BLACK);
            F3.setBounds(1150, 590, 300, 30);
            F3.setFont(f);
            Booking.add(F3);

            //flight3 source
            JLabel Fs3 = new JLabel("Source :  " + DomCities[cmbcities.getSelectedIndex()] + "  (07:45 IST)");
            Fs3.setForeground(Color.BLACK);
            Fs3.setBounds(700, 640, 500, 30);
            Fs3.setFont(f);
            Booking.add(Fs3);

            //flight3 destination
            JLabel Fd3 = new JLabel("Destination :  " + DomCities[cmbDcities.getSelectedIndex()] + "  (12:25 IST)");
            Fd3.setForeground(Color.BLACK);
            Fd3.setBounds(1150, 640, 500, 30);
            Fd3.setFont(f);
            Booking.add(Fd3);

            //arrow logo
            JLabel sign = new JLabel("⇒");
            sign.setBounds(1050, 640, 200, 30);
            sign.setFont(new Font("", Font.BOLD, 40));
            Booking.add(sign);

            fare[3] = 8110;//flight3 fare

            if (rdoEco.isSelected())//economy selection?
            {

            } else//first class selection??
            {
                fare[3] = 2 * fare[3];
            }

            //flight3 fare per person
            JLabel Fr3 = new JLabel("Fare :  Rs " + String.valueOf(fare[3]) + " /👤");
            Fr3.setForeground(Color.BLACK);
            Fr3.setBounds(700, 690, 500, 30);
            Fr3.setFont(f);
            Booking.add(Fr3);

            //flight3 booking button 
            btnBook3.setBounds(1150, 690, 180, 25);
            btnBook3.setFont(new Font("", Font.BOLD, 18));
            btnBook3.setBackground(c1);
            btnBook3.setForeground(Color.white);
            Booking.add(btnBook3);

            //White background for flight3
            JLabel Header4 = new JLabel("");
            Header4.setBounds(670, 565, 780, 175);
            Header4.setOpaque(true);
            Header4.setBackground(c4);
            Booking.add(Header4);

            //Line After flight3
            JLabel Line3 = new JLabel("");
            Line3.setBounds(810, 760, 500, 2);
            Line3.setOpaque(true);
            Line3.setBackground(c1);
            Booking.add(Line3);

            Booking.repaint();//adjusting changes in frame
        }

        // action listener for Booking button 1
        btnBook1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Time = "11:10 IST";
                FlType = "Boeing 787 ✈";
                BookingDone = 1;
                AdultFare = fare[1];
                ChildFare = fare[1] / 2;
                flightnumber = fno[0];
                FareCalc();
            }
        });

        // action listener for Booking button 2
        btnBook2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Time = "13:20 IST";
                FlType = "Boeing 757 ✈";
                BookingDone = 1;
                AdultFare = fare[2];
                ChildFare = fare[2] / 2;
                flightnumber = fno[1];
                FareCalc();
            }
        });

        // action listener for Booking button 3
        btnBook3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Time = "07:45 IST";
                FlType = "Airbus A320 ✈";
                BookingDone = 1;
                AdultFare = fare[3];
                ChildFare = fare[3] / 2;
                flightnumber = fno[2];
                FareCalc();
            }
        });

    }

    void FareCalc()//function to calculate fare
    {
        adults = (cmbadult.getSelectedIndex() + 1);//get number of adults
        children = (cmbchild.getSelectedIndex());//get number of children
        totalfare = (AdultFare * adults) + (ChildFare * children);//total fare
        adFare = AdultFare;
        chFare = ChildFare;

        //New Frame for booking done
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

        //COngragulations logo
        JLabel Congo = new JLabel(" 🎊 CONGRATULATIONS 🎊");
        Congo.setBounds(370, 200, 1000, 100);
        Congo.setFont(new Font("", Font.BOLD, 60));
        //Congo.setForeground(c2);
        Booking2.add(Congo);
        BookingDone = 1;

        JLabel Congo1 = new JLabel(" Your Ticket has been successfully Booked");
        Congo1.setBounds(455, 300, 1000, 100);
        Congo1.setFont(new Font("", Font.BOLD, 30));
        //Congo1.setForeground(c2);
        Booking2.add(Congo1);

        JLabel Congo2 = new JLabel("  It can be viewed in MY ACCOUNT section"/*+String.valueOf(totalfare)*/);
        Congo2.setBounds(452, 350, 1000, 100);
        Congo2.setFont(new Font("", Font.BOLD, 30));
        //Congo2.setForeground(c2);
        Booking2.add(Congo2);

        //Home button calls HomePage
        JButton Home1 = new JButton("🏠 HOME");
        Home1.setBounds(490, 450, 115, 25);
        Home1.setFont(new Font("", Font.BOLD, 18));
        Home1.setBackground(c1);
        Home1.setForeground(Color.white);
        Booking2.add(Home1);

        //cancel Booking Button, BookingDone=0,HomePage
        JButton Re = new JButton("❌ Cancel/Reset Booking");
        Re.setBounds(740, 450, 300, 25);
        Re.setFont(new Font("", Font.BOLD, 18));
        Re.setBackground(c1);
        Re.setForeground(Color.white);
        Booking2.add(Re);

        Booking.setVisible(false);
        Booking2.setVisible(true);

        //action listener for home button
        Home1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                new HomePage();
                Booking2.setVisible(false);
            }
        });

        //action listener for Cancel booking button
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
