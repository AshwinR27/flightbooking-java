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
public class TandC {
    //Public Variables

    JFrame frmTandC;
    JLabel Cname, Header, TandCH, TandCU, TandCT;
    JTextArea ZaTandC;
    JScrollPane scroll;
    JButton btnBak;
    static JCheckBox chkTandC = new JCheckBox("I have read all the terms and conditions stated above.");
    boolean ReadTandC = false;

    //Color
    Color c1 = new Color(0, 152, 152);
    Color c2 = new Color(0, 90, 90);
    Color c3 = new Color(230, 230, 230);

    //Holds all the Labels present in the Frame 
    public void AllLabels() {
        //labels
        JLabel Cname = new JLabel("QuadrA");
        Cname.setBounds(145, 10, 3000, 70);
        Cname.setForeground(Color.WHITE);
        Cname.setFont(new Font("Segoe Script", Font.BOLD, 70));
        frmTandC.add(Cname);

        //Label For airlines
        JLabel Cname3 = new JLabel(" Airlines");
        Cname3.setBounds(320, 62, 3000, 40);
        Cname3.setForeground(Color.WHITE);
        Cname3.setFont(new Font("", Font.BOLD, 30));
        frmTandC.add(Cname3);

        //Label for motto
        JLabel CMotto = new JLabel("<html>...we make the sky, <br/>feel like</html>");
        CMotto.setBounds(1185, 5, 300, 90);
        CMotto.setForeground(Color.WHITE);
        CMotto.setFont(new Font("Segoe Script", Font.PLAIN, 25));
        frmTandC.add(CMotto);

        //Label for logo layer 1
        JLabel Clogo2 = new JLabel("✥");
        Clogo2.setBounds(49, 10, 120, 80);
        Clogo2.setForeground(c1);
        Clogo2.setFont(new Font("", Font.BOLD, 60));
        frmTandC.add(Clogo2);

        //Label for logo layer 2
        JLabel Clogo3 = new JLabel("◇");
        Clogo3.setBounds(20, 2, 130, 95);
        Clogo3.setForeground(Color.white);
        Clogo3.setFont(new Font("", Font.PLAIN, 130));
        frmTandC.add(Clogo3);

        //Label for logo layer 2
        JLabel Clogo1 = new JLabel("❖");
        Clogo1.setBounds(40, 10, 120, 80);
        Clogo1.setForeground(c2);
        Clogo1.setFont(new Font("", Font.BOLD, 80));
        frmTandC.add(Clogo1);

        //Label Declaration for coloured background only for the Header
        JLabel Header = new JLabel("");
        Header.setBounds(0, 0, 5000, 100);
        Header.setOpaque(true);
        Header.setBackground(c1);
        frmTandC.add(Header);

        //Terms and Condition Heading
        TandCH = new JLabel("Terms And Conditions");
        TandCH.setBounds(100, 100, 500, 100);
        TandCH.setFont(new Font("Agency FB", Font.BOLD, 50));
        TandCH.setForeground(Color.BLACK);
        frmTandC.add(TandCH);

        //Terms and Condition Underline
        TandCU = new JLabel();
        TandCU.setBounds(100, 180, 390, 5);
        TandCU.setOpaque(true);
        TandCU.setBackground(Color.black);
        frmTandC.add(TandCU);

        //Terms and Condition Text
        TandCT = new JLabel("<html> Terms and conditions act as a contract between you or "
                + "your business and your users and customers. It serves to set out the rights and "
                + "responsibilities of both parties."
                + "<br/>In order to use your website, product, or mobile application, your users must "
                + "agree to abide by your terms and conditions and to provide services as per the terms. </html>");
        TandCT.setBounds(100, 100, 1200, 300);
        TandCT.setFont(new Font("Agency FB", Font.BOLD, 20));
        TandCT.setForeground(Color.BLACK);
        frmTandC.add(TandCT);

        //Terms and condition Text Area
        ZaTandC = new JTextArea("Terms and Conditions\n"
                + "\n THE TERMS AND CONDITIONS OF PRODUCT SALES AND SERVICE PROJECTS "
                + "ARE LIMITED TO THOSE CONTAINED HEREIN. ANY ADDITIONAL OR DIFFERENT TERMS"
                + " OR CONDITIONS IN ANY FORM DELIVERED BY YOU (\"CUSTOMER\") ARE HEREBY DEEMED TO"
                + " BE MATERIAL ALTERATIONS AND NOTICE OF OBJECTION TO THEM AND REJECTION OF THEM IS "
                + "HEREBY GIVEN." + "BY ACCEPTING DELIVERY OF THE PRODUCTS OR BY ENGAGING THE VLC AFFILIATE "
                + "IDENTIFIED ON THE INVOICE, STATEMENT OF WORK OR OTHER VLC DOCUMENTATION (\"SELLER\") TO"
                + " PROVIDE PRODUCT OR PERFORM OR PROCURE ANY SERVICES, CUSTOMER AGREES TO BE BOUND BY AND ACCEPTS"
                + " THESE TERMS AND CONDITIONS UNLESS CUSTOMER AND SELLER HAVE SIGNED A SEPARATE AGREEMENT, IN"
                + " WHICH CASE THE SEPARATE AGREEMENT WILL GOVERN.\n ANY GENERAL DESCRIPTION OF THE TYPES OF PRODUCTS"
                + " OR SERVICES AND RESULTS THEREOF POSTED ON ANY SELLER WEBSITE OR MOBILE APPLICATION DO NOT"
                + " CONSTITUTE PART OF THE AGREEMENT BETWEEN SELLER AND CUSTOMER."
                + "THESE TERMS AND CONDITIONS, ANY STATEMENTS OF WORK, THE SERVICES HEREUNDER AND ANY SALE OF PRODUCTS "
                + "HEREUNDER WILL BE GOVERNED BY THE LAWS OF THE STATE OF AREA 51, WITHOUT REGARD TO CONFLICTS OF LAWS"
                + " RULES. ANY ARBITRATION, ENFORCEMENT OF AN ARBITRATION OR LITIGATION WILL BE BROUGHT EXCLUSIVELY IN "
                + "COOK COUNTY, ILLINOIS, AND CUSTOMER CONSENTS TO THE JURISDICTION OF THE FEDERAL AND STATE COURTS "
                + "LOCATED THEREIN, SUBMITS TO THE JURISDICTION THEREOF AND WAIVES THE RIGHT TO CHANGE VENUE. CUSTOMER "
                + "FURTHER CONSENTS TO THE EXERCISE OF PERSONAL JURISDICTION BY ANY SUCH COURT WITH RESPECT TO ANY SUCH"
                + " PROCEEDING. Except in the case of nonpayment, neither party may institute any action in any form arising "
                + "out of these Terms and Conditions more than one (1) year after the cause of action has arisen. The rights and "
                + "remedies provided Seller under these Terms and Conditions are cumulative, are in addition to, and do not limit "
                + "or prejudice any other right or remedy available at law or in equity."
                + "\n\nCOMMUNICATION\n\n"
                + "n addition to any specific Customer duties set forth in any applicable Statement of Work, Customer agrees to "
                + "cooperate with Seller in connection with performance of the Services by providing: (i) timely responses to Seller's "
                + "inquiries and requests for approvals and authorizations, (ii) access to any information or materials reasonably "
                + "requested by Seller which are necessary or useful as determined by Seller in connection with providing the Services,"
                + " including, but not limited to, physical and computer access to Customer's computer systems, and (iii) all Required "
                + "Consents necessary for Seller to provide the Services. \"Required Consents\" means consents or approvals required to"
                + " give Seller, its Affiliates, and its and their subcontractors the right or license to access, use and modify all data "
                + "and third party products. Customer acknowledges and agrees that the Services are dependent upon the completeness and accuracy "
                + "of information provided by Customer and the knowledge and cooperation of the agents, employees or subcontractors (\"Personnel\")"
                + " engaged or appointed by Customer who are selected by Customer to work with Seller.\n Seller will follow all reasonable Customer "
                + "security rules and procedures, as communicated in writing by Customer to Seller from time to time."
                + "\n\nWarranty\n\n"
                + "Customer understands that Seller is not the manufacturer of the Products purchased by Customer hereunder and the only warranties "
                + "offered are those of the manufacturer, not Seller or its Affiliates. In purchasing the Products, Customer is relying on the "
                + "manufacturer's specifications only and is not relying on any statements, specifications, photographs or other illustrations"
                + " representing the Products that may be provided by Seller or its Affiliates. SELLER AND ITS AFFILIATES HEREBY EXPRESSLY DISCLAIM "
                + "ALL WARRANTIES EITHER EXPRESS OR IMPLIED, RELATED TO PRODUCTS, INCLUDING, BUT NOT LIMITED TO, ANY WARRANTY OF TITLE, ACCURACY, "
                + "MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE, WARRANTY OF NON-INFRINGEMENT, OR ANY WARRANTY RELATING TO THIRD PARTY SERVICES. "
                + "THE DISCLAIMER CONTAINED IN THIS PARAGRAPH DOES NOT AFFECT THE TERMS OF ANY MANUFACTURER'S WARRANTY. Customer expressly waives any "
                + "claim that it may have against Seller or its Affiliates based on any product liability or infringement or alleged infringement of any"
                + " patent, copyright, trade secret or other intellectual property rights (each a \"Claim\") with respect to any Product and also waives "
                + "any right to indemnification from Seller or its Affiliates against any such Claim made against Customer by a third party. Customer "
                + "acknowledges that no employee of Seller or its Affiliates is authorized to make any representation or warranty on behalf of Seller or "
                + "any of its Affiliates that is not in this Agreement.\n Seller makes no warranties to the Customer and the Customer hereby acknowledges "
                + "that Seller makes no warranties in regard to the applicability of all laws and regulations affecting, without limitation the manufacture,"
                + " performance, sale, packaging and labelling of the Products which are in force within the Customer's territory.\n Customer further "
                + "acknowledges and agrees that Seller makes no representations, warranties or assurances that the Products are designed for or suitable "
                + "for use in any high risk environment, including but not limited to aircraft or automobile safety devices or navigation, life support "
                + "systems or medical devices, nuclear facilities, or weapon systems, and Customer agrees to indemnify Seller in connection with any such "
                + "use of the Products. Customer further agrees to review and comply with the manufacture's disclaimers and restrictions regarding the use "
                + "of the Products in high risk environments.\n Seller warrants that the Services will be performed in a good and workmanlike manner. "
                + "Customer's sole and exclusive remedy and Seller's entire liability with respect to this warranty will be, at the sole option of Seller,"
                + "Its Getting boring so time for some Barbie gril song Hiya, Barbie Hi, Ken You want to go for a ride? Sure, Ken Jump in I'm a Barbie girl"
                + "Imagination, life is your creation Come on, Barbie, let's go party I'm a Barbie girl, in the Barbie world Life in plastic, it's fantastic"
                + "You can brush my hair, undress me everywhere Imagination, life is your creation I'm a blond bimbo girl in a fantasy world Dress me up, make it tight"
                + "You're my doll, rock'n'roll, feel the glamour in pink Kiss me here, touch me there, hanky panky You can touch You can pla If you say, I'm always yours"
                + "I'm a Barbie girl, in the Barbie world Life in plastic, it's fantastic You can brush my hair, undress me everywhere Imagination, life is your creation"
                + "Come on, Barbie, let's go party Come on, Barbie, let's go party Come on, Barbie, let's go party  Come on, Barbie, let's go party Make me walk"
                + "I can act like a star, I can beg on my knees Come jump in, bimbo friend, let us do it again Hit the town, fool around, let's go party"
                + "You can touch You can play If you say, I'm always yours You can touch You can play If you say, I'm always yours Life in plastic, it's fantastic"
                + "You can brush my hair, undress me everywhere Imagination, life is your creation I'm a Barbie girl, in the Barbie world Life in plastic, it's fantastic"
                + "You can brush my hair, undress me everywhere Imagination, life is your creation Come on, Barbie, let's go party Oh, I'm having so much fun Well"
                + " to either (a) use its reasonable commercial efforts to re-perform or cause to be re-performed any Services not in substantial compliance "
                + "with this warranty or (b) refund amounts paid by Customer related to the portion of the Services not in substantial compliance; provided, in"
                + " each case, Customer notifies Seller in writing within five (5) business days after performance of the applicable Services. EXCEPT AS SET FORTH "
                + "HEREIN OR IN ANY STATEMENT OF WORK THAT EXPRESSLY AMENDS SELLER'S WARRANTY, AND SUBJECT TO APPLICABLE LAW, SELLER MAKES NO OTHER, AND EXPRESSLY "
                + "DISCLAIMS ALL OTHER, REPRESENTATIONS, WARRANTIES, CONDITIONS OR COVENANTS, EITHER EXPRESS OR IMPLIED (INCLUDING WITHOUT LIMITATION, ANY EXPRESS "
                + "OR IMPLIED WARRANTIES OR CONDITIONS OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, DURABILITY, TITLE, ACCURACY OR NON-INFRINGEMENT) ARISING "
                + "OUT OF OR RELATED TO THE PERFORMANCE OR NON-PERFORMANCE OF THE SERVICES, INCLUDING BUT NOT LIMITED TO ANY WARRANTY RELATING TO THIRD PARTY SERVICES, "
                + "ANY WARRANTY WITH RESPECT TO THE PERFORMANCE OF ANY HARDWARE OR SOFTWARE USED IN PERFORMING SERVICES AND ANY WARRANTY CONCERNING THE RESULTS TO BE "
                + "OBTAINED FROM THE SERVICES. THIS DISCLAIMER AND EXCLUSION SHALL APPLY EVEN IF THE EXPRESS WARRANTY AND LIMITED REMEDY SET FORTH HEREIN FAILS OF ITS"
                + " ESSENTIAL PURPOSE. CUSTOMER ACKNOWLEDGES THAT NO REPRESENTATIVE OF SELLER OR OF ITS AFFILIATES IS AUTHORIZED TO MAKE ANY REPRESENTATION OR WARRANTY "
                + "ON BEHALF OF SELLER OR ANY OF ITS AFFILIATES THAT IS NOT IN THIS AGREEMENT OR IN A STATEMENT OF WORK EXPRESSLY AMENDING SELLER'S WARRANTY.\n Customer "
                + "shall be solely responsible for daily back-up and other protection of its data and software against loss, damage or corruption. Customer shall be solely "
                + "responsible for reconstructing data (including but not limited to data located on disk files and memories) and software that may be lost, damaged or "
                + "corrupted during the performance of Services. SELLER, ITS AFFILIATES, AND ITS AND THEIR SUPPLIERS, SUBCONTRACTORS AND AGENTS ARE HEREBY RELEASED AND "
                + "SHALL CONTINUE TO BE RELEASED FROM ALL LIABILITY IN CONNECTION WITH THE LOSS, DAMAGE OR CORRUPTION OF DATA AND SOFTWARE, AND CUSTOMER ASSUMES ALL RISK "
                + "OF LOSS, DAMAGE OR CORRUPTION OF DATA AND SOFTWARE IN ANY WAY RELATED TO OR RESULTING FROM THE SERVICES.\n Seller will not be responsible for and no"
                + " liability shall result to Seller or any of its Affiliates for any delays in delivery or in performance which result from any circumstances beyond Seller's "
                + "reasonable control, including, but not limited to, Product unavailability, carrier delays, delays due to fire, severe weather conditions, failure of power,"
                + " labor problems, acts of war, terrorism, embargo, acts of God or acts or laws of any government or agency. Any shipping dates or completion dates"
                + " provided by Seller or any purported deadlines contained in a Statement of Work or any other document are estimates only."
                + "\n\nTermination\n\n"
                + "Either party may terminate performance of a Service or a Statement of Work for cause if the other party fails to cure a "
                + "material default in the time period specified herein. Any material default must be specifically identified in a written "
                + "notice of termination. After written notice, the notified party will, subject to the provision of warranties herein, have "
                + "thirty (30) days to remedy its performance except that it will only have ten (10) days to remedy any monetary default. "
                + "Failure to remedy any material default within the applicable time period provided for herein will give cause for immediate "
                + "termination, unless such default is incapable of being cured within the time period in which case the defaulting party will "
                + "not be in breach (except for Customer's payment obligations) if it used its reasonable efforts to cure the default. In the event "
                + "of any termination of the Services or a Statement of Work, Customer will pay Seller for all Services performed and expenses "
                + "incurred up to and including the date of termination plus any termination fee if one is set forth in the applicable Statement"
                + " of Work. In such event Customer will also pay Seller for any out-of-pocket demobilization or other direct costs resulting from "
                + "termination. Upon termination, all rights and obligations of the parties under this Agreement will automatically terminate except"
                + " for any right of action occurring prior to termination, payment obligations and obligations that expressly or by implication are"
                + " intended to survive termination (including, but not limited to, limitation of liability, indemnity, confidentiality, or licensing "
                + "of Work Product and this survival provision)."
                + "\n\nAbritration\n\n"
                + "Any claim, dispute, or controversy (whether in contract, tort or otherwise, whether preexisting, present or "
                + "future, and including, but not limited to, statutory, common law, intentional tort and equitable claims) arising "
                + "from or relating to the Products, the Services, the interpretation or application of these Terms and Conditions or "
                + "any Statement of Work or the breach, termination or validity thereof, the relationships which result from these Terms "
                + "and Conditions or any Statement of Work (including, to the full extent permitted by applicable law, relationships with"
                + " third parties who are not signatories hereto), or Seller's or any of its Affiliates' advertising or marketing (collectively,"
                + " a \"Claim\") WILL BE RESOLVED, UPON THE ELECTION OF ANY OF SELLER, CUSTOMER OR THE THIRD PARTIES INVOLVED, EXCLUSIVELY AND "
                + "FINALLY BY BINDING ARBITRATION. If arbitration is chosen, it will be conducted pursuant to the Rules of the American Arbitration "
                + "Association. If arbitration is chosen by any party with respect to a Claim, neither Seller nor Customer will have the right to litigate "
                + "that Claim in court or to have a jury trial on that Claim or to engage in pre-arbitration discovery, except as provided for in the "
                + "applicable arbitration rules or by agreement of the parties involved. Further, Customer will not have the right to participate as a"
                + " representative or member of any class of claimants pertaining to any Claim. Notwithstanding any choice of law provision included in "
                + "these Terms and Conditions, this arbitration agreement is subject to the Federal Arbitration Act (9 U.S.C. §§ 1-16). The arbitration "
                + "will take place exclusively in Chicago, Illinois. Any court having jurisdiction may enter judgment on the award rendered by the arbitrator(s)."
                + " Each party involved will bear its own cost of any legal representation, discovery or research required to complete arbitration."
                + " The existence or results of any arbitration will be treated as confidential. Notwithstanding anything to the contrary contained"
                + " herein, all matters pertaining to the collection of amounts due to Seller arising out of the Products or Services will be exclusively "
                + "litigated in court rather than through arbitration.", 10, 20);

        scroll = new JScrollPane(ZaTandC, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(400, 350, 500, 300);
        ZaTandC.setFont(new Font("Agency FB", Font.BOLD, 15));
        ZaTandC.setLineWrap(true);
        ZaTandC.setWrapStyleWord(true);
        frmTandC.add(scroll);
    }

    //Holds all the button present in the frame
    public void AllButtons() {
        //A button to go home
        btnBak = new JButton(" 🏠 HOME");
        btnBak.setBounds(1300, 60, 130, 25);
        btnBak.setFont(new Font("", Font.BOLD, 18));
        btnBak.setBackground(c2);
        btnBak.setForeground(Color.WHITE);
        frmTandC.add(btnBak);

        //CheckBox        
        chkTandC.setBounds(400, 655, 700, 20);
        chkTandC.setOpaque(true);
        chkTandC.setBackground(c3);
        frmTandC.add(chkTandC);

    }

    //function that holds all the functionality of the action listeners
    public void AllActionListener() {
        //takes the user to the home page
        btnBak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Takes the user to the homepage if the checkbox is selected
                if (chkTandC.isSelected()) {
                    new HomePage();
                    frmTandC.setVisible(false);
                } else {
                    //If the user tries go back without clicking on the checkBox below the T%C
                    JOptionPane.showMessageDialog(frmTandC, "Please read the Terms and Condition Before Proceeding", "ERROR", 0);
                }
            }
        }
        );
    }

    //Initializes the frame  
    public void DisplayFrame() {
        frmTandC = new JFrame("Terms and Conditions");
        frmTandC.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Calling appropriate functions to set up the frame
        AllLabels();
        AllButtons();
        AllActionListener();

        frmTandC.getContentPane().setBackground(c3);
        frmTandC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmTandC.setLayout(null);
        frmTandC.setVisible(true);
    }

    //Function called by the actionListener in HomePage   
    public void ShowTandC() {
        DisplayFrame();
    }

}
