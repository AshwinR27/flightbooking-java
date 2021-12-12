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
public class AboutUs {

    //Public Variables
    JFrame frmAboutUs;
    JLabel Cname, Header, lblAbH, lblAbU, lblAbT, lblMottoH, lblMottoU, lblMottoT,
            VerDiv, HorDiv1, HorDiv2, lblContactH, lblContactU, lblContactTN, lblContactTE,
            lblFeedH, lblFeedU, lblFeedT;
    JTextArea FeedbackText;
    JButton btnSub, Home;
    boolean Editable = true;

    //colors
    Color c1 = new Color(0, 152, 152);
    Color c2 = new Color(0, 90, 90);
    Color c3 = new Color(230, 230, 230);

    //Holds all the button present in the frame
    public void AllButton() {
        //Submit FeedBackButton
        btnSub = new JButton("Submit");
        btnSub.setBounds(860, 725, 125, 75);
        btnSub.setFont(new Font("Agency FB", Font.BOLD, 30));
        btnSub.setBackground(c1);
        btnSub.setForeground(Color.WHITE);
        frmAboutUs.add(btnSub);

        //Home Button
        Home = new JButton(" 🏠 HOME");
        Home.setBounds(1300, 60, 130, 25);
        Home.setFont(new Font("", Font.BOLD, 18));
        Home.setBackground(c2);
        Home.setForeground(Color.WHITE);
        frmAboutUs.add(Home);

    }

