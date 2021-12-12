package Adithya_K_Shetty;//USER DEFINED PACKAGES

//IMPORTING STANDARD PACKAGES
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.*;

//IMPORTING USER DEFINED PACKAGES
import Ashwin_R_Prabhu.*;
import Anston_P_Miranda.*;

/**
 *
 * @author Adithya K Shetty 4SO19CS007
 */
public class BoardingPass {

    //All Label Declarations 
    JLabel ticketContainer, ticketUpperLabel, ticketLowerLabel, ticketName1;
    JLabel ticketName2, ticketFlight1, ticketFlight2, ticketBar1, flightNo;
    JLabel flightNoDisplay, flightType, flightTypeDisplay, flightSource;
    JLabel flightSourceDisplay, flightDestination;
    JLabel flightDestinationDisplay, ticketFare, ticketFareDisplay;
    JLabel passengerName, passengerNameDisplay, time, timeDisplay;
    JLabel flightClass, flightClassDisplay, numberOfChildren, numberOfChildrenDisplay;
    JLabel numberOfAdult, numberOfAdultDisplay, sadFace, sadMessage;
    JLabel I_flightNoDisplay, I_flightSourceDisplay, I_flightDestinationDisplay;

    public BoardingPass()//Constructor of Boarding Pass class
    {

        //Frame for this section
        JFrame accFrame = new JFrame("Boarding Pass");
        accFrame.setLayout(null);
        accFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        accFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //All cuastom colors used in this frame
        Color c1 = new Color(0, 152, 152);
        Color c2 = new Color(0, 90, 90);
        Color c3 = new Color(230, 230, 230);
        Color c4 = new Color(240, 240, 240);

        //Setting Background Color
        accFrame.getContentPane().setBackground(c3);

        //Declaring and specifying Button to go to HomeScreen
        JButton Home = new JButton("🏠 HOME");
        Home.setBounds(1300, 60, 130, 25);
        Home.setFont(new Font("", Font.BOLD, 18));
        Home.setBackground(c2);
        Home.setForeground(Color.white);
        accFrame.add(Home);

        //Action Listner for Home button that calls Homepage constructor       
        Home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new HomePage();
                accFrame.setVisible(false);
            }
        });

        // BORDER COLOUR
        Color color = new Color(72, 245, 191);
        Color col = new Color(183, 139, 255);
        Color borderColorHover = new Color(8, 247, 124);
        Color borderCol = new Color(50, 231, 137);

        /**
         * ****************HEADER FOR FRAME SECTION****************
         */
        //Label Declaration for QuadrA
        JLabel Cname = new JLabel("QuadrA");
        Cname.setBounds(145, 10, 3000, 70);
        Cname.setForeground(Color.WHITE);
        Cname.setFont(new Font("Segoe Script", Font.BOLD, 70));
        accFrame.add(Cname);

        //Label For airlines
        JLabel Cname2 = new JLabel(" Airlines");
        Cname2.setBounds(320, 62, 3000, 40);
        Cname2.setForeground(Color.WHITE);
        Cname2.setFont(new Font("", Font.BOLD, 30));
        accFrame.add(Cname2);

        //Label for motto
        JLabel CMotto = new JLabel("<html>...we make the sky, <br/>feel like</html>");
        CMotto.setBounds(1185, 5, 300, 90);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));
        accFrame.add(CMotto);

        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(49, 10, 120, 80);
        Clogo2.setForeground(c1);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        accFrame.add(Clogo2);

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(20, 2, 130, 95);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        accFrame.add(Clogo3);

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(40, 10, 120, 80);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        accFrame.add(Clogo1);

        JLabel Header = new JLabel("");
        Header.setBounds(0, 0, 5000, 100);
        Header.setOpaque(true);
        Header.setBackground(c1);
        accFrame.add(Header);

        /**
         * *************MY BOOKING HEADING****************
         */
        JLabel Title = new JLabel("MY BOOKING");
        Title.setBounds(500, 150, 800, 100);
        //Title.setForeground(c1);
        Title.setFont(new Font("", Font.BOLD, 80));
        accFrame.add(Title);

        JLabel Title1 = new JLabel("");
        Title1.setBounds(515, 240, 490, 5);
        Title1.setBackground(Color.DARK_GRAY);
        Title1.setOpaque(true);
        accFrame.add(Title1);

        /**
         * ********SHOW TICKET ONLY IF BOOKING IS DONE**********
         */
        if (Flight.BookingDone == 1 || Flight.BookingDone == 2)//Booking done test case
        {

            /**
             * **RIGHT HALF LAYOUT (TICKET DISPLAY)****
             */
            Color ticketHeaderBackground = new Color(174, 214, 241);
            Color ticketLabelColor = new Color(52, 152, 219);

            /**
             * ************** TOTAL FARE FOR TICKET DISPLAY************
             */
            //FARE BREAK-UP TITLE
            JLabel Title0 = new JLabel("FARE BREAK-UP");
            Title0.setBounds(140, 330, 800, 50);
            Title0.setFont(new Font("", Font.BOLD, 40));
            accFrame.add(Title0);

            //LINE
            JLabel Title5 = new JLabel("");
            Title5.setBounds(140, 380, 330, 5);
            Title5.setBackground(Color.DARK_GRAY);
            Title5.setOpaque(true);
            accFrame.add(Title5);

            //ADULT FARE DISPLAY
            JLabel Adultfare = new JLabel("Adult Fare    ⇒      " + String.valueOf(Flight.adFare) + "     x      "
                    + String.valueOf(Flight.adults) + "👤" + "       =     +₹" + String.valueOf(Flight.adFare * Flight.adults));
            Adultfare.setBounds(50, 400, 1000, 30);
            Adultfare.setForeground(Color.black);
            Adultfare.setFont(new Font("", Font.BOLD, 20));
            accFrame.add(Adultfare);

            //CHILD FARE DISPLAY
            JLabel Childfare = new JLabel("Child Fare    ⇒      " + String.valueOf(Flight.chFare) + "     x      "
                    + String.valueOf(Flight.children) + "🚼" + "       =     +₹" + String.valueOf(Flight.chFare * Flight.children));
            Childfare.setBounds(50, 430, 1000, 30);
            Childfare.setForeground(Color.black);
            Childfare.setFont(new Font("", Font.BOLD, 20));
            accFrame.add(Childfare);

            //TOTAL AMOUNT
            JLabel Total = new JLabel("TOTAL :           ₹" + String.valueOf(Flight.totalfare));
            Total.setBounds(310, 470, 1000, 50);
            Total.setForeground(Color.black);
            Total.setFont(new Font("", Font.BOLD, 20));
            accFrame.add(Total);

            //LINE
            JLabel Title2 = new JLabel("");
            Title2.setBounds(300, 475, 240, 2);
            Title2.setBackground(Color.DARK_GRAY);
            Title2.setOpaque(true);
            accFrame.add(Title2);

            //tax calculator
            float Tax1 = Flight.totalfare * 18 / 100;
            //discount calculator
            float Discount = Flight.totalfare * 10 / 100;

            //TAX
            JLabel Tax = new JLabel("GST (18%)        ⇒          +₹" + String.valueOf(Tax1));
            Tax.setBounds(225, 520, 1000, 50);
            Tax.setForeground(Color.black);
            Tax.setFont(new Font("", Font.BOLD, 20));
            accFrame.add(Tax);

            //DISCOUNT
            JLabel Disc = new JLabel("Discount (NervousFlyer 10%)        ⇒           -₹" + String.valueOf(Discount));
            Disc.setBounds(48, 540, 1000, 50);
            Disc.setForeground(Color.black);
            Disc.setFont(new Font("", Font.BOLD, 20));
            accFrame.add(Disc);

            //LINE
            JLabel Title3 = new JLabel("");
            Title3.setBounds(40, 613, 540, 2);
            Title3.setBackground(Color.DARK_GRAY);
            Title3.setOpaque(true);
            accFrame.add(Title3);

            //FINAL AMOUNT
            JLabel Final = new JLabel("Final Amount        ⇒        ₹" + String.valueOf(Flight.totalfare * 108 / 100));
            Final.setBounds(70, 620, 1000, 50);
            Final.setForeground(Color.black);
            Final.setFont(new Font("", Font.BOLD, 30));
            accFrame.add(Final);

            //LINE
            JLabel Title4 = new JLabel("");
            Title4.setBounds(40, 680, 540, 2);
            Title4.setBackground(Color.DARK_GRAY);
            Title4.setOpaque(true);
            accFrame.add(Title4);

            /**
             * *****TICKET BOARDING PASS CREATION***********
             */
            //TICKET TEAR-HERE DOTTED LINE
            ticketBar1 = new JLabel("<html>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘<br>❘</html>");
            ticketBar1.setBounds(1200, 330, 30, 360);
            ticketBar1.setForeground(Color.LIGHT_GRAY);
            accFrame.add(ticketBar1);

            //BOARDING PASS LEFT TITLE
            ticketName1 = new JLabel("Boarding Pass ✈");
            ticketName1.setBounds(730, 350, 280, 40);
            ticketName1.setFont(new Font("", Font.BOLD, 30));
            ticketName1.setForeground(Color.WHITE);
            accFrame.add(ticketName1);

            //BOARDING PASS RIGHT TITLE
            ticketName2 = new JLabel("Boarding Pass ✈");
            ticketName2.setBounds(1210, 350, 280, 40);
            ticketName2.setFont(new Font("", Font.BOLD, 30));
            ticketName2.setForeground(Color.WHITE);
            accFrame.add(ticketName2);

            //Label for logo layer 1 on Ticket
            JLabel Clogo4 = new JLabel("✥");
            Clogo4.setBounds(649, 335, 120, 80);
            Clogo4.setForeground(c1);
            Clogo4.setFont(new Font("", Font.BOLD, 60));
            accFrame.add(Clogo4);

            //Label for logo layer 2 in ticket
            JLabel Clogo5 = new JLabel("◇");
            Clogo5.setBounds(620, 327, 130, 95);
            Clogo5.setForeground(Color.white);
            Clogo5.setFont(new Font("", Font.PLAIN, 130));
            accFrame.add(Clogo5);

            //Label for logo layer 2 in ticket
            JLabel Clogo6 = new JLabel("❖");
            Clogo6.setBounds(640, 335, 120, 80);
            Clogo6.setForeground(c2);
            Clogo6.setFont(new Font("", Font.BOLD, 80));
            accFrame.add(Clogo6);

            if (Flight.rdoEco.isSelected())//TO CHECK FOR ECONOMY OR FIRST CLASS
            {
                //ECONOMY LEFT SIDE
                JLabel Cname7 = new JLabel("ECONOMY");
                Cname7.setBounds(730, 380, 250, 30);
                Cname7.setFont(new Font("", Font.BOLD, 16));
                Cname7.setForeground(Color.WHITE);
                accFrame.add(Cname7);

                //ECONOMY RIGHT SIDE
                JLabel Cname8 = new JLabel("ECONOMY");
                Cname8.setBounds(1210, 380, 250, 30);
                Cname8.setFont(new Font("", Font.BOLD, 16));
                Cname8.setForeground(Color.WHITE);
                accFrame.add(Cname8);
            } else//FOR FIRST CLASS
            {
                //LEFT SIDE
                JLabel Cname7 = new JLabel("FIRST CLASS");
                Cname7.setBounds(730, 380, 250, 30);
                Cname7.setFont(new Font("", Font.BOLD, 16));
                Cname7.setForeground(Color.WHITE);
                accFrame.add(Cname7);

                //RIGHT SIDE
                JLabel Cname8 = new JLabel("FIRST CLASS");
                Cname8.setBounds(1210, 380, 250, 30);
                Cname8.setFont(new Font("", Font.BOLD, 16));
                Cname8.setForeground(Color.WHITE);
                accFrame.add(Cname8);
            }

            //TICKET UPPER LABEL
            ticketUpperLabel = new JLabel();
            ticketUpperLabel.setBounds(620, 330, 900, 90);
            ticketUpperLabel.setOpaque(true);
            ticketUpperLabel.setBackground(c1);
            accFrame.add(ticketUpperLabel);

            //TICKET LOWER LABEL
            ticketLowerLabel = new JLabel();
            ticketLowerLabel.setBounds(620, 675, 900, 15);
            ticketLowerLabel.setOpaque(true);
            ticketLowerLabel.setBackground(c1);
            accFrame.add(ticketLowerLabel);

            //FLIGHT NO LEFT SIDE
            flightNo = new JLabel("FLIGHT NO.");
            flightNo.setBounds(630, 490, 100, 30);
            flightNo.setFont(new Font("", Font.BOLD, 14));
            flightNo.setForeground(Color.LIGHT_GRAY);
            accFrame.add(flightNo);

            //FLIGHT NO RIGHT SIDE
            JLabel flightNo1 = new JLabel("FLIGHT NO.");
            flightNo1.setBounds(1220, 490, 100, 30);
            flightNo1.setFont(new Font("", Font.BOLD, 14));
            flightNo1.setForeground(Color.LIGHT_GRAY);
            accFrame.add(flightNo1);

            //GATE NO LABEL LEFT
            JLabel gateNo = new JLabel("GATE NO.");
            gateNo.setBounds(850, 490, 100, 30);
            gateNo.setFont(new Font("", Font.BOLD, 14));
            gateNo.setForeground(Color.LIGHT_GRAY);
            accFrame.add(gateNo);
            JLabel gateNo1 = new JLabel("A" + String.valueOf(Flight.op + 7));
            gateNo1.setBounds(850, 510, 100, 30);
            gateNo1.setFont(new Font("", Font.BOLD, 20));
            accFrame.add(gateNo1);

            //GATE NO LABEL RIGHT SIDE
            JLabel gateNo3 = new JLabel("GATE NO.");
            gateNo3.setBounds(1350, 490, 100, 30);
            gateNo3.setFont(new Font("", Font.BOLD, 14));
            gateNo3.setForeground(Color.LIGHT_GRAY);
            accFrame.add(gateNo3);
            JLabel gateNo2 = new JLabel("A" + String.valueOf(Flight.op + 7));
            gateNo2.setBounds(1350, 510, 100, 30);
            gateNo2.setFont(new Font("", Font.BOLD, 20));
            accFrame.add(gateNo2);

            //TIME LABELS
            JLabel time1 = new JLabel("TIME");
            time1.setBounds(1000, 490, 150, 30);
            time1.setFont(new Font("", Font.BOLD, 14));
            time1.setForeground(Color.LIGHT_GRAY);
            accFrame.add(time1);

            JLabel timeDisplay1 = new JLabel(Flight.Time);
            timeDisplay1.setBounds(1000, 510, 300, 30);
            timeDisplay1.setFont(new Font("", Font.BOLD, 20));
            timeDisplay1.setForeground(Color.BLACK);
            accFrame.add(timeDisplay1);

            //FLIGHT TYPE LABELS
            flightType = new JLabel("FLIGHT TYPE");
            flightType.setBounds(630, 540, 150, 30);
            flightType.setFont(new Font("", Font.BOLD, 14));
            flightType.setForeground(Color.LIGHT_GRAY);
            accFrame.add(flightType);

            flightTypeDisplay = new JLabel(Flight.FlType);
            flightTypeDisplay.setBounds(630, 560, 200, 30);
            flightTypeDisplay.setFont(new Font("", Font.BOLD, 16));
            flightTypeDisplay.setForeground(Color.BLACK);
            accFrame.add(flightTypeDisplay);

            //FLIGHT FROM LABEL
            flightSource = new JLabel("FROM");
            flightSource.setBounds(800, 540, 100, 30);
            flightSource.setFont(new Font("", Font.BOLD, 14));
            flightSource.setForeground(Color.LIGHT_GRAY);
            accFrame.add(flightSource);

            //FLIGHT TO LABEL
            flightDestination = new JLabel("TO");
            flightDestination.setBounds(930, 540, 150, 30);
            flightDestination.setFont(new Font("", Font.BOLD, 14));
            flightDestination.setForeground(Color.LIGHT_GRAY);
            accFrame.add(flightDestination);

            //IF BOOKING IS A DOMESTIC BOOKING
            if (Flight.BookingDone == 1) {
                flightNoDisplay = new JLabel("QAD" + String.valueOf(Flight.flightnumber));
                flightNoDisplay.setBounds(630, 510, 100, 30);
                flightNoDisplay.setFont(new Font("", Font.BOLD, 20));
                flightNoDisplay.setForeground(Color.BLACK);
                accFrame.add(flightNoDisplay);

                JLabel flightNoDisplay1 = new JLabel("QAD" + String.valueOf(Flight.flightnumber));
                flightNoDisplay1.setBounds(1220, 510, 100, 30);
                flightNoDisplay1.setFont(new Font("", Font.BOLD, 20));
                flightNoDisplay1.setForeground(Color.BLACK);
                accFrame.add(flightNoDisplay1);

                flightSourceDisplay = new JLabel(Domestic.DomCities[(Domestic.cmbcities).getSelectedIndex()]);
                flightSourceDisplay.setBounds(800, 560, 100, 30);
                flightSourceDisplay.setFont(new Font("", Font.BOLD, 16));
                flightSourceDisplay.setForeground(Color.BLACK);
                accFrame.add(flightSourceDisplay);

                flightDestinationDisplay = new JLabel(Domestic.DomCities[(Domestic.cmbDcities).getSelectedIndex()]);
                flightDestinationDisplay.setBounds(930, 560, 100, 30);
                flightDestinationDisplay.setFont(new Font("", Font.BOLD, 16));
                flightDestinationDisplay.setForeground(Color.BLACK);
                accFrame.add(flightDestinationDisplay);
            }

            //IF BOOKING IS A INTERNATIONAL BOOKING
            if (Flight.BookingDone == 2) {
                I_flightNoDisplay = new JLabel("IQA" + String.valueOf(Flight.flightnumber));
                I_flightNoDisplay.setBounds(630, 510, 100, 30);
                I_flightNoDisplay.setFont(new Font("", Font.BOLD, 20));
                I_flightNoDisplay.setForeground(Color.BLACK);
                accFrame.add(I_flightNoDisplay);

                JLabel I_flightNoDisplay1 = new JLabel("IQA" + String.valueOf(Flight.flightnumber));
                I_flightNoDisplay1.setBounds(1220, 510, 100, 30);
                I_flightNoDisplay1.setFont(new Font("", Font.BOLD, 20));
                I_flightNoDisplay1.setForeground(Color.BLACK);
                accFrame.add(I_flightNoDisplay1);

                flightSourceDisplay = new JLabel(International.IntCities[(International.cmbcities).getSelectedIndex()]);
                flightSourceDisplay.setBounds(800, 560, 100, 30);
                flightSourceDisplay.setFont(new Font("", Font.BOLD, 16));
                flightSourceDisplay.setForeground(Color.BLACK);
                accFrame.add(flightSourceDisplay);

                I_flightDestinationDisplay = new JLabel(International.IntCities[(International.cmbDcities).getSelectedIndex()]);
                I_flightDestinationDisplay.setBounds(930, 560, 100, 30);
                I_flightDestinationDisplay.setFont(new Font("", Font.BOLD, 16));
                I_flightDestinationDisplay.setForeground(Color.BLACK);
                accFrame.add(I_flightDestinationDisplay);
            }

            //CLASS LABEL 
            JLabel Cname10 = new JLabel("CLASS");
            Cname10.setBounds(1070, 540, 250, 30);
            Cname10.setFont(new Font("", Font.BOLD, 14));
            Cname10.setForeground(Color.LIGHT_GRAY);
            accFrame.add(Cname10);

            //ECONOMY OR FIRST CLASS LABEL INSIDE TICKET
            if (Flight.rdoEco.isSelected()) {
                JLabel Cname9 = new JLabel("Economy");
                Cname9.setBounds(1070, 560, 250, 30);
                Cname9.setFont(new Font("", Font.BOLD, 16));
                Cname9.setForeground(Color.black);
                accFrame.add(Cname9);
            } else {
                JLabel Cname9 = new JLabel("First Class");
                Cname9.setBounds(1070, 560, 250, 30);
                Cname9.setFont(new Font("", Font.BOLD, 16));
                Cname9.setForeground(Color.black);
                accFrame.add(Cname9);
            }

            //BARCODE IN LEFT SIDE
            JLabel ticketBar = new JLabel("║▌║█║▌│║▌║▌█");
            ticketBar.setBounds(960, 600, 1000, 50);
            ticketBar.setFont(new Font("", Font.PLAIN, 30));
            ticketBar.setForeground(Color.BLACK);
            accFrame.add(ticketBar);

            //BARCODE IN RIGHT SIDE
            JLabel ticketBar1 = new JLabel("║▌║█║▌│║▌║▌█");
            ticketBar1.setBounds(1250, 600, 1000, 50);
            ticketBar1.setFont(new Font("", Font.PLAIN, 30));
            ticketBar1.setForeground(Color.BLACK);
            accFrame.add(ticketBar1);

            //DATE DISPLAY LEFT SIDE
            JLabel datedisp = new JLabel("ON");
            datedisp.setBounds(1000, 430, 100, 30);
            datedisp.setFont(new Font("", Font.BOLD, 14));
            datedisp.setForeground(Color.LIGHT_GRAY);
            accFrame.add(datedisp);

            JLabel DateDisplay = new JLabel(Flight.Date1[Flight.cmbdate.getSelectedIndex()]);
            DateDisplay.setBounds(1000, 450, 100, 30);
            DateDisplay.setFont(new Font("", Font.BOLD, 18));
            DateDisplay.setForeground(Color.BLACK);
            accFrame.add(DateDisplay);

            //DATE DISPLAY RIGHT SIDE
            JLabel datedisp2 = new JLabel("ON");
            datedisp2.setBounds(1400, 540, 100, 30);
            datedisp2.setFont(new Font("", Font.BOLD, 14));
            datedisp2.setForeground(Color.LIGHT_GRAY);
            accFrame.add(datedisp2);

            JLabel DateDisplay2 = new JLabel(Flight.Date1[Flight.cmbdate.getSelectedIndex()]);
            DateDisplay2.setBounds(1400, 560, 100, 30);
            DateDisplay2.setFont(new Font("", Font.BOLD, 20));
            DateDisplay2.setForeground(Color.BLACK);
            accFrame.add(DateDisplay2);

            //NUMBER OF ADULTS DISPLAY
            numberOfAdult = new JLabel("👤");
            numberOfAdult.setBounds(650, 617, 50, 30);
            numberOfAdult.setFont(new Font("", Font.BOLD, 18));
            numberOfAdult.setForeground(Color.LIGHT_GRAY);
            accFrame.add(numberOfAdult);

            numberOfAdultDisplay = new JLabel(String.valueOf(Flight.adults));
            numberOfAdultDisplay.setBounds(680, 615, 50, 30);
            numberOfAdultDisplay.setFont(new Font("", Font.BOLD, 18));
            numberOfAdultDisplay.setForeground(Color.BLACK);
            accFrame.add(numberOfAdultDisplay);

            //NUMBER OF CHILD DISPLAY
            numberOfChildren = new JLabel("🚼");
            numberOfChildren.setBounds(730, 615, 150, 30);
            numberOfChildren.setFont(new Font("", Font.BOLD, 20));
            numberOfChildren.setForeground(Color.LIGHT_GRAY);
            accFrame.add(numberOfChildren);

            numberOfChildrenDisplay = new JLabel(String.valueOf(Flight.children));
            numberOfChildrenDisplay.setBounds(760, 615, 150, 30);
            numberOfChildrenDisplay.setFont(new Font("", Font.BOLD, 18));
            numberOfChildrenDisplay.setForeground(Color.BLACK);
            accFrame.add(numberOfChildrenDisplay);

            //BOOKED UNDER LEFT SIDE
            passengerName = new JLabel("BOOKED UNDER");
            passengerName.setBounds(1220, 430, 300, 30);
            passengerName.setFont(new Font("", Font.BOLD, 14));
            passengerName.setForeground(Color.LIGHT_GRAY);
            accFrame.add(passengerName);

            //BOOKED UNDER RIGHT SIDE
            JLabel passengerName1 = new JLabel("BOOKED UNDER");
            passengerName1.setBounds(630, 430, 300, 30);
            passengerName1.setFont(new Font("", Font.BOLD, 14));
            passengerName1.setForeground(Color.LIGHT_GRAY);
            accFrame.add(passengerName1);

            //USER NAME LABEL 
            String User, User2;
            User = SignUp.fname;
            User2 = SignUp.lname;
            if (User != null) {
                User = User.toUpperCase();
            }
            if (User2 != null) {
                User2 = User2.toUpperCase();
            }

            passengerNameDisplay = new JLabel(User + " " + User2);
            passengerNameDisplay.setBounds(630, 450, 500, 30);
            passengerNameDisplay.setFont(new Font("", Font.BOLD, 25));
            passengerNameDisplay.setForeground(Color.BLACK);
            accFrame.add(passengerNameDisplay);

            JLabel passengerNameDisplay1 = new JLabel(User + " " + User2);
            passengerNameDisplay1.setBounds(1220, 450, 500, 30);
            passengerNameDisplay1.setFont(new Font("", Font.BOLD, 25));
            passengerNameDisplay1.setForeground(Color.BLACK);
            accFrame.add(passengerNameDisplay1);

            //TIME LABEL ON RIGHT SIDE
            time = new JLabel("TIME");
            time.setBounds(1220, 540, 150, 30);
            time.setFont(new Font("", Font.BOLD, 14));
            time.setForeground(Color.LIGHT_GRAY);
            accFrame.add(time);

            //FLIGHT TIME ON RIGHT SIDE
            timeDisplay = new JLabel(Flight.Time);
            timeDisplay.setBounds(1220, 560, 300, 30);
            timeDisplay.setFont(new Font("", Font.BOLD, 25));
            timeDisplay.setForeground(Color.BLACK);
            accFrame.add(timeDisplay);

            //TICKET WATERMARK  
            JLabel Cname1 = new JLabel("QuadrA");
            Cname1.setBounds(690, 430, 900, 200);
            Cname1.setForeground(c4);
            Cname1.setFont(new Font("Segoe Script", Font.BOLD, 170));
            accFrame.add(Cname1);

            //TICKET WATERMARK
            JLabel Cname3 = new JLabel(" Airlines");
            Cname3.setBounds(1150, 590, 3000, 60);
            Cname3.setForeground(c4);
            Cname3.setFont(new Font("", Font.BOLD, 72));
            accFrame.add(Cname3);

            //THE TICKET LABEL CONTAINER
            ticketContainer = new JLabel();
            ticketContainer.setBounds(620, 370, 900, 320);
            ticketContainer.setOpaque(true);
            ticketContainer.setBackground(Color.WHITE);
            Border ticketContainerBorder = new LineBorder(ticketLabelColor, 1, true);
            ticketContainer.setBorder(ticketContainerBorder);
            accFrame.add(ticketContainer);

            //cancel Booking Button, BookingDone=0,HomePage
            JButton Re = new JButton("❌ Cancel/Reset Booking");
            Re.setBounds(240, 750, 300, 25);
            Re.setFont(new Font("", Font.BOLD, 18));
            Re.setBackground(c1);
            Re.setForeground(Color.white);
            accFrame.add(Re);

            //action listener for Cancel booking button
            Re.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String msg = "Your Booking has been successfully Cancelled.";
                    int result = JOptionPane.showConfirmDialog(accFrame, "Are You Sure You Want to Cancel You Booking?", "Cancellation",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (result == JOptionPane.YES_OPTION) {
                        Flight.BookingDone = 0;
                        new HomePage();
                        accFrame.setVisible(false);
                    }
                }
            });

            //DOWNLOAD BUTTON...TOTALLY REAL
            JButton Download = new JButton("🡇 Download Ticket 🡇");
            Download.setBounds(610, 750, 300, 25);
            Download.setFont(new Font("", Font.BOLD, 18));
            Download.setBackground(c1);
            Download.setForeground(Color.white);
            accFrame.add(Download);

            //DOWNLOAD BUTTON ACTION LISTENER
            Download.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String msg = "Your Ticket has been succesfully Downloaded ";
                    JOptionPane.showMessageDialog(accFrame, msg, "Ticket Downloaded", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            //EMAIL BUTTON..REAL AGAIN
            JButton email = new JButton("Email Ticket 📨");
            email.setBounds(980, 750, 300, 25);
            email.setFont(new Font("", Font.BOLD, 18));
            email.setBackground(c1);
            email.setForeground(Color.white);
            accFrame.add(email);

            //EMAIL ACTION LISTENER
            email.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String msg = "Your Ticket has been emailed to " + SignIn.username1 + "@xyz.com";
                    JOptionPane.showMessageDialog(accFrame, msg, "Ticket Emailed", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            //FRAME SET VISIBLE
            accFrame.setVisible(true);
        } else//WHEN NO BOOKING DONE
        {
            sadFace = new JLabel("🙁");
            sadFace.setBounds(640, 300, 400, 300);
            sadFace.setFont(new Font("", Font.BOLD, 250));
            //sadFace.setForeground(ticketLabelColor);
            accFrame.add(sadFace);

            sadMessage = new JLabel("You Haven't Booked Your Ticket To Heaven Yet!!");
            sadMessage.setBounds(320, 530, 1000, 200);
            sadMessage.setFont(new Font("", Font.BOLD, 40));
            sadMessage.setForeground(Color.RED);
            accFrame.add(sadMessage);

            accFrame.setVisible(true);
        }
    }
}
