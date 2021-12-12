package Ashish_Kishore_Kumar;//USER DEFINED PACKAGES

//Built-in Packages
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

//User-Defined Packages
import Ashwin_R_Prabhu.HomePage;

/**
 *
 * @author Ashish Kishore Kumar
 */
public class Devs {

    //Public Variables
    JFrame Devs;
    JLabel Cname, Header, MeetH, MeetU, MeetT, ADI, APM, AKK, ARP, HorDIv, VerDiv, VerDiv1, VerDiv2;
    JButton btnBack;

    //Color
    Color c1 = new Color(0, 152, 152);
    Color c2 = new Color(0, 90, 90);
    Color c3 = new Color(230, 230, 230);

    //Holds all the Labels present in the Frame
    public void AllLabels() {
        //Top Heading (Anston's Code)
        JLabel Cname = new JLabel("QuadrA");
        Cname.setBounds(145, 10, 3000, 70);
        Cname.setForeground(Color.WHITE);
        Cname.setFont(new Font("Segoe Script", Font.BOLD, 70));
        Devs.add(Cname);

        //Label For airlines
        JLabel Cname3 = new JLabel(" Airlines");
        Cname3.setBounds(320, 62, 3000, 40);
        Cname3.setForeground(Color.WHITE);
        Cname3.setFont(new Font("", Font.BOLD, 30));
        Devs.add(Cname3);

        //Label for motto
        JLabel CMotto = new JLabel("<html>...we make the sky, <br/>feel like</html>");
        CMotto.setBounds(1185, 5, 300, 90);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));
        Devs.add(CMotto);

        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(49, 10, 120, 80);
        Clogo2.setForeground(c1);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        Devs.add(Clogo2);

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(20, 2, 130, 95);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        Devs.add(Clogo3);

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(40, 10, 120, 80);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        Devs.add(Clogo1);

        //Label Declaration for coloured background only for the Header
        JLabel Header = new JLabel("");
        Header.setBounds(0, 0, 5000, 100);
        Header.setOpaque(true);
        Header.setBackground(c1);
        Devs.add(Header);

        //Label that divides Vertically
        VerDiv = new JLabel();
        VerDiv.setBounds(775, 200, 3, 700);
        VerDiv.setOpaque(true);
        VerDiv.setBackground(c1);
        Devs.add(VerDiv);

        //Label that Divides Horizontally
        VerDiv = new JLabel();
        VerDiv.setBounds(10, 500, 2000, 3);
        VerDiv.setOpaque(true);
        VerDiv.setBackground(c1);
        Devs.add(VerDiv);

        //Label for code in left laptop
        JLabel Code = new JLabel("<html>01011101101111<br/>01100111101001<br/>11100..</html>");
        Code.setBounds(517, 126, 70, 40);
        Code.setForeground(Color.BLACK);
        Code.setFont(new Font("", Font.PLAIN, 8));
        Devs.add(Code);

        //Label for code in right laptop
        JLabel Code2 = new JLabel("<html>01101110110011<br/>0110011110110<br/>10010..</html>");
        Code2.setBounds(981, 126, 70, 40);
        Code2.setForeground(Color.BLACK);
        Code2.setFont(new Font("", Font.PLAIN, 8));
        Devs.add(Code2);

        //Left laptop screen
        VerDiv1 = new JLabel();
        VerDiv1.setBounds(515, 125, 70, 42);
        VerDiv1.setOpaque(true);
        VerDiv1.setBackground(c1);
        Devs.add(VerDiv1);

        //Right Laptop screen
        VerDiv2 = new JLabel();
        VerDiv2.setBounds(979, 125, 70, 42);
        VerDiv2.setOpaque(true);
        VerDiv2.setBackground(c1);
        Devs.add(VerDiv2);

        //Meet the Dev Heading
        MeetH = new JLabel("MEET THE DEVS");
        MeetH.setBounds(630, 100, 500, 100);
        MeetH.setFont(new Font("Agency FB", Font.BOLD, 60));
        MeetH.setForeground(Color.BLACK);
        Devs.add(MeetH);

        //Meet the Dev Lap
        MeetT = new JLabel("💻             💻 ");
        MeetT.setBounds(500, 100, 600, 100);
        MeetT.setFont(new Font("", Font.PLAIN, 100));
        MeetT.setForeground(Color.BLACK);
        Devs.add(MeetT);

        //Meet the Devs underline
        MeetU = new JLabel();
        MeetU.setBounds(650, 180, 260, 5);
        MeetU.setOpaque(true);
        MeetU.setBackground(Color.black);
        Devs.add(MeetU);

        //Aditya label
        ADI = new JLabel("<html> Name : Adithya K Shetty "
                + "<br/> USN : 4SO19CS007"
                + "<br/> Contribution : Account Page");
        ADI.setBounds(150, 200, 700, 300);
        ADI.setFont(new Font("Agency FB", Font.BOLD, 50));
        ADI.setForeground(Color.BLACK);
        Devs.add(ADI);

        //Anston label
        APM = new JLabel("<html> Name : Anston Pritesh Miranda "
                + "<br/> USN : 4SO19CS023"
                + "<br/> Contribution : Booking Page and Intro");
        APM.setBounds(850, 200, 700, 300);
        APM.setFont(new Font("Agency FB", Font.BOLD, 50));
        APM.setForeground(Color.BLACK);
        Devs.add(APM);

        //AKK label
        AKK = new JLabel("<html> Name : Ashish Kishore Kumar "
                + "<br/> USN : 4SO19CS027"
                + "<br/> Contribution : About Us , T&C and <br/>Devs Page");
        AKK.setBounds(150, 500, 700, 300);
        AKK.setFont(new Font("Agency FB", Font.BOLD, 50));
        AKK.setForeground(Color.BLACK);
        Devs.add(AKK);

        //ARP label
        ARP = new JLabel("<html> Name : Ashwin R Prabhu "
                + "<br/> USN : 4SO19CS033"
                + "<br/> Contribution : Sign In/Up and Home "
                + "<br/> Page");
        ARP.setBounds(850, 500, 700, 300);
        ARP.setFont(new Font("Agency FB", Font.BOLD, 50));
        ARP.setForeground(Color.BLACK);
        Devs.add(ARP);

    }

    //Holds all the button present in the frame
    public void AllButtons() {
        btnBack = new JButton("🏠 HOME");
        btnBack.setBounds(1300, 60, 130, 25);
        btnBack.setFont(new Font("", Font.BOLD, 18));
        btnBack.setBackground(c2);
        btnBack.setForeground(Color.WHITE);
        Devs.add(btnBack);
    }

    //function that holds all the functionality of the action listeners
    public void AllActionListener() {
        //Go Back to Home page
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Devs.setVisible(false);
                new HomePage();
            }
        }
        );
    }

    //Initializes the frame  
    public void DisplayFrame() {

        Devs = new JFrame("Devs");
        Devs.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Calling appropriate functions to set up the frame      
        AllLabels();
        AllButtons();
        AllActionListener();

        Devs.getContentPane().setBackground(c3);
        Devs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Devs.setLayout(null);
        Devs.setVisible(true);

    }

    //Function called by the actionListener in HomePage
    public void ShowDevs() {
        DisplayFrame();
    }

}