    //Holds all the Labels present in the Frame
    public void AllLabels() {

        //Top Heading (Anston's Code)
        //Label Declaration for QuadrA
        //labels
        JLabel Cname = new JLabel("QuadrA");
        Cname.setBounds(145, 10, 3000, 70);
        Cname.setForeground(Color.WHITE);
        Cname.setFont(new Font("Segoe Script", Font.BOLD, 70));
        frmAboutUs.add(Cname);

        //Label For airlines
        JLabel Cname3 = new JLabel(" Airlines");
        Cname3.setBounds(320, 62, 3000, 40);
        Cname3.setForeground(Color.WHITE);
        Cname3.setFont(new Font("", Font.BOLD, 30));
        frmAboutUs.add(Cname3);

        //Label for motto
        JLabel CMotto = new JLabel("<html>...we make the sky, <br/>feel like</html>");
        CMotto.setBounds(1185, 5, 300, 90);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));
        frmAboutUs.add(CMotto);

        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(49, 10, 120, 80);
        Clogo2.setForeground(c1);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        frmAboutUs.add(Clogo2);

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(20, 2, 130, 95);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        frmAboutUs.add(Clogo3);

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(40, 10, 120, 80);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        frmAboutUs.add(Clogo1);

        //Label Declaration for coloured background only for the Header
        JLabel Header = new JLabel("");
        Header.setBounds(0, 0, 5000, 100);
        Header.setOpaque(true);
        Header.setBackground(c1);
        frmAboutUs.add(Header);

        //About us Heading
        lblAbH = new JLabel("About us");
        lblAbH.setBounds(100, 100, 500, 100);
        lblAbH.setFont(new Font("Agency FB", Font.BOLD, 50));
        lblAbH.setForeground(Color.BLACK);
        frmAboutUs.add(lblAbH);

        //Underline of About Us 
        lblAbU = new JLabel();
        lblAbU.setBounds(100, 180, 160, 5);
        lblAbU.setOpaque(true);
        lblAbU.setBackground(Color.black);
        frmAboutUs.add(lblAbU);

        //Description under About us
        lblAbT = new JLabel("<html>QuadraA Airlines is founded by 4 entrepreneurs, whose dream is to make sure each and everyone <br/> "
                + "can reach home despite this covid crisis."
                + "<br/> So far we have helped 10K people reach home and we do not plan on stopping!"
                + "<br/><br/>Quadra Airlines will soon launch its specialized airplanes at cheap prices for those <br/> who adore travelling!</html>");
        lblAbT.setBounds(100, 120, 2500, 300);
        lblAbT.setFont(new Font("Agency FB", Font.BOLD, 20));
        lblAbT.setForeground(Color.BLACK);
        frmAboutUs.add(lblAbT);

        //Label that Divides about us and motto
        VerDiv = new JLabel();
        VerDiv.setBounds(750, 20, 3, 330);
        VerDiv.setOpaque(true);
        VerDiv.setBackground(c1);
        frmAboutUs.add(VerDiv);

        //Label that Divides Contacts and above
        HorDiv1 = new JLabel();
        HorDiv1.setBounds(10, 350, 1900, 3);
        HorDiv1.setOpaque(true);
        HorDiv1.setBackground(c1);
        frmAboutUs.add(HorDiv1);

        //Label that Divide Feedback and Contact
        HorDiv2 = new JLabel();
        HorDiv2.setBounds(10, 550, 1900, 3);
        HorDiv2.setOpaque(true);
        HorDiv2.setBackground(c1);
        frmAboutUs.add(HorDiv2);

        //Our Motto And Vision Heading
        lblMottoH = new JLabel("Our Motto And Vision");
        lblMottoH.setBounds(800, 100, 500, 100);
        lblMottoH.setFont(new Font("Agency FB", Font.BOLD, 50));
        lblMottoH.setForeground(Color.BLACK);
        frmAboutUs.add(lblMottoH);

        //Our Motto Underline
        lblMottoU = new JLabel();
        lblMottoU.setBounds(800, 180, 375, 5);
        lblMottoU.setOpaque(true);
        lblMottoU.setBackground(Color.black);
        frmAboutUs.add(lblMottoU);

        //Our Motto Description
        lblMottoT = new JLabel("<html>Motto :<br>...we make the sky, feel like Home!<br/><br>"
                + "Vision : <br/>Fly East or West ,<br/> We will take care of it and the rest!</html>");
        lblMottoT.setBounds(800, 120, 2500, 300);
        lblMottoT.setFont(new Font("Agency FB", Font.BOLD, 20));
        lblMottoT.setForeground(Color.BLACK);
        frmAboutUs.add(lblMottoT);

        //ContactUs Heading
        lblContactH = new JLabel("Contact Us");
        lblContactH.setBounds(650, 350, 500, 100);
        lblContactH.setFont(new Font("Agency FB", Font.BOLD, 50));
        lblContactH.setForeground(Color.BLACK);
        frmAboutUs.add(lblContactH);

        //ContactUs UnderLine
        lblContactU = new JLabel();
        lblContactU.setBounds(650, 430, 200, 5);
        lblContactU.setOpaque(true);
        lblContactU.setBackground(Color.black);
        frmAboutUs.add(lblContactU);

        //ContactUs Text and number
        lblContactTN = new JLabel("<html>We are Open 24/7 and you can contact us via the numbers or email given below Numbers:    "
                + "<br> LandLine &#128384 - 26345662 , 24623241 <br/>Mobile &#128385; - 2564327797</html>");
        lblContactTN.setBounds(470, 320, 600, 350);
        lblContactTN.setFont(new Font("Agency FB", Font.BOLD, 20));
        lblContactTN.setForeground(Color.BLACK);
        frmAboutUs.add(lblContactTN);

        //Contacts us Email
        lblContactTN = new JLabel("<html> Email ID ✉ - QuadraA@xyz.com </html>");
        lblContactTN.setBounds(820, 333, 500, 350);
        lblContactTN.setFont(new Font("Agency FB", Font.BOLD, 20));
        lblContactTN.setForeground(Color.BLACK);
        frmAboutUs.add(lblContactTN);

        //Feedback Heading
        lblFeedH = new JLabel("Feedback");
        lblFeedH.setBounds(100, 550, 500, 100);
        lblFeedH.setFont(new Font("Agency FB", Font.BOLD, 50));
        lblFeedH.setForeground(Color.BLACK);
        frmAboutUs.add(lblFeedH);

        //FeedBack Underline
        lblFeedU = new JLabel();
        lblFeedU.setBounds(100, 630, 175, 5);
        lblFeedU.setOpaque(true);
        lblFeedU.setBackground(Color.black);
        frmAboutUs.add(lblFeedU);

        //FeedBack text
        lblFeedT = new JLabel("You can give your Feedback regarding your experience with this app in the textbox below , feedback will help us rectify and improve the app!");
        lblFeedT.setBounds(100, 520, 2500, 300);
        lblFeedT.setFont(new Font("Agency FB", Font.BOLD, 20));
        lblFeedT.setForeground(Color.BLACK);
        frmAboutUs.add(lblFeedT);

        //Feedback TextBox
        FeedbackText = new JTextArea("Enter your FeedBack here....", 10, 30);
        FeedbackText.setLineWrap(true);
        FeedbackText.setWrapStyleWord(true);
        FeedbackText.setBounds(350, 700, 500, 100);
        FeedbackText.setFont(new Font("Agency FB", Font.BOLD, 20));
        frmAboutUs.add(FeedbackText);

    }

    //function that holds all the functionality of the action listeners
    public void AllActionListeners() {

        //Go Back to Home page
        Home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new HomePage();
                frmAboutUs.setVisible(false);

            }
        }
        );

        //Manages the feedback System
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Checks of feedback is inputed
                if (FeedbackText.getText().equals("Enter your FeedBack here....") || FeedbackText.getText().equals("")) {
                    //Shows error if feedback is not inputed
                    JOptionPane.showMessageDialog(frmAboutUs, "Please Enter a Appropriate feedback.", "ERROR", 0);
                } else if (Editable == true) {
                    //Give message that feedback has been submitted and make the textbook uneditable
                    JOptionPane.showMessageDialog(frmAboutUs, "Your feedback has been submitted!!");
                    FeedbackText.setEditable(false);
                    Editable = false;
                } else {
                    //preventing the user to input another feedback
                    JOptionPane.showMessageDialog(frmAboutUs, "You have already Submitted your feedback!");
                }

            }
        }
        );
    }

    //Initializes the frame  
    public void DisplayFrame() {
        frmAboutUs = new JFrame("About US");
        frmAboutUs.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Calling appropriate functions to set up the frame      
        AllButton();
        AllLabels();
        AllActionListeners();

        frmAboutUs.getContentPane().setBackground(c3); // BG to light gray
        frmAboutUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAboutUs.setLayout(null);
        frmAboutUs.setVisible(true);
    }

    //Function called by the actionListener in HomePage
    public void ShowAboutus() {
        DisplayFrame();
    }

}
