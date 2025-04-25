package hospitalmanagementsystem;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class AdminPage extends javax.swing.JFrame {
    public AdminPage() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hospitaldb";
        String username = "root";
        String password = "";

        try 
        {
            con = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the database!");
        }
        catch(SQLException s){
        
        }
        initComponents();
    }                        
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        P_BorderPane = new javax.swing.JPanel();
        Pnavigation = new javax.swing.JPanel();
        BaddInfo = new javax.swing.JButton();
        BdispInfo = new javax.swing.JButton();
        Bsearch = new javax.swing.JButton();
        BeditInfo = new javax.swing.JButton();
        BeditFac = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Bback = new javax.swing.JButton();
        PHome = new javax.swing.JTabbedPane();
        PRegPane3 = new javax.swing.JPanel();
        Lname = new javax.swing.JLabel();
        LGender = new javax.swing.JLabel();
        Ldob = new javax.swing.JLabel();
        LBlood = new javax.swing.JLabel();
        TName = new javax.swing.JTextField();
        Ladd2 = new javax.swing.JLabel();
        Ladd1 = new javax.swing.JLabel();
        Tadd2 = new javax.swing.JTextField();
        Tadd1 = new javax.swing.JTextField();
        TPhone = new javax.swing.JTextField();
        Tadhaar = new javax.swing.JTextField();
        RFemale = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        jComboBox34 = new javax.swing.JComboBox<>();
        jComboBox35 = new javax.swing.JComboBox<>();
        jComboBox36 = new javax.swing.JComboBox<>();
        TRegTitle = new javax.swing.JLabel();
        C_Blood = new javax.swing.JComboBox<>();
        Tusrname = new javax.swing.JTextField();
        Tadd3 = new javax.swing.JTextField();
        Tpasswd = new javax.swing.JTextField();
        Tadd4 = new javax.swing.JTextField();
        Ladhaar = new javax.swing.JLabel();
        Lusrname = new javax.swing.JLabel();
        Lpasswd = new javax.swing.JLabel();
        Ladd3 = new javax.swing.JLabel();
        Ladd4 = new javax.swing.JLabel();
        terms = new javax.swing.JCheckBox();
        RMale = new javax.swing.JRadioButton();
        Lwarn = new javax.swing.JLabel();
        LPhone = new javax.swing.JLabel();
        PsearchPane = new javax.swing.JPanel();
        LsearchTitle = new javax.swing.JLabel();
        BsearchId = new javax.swing.JButton();
        LsearchId = new javax.swing.JLabel();
        TsearchId1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTbl = new javax.swing.JTable();
        Lsearchwarn = new javax.swing.JLabel();
        Bedit = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        PeditPane = new javax.swing.JPanel();
        LEDtitle = new javax.swing.JLabel();
        Lcanteen = new javax.swing.JLabel();
        Lscan = new javax.swing.JLabel();
        Loxy = new javax.swing.JLabel();
        LbloodSt = new javax.swing.JLabel();
        Toxy = new javax.swing.JTextField();
        TbloodSt = new javax.swing.JTextField();
        Tamb = new javax.swing.JTextField();
        Tscan = new javax.swing.JTextField();
        Lpharm = new javax.swing.JLabel();
        Lamb = new javax.swing.JLabel();
        RcantN = new javax.swing.JRadioButton();
        Rcanty = new javax.swing.JRadioButton();
        RpharmY = new javax.swing.JRadioButton();
        RpharmN = new javax.swing.JRadioButton();
        Bedsubmit = new javax.swing.JButton();
        PDisplay = new javax.swing.JPanel();
        Ptable = new javax.swing.JScrollPane();
        Disptable = new javax.swing.JTable();
        LdispTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Gender.add(RMale);
        Gender.add(RFemale);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setExtendedState(1600);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        title.setBackground(new java.awt.Color(102, 255, 102));
        title.setFont(new java.awt.Font("Stencil", 0, 50)); 
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("H o s p i t a l     m a n a g e m e n t     s y s t e m");
        getContentPane().add(title);
        title.setBounds(224, 9, 1171, 51);

        P_BorderPane.setBackground(new java.awt.Color(51, 255, 255));
        P_BorderPane.setLayout(null);

        Pnavigation.setBackground(new java.awt.Color(0, 153, 255));
        Pnavigation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pnavigation.setLayout(null);

        BaddInfo.setBackground(new java.awt.Color(0, 204, 255));
        BaddInfo.setFont(new java.awt.Font("Segoe UI", 1, 18));
        BaddInfo.setForeground(new java.awt.Color(255, 255, 255));
        BaddInfo.setText("Add Information");
        BaddInfo.setActionCommand("addInfo");
        BaddInfo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                BaddInfoComponentAdded(evt);
            }
        });
        BaddInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddInfoActionPerformed(evt);
            }
        });
        Pnavigation.add(BaddInfo);
        BaddInfo.setBounds(30, 113, 235, 41);

        BdispInfo.setBackground(new java.awt.Color(0, 204, 255));
        BdispInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BdispInfo.setForeground(new java.awt.Color(255, 255, 255));
        BdispInfo.setText("Display Info");
        BdispInfo.setActionCommand("dispInfo");
        BdispInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdispInfoActionPerformed(evt);
            }
        });
        Pnavigation.add(BdispInfo);
        BdispInfo.setBounds(30, 195, 235, 41);

        Bsearch.setBackground(new java.awt.Color(0, 204, 255));
        Bsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Bsearch.setForeground(new java.awt.Color(255, 255, 255));
        Bsearch.setText("Search Details");
        Bsearch.setActionCommand("searchInfo");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });
        Pnavigation.add(Bsearch);
        Bsearch.setBounds(30, 277, 235, 41);

        BeditInfo.setBackground(new java.awt.Color(0, 204, 255));
        BeditInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BeditInfo.setForeground(new java.awt.Color(255, 255, 255));
        BeditInfo.setText("Edit Information");
        BeditInfo.setActionCommand("editInfo");
        BeditInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditInfoActionPerformed(evt);
            }
        });
        Pnavigation.add(BeditInfo);
        BeditInfo.setBounds(30, 358, 235, 41);

        BeditFac.setBackground(new java.awt.Color(0, 204, 255));
        BeditFac.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BeditFac.setForeground(new java.awt.Color(255, 255, 255));
        BeditFac.setText("Edit Facility");
        BeditFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditFacActionPerformed(evt);
            }
        });
        Pnavigation.add(BeditFac);
        BeditFac.setBounds(30, 438, 235, 41);

        B_Logout.setBackground(new java.awt.Color(255, 0, 0));
        B_Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        B_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/LOGOUT_icon.jpg"))); 
        B_Logout.setText("Logout");
        B_Logout.setIconTextGap(6);
        B_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LogoutActionPerformed(evt);
            }
        });
        Pnavigation.add(B_Logout);
        B_Logout.setBounds(61, 523, 159, 41);

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOOLS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pnavigation.add(jLabel2);
        jLabel2.setBounds(103, 47, 117, 32);

        P_BorderPane.add(Pnavigation);
        Pnavigation.setBounds(6, 58, 286, 619);

        Bback.setBackground(new java.awt.Color(51, 153, 255));
        Bback.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Bback.setForeground(new java.awt.Color(255, 255, 255));
        Bback.setText("BACK");
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });
        P_BorderPane.add(Bback);
        Bback.setBounds(95, 17, 115, 29);

        getContentPane().add(P_BorderPane);
        P_BorderPane.setBounds(20, 90, 300, 683);

        PHome.setEnabled(false);
        PHome.setFocusable(false);

        PRegPane3.setBackground(new java.awt.Color(0, 153, 255));
        PRegPane3.setLayout(null);

        Lname.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Lname.setForeground(new java.awt.Color(255, 255, 255));
        Lname.setText("Name :");
        PRegPane3.add(Lname);
        Lname.setBounds(72, 90, 92, 33);

        LGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LGender.setForeground(new java.awt.Color(255, 255, 255));
        LGender.setText("Gender :");
        PRegPane3.add(LGender);
        LGender.setBounds(565, 90, 86, 33);

        Ldob.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ldob.setForeground(new java.awt.Color(255, 255, 255));
        Ldob.setText("D . O . B :");
        PRegPane3.add(Ldob);
        Ldob.setBounds(72, 135, 92, 22);

        LBlood.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LBlood.setForeground(new java.awt.Color(255, 255, 255));
        LBlood.setText("Blood :");
        PRegPane3.add(LBlood);
        LBlood.setBounds(565, 135, 92, 32);
        PRegPane3.add(TName);
        TName.setBounds(201, 91, 282, 32);

        Ladd2.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladd2.setForeground(new java.awt.Color(255, 255, 255));
        Ladd2.setText("Email :");
        PRegPane3.add(Ladd2);
        Ladd2.setBounds(565, 231, 89, 32);

        Ladd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladd1.setForeground(new java.awt.Color(255, 255, 255));
        Ladd1.setText("Licence ID :");
        PRegPane3.add(Ladd1);
        Ladd1.setBounds(565, 180, 92, 32);
        PRegPane3.add(Tadd2);
        Tadd2.setBounds(697, 232, 256, 32);
        PRegPane3.add(Tadd1);
        Tadd1.setBounds(697, 181, 256, 32);
        PRegPane3.add(TPhone);
        TPhone.setBounds(201, 180, 282, 32);
        PRegPane3.add(Tadhaar);
        Tadhaar.setBounds(200, 230, 283, 32);

        RFemale.setFont(new java.awt.Font("Segoe UI", 0, 16)); 
        RFemale.setForeground(new java.awt.Color(255, 255, 255));
        RFemale.setText("Female");
        PRegPane3.add(RFemale);
        RFemale.setBounds(797, 89, 98, 33);

        submit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); 
        submit.setForeground(new java.awt.Color(0, 102, 204));
        submit.setText("SUBMIT");
        submit.setActionCommand("Dsubmit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitsubmitActionPerformed(evt);
            }
        });
        PRegPane3.add(submit);
        submit.setBounds(446, 547, 155, 45);

        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox34.setName("Date"); 
        PRegPane3.add(jComboBox34);
        jComboBox34.setBounds(201, 135, 78, 23);

        jComboBox35.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        PRegPane3.add(jComboBox35);
        jComboBox35.setBounds(291, 136, 87, 22);

        jComboBox36.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1960", "1961", "1962", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", " " }));
        PRegPane3.add(jComboBox36);
        jComboBox36.setBounds(390, 135, 93, 23);

        TRegTitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); 
        TRegTitle.setForeground(new java.awt.Color(255, 255, 255));
        TRegTitle.setText("Doctor Registration Form");
        PRegPane3.add(TRegTitle);
        TRegTitle.setBounds(72, 6, 596, 54);

        C_Blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "O + ve", "O - ve", "A + ve", "A - ve", "B - ve", "B + ve", "AB - ve", "AB + ve" }));
        PRegPane3.add(C_Blood);
        C_Blood.setBounds(697, 141, 107, 30);
        PRegPane3.add(Tusrname);
        Tusrname.setBounds(200, 280, 282, 32);
        PRegPane3.add(Tadd3);
        Tadd3.setBounds(697, 282, 256, 32);
        PRegPane3.add(Tpasswd);
        Tpasswd.setBounds(200, 330, 282, 32);
        PRegPane3.add(Tadd4);
        Tadd4.setBounds(700, 330, 253, 32);

        Ladhaar.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladhaar.setForeground(new java.awt.Color(255, 255, 255));
        Ladhaar.setText("Aadhaar No. :");
        PRegPane3.add(Ladhaar);
        Ladhaar.setBounds(72, 232, 110, 30);

        Lusrname.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Lusrname.setForeground(new java.awt.Color(255, 255, 255));
        Lusrname.setText("Username :");
        PRegPane3.add(Lusrname);
        Lusrname.setBounds(70, 280, 92, 30);

        Lpasswd.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Lpasswd.setForeground(new java.awt.Color(255, 255, 255));
        Lpasswd.setText("Password :");
        PRegPane3.add(Lpasswd);
        Lpasswd.setBounds(70, 330, 92, 30);

        Ladd3.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladd3.setForeground(new java.awt.Color(255, 255, 255));
        Ladd3.setText("Specilization :");
        PRegPane3.add(Ladd3);
        Ladd3.setBounds(565, 282, 109, 30);

        Ladd4.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladd4.setForeground(new java.awt.Color(255, 255, 255));
        Ladd4.setText("Experience :");
        PRegPane3.add(Ladd4);
        Ladd4.setBounds(565, 332, 92, 30);

        terms.setFont(new java.awt.Font("Segoe UI", 1, 16)); 
        terms.setForeground(new java.awt.Color(255, 255, 255));
        terms.setText("Accept Terms & Conditions");
        PRegPane3.add(terms);
        terms.setBounds(413, 495, 230, 26);

        RMale.setFont(new java.awt.Font("Segoe UI", 0, 16)); 
        RMale.setForeground(new java.awt.Color(255, 255, 255));
        RMale.setText("Male");
        PRegPane3.add(RMale);
        RMale.setBounds(697, 89, 88, 33);

        Lwarn.setFont(new java.awt.Font("Segoe UI", 0, 20)); 
        Lwarn.setForeground(new java.awt.Color(255, 0, 0));
        Lwarn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRegPane3.add(Lwarn);
        Lwarn.setBounds(315, 431, 397, 46);

        LPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LPhone.setForeground(new java.awt.Color(255, 255, 255));
        LPhone.setText("Phone No, :");
        PRegPane3.add(LPhone);
        LPhone.setBounds(72, 179, 92, 32);

        PHome.addTab("", PRegPane3);

        PsearchPane.setBackground(new java.awt.Color(0, 153, 204));
        PsearchPane.setLayout(null);

        LsearchTitle.setFont(new java.awt.Font("Segoe UI", 0, 20)); 
        LsearchTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LsearchTitle.setText("Search Doctor Details");
        PsearchPane.add(LsearchTitle);
        LsearchTitle.setBounds(389, 65, 396, 40);

        BsearchId.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        BsearchId.setText("Search");
        BsearchId.setMnemonic('S');
        BsearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchIdActionPerformed(evt);
            }
        });
        PsearchPane.add(BsearchId);
        BsearchId.setBounds(721, 188, 81, 32);
        BsearchId.getAccessibleContext().setAccessibleName("");

        LsearchId.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        LsearchId.setText("Doctor Id :");
        PsearchPane.add(LsearchId);
        LsearchId.setBounds(265, 188, 113, 31);
        PsearchPane.add(TsearchId1);
        TsearchId1.setBounds(425, 189, 212, 31);

        searchTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "DOB", "Rank"
            }
        ));
        searchTbl.setRowHeight(50);
        searchTbl.setShowHorizontalLines(true);
        searchTbl.setShowVerticalLines(true);
        jScrollPane1.setViewportView(searchTbl);

        PsearchPane.add(jScrollPane1);
        jScrollPane1.setBounds(198, 314, 685, 78);

        Lsearchwarn.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        Lsearchwarn.setForeground(new java.awt.Color(255, 0, 0));
        Lsearchwarn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lsearchwarn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PsearchPane.add(Lsearchwarn);
        Lsearchwarn.setBounds(369, 489, 316, 38);

        Bedit.setText("Edit");
        Bedit.setVisible(false);
        PsearchPane.add(Bedit);
        Bedit.setBounds(324, 539, 103, 35);

        Bdelete.setText("Delete");
        Bdelete.setVisible(false);
        PsearchPane.add(Bdelete);
        Bdelete.setBounds(678, 539, 107, 35);

        PHome.addTab("", PsearchPane);

        PeditPane.setBackground(new java.awt.Color(0, 153, 204));
        PeditPane.setForeground(new java.awt.Color(0, 153, 204));
        PeditPane.setLayout(null);

        LEDtitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        LEDtitle.setForeground(new java.awt.Color(255, 255, 255));
        LEDtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEDtitle.setText("Edit Hospital Facilities");
        PeditPane.add(LEDtitle);
        LEDtitle.setBounds(340, 70, 380, 50);

        Lcanteen.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        Lcanteen.setForeground(new java.awt.Color(255, 255, 255));
        Lcanteen.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Lcanteen.setText("Canteen :");
        PeditPane.add(Lcanteen);
        Lcanteen.setBounds(325, 298, 130, 29);

        Lscan.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        Lscan.setForeground(new java.awt.Color(255, 255, 255));
        Lscan.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Lscan.setText("Scanners :");
        PeditPane.add(Lscan);
        Lscan.setBounds(300, 460, 155, 34);

        Loxy.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        Loxy.setForeground(new java.awt.Color(255, 255, 255));
        Loxy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Loxy.setText("Oxygen Availability :");
        PeditPane.add(Loxy);
        Loxy.setBounds(285, 236, 170, 32);

        LbloodSt.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        LbloodSt.setForeground(new java.awt.Color(255, 255, 255));
        LbloodSt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LbloodSt.setText("Blood Stock :");
        PeditPane.add(LbloodSt);
        LbloodSt.setBounds(325, 185, 130, 31);
        PeditPane.add(Toxy);
        Toxy.setBounds(492, 240, 193, 31);
        PeditPane.add(TbloodSt);
        TbloodSt.setBounds(492, 185, 193, 31);
        PeditPane.add(Tamb);
        Tamb.setBounds(490, 410, 193, 31);

        Tscan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TscanActionPerformed(evt);
            }
        });
        PeditPane.add(Tscan);
        Tscan.setBounds(490, 470, 193, 31);

        Lpharm.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        Lpharm.setForeground(new java.awt.Color(255, 255, 255));
        Lpharm.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Lpharm.setText("Pharmacy :");
        PeditPane.add(Lpharm);
        Lpharm.setBounds(300, 350, 155, 34);

        Lamb.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        Lamb.setForeground(new java.awt.Color(255, 255, 255));
        Lamb.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Lamb.setText("Ambulance :");
        PeditPane.add(Lamb);
        Lamb.setBounds(300, 405, 155, 34);

        RcantN.setBackground(new java.awt.Color(0, 153, 204));
        RcantN.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        RcantN.setForeground(new java.awt.Color(255, 255, 255));
        RcantN.setText("No");
        PeditPane.add(RcantN);
        RcantN.setBounds(611, 302, 74, 25);

        Rcanty.setBackground(new java.awt.Color(0, 153, 204));
        Rcanty.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        Rcanty.setForeground(new java.awt.Color(255, 255, 255));
        Rcanty.setText("Yes");
        PeditPane.add(Rcanty);
        Rcanty.setBounds(492, 302, 74, 25);

        RpharmY.setBackground(new java.awt.Color(0, 153, 204));
        RpharmY.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        RpharmY.setForeground(new java.awt.Color(255, 255, 255));
        RpharmY.setText("Yes");
        PeditPane.add(RpharmY);
        RpharmY.setBounds(492, 357, 74, 25);

        RpharmN.setBackground(new java.awt.Color(0, 153, 204));
        RpharmN.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        RpharmN.setForeground(new java.awt.Color(255, 255, 255));
        RpharmN.setText("No");
        PeditPane.add(RpharmN);
        RpharmN.setBounds(611, 357, 74, 25);

        Bedsubmit.setText("SUBMIT");
        Bedsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedsubmitActionPerformed(evt);
            }
        });
        PeditPane.add(Bedsubmit);
        Bedsubmit.setBounds(439, 561, 161, 42);

        PHome.addTab("", PeditPane);

        PDisplay.setBackground(new java.awt.Color(0, 153, 255));
        PDisplay.setLayout(null);

        Disptable.setBackground(new java.awt.Color(102, 255, 255));
        Disptable.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        Disptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Specilaization", "Gender", "Rank", "DOB"
            }
        ));
        Disptable.setGridColor(new java.awt.Color(153, 255, 255));
        Disptable.setEnabled(false);
        Disptable.setIntercellSpacing(new java.awt.Dimension(2, 2));
        Disptable.setRowHeight(50);
        Disptable.setVisible(false);
        Disptable.setShowHorizontalLines(true);
        Ptable.setViewportView(Disptable);

        PDisplay.add(Ptable);
        Ptable.setBounds(49, 87, 995, 535);

        LdispTitle.setFont(new java.awt.Font("Segoe UI", 0, 20)); 
        LdispTitle.setForeground(new java.awt.Color(255, 255, 255));
        LdispTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LdispTitle.setText("Doctors Details");
        PDisplay.add(LdispTitle);
        LdispTitle.setBounds(337, 28, 373, 41);

        PHome.addTab("", PDisplay);

        getContentPane().add(PHome);
        PHome.setBounds(352, 90, 1115, 683);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/back.jpg"))); 
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1740, 800);

        pack();
    }                                                             

    private void BaddInfoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(evt.getActionCommand()=="addInfo"){
            PHome.setSelectedIndex(0);
            BaddInfo.setText("Add Doctor");
            BaddInfo.setActionCommand("addDoc");
            BdispInfo.setText("Add Nurse");
            BdispInfo.setActionCommand("addnurse");
            Bsearch.setText("Add In-Patient");
            Bsearch.setActionCommand("addIP");
            BeditInfo.setText("Add Out-Patient");
            BeditInfo.setActionCommand("addOP");
        }
        else if (evt.getActionCommand()=="addDoc"){
            TRegTitle.setText("Doctor Registration Form :");
            submit.setActionCommand("Dsubmit");
            Ladd1.setText("License Id :");
            Ladd3.setText("Specilization :");
            Ladd2.setText("Email :");
            Ladd4.setText("Experience :");
        }
        else if(evt.getActionCommand()=="dispDoc"){
            LdispTitle.setText("Doctor Details");
            String query="SELECT name,Specilization,Rank,Gender,DOB FROM `doctor`;";
            java.sql.Statement stmt ;
            ResultSet rs = null;
            Disptable.removeAll();
            try {
                stmt = con.createStatement();
                Disptable.setVisible(true);
                rs = stmt.executeQuery(query);
                ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
                DefaultTableModel tbl=(DefaultTableModel) Disptable.getModel();
                int col=rsmd.getColumnCount();
                String [] colData=new String[col];
                for(int i=0;i<col;i++){
                    colData[i]=rsmd.getColumnName(i+1);
                    tbl.setColumnIdentifiers(colData);
                    String name,gender,dob,special;
                    Integer rank;
                    while(rs.next()){
                        name =rs.getString("name");
                        special=rs.getString("Specilization");
                        rank=rs.getInt("Rank");
                        gender=rs.getString("Gender");
                        dob=rs.getString("DOB");
                        
                        String [] rowData={name,special,rank.toString(),gender,dob};
                        tbl.addRow(rowData);
                    }
                }
                BaddInfo.setEnabled(false);
            }
            catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }          
        }
        else if(evt.getActionCommand()=="searchDoc")
        {
            LsearchTitle.setText("Search Doctor Details :");
            LsearchId.setText("Doctor Id :");
            BsearchId.setActionCommand("searchDoc");
            
        }
        else if(evt.getActionCommand()=="editDoc")
        {
            LsearchTitle.setText("Edit Doctor Details :");
            LsearchId.setText("Doctor Id :"); 
            String query="SELECT Name,Gender,Rank,DOB FROM `doctor` WHERE Name = "+TsearchId1.getText()+";";
            java.sql.Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.first()){
                    searchTbl.setValueAt(rs.getString("Name"), 0, 0);
                    searchTbl.setValueAt(rs.getString("Gender"), 0, 1);
                    searchTbl.setValueAt(rs.getInt("Rank"), 0, 2);
                    searchTbl.setValueAt(rs.getString("DOB"), 0, 3);
                    Lsearchwarn.setText("");
                }
                else{
                     Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                Lsearchwarn.setText("!!! Not Found !!!!");
            }
            
        }
    }                                        

    private void BdispInfoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(evt.getActionCommand()=="addnurse"){
            TRegTitle.setText("Nurse Registration Form :");
            submit.setActionCommand("Nsubmit");
            Ladd1.setText("License Id :");
            Ladd3.setText("Specilization :");
            Ladd2.setText("Email :");
            Ladd4.setText("Experience :");
        }
        else if(evt.getActionCommand()=="dispInfo"){
            PHome.setSelectedIndex(3);
            Disptable.setVisible(false);
            LsearchTitle.setText("Edit Doctor Details :");
            LsearchId.setText("Doctor Id :");  
            BaddInfo.setText("Display Doctor");
            BaddInfo.setActionCommand("dispDoc");
            BdispInfo.setText("Display Nurse");
            BdispInfo.setActionCommand("dispnurse");
            Bsearch.setText("Display In-Patient");
            Bsearch.setActionCommand("dispIP");
            BeditInfo.setText("Display Out-Patient");
            BeditInfo.setActionCommand("dispOP");
        }
        else if(evt.getActionCommand()=="dispnurse"){
            LdispTitle.setText("Nurse Details");
            String query="SELECT name,Specilization,Rank,Gender,DOB FROM `nurse`;";
            java.sql.Statement stmt ;
            ResultSet rs = null;
            Disptable.removeAll();
            try {
                stmt = con.createStatement();
                Disptable.setVisible(true);
                rs = stmt.executeQuery(query);
                ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
                DefaultTableModel tbl=(DefaultTableModel) Disptable.getModel();
                int col=rsmd.getColumnCount();
                String [] colData=new String[col];
                for(int i=0;i<col;i++){
                    colData[i]=rsmd.getColumnName(i+1);
                    tbl.setColumnIdentifiers(colData);
                    String name,gender,dob,special;
                    Integer rank;
                    while(rs.next()){
                        name =rs.getString("name");
                        special=rs.getString("Specilization");
                        rank=rs.getInt("Rank");
                        gender=rs.getString("Gender");
                        dob=rs.getString("DOB");
                        
                        String [] rowData={name,special,rank.toString(),gender,dob};
                        tbl.addRow(rowData);
                    }
                }
                BaddInfo.setEnabled(false);
            }
            catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }                      
        }
        else if(evt.getActionCommand()=="searchnurse"){
            LsearchTitle.setText("Search Nurse Details :");
            LsearchId.setText("Nurse Id :");
            BsearchId.setActionCommand("searchnurse");
            
        }
        else if(evt.getActionCommand()=="editNurse"){
            LsearchTitle.setText("Edit Nurse Details :");
            LsearchId.setText("Nurse Id :");
            
        }
        
    }                                         

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(evt.getActionCommand()=="searchInfo"){
            PHome.setSelectedIndex(1);
            BaddInfo.setText("Search Doctor");
            BaddInfo.setActionCommand("searchDoc");
            
            BsearchId.setActionCommand("searchDoc");
            BdispInfo.setText("Search Nurse");
            BdispInfo.setActionCommand("searchnurse");
            Bsearch.setText("Search In-Patient");
            Bsearch.setActionCommand("searchIP");
            BeditInfo.setText("Search Out-Patient");
            BeditInfo.setActionCommand("searchOP");
        }
        else if(evt.getActionCommand()=="addIP"){
            TRegTitle.setText("In-Patient Registration Form :");
            submit.setActionCommand("IPsubmit");
            Ladd1.setText("Room No. :");
            Ladd3.setText("Disease :");
            Ladd2.setText("Height :");
            Ladd4.setText("Weight :");
        }
        else if(evt.getActionCommand()=="dispIP"){
            LdispTitle.setText("IN-Patient Details");
          String query="SELECT name,Specilization,Rank,Gender,DOB FROM `doctor`;";
            java.sql.Statement stmt ;
            ResultSet rs = null;
            Disptable.removeAll();
            try {
                stmt = con.createStatement();
                Disptable.setVisible(true);
                rs = stmt.executeQuery(query);
                ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
                DefaultTableModel tbl=(DefaultTableModel) Disptable.getModel();
                int col=rsmd.getColumnCount();
                String [] colData=new String[col];
                for(int i=0;i<col;i++){
                    colData[i]=rsmd.getColumnName(i+1);
                    tbl.setColumnIdentifiers(colData);
                    String name,gender,dob,special;
                    Integer rank;
                    while(rs.next()){
                        name =rs.getString("name");
                        special=rs.getString("Specilization");
                        rank=rs.getInt("Rank");
                        gender=rs.getString("Gender");
                        dob=rs.getString("DOB");
                        
                        String [] rowData={name,special,rank.toString(),gender,dob};
                        tbl.addRow(rowData);
                    }
                }
                BaddInfo.setEnabled(false);
            }
            catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }             
        }
        else if(evt.getActionCommand()=="searchIP"){
            LsearchTitle.setText("Search InPatient Details :");
            LsearchId.setText("In-Patient Id :");
            BsearchId.setActionCommand("searchIP");
            
        }
        else if(evt.getActionCommand()=="editIP"){
            LsearchTitle.setText("Edit In Patient Details :");
            LsearchId.setText("In-Patient Id :");
        }
    }                                       

    private void BeditInfoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(evt.getActionCommand()=="addOP"){
            TRegTitle.setText("Out-Patient Registration Form :");
            submit.setActionCommand("OPsubmit");
            Ladd1.setText("Temperature :");
            Ladd3.setText("Disease :");
            Ladd2.setText("Height :");
            Ladd4.setText("Weight :");
        }
        else if(evt.getActionCommand()=="editInfo"){
            PHome.setSelectedIndex(1);
            BaddInfo.setText("Edit Doctor");
            BaddInfo.setActionCommand("editDoc");
            BdispInfo.setText("Edit Nurse");
            BdispInfo.setActionCommand("editNurse");
            Bsearch.setText("Edit In-Patient");
            Bsearch.setActionCommand("editIP");
            BeditInfo.setText("Edit Out-Patient");
            BeditInfo.setActionCommand("editOP");
            Bedit.setVisible(true);
            Bdelete.setVisible(true);
        }
        else if(evt.getActionCommand()=="dispOP"){
            LdispTitle.setText("Out-Patient Details");
            String query="SELECT name,Specilization,Rank,Gender,DOB FROM `doctor`;";
            java.sql.Statement stmt ;
            ResultSet rs = null;
            Disptable.removeAll();
            try {
                stmt = con.createStatement();
                Disptable.setVisible(true);
                rs = stmt.executeQuery(query);
                ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
                DefaultTableModel tbl=(DefaultTableModel) Disptable.getModel();
                int col=rsmd.getColumnCount();
                String [] colData=new String[col];
                for(int i=0;i<col;i++){
                    colData[i]=rsmd.getColumnName(i+1);
                    tbl.setColumnIdentifiers(colData);
                    String name,gender,dob,special;
                    Integer rank;
                    while(rs.next()){
                        name =rs.getString("name");
                        special=rs.getString("Specilization");
                        rank=rs.getInt("Rank");
                        gender=rs.getString("Gender");
                        dob=rs.getString("DOB");
                        
                        String [] rowData={name,special,rank.toString(),gender,dob};
                        tbl.addRow(rowData);
                    }
                }
                BaddInfo.setEnabled(false);
            }
            catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else if(evt.getActionCommand()=="searchOP"){
            LsearchTitle.setText("Search Out Patient Details :");
            LsearchId.setText("Out Patient Id :");
            BsearchId.setActionCommand("searchOP");
            
        }
        else if(evt.getActionCommand()=="editOP"){
            LsearchTitle.setText("Edit Out Patient Details :");
            LsearchId.setText("Out-Patient Id :");
        }
    }                                         

    private void B_LogoutActionPerformed(java.awt.event.ActionEvent evt) {                                         
        LoginForm l=new LoginForm();
        l.generateCaptcha();
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
        l.setVisible(true);
    }                                        

    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {                                      
        PHome.setSelectedIndex(0);
        Disptable.setVisible(false);
        BaddInfo.setText("Add Information");
        BaddInfo.setEnabled(true);
        BaddInfo.setActionCommand("addInfo");
        BdispInfo.setText("Diplay Info");
        BdispInfo.setActionCommand("dispInfo");
        Bsearch.setText("Search Details");
        Bsearch.setActionCommand("searchInfo");
        BeditInfo.setText("Edit Information");
        BeditInfo.setActionCommand("editInfo");

    }                                     

    private void submitsubmitActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String jdbcUrl = "jdbc:mysql://localhost:3306/hospitaldb";
        String username = "root";
        String password = "";
        if(terms.isSelected()){
            if(!(TName.getText().equals(""))&& !(TPhone.getText().equals("")) && !(Tadhaar.getText().
                    equals("")) && !(Tusrname.getText().equals(""))&& !(Tpasswd.getText().equals("")) && 
                    !(Tadd1.getText().equals("")) && !(Tadd2.getText().equals("")) && !(Tadd3.getText()
                    .equals("")) && !(Tadd4.getText().equals("")) ){
                if(evt.getActionCommand()=="Dsubmit"){
                   

        try 
        {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            String name=TName.getText();
            String spec =Tadd1.getText();
            Integer rank=Integer.parseInt(Tadd2.getText());
            Integer phone=Integer.parseInt(TPhone.getText());
            String dob=jComboBox36.getSelectedItem()+"-"+(jComboBox35.getSelectedIndex())+"-"+jComboBox34.getSelectedItem();
            boolean avail=true;
            String pass=Tpasswd.getText();
            Integer ad=Integer.parseInt(Tadhaar.getText());
            String blood=(String) C_Blood.getSelectedItem();
            String user=Tusrname.getText();
            Integer lic=Integer.parseInt(Tadd3.getText());
            String email=Tadd4.getText();
            String gen="";
            if(RMale.isSelected()){
                gen="Male";
            }
            else{
                gen="Female";
            }
            String insertQuery = "INSERT INTO doctor(Name,Specilization,Rank,Phone,DOB,Available,Password,Aadhaar_No,Blood,Username,LICid,email,Gender) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";

            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) 
            {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, spec);
                preparedStatement.setInt(3, rank);
                preparedStatement.setInt(4, phone);
                preparedStatement.setString(5, dob);
                preparedStatement.setBoolean(6, avail);
                preparedStatement.setString(7, pass);
                preparedStatement.setInt(8, ad);
                preparedStatement.setString(9, blood);
                preparedStatement.setString(10, user);
                preparedStatement.setInt(11, lic);
                preparedStatement.setString(12, email);
                preparedStatement.setString(13, gen);
                preparedStatement.executeUpdate();
                
            }
            connection.close();
        }
        catch (SQLException e) 
        {
            Lwarn.setText("*** Invalid Data Entered ***");
            Lwarn.setForeground(Color.red);
        }
                    Lwarn.setText("*** Registration Successfull ***");
                    Lwarn.setForeground(Color.green);
                }
                else if(evt.getActionCommand()=="Nsubmit"){
                    Lwarn.setText("*** Registration Successfull ***");
                    Lwarn.setForeground(Color.green);
                }
                else if(evt.getActionCommand()=="INsubmit"){
                    Lwarn.setText("*** Registration Successfull ***");
                    Lwarn.setForeground(Color.green);
                }
            
                else if (evt.getActionCommand()=="OPsubmit"){
                    Lwarn.setText("*** Registration Successfull ***");
                    Lwarn.setForeground(Color.green);
            
                }
                else{
                    
                }
        }
        else{
             Lwarn.setText("*** Enter Valid Details ***");
             Lwarn.setForeground(Color.red);   
       }
        }
        else{
            Lwarn.setText("!!!!! Accept Terms And Conditions !!!!");
        }
    }                                            

    private void BsearchIdActionPerformed(java.awt.event.ActionEvent evt) {                                          
        BsearchId.setMnemonic('S');
        
        if(evt.getActionCommand()=="searchDoc"){
            String query="SELECT Name,Gender,Rank,DOB FROM `doctor` WHERE Name = "+TsearchId1.getText()+";";
            java.sql.Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.first()){
                    searchTbl.setValueAt(rs.getString("Name"), 0, 0);
                    searchTbl.setValueAt(rs.getString("Gender"), 0, 1);
                    searchTbl.setValueAt(rs.getInt("Rank"), 0, 2);
                    searchTbl.setValueAt(rs.getString("DOB"), 0, 3);
                    Lsearchwarn.setText("");
                }
                else{
                     Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                Lsearchwarn.setText("!!! Not Found !!!!");
            }
        }
        else if(evt.getActionCommand()=="searchnurse"){
            String query="SELECT Name,Gender,Rank,DOB FROM `Nurse` WHERE Name = "+TsearchId1.getText()+";";
            java.sql.Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.first()){
                    searchTbl.setValueAt(rs.getString("Name"), 0, 0);
                    searchTbl.setValueAt(rs.getString("Gender"), 0, 1);
                    searchTbl.setValueAt(rs.getInt("Rank"), 0, 2);
                    searchTbl.setValueAt(rs.getString("DOB"), 0, 3);
                    Lsearchwarn.setText("");
                }
                else{
                     Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                Lsearchwarn.setText("!!! Not Found !!!!");
            }
        }
        else if(evt.getActionCommand()=="searchIP"){
            String query="SELECT Name,Gender,Rank,DOB FROM `doctor` WHERE Name = "+TsearchId1.getText()+";";
            java.sql.Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.first()){
                    searchTbl.setValueAt(rs.getString("Name"), 0, 0);
                    searchTbl.setValueAt(rs.getString("Gender"), 0, 1);
                    searchTbl.setValueAt(rs.getInt("Rank"), 0, 2);
                    searchTbl.setValueAt(rs.getString("DOB"), 0, 3);
                    Lsearchwarn.setText("");
                }
                else{
                     Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                Lsearchwarn.setText("!!! Not Found !!!!");
            }
        }
        else if(evt.getActionCommand()=="searchOP"){
            String query="SELECT Name,Gender,Rank,DOB FROM `doctor` WHERE Name = "+TsearchId1.getText()+";";
            java.sql.Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.first()){
                    searchTbl.setValueAt(rs.getString("Name"), 0, 0);
                    searchTbl.setValueAt(rs.getString("Gender"), 0, 1);
                    searchTbl.setValueAt(rs.getInt("Rank"), 0, 2);
                    searchTbl.setValueAt(rs.getString("DOB"), 0, 3);
                    Lsearchwarn.setText("");
                }
                else{
                     Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                Lsearchwarn.setText("!!! Not Found !!!!");
            }
        }
    }                                         

    private void BedsubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
    }                                         

    private void TscanActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void BeditFacActionPerformed(java.awt.event.ActionEvent evt) {                                         
        PHome.setSelectedIndex(2);
    }                                        

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        int x=JOptionPane.showConfirmDialog(null,"Do you Want to Exit ?","Confirmation",JOptionPane.YES_NO_OPTION);
        if(x==0){
            System.exit(0);
        }
        else {
            try {
                wait();
            } catch (Exception ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }           
         }
    }                                  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Registration u=new Registration();
        u.getContentPane().setBackground(Color.white);
        u.setExtendedState(JFrame.MAXIMIZED_BOTH);
        u.setVisible(true);
    }
    
    Connection con;                 
    private javax.swing.JButton B_Logout;
    private javax.swing.JButton BaddInfo;
    private javax.swing.JButton Bback;
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton BdispInfo;
    private javax.swing.JButton Bedit;
    private javax.swing.JButton BeditFac;
    private javax.swing.JButton BeditInfo;
    private javax.swing.JButton Bedsubmit;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton BsearchId;
    private javax.swing.JComboBox<String> C_Blood;
    private javax.swing.JTable Disptable;
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JLabel LBlood;
    private javax.swing.JLabel LEDtitle;
    private javax.swing.JLabel LGender;
    private javax.swing.JLabel LPhone;
    private javax.swing.JLabel Ladd1;
    private javax.swing.JLabel Ladd2;
    private javax.swing.JLabel Ladd3;
    private javax.swing.JLabel Ladd4;
    private javax.swing.JLabel Ladhaar;
    private javax.swing.JLabel Lamb;
    private javax.swing.JLabel LbloodSt;
    private javax.swing.JLabel Lcanteen;
    private javax.swing.JLabel LdispTitle;
    private javax.swing.JLabel Ldob;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Loxy;
    private javax.swing.JLabel Lpasswd;
    private javax.swing.JLabel Lpharm;
    private javax.swing.JLabel Lscan;
    private javax.swing.JLabel LsearchId;
    private javax.swing.JLabel LsearchTitle;
    private javax.swing.JLabel Lsearchwarn;
    private javax.swing.JLabel Lusrname;
    private javax.swing.JLabel Lwarn;
    private javax.swing.JPanel PDisplay;
    private javax.swing.JTabbedPane PHome;
    private javax.swing.JPanel PRegPane3;
    private javax.swing.JPanel P_BorderPane;
    private javax.swing.JPanel PeditPane;
    private javax.swing.JPanel Pnavigation;
    private javax.swing.JPanel PsearchPane;
    private javax.swing.JScrollPane Ptable;
    private javax.swing.JRadioButton RFemale;
    private javax.swing.JRadioButton RMale;
    private javax.swing.JRadioButton RcantN;
    private javax.swing.JRadioButton Rcanty;
    private javax.swing.JRadioButton RpharmN;
    private javax.swing.JRadioButton RpharmY;
    private javax.swing.JTextField TName;
    private javax.swing.JTextField TPhone;
    private javax.swing.JLabel TRegTitle;
    private javax.swing.JTextField Tadd1;
    private javax.swing.JTextField Tadd2;
    private javax.swing.JTextField Tadd3;
    private javax.swing.JTextField Tadd4;
    private javax.swing.JTextField Tadhaar;
    private javax.swing.JTextField Tamb;
    private javax.swing.JTextField TbloodSt;
    private javax.swing.JTextField Toxy;
    private javax.swing.JTextField Tpasswd;
    private javax.swing.JTextField Tscan;
    private javax.swing.JTextField TsearchId1;
    private javax.swing.JTextField Tusrname;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchTbl;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox terms;
    private javax.swing.JLabel title;                 
}
