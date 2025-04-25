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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import com.toedter.calendar.JCalendar;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.PanelUI;

public class Registration extends javax.swing.JFrame {
    DefaultTableModel tbl;
    JCalendar c=new JCalendar();
    Integer AdminId;
    File imageFile;
    InputStream input;
    String AdminName;
    public Registration(int AdId,String AdminName) {
        try 
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root","");
            System.out.println("Connected to the database!");
        }
        catch(SQLException s){
            System.out.prinrln(s);        
        }
        AdminId=AdId;
        this.AdminName=AdminName;
        initComponents();
    }
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        BGcanteen = new javax.swing.ButtonGroup();
        BGpharm = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        PHome = new javax.swing.JTabbedPane();
        PsearchPane = new javax.swing.JPanel();
        LsearchTitle = new javax.swing.JLabel();
        BsearchId = new javax.swing.JButton();
        LsearchId = new javax.swing.JLabel();
        TsearchId1 = new javax.swing.JTextField();
        Psearch = new javax.swing.JScrollPane();
        searchTbl = new javax.swing.JTable();
        Lsearchwarn = new javax.swing.JLabel();
        Bedit = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PDisplay = new javax.swing.JPanel();
        Ptable = new javax.swing.JScrollPane();
        Disptable = new javax.swing.JTable();
        LdispTitle = new javax.swing.JLabel();
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
        LRegTitle = new javax.swing.JLabel();
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
        Limage = new javax.swing.JLabel();
        BupImg = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
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
        jLabel2 = new javax.swing.JLabel();
        Lroom = new javax.swing.JLabel();
        Troom = new javax.swing.JTextField();
        PRegPane4 = new javax.swing.JPanel();
        Lname1 = new javax.swing.JLabel();
        LGender1 = new javax.swing.JLabel();
        Ldob1 = new javax.swing.JLabel();
        LBlood1 = new javax.swing.JLabel();
        TName1 = new javax.swing.JTextField();
        Ladd5 = new javax.swing.JLabel();
        Lremark = new javax.swing.JLabel();
        Temail = new javax.swing.JTextField();
        Tremark = new javax.swing.JTextField();
        TPhone1 = new javax.swing.JTextField();
        Tadhaar1 = new javax.swing.JTextField();
        LRegTitle1 = new javax.swing.JLabel();
        Tusrname1 = new javax.swing.JTextField();
        Tspec = new javax.swing.JTextField();
        Tpasswd1 = new javax.swing.JTextField();
        Ladhaar1 = new javax.swing.JLabel();
        Lusrname1 = new javax.swing.JLabel();
        Lpasswd1 = new javax.swing.JLabel();
        Lspec = new javax.swing.JLabel();
        Lwarn1 = new javax.swing.JLabel();
        LPhone1 = new javax.swing.JLabel();
        Tdate1 = new javax.swing.JTextField();
        Tgender = new javax.swing.JTextField();
        Tblood = new javax.swing.JTextField();
        Lexp = new javax.swing.JLabel();
        Texp = new javax.swing.JTextField();
        Bupdate = new javax.swing.JButton();
        Limage1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BupImg2 = new javax.swing.JButton();
        P_BorderPane = new javax.swing.JPanel();
        Pnavigation = new javax.swing.JPanel();
        BaddInfo = new javax.swing.JButton();
        BdispInfo = new javax.swing.JButton();
        Bsearch = new javax.swing.JButton();
        BeditInfo = new javax.swing.JButton();
        BmyProfile = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();
        Ltools = new javax.swing.JLabel();
        Bback = new javax.swing.JButton();
        LBackground = new javax.swing.JLabel();

        Gender.add(RMale);
        Gender.add(RFemale);

        BGcanteen.add(Rcanty);
        BGcanteen.add(RcantN);

        BGpharm.add(RpharmY);
        BGpharm.add(RpharmN);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        PHome.setFocusable(false);

        PsearchPane.setBackground(new java.awt.Color(0, 153, 204));
        PsearchPane.setLayout(null);

        LsearchTitle.setFont(new java.awt.Font("Segoe UI", 1, 36));
        LsearchTitle.setForeground(new java.awt.Color(255, 255, 255));
        LsearchTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LsearchTitle.setText("Search Doctor Details");
        PsearchPane.add(LsearchTitle);
        LsearchTitle.setBounds(310, 60, 540, 40);

        BsearchId.setFont(new java.awt.Font("Segoe UI", 1, 18));
        BsearchId.setForeground(new java.awt.Color(0, 0, 204));
        BsearchId.setText("Search");
        BsearchId.setMnemonic('S');
        BsearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchIdActionPerformed(evt);
            }
        });
        PsearchPane.add(BsearchId);
        BsearchId.setBounds(750, 280, 90, 30);
        BsearchId.getAccessibleContext().setAccessibleName("");

        LsearchId.setFont(new java.awt.Font("Segoe UI", 1, 18));
        LsearchId.setForeground(new java.awt.Color(255, 255, 255));
        LsearchId.setText("Doctor Id :");
        PsearchPane.add(LsearchId);
        LsearchId.setBounds(320, 280, 113, 31);
        PsearchPane.add(TsearchId1);
        TsearchId1.setBounds(450, 280, 212, 31);

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
        Psearch.setViewportView(searchTbl);

        PsearchPane.add(Psearch);
        Psearch.setBounds(230, 380, 685, 78);

        Lsearchwarn.setFont(new java.awt.Font("Segoe UI", 1, 24));
        Lsearchwarn.setForeground(new java.awt.Color(255, 0, 0));
        Lsearchwarn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lsearchwarn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PsearchPane.add(Lsearchwarn);
        Lsearchwarn.setBounds(369, 489, 316, 38);

        Bedit.setFont(new java.awt.Font("Segoe UI", 1, 18));
        Bedit.setForeground(new java.awt.Color(0, 0, 255));
        Bedit.setText("Edit");
        Bedit.setVisible(false);
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });
        PsearchPane.add(Bedit);
        Bedit.setBounds(420, 540, 103, 35);

        Bdelete.setFont(new java.awt.Font("Segoe UI", 1, 18));
        Bdelete.setForeground(new java.awt.Color(0, 0, 255));
        Bdelete.setText("Delete");
        Bdelete.setVisible(false);
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });
        PsearchPane.add(Bdelete);
        Bdelete.setBounds(570, 540, 107, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/search.jpg")));
        jLabel1.setToolTipText("");
        PsearchPane.add(jLabel1);
        jLabel1.setBounds(510, 130, 90, 90);

        PHome.addTab("", PsearchPane);

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

        PRegPane3.setBackground(new java.awt.Color(0, 153, 255));
        PRegPane3.setLayout(null);
        PRegPane3.add(c);

        Lname.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Lname.setForeground(new java.awt.Color(255, 255, 255));
        Lname.setText("Name :");
        PRegPane3.add(Lname);
        Lname.setBounds(80, 180, 92, 33);

        LGender.setFont(new java.awt.Font("Segoe UI", 1, 14));
        LGender.setForeground(new java.awt.Color(255, 255, 255));
        LGender.setText("Gender :");
        PRegPane3.add(LGender);
        LGender.setBounds(570, 160, 86, 33);

        Ldob.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Ldob.setForeground(new java.awt.Color(255, 255, 255));
        Ldob.setText("D . O . B :");
        PRegPane3.add(Ldob);
        Ldob.setBounds(80, 230, 92, 22);

        LBlood.setFont(new java.awt.Font("Segoe UI", 1, 14));
        LBlood.setForeground(new java.awt.Color(255, 255, 255));
        LBlood.setText("Blood :");
        PRegPane3.add(LBlood);
        LBlood.setBounds(570, 210, 92, 32);
        PRegPane3.add(TName);
        TName.setBounds(200, 190, 282, 32);

        Ladd2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Ladd2.setForeground(new java.awt.Color(255, 255, 255));
        Ladd2.setText("Email :");
        PRegPane3.add(Ladd2);
        Ladd2.setBounds(570, 310, 89, 32);

        Ladd1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Ladd1.setForeground(new java.awt.Color(255, 255, 255));
        Ladd1.setText("Licence ID :");
        PRegPane3.add(Ladd1);
        Ladd1.setBounds(570, 260, 92, 32);
        PRegPane3.add(Tadd2);
        Tadd2.setBounds(700, 310, 256, 32);
        PRegPane3.add(Tadd1);
        Tadd1.setBounds(700, 260, 256, 32);
        PRegPane3.add(TPhone);
        TPhone.setBounds(200, 270, 282, 32);
        PRegPane3.add(Tadhaar);
        Tadhaar.setBounds(200, 320, 283, 32);

        RFemale.setFont(new java.awt.Font("Segoe UI", 0, 16));
        RFemale.setForeground(new java.awt.Color(255, 255, 255));
        RFemale.setText("Female");
        RFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFemaleActionPerformed(evt);
            }
        });
        PRegPane3.add(RFemale);
        RFemale.setBounds(800, 160, 98, 33);

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
        submit.setBounds(470, 540, 155, 45);

        LRegTitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36));
        LRegTitle.setForeground(new java.awt.Color(255, 255, 255));
        LRegTitle.setText("Doctor Registration Form");
        PRegPane3.add(LRegTitle);
        LRegTitle.setBounds(60, 40, 596, 54);

        C_Blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "O + ve", "O - ve", "A + ve", "A - ve", "B - ve", "B + ve", "AB - ve", "AB + ve" }));
        PRegPane3.add(C_Blood);
        C_Blood.setBounds(700, 210, 107, 30);
        PRegPane3.add(Tusrname);
        Tusrname.setBounds(200, 370, 282, 32);
        PRegPane3.add(Tadd3);
        Tadd3.setBounds(700, 360, 256, 32);
        PRegPane3.add(Tpasswd);
        Tpasswd.setBounds(200, 420, 282, 32);
        PRegPane3.add(Tadd4);
        Tadd4.setBounds(700, 410, 253, 32);

        Ladhaar.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Ladhaar.setForeground(new java.awt.Color(255, 255, 255));
        Ladhaar.setText("Aadhaar No. :");
        PRegPane3.add(Ladhaar);
        Ladhaar.setBounds(80, 330, 110, 30);

        Lusrname.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Lusrname.setForeground(new java.awt.Color(255, 255, 255));
        Lusrname.setText("Username :");
        PRegPane3.add(Lusrname);
        Lusrname.setBounds(70, 370, 92, 30);

        Lpasswd.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Lpasswd.setForeground(new java.awt.Color(255, 255, 255));
        Lpasswd.setText("Password :");
        PRegPane3.add(Lpasswd);
        Lpasswd.setBounds(70, 420, 92, 30);

        Ladd3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Ladd3.setForeground(new java.awt.Color(255, 255, 255));
        Ladd3.setText("Specilization :");
        PRegPane3.add(Ladd3);
        Ladd3.setBounds(570, 360, 109, 30);

        Ladd4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Ladd4.setForeground(new java.awt.Color(255, 255, 255));
        Ladd4.setText("Experience :");
        PRegPane3.add(Ladd4);
        Ladd4.setBounds(570, 410, 92, 30);

        terms.setFont(new java.awt.Font("Segoe UI", 1, 16));
        terms.setForeground(new java.awt.Color(255, 255, 255));
        terms.setText("Accept Terms & Conditions");
        PRegPane3.add(terms);
        terms.setBounds(413, 495, 230, 26);

        RMale.setFont(new java.awt.Font("Segoe UI", 0, 16));
        RMale.setForeground(new java.awt.Color(255, 255, 255));
        RMale.setSelected(true);
        RMale.setText("Male");
        PRegPane3.add(RMale);
        RMale.setBounds(700, 160, 88, 33);

        Lwarn.setFont(new java.awt.Font("Segoe UI", 0, 20));
        Lwarn.setForeground(new java.awt.Color(255, 0, 0));
        Lwarn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRegPane3.add(Lwarn);
        Lwarn.setBounds(315, 431, 397, 46);

        LPhone.setFont(new java.awt.Font("Segoe UI", 1, 14));
        LPhone.setForeground(new java.awt.Color(255, 255, 255));
        LPhone.setText("Phone No, :");
        PRegPane3.add(LPhone);
        LPhone.setBounds(80, 270, 92, 32);

        Limage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PRegPane3.add(Limage);
        Limage.setBounds(920, 30, 130, 150);

        BupImg.setText("Upload Image");
        BupImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupImgActionPerformed(evt);
            }
        });
        PRegPane3.add(BupImg);
        BupImg.setBounds(920, 220, 130, 23);

        jLabel3.setText("Size LessThan : (1MB)");
        PRegPane3.add(jLabel3);
        jLabel3.setBounds(920, 190, 130, 20);
        PRegPane3.add(dateChooser);
        dateChooser.setBounds(200, 230, 280, 30);
        dateChooser.setToolTipText("Select Date");

        PHome.addTab("", PRegPane3);

        PeditPane.setBackground(new java.awt.Color(0, 153, 204));
        PeditPane.setForeground(new java.awt.Color(0, 153, 204));
        PeditPane.setLayout(null);

        LEDtitle.setFont(new java.awt.Font("Segoe UI", 1, 36));
        LEDtitle.setForeground(new java.awt.Color(255, 255, 255));
        LEDtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEDtitle.setText("Edit Hospital Facilities");
        PeditPane.add(LEDtitle);
        LEDtitle.setBounds(330, 0, 380, 50);

        Lcanteen.setFont(new java.awt.Font("Segoe UI", 1, 18));
        Lcanteen.setForeground(new java.awt.Color(255, 255, 255));
        Lcanteen.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Lcanteen.setText("Canteen :");
        PeditPane.add(Lcanteen);
        Lcanteen.setBounds(90, 300, 130, 29);

        Lscan.setFont(new java.awt.Font("Segoe UI", 1, 18));
        Lscan.setForeground(new java.awt.Color(255, 255, 255));
        Lscan.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Lscan.setText("Scanners :");
        PeditPane.add(Lscan);
        Lscan.setBounds(510, 240, 155, 34);

        Loxy.setFont(new java.awt.Font("Segoe UI", 1, 18));
        Loxy.setForeground(new java.awt.Color(255, 255, 255));
        Loxy.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Loxy.setText("Oxygen Availability :");
        PeditPane.add(Loxy);
        Loxy.setBounds(40, 240, 190, 32);

        LbloodSt.setFont(new java.awt.Font("Segoe UI", 1, 18));
        LbloodSt.setForeground(new java.awt.Color(255, 255, 255));
        LbloodSt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LbloodSt.setText("Blood Stock :");
        PeditPane.add(LbloodSt);
        LbloodSt.setBounds(90, 190, 130, 31);
        PeditPane.add(Toxy);
        Toxy.setBounds(260, 240, 193, 31);
        PeditPane.add(TbloodSt);
        TbloodSt.setBounds(260, 190, 193, 31);
        PeditPane.add(Tamb);
        Tamb.setBounds(700, 190, 193, 31);

        Tscan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TscanActionPerformed(evt);
            }
        });
        PeditPane.add(Tscan);
        Tscan.setBounds(700, 250, 193, 31);

        Lpharm.setFont(new java.awt.Font("Segoe UI", 1, 18));
        Lpharm.setForeground(new java.awt.Color(255, 255, 255));
        Lpharm.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Lpharm.setText("Pharmacy :");
        PeditPane.add(Lpharm);
        Lpharm.setBounds(70, 350, 155, 34);

        Lamb.setFont(new java.awt.Font("Segoe UI", 1, 18));
        Lamb.setForeground(new java.awt.Color(255, 255, 255));
        Lamb.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Lamb.setText("Ambulance :");
        PeditPane.add(Lamb);
        Lamb.setBounds(510, 190, 155, 34);

        RcantN.setBackground(new java.awt.Color(0, 153, 204));
        RcantN.setFont(new java.awt.Font("Segoe UI", 0, 14));
        RcantN.setForeground(new java.awt.Color(255, 255, 255));
        RcantN.setText("No");
        PeditPane.add(RcantN);
        RcantN.setBounds(380, 300, 74, 25);

        Rcanty.setBackground(new java.awt.Color(0, 153, 204));
        Rcanty.setFont(new java.awt.Font("Segoe UI", 0, 14));
        Rcanty.setForeground(new java.awt.Color(255, 255, 255));
        Rcanty.setText("Yes");
        PeditPane.add(Rcanty);
        Rcanty.setBounds(260, 300, 74, 25);

        RpharmY.setBackground(new java.awt.Color(0, 153, 204));
        RpharmY.setFont(new java.awt.Font("Segoe UI", 0, 14));
        RpharmY.setForeground(new java.awt.Color(255, 255, 255));
        RpharmY.setText("Yes");
        PeditPane.add(RpharmY);
        RpharmY.setBounds(260, 350, 74, 25);

        RpharmN.setBackground(new java.awt.Color(0, 153, 204));
        RpharmN.setFont(new java.awt.Font("Segoe UI", 0, 14));
        RpharmN.setForeground(new java.awt.Color(255, 255, 255));
        RpharmN.setText("No");
        RpharmN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RpharmNActionPerformed(evt);
            }
        });
        PeditPane.add(RpharmN);
        RpharmN.setBounds(380, 350, 74, 25);

        Bedsubmit.setText("SUBMIT");
        Bedsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedsubmitActionPerformed(evt);
            }
        });
        PeditPane.add(Bedsubmit);
        Bedsubmit.setBounds(440, 580, 161, 42);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/edit.png")));
        PeditPane.add(jLabel2);
        jLabel2.setBounds(470, 60, 100, 100);

        Lroom.setFont(new java.awt.Font("Segoe UI", 1, 18));
        Lroom.setForeground(new java.awt.Color(255, 255, 255));
        Lroom.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Lroom.setText("Rooms Available :");
        PeditPane.add(Lroom);
        Lroom.setBounds(510, 290, 155, 34);

        Troom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TroomActionPerformed(evt);
            }
        });
        PeditPane.add(Troom);
        Troom.setBounds(700, 300, 193, 31);

        PHome.addTab("", PeditPane);

        PRegPane4.setBackground(new java.awt.Color(0, 153, 255));
        PRegPane4.setLayout(null);

        Lname1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Lname1.setForeground(new java.awt.Color(255, 255, 255));
        Lname1.setText("Name :");
        PRegPane4.add(Lname1);
        Lname1.setBounds(70, 200, 92, 33);

        LGender1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        LGender1.setForeground(new java.awt.Color(255, 255, 255));
        LGender1.setText("Gender :");
        PRegPane4.add(LGender1);
        LGender1.setBounds(570, 200, 86, 33);

        Ldob1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Ldob1.setForeground(new java.awt.Color(255, 255, 255));
        Ldob1.setText("D . O . B :");
        PRegPane4.add(Ldob1);
        Ldob1.setBounds(70, 240, 92, 22);

        LBlood1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        LBlood1.setForeground(new java.awt.Color(255, 255, 255));
        LBlood1.setText("Blood :");
        PRegPane4.add(LBlood1);
        LBlood1.setBounds(570, 240, 92, 32);
        PRegPane4.add(TName1);
        TName1.setBounds(200, 200, 282, 32);

        Ladd5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Ladd5.setForeground(new java.awt.Color(255, 255, 255));
        Ladd5.setText("Email :");
        PRegPane4.add(Ladd5);
        Ladd5.setBounds(570, 340, 89, 32);

        Lremark.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Lremark.setForeground(new java.awt.Color(255, 255, 255));
        Lremark.setText("Remark :");
        PRegPane4.add(Lremark);
        Lremark.setBounds(570, 440, 92, 32);
        PRegPane4.add(Temail);
        Temail.setBounds(700, 340, 256, 32);

        Tremark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TremarkActionPerformed(evt);
            }
        });
        PRegPane4.add(Tremark);
        Tremark.setBounds(700, 440, 256, 32);
        PRegPane4.add(TPhone1);
        TPhone1.setBounds(200, 290, 282, 32);
        PRegPane4.add(Tadhaar1);
        Tadhaar1.setBounds(200, 340, 283, 32);

        LRegTitle1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36));
        LRegTitle1.setForeground(new java.awt.Color(255, 255, 255));
        LRegTitle1.setText("My Profile");
        PRegPane4.add(LRegTitle1);
        LRegTitle1.setBounds(80, 50, 260, 54);
        PRegPane4.add(Tusrname1);
        Tusrname1.setBounds(200, 390, 282, 32);
        PRegPane4.add(Tspec);
        Tspec.setBounds(700, 390, 256, 32);
        PRegPane4.add(Tpasswd1);
        Tpasswd1.setBounds(200, 440, 282, 32);

        Ladhaar1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Ladhaar1.setForeground(new java.awt.Color(255, 255, 255));
        Ladhaar1.setText("Aadhaar No. :");
        PRegPane4.add(Ladhaar1);
        Ladhaar1.setBounds(70, 340, 110, 30);

        Lusrname1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Lusrname1.setForeground(new java.awt.Color(255, 255, 255));
        Lusrname1.setText("Username :");
        PRegPane4.add(Lusrname1);
        Lusrname1.setBounds(70, 390, 92, 30);

        Lpasswd1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Lpasswd1.setForeground(new java.awt.Color(255, 255, 255));
        Lpasswd1.setText("Password :");
        PRegPane4.add(Lpasswd1);
        Lpasswd1.setBounds(70, 440, 92, 30);

        Lspec.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Lspec.setForeground(new java.awt.Color(255, 255, 255));
        Lspec.setText("Specilization :");
        PRegPane4.add(Lspec);
        Lspec.setBounds(570, 390, 109, 30);

        Lwarn1.setFont(new java.awt.Font("Segoe UI", 0, 20));
        Lwarn1.setForeground(new java.awt.Color(255, 0, 0));
        Lwarn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRegPane4.add(Lwarn1);
        Lwarn1.setBounds(320, 500, 397, 46);

        LPhone1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        LPhone1.setForeground(new java.awt.Color(255, 255, 255));
        LPhone1.setText("Phone No, :");
        PRegPane4.add(LPhone1);
        LPhone1.setBounds(70, 290, 92, 32);

        Tdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tdate1ActionPerformed(evt);
            }
        });
        PRegPane4.add(Tdate1);
        Tdate1.setBounds(200, 250, 280, 30);
        PRegPane4.add(Tgender);
        Tgender.setBounds(700, 200, 80, 30);
        PRegPane4.add(Tblood);
        Tblood.setBounds(700, 240, 80, 30);

        Lexp.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Lexp.setForeground(new java.awt.Color(255, 255, 255));
        Lexp.setText("Experience :");
        PRegPane4.add(Lexp);
        Lexp.setBounds(570, 290, 92, 32);
        PRegPane4.add(Texp);
        Texp.setBounds(700, 290, 256, 32);

        Bupdate.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Bupdate.setForeground(new java.awt.Color(0, 102, 255));
        Bupdate.setText("Update");
        Bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupdateActionPerformed(evt);
            }
        });
        PRegPane4.add(Bupdate);
        Bupdate.setBounds(460, 560, 140, 40);

        Limage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PRegPane4.add(Limage1);
        Limage1.setBounds(920, 30, 130, 150);

        jLabel4.setText("Size LessThan : (1MB)");
        PRegPane4.add(jLabel4);
        jLabel4.setBounds(920, 190, 130, 20);

        BupImg2.setText("Upload Image");
        BupImg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupImg2ActionPerformed(evt);
            }
        });
        PRegPane4.add(BupImg2);
        BupImg2.setBounds(920, 220, 130, 23);

        PHome.addTab("", PRegPane4);
        PHome.setSelectedIndex(4);
        getContentPane().add(PHome);
        PHome.setBounds(352, 90, 1120, 680);

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

        BmyProfile.setBackground(new java.awt.Color(0, 204, 255));
        BmyProfile.setFont(new java.awt.Font("Segoe UI", 1, 18));
        BmyProfile.setForeground(new java.awt.Color(255, 255, 255));
        BmyProfile.setText("My Profile");
        BmyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmyProfileActionPerformed(evt);
            }
        });
        Pnavigation.add(BmyProfile);
        BmyProfile.setBounds(30, 438, 235, 41);

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

        Ltools.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24));
        Ltools.setForeground(new java.awt.Color(255, 255, 255));
        Ltools.setText("TOOLS");
        Ltools.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pnavigation.add(Ltools);
        Ltools.setBounds(103, 47, 117, 32);

        P_BorderPane.add(Pnavigation);
        Pnavigation.setBounds(10, 60, 300, 610);

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
        P_BorderPane.setBounds(20, 90, 320, 683);

        LBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/back.jpg")));
        LBackground.setText("jLabel1");
        getContentPane().add(LBackground);
        LBackground.setBounds(-10, -20, 1770, 800);

        pack();
    }
     private boolean validatePhone(){
        String val = TPhone.getText().toString().trim();
        String validation = "^[0-9]{10}$";
        if(!val.matches(validation)){
                JOptionPane.showMessageDialog(this, "Only 10 digits number is valid!", "PhoneNo Error", HEIGHT);
                return false;
        }
        else if(val.isEmpty()){
            JOptionPane.showMessageDialog(this, "Field can't be empty", "PhoneNo Error", HEIGHT);
            return false;
        }
        else
        {
            return true;
        }
    }
    private boolean validatePassword(){
        String val = Tpasswd.getText().toString().trim();
        String validation = "[a-zA-Z0-9]+[@#$%^&0-9]+[a-zA-Z0-9]+";
        if(val.isEmpty()){
            JOptionPane.showMessageDialog(this, "Field can't be empty", "PasswordError", HEIGHT);
            return false;
        }
        else if(!val.matches(validation)){
            JOptionPane.showMessageDialog(this, "Invalid Format", "PasswordError", HEIGHT);
            return false;
        }
        else{
            return true;
        }
    }

    private boolean validateName(){
        String val = TName.getText().toString().trim();
        if(val.isEmpty()){
            JOptionPane.showMessageDialog(this, "Field can't be empty", "NameError", HEIGHT);
            return false;
        }
        else{
             return true;
        }
    }

    private void BaddInfoActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getActionCommand()=="addInfo"){
            PHome.setSelectedIndex(2);
            BaddInfo.setText("Add Doctor");
            BaddInfo.setActionCommand("addDoc");
            BdispInfo.setText("Add Nurse");
            BdispInfo.setActionCommand("addnurse");
            Bsearch.setText("Add Patient");
            Bsearch.setActionCommand("addPat");
            Tspec.setVisible(false);
            Tremark.setVisible(false);
            Lspec.setVisible(false);
            Lremark.setVisible(false);            
        }
        else if (evt.getActionCommand()=="addDoc"){
            LRegTitle.setText("Doctor Registration Form :");
            submit.setActionCommand("Dsubmit");
            Ladd1.setText("License Id :");
            Ladd3.setText("Specilization :");
            Ladd2.setText("Email :");
            Ladd4.setText("Experience :");
        }
        else if(evt.getActionCommand()=="dispDoc"  ){
            LdispTitle.setText("Doctor Details");
            String query="SELECT name,Specilization,Rank,Gender,DOB FROM `doctor`;";
            ResultSet rs = null;
            DefaultTableModel tbl=(DefaultTableModel) Disptable.getModel();
            tbl.setRowCount(0);
            try {
                stmt = con.createStatement();
                Ptable.setVisible(true);
                Disptable.setVisible(true);
                rs = stmt.executeQuery(query);
                ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
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
                
                if(tbl.getRowCount()*50<535){
                    Ptable.setBounds(49, 87, 995,(tbl.getRowCount()*50)+25);
                }
                 else{
                      Ptable.setBounds(49, 87, 995,540);
                 }
            }
            catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }          
        }
        else if(evt.getActionCommand()=="searchDoc"){
            LsearchTitle.setText("Search Doctor Details :");
            LsearchId.setText("Doctor Id :");
            TsearchId1.setText("");
             Psearch.setVisible(false);
            BsearchId.setActionCommand("searchDoc");
            
        }
        else if(evt.getActionCommand()=="editDoc"){
            LsearchTitle.setText("Edit Doctor Details :");
            LsearchId.setText("Doctor Id :");
            TsearchId1.setText("");
             Psearch.setVisible(false);
            Bdelete.setActionCommand("delDoc");
             Bedit.setActionCommand("editDoc");
            BsearchId.setActionCommand("searchDoc");
          
        }
    }

    private void BdispInfoActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getActionCommand()=="addnurse"){
            LRegTitle.setText("Nurse Registration Form :");
            submit.setActionCommand("Nsubmit");
            Ladd1.setText("Remark :");
            Ladd3.setText("Specilization :");
            Ladd2.setText("Email :");
            Ladd4.setText("Experience :");
        }
        else if(evt.getActionCommand()=="dispInfo"){
            PHome.setSelectedIndex(1);
            Ptable.setVisible(false);
            LsearchTitle.setText("Edit Doctor Details :");
            LsearchId.setText("Doctor Id :");  
            BaddInfo.setText("Display Doctor");
            BaddInfo.setActionCommand("dispDoc");
            BdispInfo.setText("Display Nurse");
            BdispInfo.setActionCommand("dispnurse");
            Bsearch.setText("Display Patient");
            Bsearch.setActionCommand("dispPat");
            
        }
        else if(evt.getActionCommand()=="dispnurse" ){
            LdispTitle.setText("Nurse Details");
            String query="SELECT name,Specialization,Rank,Gender,DOB FROM `nurse`;";
            ResultSet rs;
            DefaultTableModel tbl=(DefaultTableModel) Disptable.getModel();
            tbl.setRowCount(0);
            try {
                stmt = con.createStatement();
                Ptable.setVisible(true);
                Disptable.setVisible(true);
                rs = stmt.executeQuery(query);
                ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
                tbl.getDataVector().removeAllElements();
                
                    String name,gender,dob,special;
                    Integer rank;
                    while(rs.next()){
                        name =rs.getString("Name");
                        special=rs.getString("Specialization");
                        rank=rs.getInt("Rank");
                        gender=rs.getString("Gender");
                        dob=rs.getString("DOB");
                        
                        String [] rowData={name,special,rank.toString(),gender,dob};
                        tbl.addRow(rowData);
                    }
                
                 if(tbl.getRowCount()*50<535){
                    Ptable.setBounds(49, 87, 995,(tbl.getRowCount()*50)+25);
                }
                  else{
                      Ptable.setBounds(49, 87, 995,540);
                 }
            }
            catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }                      
        }
        else if(evt.getActionCommand()=="searchnurse"){
            LsearchTitle.setText("Search Nurse Details :");
            LsearchId.setText("Nurse Id :");
            TsearchId1.setText("");
             Psearch.setVisible(false);
            BsearchId.setActionCommand("searchnurse");
            
        }
        else if(evt.getActionCommand()=="editNurse"){
            LsearchTitle.setText("Edit Nurse Details :");
            LsearchId.setText("Nurse Id :");
            TsearchId1.setText("");
            Psearch.setVisible(false);
            Bedit.setActionCommand("editNurse");
            BsearchId.setActionCommand("searchnurse");
            Bdelete.setActionCommand("delNurse");            
        }
        
    }

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getActionCommand()=="searchInfo"){
            PHome.setSelectedIndex(0);
            Psearch.setVisible(false);
            Bedit.setVisible(false);
            Bdelete.setVisible(false);
            BaddInfo.setText("Search Doctor");
            BaddInfo.setActionCommand("searchDoc");
            LsearchTitle.setText("Search Doctor Details :");
            LsearchId.setText("Doctor Id :");
            BsearchId.setActionCommand("searchDoc");
            BdispInfo.setText("Search Nurse");
            BdispInfo.setActionCommand("searchnurse");
            Bsearch.setText("Search Patient");
            Bsearch.setActionCommand("searchPat");
        }
        else if(evt.getActionCommand()=="addPat"){
            LRegTitle.setText("Patient Registration Form :");
            submit.setActionCommand("Patsubmit");
            Ladd1.setText("Temperature :");
            Ladd3.setText("Disease :");
            Ladd2.setText("Height :");
            Ladd4.setText("Weight :");
        }
        else if(evt.getActionCommand()=="dispPat" ){
            LdispTitle.setText("Patient Details");
          String query="SELECT OP_name,Disease,Gender,DOB FROM `patient_out`;";
            ResultSet rs = null;
            DefaultTableModel tbl=(DefaultTableModel) Disptable.getModel();
            tbl.setRowCount(0);
            
            try {
                stmt = con.createStatement();
                Ptable.setVisible(true);
                Disptable.setVisible(true);
                rs = stmt.executeQuery(query);
                ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
                
                    
                    String name,gender,dob,dis;
                    Integer rank;
                    while(rs.next()){
                        name =rs.getString("OP_name");
                        dis=rs.getString("disease");
                        
                        gender=rs.getString("Gender");
                        dob=rs.getString("DOB");
                        
                        String [] rowData={name,dis,gender,dob};
                        tbl.addRow(rowData);
                    }
                
                 if(tbl.getRowCount()*50<535){
                    Ptable.setBounds(49, 87, 995,(tbl.getRowCount()*50)+25);
                }
                  else{
                      Ptable.setBounds(49, 87, 995,540);
                 }
            }
            catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }             
        }
        else if(evt.getActionCommand()=="searchPat"){
            LsearchTitle.setText("Search Patient Details :");
            LsearchId.setText("Patient Id :");
            TsearchId1.setText("");
             Psearch.setVisible(false);
            BsearchId.setActionCommand("searchPat");
            
        }
        else if(evt.getActionCommand()=="editPat"){
            LsearchTitle.setText("Edit Patient Details :");
            LsearchId.setText("Patient Name :");
            TsearchId1.setText("");
             Psearch.setVisible(false);
             Bedit.setActionCommand("editPat");
             Bdelete.setActionCommand("delPat");
            BsearchId.setActionCommand("searchPat");
        }
    }

    private void BeditInfoActionPerformed(java.awt.event.ActionEvent evt) {       
        if(evt.getActionCommand()=="editInfo"){
            LsearchTitle.setText("Edit Doctor Details :");
            LsearchId.setText("Doctor Id :");
            PHome.setSelectedIndex(0);
            Bedit.setVisible(true);
            Bdelete.setVisible(true);
            Psearch.setVisible(false);
            TsearchId1.setText("");
             Bedit.setActionCommand("editDoc");
            BaddInfo.setText("Edit Doctor");
            BaddInfo.setActionCommand("editDoc");
            BdispInfo.setText("Edit Nurse");
            BdispInfo.setActionCommand("editNurse");
            Bsearch.setText("Edit Patient");
           // terms.setVisible(false);
            Bsearch.setActionCommand("editPat");
            BeditInfo.setText("Edit Facility");
            BeditInfo.setActionCommand("EditFac");
            Bedit.setVisible(true);
            Bdelete.setVisible(true);
        }
        else if(evt.getActionCommand()=="EditFac"){
            PHome.setSelectedIndex(3);
            Bedsubmit.setText("Edit");
         String query="SELECT * FROM `Facility`;";
        try {

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Boolean cant,pharm;
            if(rs.next()){
              
                TbloodSt.setText(Integer.valueOf(rs.getInt("Bloodstock")).toString());
                 Toxy.setText(Integer.valueOf(rs.getInt("oxygen")).toString());
                cant=rs.getBoolean("Canteen");
                if(cant){
                    Rcanty.setSelected(true);
                }
                 pharm=rs.getBoolean("pharmacy");
                  if(cant){
                    RpharmY.setSelected(true);
                }
                 
                Tamb.setText(Integer.valueOf(rs.getInt("ambulance")).toString());
                Tscan.setText(Integer.valueOf(rs.getInt("scanning")).toString());
                Troom.setText(Integer.valueOf(rs.getInt("Rooms")).toString());
               
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        }
    }

    private void B_LogoutActionPerformed(java.awt.event.ActionEvent evt) {
        LoginForm l=new LoginForm();
        l.generateCaptcha();
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
        l.setVisible(true);
    }

    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {
        PHome.setSelectedIndex(4);
        LRegTitle.setText("Doctor registration Form :");
        BaddInfo.setText("Add Information");
        BaddInfo.setActionCommand("addInfo");
        BdispInfo.setText("Diplay Info");
        BdispInfo.setActionCommand("dispInfo");
        Bsearch.setText("Search Details");
        Bsearch.setActionCommand("searchInfo");
        BeditInfo.setText("Edit Information");
        BeditInfo.setActionCommand("editInfo");

    }

    private void submitsubmitActionPerformed(java.awt.event.ActionEvent evt) {
       if(terms.isSelected()){
            if((validateName())&& (validatePhone()) && !(Tadhaar.getText().
                    equals("")) && !(Tusrname.getText().equals(""))&& (validatePassword()) && 
                    !(Tadd1.getText().equals("")) && !(Tadd2.getText().equals("")) && !(Tadd3.getText()
                    .equals("")) && !(Tadd4.getText().equals(""))&&BupImg.getActionCommand()=="success" ){
                if(evt.getActionCommand()=="Dsubmit"){
                    try 
                    {
                        
                        String name=TName.getText();
                        String spec =Tadd3.getText();
                        Integer rank=Integer.parseInt(Tadd4.getText());
                        Long phone=Long.parseLong(TPhone.getText());
                        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
                        boolean avail=true;
                        String pass=Tpasswd.getText();
                        Long ad=Long.parseLong(Tadhaar.getText());
                        String blood=(String) C_Blood.getSelectedItem();
                        String user=Tusrname.getText();
                        Integer lic=Integer.parseInt(Tadd1.getText());
                        String email=Tadd2.getText();
                        String gen="";
                        if(RMale.isSelected())
                        {
                            gen="Male";
                        }
                        else{
                            gen="Female";
                        }
                        String insertQuery = "INSERT INTO doctor(Name,Specilization,Rank,Phone,DOB,Available,Password,Aadhaar_No,Blood,Username,LICid,email,Gender,image) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
                        try (PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) 
                        {
                            preparedStatement.setString(1, name);
                            preparedStatement.setString(2, spec);
                            preparedStatement.setInt(3, rank);
                            preparedStatement.setString(4, phone.toString());
                            preparedStatement.setString(5, dob);
                            preparedStatement.setBoolean(6, avail);
                            preparedStatement.setString(7, pass);
                            preparedStatement.setString(8, ad.toString());
                            preparedStatement.setString(9, blood);
                            preparedStatement.setString(10, user);
                            preparedStatement.setInt(11, lic);
                            preparedStatement.setString(12, email);
                            preparedStatement.setString(13, gen);
                            preparedStatement.setBinaryStream(14, input, (int) imageFile.length());
                            preparedStatement.executeUpdate();
                            
                        }
                    }
                    catch (SQLException e) 
                    {
                        e.printStackTrace();
                        Lwarn.setText("*** Invalid Data And Image Entered ***");
                        Lwarn.setForeground(Color.red);
                    }
                    BupImg.setActionCommand("unsuccess");
                    Lwarn.setText("*** Registration Successfull ***");
                    Lwarn.setForeground(Color.green);
                }
                else if(evt.getActionCommand()=="Nsubmit"){
                     try{
            
                        String name=TName.getText();                                                            
                        String spec =Tadd1.getText();                                                           
                        Integer exp=Integer.parseInt(Tadd4.getText());                                        
                        Integer phone=Integer.parseInt(TPhone.getText());                                     
                        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();        
                        boolean avail=true;                                                                     
                        String pass=Tpasswd.getText();                                                          
                        Long ad=Long.parseLong(Tadhaar.getText());                                              
                        String blood=(String) C_Blood.getSelectedItem();                                        
                        String user=Tusrname.getText();                                                         
                        String remark=Tadd3.getText();
                        String email=Tadd2.getText();
                        String gen="";
                        if(RMale.isSelected()){
                            gen="Male";
                        }
                        else{
                            gen="Female";
                        }
                        String insertQuery = "INSERT INTO Nurse(Name,Specialization,experience,PhoneNo,DOB,Availability,Password,AadhaarNo,Blood,Username,remark,email,Gender,image) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
                        try (PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) 
                        {
                            preparedStatement.setString(1, name);
                            preparedStatement.setString(2, spec);
                            preparedStatement.setInt(3, exp);
                            preparedStatement.setInt(4, phone);
                            preparedStatement.setString(5,  dob);
                            preparedStatement.setBoolean(6, avail);
                            preparedStatement.setString(7, pass);
                            preparedStatement.setLong(8, ad);
                            preparedStatement.setString(9, blood);
                            preparedStatement.setString(10, user);
                            preparedStatement.setString(11, remark);
                            preparedStatement.setString(12, email);
                            preparedStatement.setString(13, gen);
                            preparedStatement.setBinaryStream(14, input, (int) imageFile.length());
                            preparedStatement.executeUpdate();
                        }
                    }
                    catch (SQLException e) 
                    {
                       e.printStackTrace();
                        Lwarn.setText("*** Invalid Data Entered ***");
                        Lwarn.setForeground(Color.red);
                    }
                     Lwarn.setText("*** Registration Successfull ***");
                     Lwarn.setForeground(Color.green);
                     TName.setText("");
                     Tusrname.setText("");
                     Tadd3.setText("");
                     Tpasswd.setText("");
                     TPhone.setText("");
                     Tadd1.setText("");
                     Tadhaar.setText("");
                     Tadd2.setText("");
                     Tadd4.setText("");
                }           
                else if (evt.getActionCommand()=="Patsubmit"){                                 
                     try {
                        String name=TName.getText();
                        
                        Integer temp =Integer.parseInt(Tadd1.getText());
                        Integer wght=Integer.parseInt(Tadd4.getText());
                        Integer phone=Integer.parseInt(TPhone.getText());
                        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();;
                        boolean avail=true;
                        String pass=Tpasswd.getText();
                        Long ad=Long.parseLong(Tadhaar.getText());
                        String blood=(String) C_Blood.getSelectedItem();
                        String user=Tusrname.getText();
                        String disease=Tadd3.getText();
                        Integer hgt=Integer.parseInt(Tadd2.getText());
                        String gen="";
                        String dov=LocalDate.now().toString();
                        if(RMale.isSelected()){
                            gen="Male";
                        }
                        else{
                            gen="Female";
                        }
                        String insertQuery = "INSERT INTO patient_OUT(OP_Name,temperature,height,Phone,DOB,weight,Password,Aadhaar_No,blood,Username,Gender,disease,DOV,image) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
                        try {
                            PreparedStatement preparedStatement = con.prepareStatement(insertQuery);
                            preparedStatement.setString(1, name);
                            preparedStatement.setInt(2, temp);
                            preparedStatement.setInt(3, hgt);
                            preparedStatement.setInt(4, phone);
                            preparedStatement.setString(5,  dob);
                            preparedStatement.setInt(6, wght);
                            preparedStatement.setString(7, pass);
                            preparedStatement.setLong(8, ad);
                            preparedStatement.setString(9, blood);
                            preparedStatement.setString(10, user);
                            preparedStatement.setString(11, gen);
                            preparedStatement.setString(12, disease);
                            preparedStatement.setString(13, dov);
                            preparedStatement.setBinaryStream(14, input, (int) imageFile.length());
                            preparedStatement.executeUpdate();             
                        }     
                    }
                    catch (SQLException e) 
                    {
                       e.printStackTrace();
                        Lwarn.setText("*** Invalid Data Entered ***");
                        Lwarn.setForeground(Color.red);
                    }
                    Lwarn.setText("*** Registration Successfull ***");
                    Lwarn.setForeground(Color.green);
                } 
                else{
                    System.out.println("Something went Wrong");
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

    private void BedsubmitActionPerformed(java.awt.event.ActionEvent evt) {
        Integer canteen,pharm;
       if(Rcanty.isSelected()){
           canteen=1;
       }
       else{
           canteen =0;
       }
       if(RpharmY.isSelected()){
           pharm=1;
       }
       else{
           pharm =0;
       }
       String query= "UPDATE `facility` SET `Bloodstock`='"+TbloodSt.getText()+"',`oxygen`='"+Toxy.getText()
           +"',`canteen`='"+canteen+"',`pharmacy`='"+pharm+"',`Ambulance`='"+Tamb.getText()+"',`Scanning`='"+Tscan.getText()+"',`Rooms`='"+Troom.getText()+"' ;";
       try {

            stmt = con.createStatement();
            int x = stmt.executeUpdate(query);
            if(x==1)
            {
                System.out.println("Success");
            }
            else
            {
                  System.out.println("Unsuccessfull");
            }
       }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void BmyProfileActionPerformed(java.awt.event.ActionEvent evt) {
        PHome.setSelectedIndex(4);
        PRegPane4.setBounds(390, 90, 1090, 680);
        PRegPane4.setVisible(true);
        String query="SELECT * FROM `Admin` WHERE Id="+AdminId+";";
        try {

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.first()){
                TName1.setText(rs.getString("Name"));
                Tdate1.setText(rs.getDate("DOB").toString());
                TPhone1.setText(Integer.valueOf(rs.getInt("Phone")).toString());
                Tadhaar1.setText(Integer.valueOf(rs.getInt("AadhaarNo")).toString());
                Tusrname1.setText(rs.getString("Username"));
                Tpasswd1.setText(rs.getString("Password"));
                Tgender.setText(rs.getString("Gender"));
                Texp.setText(Integer.valueOf(rs.getInt("experience")).toString());
                Tblood.setText(rs.getString("blood"));
                Temail.setText(rs.getString("email"));
                Tspec.setVisible(false);
                Tremark.setVisible(false);
                Lspec.setVisible(false);
                Lremark.setVisible(false);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        int x=JOptionPane.showConfirmDialog(null,"Do you Want to Exit ?","Confirmation",JOptionPane.YES_NO_OPTION);
        if(x==0){
            System.exit(0);
        }
        else {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.print(ex.getClass());
            }
            
         }
    }
    
    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println(evt.getActionCommand());
        if(evt.getActionCommand()=="editDoc" && Lsearchwarn.getText()!="!!! Not Found !!!!"){
            PHome.setSelectedIndex(4);
            Bupdate.setVisible(true);
            Bupdate.setActionCommand("updateDoc");
            LRegTitle1.setText("Doctor Profile : ");
            String DocName=TsearchId1.getText();

            String query="SELECT * FROM `Doctor` WHERE Name='"+DocName+"';";
            try {

                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                if(rs.next()){
                    Lremark.setText("LIC Id :");
                    TName1.setText(rs.getString("Name"));
                    Tdate1.setText(rs.getString("DOB"));
                    TPhone1.setText(Integer.valueOf(rs.getInt("Phone")).toString());
                    Tadhaar1.setText(Integer.valueOf(rs.getInt("Aadhaar_No")).toString());
                    Tusrname1.setText(rs.getString("Username"));
                    Tpasswd1.setText(rs.getString("Password"));
                    Tgender.setText(rs.getString("gender"));
                    Tremark.setText(Integer.valueOf(rs.getInt("LICid")).toString());
                    Tblood.setText(rs.getString("Blood"));
                    Temail.setText(rs.getString("email"));
                    Tspec.setText(rs.getString("specilization"));
                    Texp.setText(Integer.valueOf(rs.getInt("experience")).toString());
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        else if(evt.getActionCommand()=="editNurse" && Lsearchwarn.getText()!="!!! Not Found !!!!"){
            PHome.setSelectedIndex(4);
            Bupdate.setVisible(true);
            Bupdate.setActionCommand("updateNurse");
            LRegTitle1.setText("Nurse Profile : ");
            String NurseName=TsearchId1.getText();

            String query="SELECT * FROM `Nurse` WHERE Name='"+NurseName+"';";
            try {

                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                if(rs.next()){
                    TName1.setText(rs.getString("Name"));
                    Tdate1.setText(rs.getDate("DOB").toString());
                    TPhone1.setText(Integer.valueOf(rs.getInt("PhoneNo")).toString());
                    Tadhaar1.setText(Long.valueOf(rs.getLong("AadhaarNo")).toString());
                    Tusrname1.setText(rs.getString("Username"));
                    Tpasswd1.setText(rs.getString("Password"));
                    Tgender.setText(rs.getString("Gender"));
                    Tblood.setText(rs.getString("Blood"));
                    String Gender=rs.getString("Gender");
                    if(Gender.equals("Male")){
                        RMale.setSelected(true);
                    }
                    else{
                        RFemale.setSelected(true);
                    }
                    Tremark.setText(rs.getString("Remark"));
                    C_Blood.setSelectedItem(rs.getString("blood"));
                    Temail.setText(rs.getString("email"));
                    Tspec.setText(rs.getString("specialization"));
                    Texp.setText(Integer.valueOf(rs.getInt("experience")).toString());
                }
            }

            catch(Exception ex){
                ex.printStackTrace();
            }

        }
        else if(evt.getActionCommand()=="editPat" && Lsearchwarn.getText()!="!!! Not Found !!!!"){
            PHome.setSelectedIndex(4);
            Bupdate.setVisible(true);

            Bupdate.setActionCommand("updatePat");
            LRegTitle1.setText("Patient Profile : ");
            String PatName=TsearchId1.getText();

            String query="SELECT * FROM `patient_OUT` WHERE OP_Name='"+PatName+"';";
            try {

                stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                if(rs.next()){
                    TName1.setText(rs.getString("OP_Name"));
                    Tdate1.setText(rs.getDate("DOB").toString());
                    TPhone1.setText(Integer.valueOf(rs.getInt("Phone")).toString());
                    Tadhaar1.setText(Integer.valueOf(rs.getInt("Aadhaar_No")).toString());
                    Tusrname1.setText(rs.getString("Username"));
                    Tpasswd1.setText(rs.getString("Password"));
                    Tgender.setText(rs.getString("Gender"));
                    Tblood.setText(rs.getString("Blood"));
                    String Gender=rs.getString("Gender");
                    if(Gender.equals("Male")){
                        RMale.setSelected(true);
                    }
                    else{
                        RFemale.setSelected(true);
                    }
                    Tremark.setText(Integer.valueOf(rs.getInt("height")).toString());
                    C_Blood.setSelectedItem(rs.getString("blood"));
                    Temail.setText(Integer.valueOf(rs.getInt("weight")).toString());
                    Tspec.setText(rs.getString("disease"));
                    Texp.setText(Integer.valueOf(rs.getInt("temperature")).toString());
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }

    private void BsearchIdActionPerformed(java.awt.event.ActionEvent evt) {
        BsearchId.setMnemonic('S');

        if(evt.getActionCommand()=="searchDoc"){
            String query="SELECT Name,Gender,Rank,DOB FROM `doctor` WHERE Name = '"+TsearchId1.getText()+"';";

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
                    Psearch.setVisible(true);
                    Bupdate.setActionCommand("UpdateDoc");
                }
                else{
                    Psearch.setVisible(false);
                    Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                Lsearchwarn.setText("!!! Not Found !!!!");
            }
        }
        else if(evt.getActionCommand()=="searchnurse"){
            String query="SELECT Name,Gender,Rank,DOB FROM `nurse` WHERE Name = '"+TsearchId1.getText()+"';";

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
                    Psearch.setVisible(true);
                    Bupdate.setActionCommand("UpdateNurse");
                }
                else{
                    Psearch.setVisible(false);
                    Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                Lsearchwarn.setText("!!! Not Found !!!!");
            }
        }
        else if(evt.getActionCommand()=="searchPat"){
            String query="SELECT OP_Name,Gender,PatientID,DOB FROM patient_OUT WHERE OP_Name = '"+TsearchId1.getText()+"';";
            System.out.print("qwertyu");
            ResultSet rs = null;
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.first()){
                    searchTbl.setValueAt(rs.getString("OP_Name"), 0, 0);
                    searchTbl.setValueAt(rs.getString("Gender"), 0, 1);
                    searchTbl.setValueAt(rs.getInt("PatientID"), 0, 2);
                    searchTbl.setValueAt(rs.getString("DOB"), 0, 3);
                    Lsearchwarn.setText("");
                    Psearch.setVisible(true);
                }
                else{
                    Psearch.setVisible(false);
                    Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                Lsearchwarn.setText("!!! Not Found !!!!");
            }

        }
    }
    
    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {
          if(evt.getActionCommand()=="delDoc" && Lsearchwarn.getText()!="!!! Not Found !!!!")
          {
               String query="DELETE FROM `doctor` WHERE Name= '"+TsearchId1.getText()+"';";
                try {
                    stmt = con.createStatement();
                    int x = stmt.executeUpdate(query);
                    if(x==1){
                        Lsearchwarn.setForeground(Color.green);
                        Lsearchwarn.setText("** Successfully Deleted **");
                        
                    }
                    else{
                        Lsearchwarn.setForeground(Color.red);
                        Lsearchwarn.setText("!!! Not Found !!!!");
                        
                    }
                }
                catch(SQLException ex)
                {
                    ex.printStackTrace();
                       Lsearchwarn.setForeground(Color.red);
                    Lsearchwarn.setText("!!! Error!!!!");
                 
                }
          }
          else if(evt.getActionCommand()=="delNurse" && Lsearchwarn.getText()!="!!! Not Found !!!!")
          {
               String query="DELETE FROM `Nurse` WHERE Name= '"+TsearchId1.getText()+"';";
                try {
                    stmt = con.createStatement();
                    int x = stmt.executeUpdate(query);
                    if(x==1){
                        Lsearchwarn.setForeground(Color.green);
                        Lsearchwarn.setText("** Successfully Deleted **");
                        Lsearchwarn.setForeground(Color.green);
                    }
                    else{
                        Lsearchwarn.setForeground(Color.red);
                        Lsearchwarn.setText("!!! Not Found !!!!");
                      
                    }
                }
                catch(SQLException ex)
                {
                    ex.printStackTrace();
                    Lsearchwarn.setForeground(Color.red);
                    Lsearchwarn.setText("!!! Error!!!!");
              
                }
          
              
          }
          else if(evt.getActionCommand()=="delPat" && Lsearchwarn.getText()!="!!! Not Found !!!!")
          {
               String query="DELETE FROM `patient_OUT` WHERE OP_Name= '"+TsearchId1.getText()+"';";
                try {
                    stmt = con.createStatement();
                    int x = stmt.executeUpdate(query);
                    if(x==1){
                        Lsearchwarn.setForeground(Color.green);
                        Lsearchwarn.setText("** Successfully Deleted **");
                    }
                    else{
                        Lsearchwarn.setForeground(Color.red);
                        Lsearchwarn.setText("!!! Not Found !!!!");
                        
                    }
                }
                catch(SQLException ex)
                {
                    ex.printStackTrace();
                    Lsearchwarn.setForeground(Color.red);
                    Lsearchwarn.setText("!!! Error!!!!");
                    
                }          
          }     
    }

    private void BupImgActionPerformed(java.awt.event.ActionEvent evt) {
         JFileChooser fileChooser = new JFileChooser();
         BupImg.setActionCommand("unsuccess");
        int returnValue = fileChooser.showOpenDialog(null);
      
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imageFile=new File(selectedFile.getPath());
        if(imageFile.length()< 1048576){    
        try {
            input=new FileInputStream(imageFile);
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            Image image = imageIcon.getImage().getScaledInstance(Limage.getWidth(), Limage.getHeight(), Image.SCALE_DEFAULT);    
            Limage.setIcon(new ImageIcon(image));
            Limage.setVisible(true); 
            BupImg.setActionCommand("success");
        }
        catch(Exception ex)
                {
                    ex.printStackTrace();
                }
        }
         else{
                    JOptionPane.showMessageDialog(null, "Image SiZe too Large", "Upload Image", JOptionPane.WARNING_MESSAGE);
                }
        }       
    }
    private void BupImg2ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        BupImg.setActionCommand("unsuccess");
        int returnValue = fileChooser.showOpenDialog(null);
      
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imageFile=new File(selectedFile.getPath());
            if(imageFile.length()< 1048576){    
                try {
                    input=new FileInputStream(imageFile);
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                    Image image = imageIcon.getImage().getScaledInstance(Limage.getWidth(), Limage.getHeight(), Image.SCALE_DEFAULT);    
                    Limage1.setIcon(new ImageIcon(image));
                    Limage1.setVisible(true); 
                    BupImg.setActionCommand("success");
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }
             else{
                JOptionPane.showMessageDialog(null, "Image SiZe too Large", "Upload Image", JOptionPane.WARNING_MESSAGE);
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
        Registration u=new Registration(100000,"Gopal");
        u.getContentPane().setBackground(Color.white);
        u.setExtendedState(JFrame.MAXIMIZED_BOTH);
        u.setVisible(true);
    }
    
    Connection con;
    java.sql.Statement stmt;
    private javax.swing.ButtonGroup BGcanteen;
    private javax.swing.ButtonGroup BGpharm;
    private javax.swing.JButton B_Logout;
    private javax.swing.JButton BaddInfo;
    private javax.swing.JButton Bback;
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton BdispInfo;
    private javax.swing.JButton Bedit;
    private javax.swing.JButton BeditInfo;
    private javax.swing.JButton Bedsubmit;
    private javax.swing.JButton BmyProfile;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton BsearchId;
    private javax.swing.JButton BupImg;
    private javax.swing.JButton BupImg2;
    private javax.swing.JButton Bupdate;
    private javax.swing.JComboBox<String> C_Blood;
    private javax.swing.JTable Disptable;
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JLabel LBackground;
    private javax.swing.JLabel LBlood;
    private javax.swing.JLabel LBlood1;
    private javax.swing.JLabel LEDtitle;
    private javax.swing.JLabel LGender;
    private javax.swing.JLabel LGender1;
    private javax.swing.JLabel LPhone;
    private javax.swing.JLabel LPhone1;
    private javax.swing.JLabel LRegTitle;
    private javax.swing.JLabel LRegTitle1;
    private javax.swing.JLabel Ladd1;
    private javax.swing.JLabel Ladd2;
    private javax.swing.JLabel Ladd3;
    private javax.swing.JLabel Ladd4;
    private javax.swing.JLabel Ladd5;
    private javax.swing.JLabel Ladhaar;
    private javax.swing.JLabel Ladhaar1;
    private javax.swing.JLabel Lamb;
    private javax.swing.JLabel LbloodSt;
    private javax.swing.JLabel Lcanteen;
    private javax.swing.JLabel LdispTitle;
    private javax.swing.JLabel Ldob;
    private javax.swing.JLabel Ldob1;
    private javax.swing.JLabel Lexp;
    private javax.swing.JLabel Limage;
    private javax.swing.JLabel Limage1;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Lname1;
    private javax.swing.JLabel Loxy;
    private javax.swing.JLabel Lpasswd;
    private javax.swing.JLabel Lpasswd1;
    private javax.swing.JLabel Lpharm;
    private javax.swing.JLabel Lremark;
    private javax.swing.JLabel Lroom;
    private javax.swing.JLabel Lscan;
    private javax.swing.JLabel LsearchId;
    private javax.swing.JLabel LsearchTitle;
    private javax.swing.JLabel Lsearchwarn;
    private javax.swing.JLabel Lspec;
    private javax.swing.JLabel Ltools;
    private javax.swing.JLabel Lusrname;
    private javax.swing.JLabel Lusrname1;
    private javax.swing.JLabel Lwarn;
    private javax.swing.JLabel Lwarn1;
    private javax.swing.JPanel PDisplay;
    private javax.swing.JTabbedPane PHome;
    private javax.swing.JPanel PRegPane3;
    private javax.swing.JPanel PRegPane4;
    private javax.swing.JPanel P_BorderPane;
    private javax.swing.JPanel PeditPane;
    private javax.swing.JPanel Pnavigation;
    private javax.swing.JScrollPane Psearch;
    private javax.swing.JPanel PsearchPane;
    private javax.swing.JScrollPane Ptable;
    private javax.swing.JRadioButton RFemale;
    private javax.swing.JRadioButton RMale;
    private javax.swing.JRadioButton RcantN;
    private javax.swing.JRadioButton Rcanty;
    private javax.swing.JRadioButton RpharmN;
    private javax.swing.JRadioButton RpharmY;
    private javax.swing.JTextField TName;
    private javax.swing.JTextField TName1;
    private javax.swing.JTextField TPhone;
    private javax.swing.JTextField TPhone1;
    private javax.swing.JTextField Tadd1;
    private javax.swing.JTextField Tadd2;
    private javax.swing.JTextField Tadd3;
    private javax.swing.JTextField Tadd4;
    private javax.swing.JTextField Tadhaar;
    private javax.swing.JTextField Tadhaar1;
    private javax.swing.JTextField Tamb;
    private javax.swing.JTextField Tblood;
    private javax.swing.JTextField TbloodSt;
    private javax.swing.JTextField Tdate1;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField Texp;
    private javax.swing.JTextField Tgender;
    private javax.swing.JTextField Toxy;
    private javax.swing.JTextField Tpasswd;
    private javax.swing.JTextField Tpasswd1;
    private javax.swing.JTextField Tremark;
    private javax.swing.JTextField Troom;
    private javax.swing.JTextField Tscan;
    private javax.swing.JTextField TsearchId1;
    private javax.swing.JTextField Tspec;
    private javax.swing.JTextField Tusrname;
    private javax.swing.JTextField Tusrname1;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable searchTbl;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox terms;
    private javax.swing.JLabel title;

}
