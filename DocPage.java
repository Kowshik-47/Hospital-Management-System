package hospitalmanagementsystem;

import com.mysql.cj.jdbc.Blob;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Image;
import java.beans.Statement;
import java.io.ByteArrayInputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class DocPage extends javax.swing.JFrame {

    JTable Disptable;
    Statement statement;
    Connection con;
    ResultSet result;
    JScrollPane jsp;
    java.sql.Statement stmt ;
    ResultSet rs;
    String DocName;
    Integer DocId;
    public DocPage(int id,String name) {
        DocName=name;
        DocId=id;
        try 
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root","");
            System.out.println("Connected to the database!");
        }
        catch(SQLException s){
        
        }
    
        initComponents();
    }

    private void initComponents() {

        Pdoc = new javax.swing.JPanel();
        LPatId = new javax.swing.JLabel();
        TpatId = new javax.swing.JTextField();
        BmakePrescript = new javax.swing.JButton();
        LmakePresTitle = new javax.swing.JLabel();
        LMakeAppwarn = new javax.swing.JLabel();
        SP_search = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        PRegPane4 = new javax.swing.JPanel();
        Lname1 = new javax.swing.JLabel();
        LGender1 = new javax.swing.JLabel();
        Ldob1 = new javax.swing.JLabel();
        LBlood1 = new javax.swing.JLabel();
        TName1 = new javax.swing.JTextField();
        Ladd5 = new javax.swing.JLabel();
        Ladd6 = new javax.swing.JLabel();
        Temail = new javax.swing.JTextField();
        Tlic = new javax.swing.JTextField();
        TPhone1 = new javax.swing.JTextField();
        Tadhaar1 = new javax.swing.JTextField();
        TRegTitle1 = new javax.swing.JLabel();
        Tusrname1 = new javax.swing.JTextField();
        Tspec = new javax.swing.JTextField();
        Ladhaar1 = new javax.swing.JLabel();
        Lusrname1 = new javax.swing.JLabel();
        Ladd7 = new javax.swing.JLabel();
        Lwarn1 = new javax.swing.JLabel();
        LPhone1 = new javax.swing.JLabel();
        Tdate1 = new javax.swing.JTextField();
        Tgender = new javax.swing.JTextField();
        Tblood = new javax.swing.JTextField();
        Limage = new javax.swing.JLabel();
        P_BorderPane = new javax.swing.JPanel();
        Pnavigation = new javax.swing.JPanel();
        BmakePresc = new javax.swing.JButton();
        BdispNurse = new javax.swing.JButton();
        Bsearch = new javax.swing.JButton();
        Bappoiments = new javax.swing.JButton();
        BeditFac = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Bback = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        Lback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Pdoc.setBackground(new java.awt.Color(51, 153, 255));
        Pdoc.setForeground(new java.awt.Color(51, 153, 255));
        Pdoc.setLayout(null);

        LPatId.setFont(new java.awt.Font("Segoe UI", 1, 24));
        LPatId.setForeground(new java.awt.Color(255, 255, 255));
        LPatId.setText("Enter Patient ID :");
        Pdoc.add(LPatId);
        LPatId.setBounds(350, 170, 195, 87);

        TpatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpatIdActionPerformed(evt);
            }
        });
        Pdoc.add(TpatId);
        TpatId.setBounds(560, 200, 223, 37);

        BmakePrescript.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BmakePrescript.setForeground(new java.awt.Color(51, 102, 255));
        BmakePrescript.setText("Make ");
        BmakePrescript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmakePrescriptActionPerformed(evt);
            }
        });
        Pdoc.add(BmakePrescript);
        BmakePrescript.setBounds(480, 300, 184, 42);

        LmakePresTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        LmakePresTitle.setForeground(new java.awt.Color(255, 255, 255));
        LmakePresTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LmakePresTitle.setText("Make Prescription");
        Pdoc.add(LmakePresTitle);
        LmakePresTitle.setBounds(390, 50, 376, 48);

        LMakeAppwarn.setFont(new java.awt.Font("Segoe UI", 1, 22)); 
        LMakeAppwarn.setForeground(new java.awt.Color(255, 51, 51));
        LMakeAppwarn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pdoc.add(LMakeAppwarn);
        LMakeAppwarn.setBounds(340, 570, 464, 44);

        searchTable.setBackground(new java.awt.Color(102, 255, 204));
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Gender", "Patient Id", "DOB"
            }
        ));
        searchTable.setRowHeight(50);
        SP_search.setViewportView(searchTable);

        Pdoc.add(SP_search);
        SP_search.setBounds(160, 380, 800, 90);
        SP_search.setVisible(false);

        PRegPane4.setBackground(new java.awt.Color(0, 153, 255));
        PRegPane4.setLayout(null);

        Lname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Lname1.setForeground(new java.awt.Color(255, 255, 255));
        Lname1.setText("Name :");
        PRegPane4.add(Lname1);
        Lname1.setBounds(80, 200, 92, 33);

        LGender1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LGender1.setForeground(new java.awt.Color(255, 255, 255));
        LGender1.setText("Gender :");
        PRegPane4.add(LGender1);
        LGender1.setBounds(570, 200, 86, 33);

        Ldob1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ldob1.setForeground(new java.awt.Color(255, 255, 255));
        Ldob1.setText("D . O . B :");
        PRegPane4.add(Ldob1);
        Ldob1.setBounds(80, 240, 92, 22);

        LBlood1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LBlood1.setForeground(new java.awt.Color(255, 255, 255));
        LBlood1.setText("Blood :");
        PRegPane4.add(LBlood1);
        LBlood1.setBounds(570, 240, 92, 32);

        TName1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        TName1.setEnabled(false);
        PRegPane4.add(TName1);
        TName1.setBounds(200, 200, 282, 32);

        Ladd5.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladd5.setForeground(new java.awt.Color(255, 255, 255));
        Ladd5.setText("Email :");
        PRegPane4.add(Ladd5);
        Ladd5.setBounds(570, 340, 89, 32);

        Ladd6.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladd6.setForeground(new java.awt.Color(255, 255, 255));
        Ladd6.setText("Licence ID :");
        PRegPane4.add(Ladd6);
        Ladd6.setBounds(570, 290, 92, 32);

        Temail.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Temail.setEnabled(false);
        PRegPane4.add(Temail);
        Temail.setBounds(700, 340, 256, 32);

        Tlic.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Tlic.setEnabled(false);
        PRegPane4.add(Tlic);
        Tlic.setBounds(700, 290, 256, 32);

        TPhone1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        TPhone1.setEnabled(false);
        PRegPane4.add(TPhone1);
        TPhone1.setBounds(200, 290, 282, 32);

        Tadhaar1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Tadhaar1.setEnabled(false);
        PRegPane4.add(Tadhaar1);
        Tadhaar1.setBounds(200, 340, 283, 32);

        TRegTitle1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36));
        TRegTitle1.setForeground(new java.awt.Color(255, 255, 255));
        TRegTitle1.setText("My Profile");
        PRegPane4.add(TRegTitle1);
        TRegTitle1.setBounds(120, 60, 260, 54);

        Tusrname1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tusrname1.setEnabled(false);
        Tusrname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tusrname1ActionPerformed(evt);
            }
        });
        PRegPane4.add(Tusrname1);
        Tusrname1.setBounds(200, 390, 282, 32);

        Tspec.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tspec.setEnabled(false);
        PRegPane4.add(Tspec);
        Tspec.setBounds(700, 390, 256, 32);

        Ladhaar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladhaar1.setForeground(new java.awt.Color(255, 255, 255));
        Ladhaar1.setText("Aadhaar No. :");
        PRegPane4.add(Ladhaar1);
        Ladhaar1.setBounds(80, 340, 110, 30);

        Lusrname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Lusrname1.setForeground(new java.awt.Color(255, 255, 255));
        Lusrname1.setText("Username :");
        PRegPane4.add(Lusrname1);
        Lusrname1.setBounds(70, 390, 92, 30);

        Ladd7.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladd7.setForeground(new java.awt.Color(255, 255, 255));
        Ladd7.setText("Specilization :");
        PRegPane4.add(Ladd7);
        Ladd7.setBounds(570, 390, 109, 30);

        Lwarn1.setFont(new java.awt.Font("Segoe UI", 0, 20)); 
        Lwarn1.setForeground(new java.awt.Color(255, 0, 0));
        Lwarn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRegPane4.add(Lwarn1);
        Lwarn1.setBounds(315, 431, 397, 46);

        LPhone1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LPhone1.setForeground(new java.awt.Color(255, 255, 255));
        LPhone1.setText("Phone No, :");
        PRegPane4.add(LPhone1);
        LPhone1.setBounds(80, 290, 92, 32);

        Tdate1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Tdate1.setEnabled(false);
        PRegPane4.add(Tdate1);
        Tdate1.setBounds(200, 250, 280, 30);

        Tgender.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tgender.setEnabled(false);
        PRegPane4.add(Tgender);
        Tgender.setBounds(700, 200, 80, 30);

        Tblood.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        Tblood.setEnabled(false);
        PRegPane4.add(Tblood);
        Tblood.setBounds(700, 240, 80, 30);

        Limage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PRegPane4.add(Limage);
        Limage.setBounds(860, 50, 160, 190);

        Pdoc.add(PRegPane4);
        PRegPane4.setBounds(0, 0, 1090, 680);
        add(PRegPane4);
        PRegPane4.setVisible(false);

        Pdoc.setVisible(true);

        getContentPane().add(Pdoc);
        Pdoc.setBounds(390, 90, 1090, 680);
        Disptable=new JTable();
        jsp=new JScrollPane(Disptable);

        P_BorderPane.setBackground(new java.awt.Color(51, 255, 255));
        P_BorderPane.setLayout(null);

        Pnavigation.setBackground(new java.awt.Color(0, 153, 255));
        Pnavigation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pnavigation.setLayout(null);

        BmakePresc.setBackground(new java.awt.Color(0, 204, 255));
        BmakePresc.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BmakePresc.setForeground(new java.awt.Color(255, 255, 255));
        BmakePresc.setText("Make Prescription");
        BmakePresc.setActionCommand("addInfo");
        BmakePresc.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                BmakePrescComponentAdded(evt);
            }
        });
        BmakePresc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmakePrescActionPerformed(evt);
            }
        });
        Pnavigation.add(BmakePresc);
        BmakePresc.setBounds(14, 113, 251, 41);

        BdispNurse.setBackground(new java.awt.Color(0, 204, 255));
        BdispNurse.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BdispNurse.setForeground(new java.awt.Color(255, 255, 255));
        BdispNurse.setText("Display Nurse Availability");
        BdispNurse.setActionCommand("dispInfo");
        BdispNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdispNurseActionPerformed(evt);
            }
        });
        Pnavigation.add(BdispNurse);
        BdispNurse.setBounds(20, 200, 250, 41);

        Bsearch.setBackground(new java.awt.Color(0, 204, 255));
        Bsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Bsearch.setForeground(new java.awt.Color(255, 255, 255));
        Bsearch.setText("Search Patient");
        Bsearch.setActionCommand("searchInfo");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });
        Pnavigation.add(Bsearch);
        Bsearch.setBounds(14, 277, 251, 41);

        Bappoiments.setBackground(new java.awt.Color(0, 204, 255));
        Bappoiments.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Bappoiments.setForeground(new java.awt.Color(255, 255, 255));
        Bappoiments.setText("Appointments");
        Bappoiments.setActionCommand("editInfo");
        Bappoiments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BappoimentsActionPerformed(evt);
            }
        });
        Pnavigation.add(Bappoiments);
        Bappoiments.setBounds(14, 358, 251, 41);

        BeditFac.setBackground(new java.awt.Color(0, 204, 255));
        BeditFac.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BeditFac.setForeground(new java.awt.Color(255, 255, 255));
        BeditFac.setText("My Profile");
        BeditFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditFacActionPerformed(evt);
            }
        });
        Pnavigation.add(BeditFac);
        BeditFac.setBounds(14, 438, 251, 41);

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
        Pnavigation.setBounds(20, 60, 290, 610);

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
        Bback.setBounds(110, 20, 115, 29);

        getContentPane().add(P_BorderPane);
        P_BorderPane.setBounds(36, 90, 330, 683);

        title.setBackground(new java.awt.Color(102, 255, 102));
        title.setFont(new java.awt.Font("Stencil", 0, 50)); 
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("H o s p i t a l     m a n a g e m e n t     s y s t e m");
        getContentPane().add(title);
        title.setBounds(224, 9, 1171, 51);

        Lback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/back.jpg"))); 
        getContentPane().add(Lback);
        Lback.setBounds(0, -10, 1740, 800);

        pack();
    }

    private void B_LogoutActionPerformed(java.awt.event.ActionEvent evt) {
        LoginForm l=new LoginForm();
        l.generateCaptcha();
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
        l.setVisible(true);
    }

    private void BmakePrescriptActionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getActionCommand()=="makePresc"){ 
            String query="SELECT OP_Name,Gender,PatientID,DOB FROM patient_OUT WHERE OP_Name = '"+TpatId.getText()+"';";
            ResultSet rs = null;
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.first()){
                    Integer patId=rs.getInt("PatientID");
                     new Presc(patId.toString(),DocName,rs.getString("OP_Name")).setVisible(true); 
                }
                else {
                    LMakeAppwarn.setText("!!! Not Found !!!!");
                }
            }catch (SQLException ex) {
                LMakeAppwarn.setText("!!! Not Found !!!!");
            }
        }            
        else if (evt.getActionCommand()=="search"){
            String query="SELECT OP_Name,Gender,PatientID,DOB FROM patient_OUT WHERE OP_Name = '"+TpatId.getText()+"';";
            ResultSet rs = null;
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.first()){
                    searchTable.setValueAt(rs.getString("OP_Name"), 0, 0);
                    searchTable.setValueAt(rs.getString("Gender"), 0, 1);
                    searchTable.setValueAt(rs.getInt("PatientID"), 0, 2);
                    searchTable.setValueAt(rs.getString("DOB"), 0, 3);
                    LMakeAppwarn.setText("");
                    SP_search.setVisible(true);
                }
                else{
                    SP_search.setVisible(false);
                    LMakeAppwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                LMakeAppwarn.setText("!!! Not Found !!!!");
            }
        }
    }

    private void BmakePrescActionPerformed(java.awt.event.ActionEvent evt) {
        Pdoc.setVisible(true);
        SP_search.setVisible(false);
        PRegPane4.setVisible(false);
        jsp.setVisible(false);
        LmakePresTitle.setText("Make Prescription ");
        BmakePrescript.setVisible(true);
        LPatId.setVisible(true); 
        TpatId.setVisible(true);
        BmakePrescript.setActionCommand("makePresc");

    }

    private void BdispNurseActionPerformed(java.awt.event.ActionEvent evt) {
        Pdoc.setVisible(true);
        SP_search.setVisible(false);
        PRegPane4.setVisible(false);
        jsp.setVisible(true);
        LmakePresTitle.setText("Nurse Availability ");
        BmakePrescript.setVisible(false);
        LPatId.setVisible(false); 
        TpatId.setVisible(false);
        
        Disptable.setBackground(new java.awt.Color(102, 255, 255));
        Disptable.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        Disptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Name", "Specilaization", "Gender", "Rank", "Availability"
            }
        ));
        Disptable.setGridColor(new java.awt.Color(153, 255, 255));
        Disptable.setEnabled(false);
        Disptable.setIntercellSpacing(new java.awt.Dimension(2, 2));
        Disptable.setRowHeight(30);
        Disptable.setShowHorizontalLines(true);
        Pdoc.add(jsp);
        String query="SELECT name,specialization,rank,Gender,Availability FROM `Nurse`;";
            java.sql.Statement stmt ;
            ResultSet rs = null;
            DefaultTableModel tbl=(DefaultTableModel) Disptable.getModel();
            tbl.setRowCount(0);
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                //ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
                    String name,gender,dob,special;
                    Integer rank;
                    Boolean avail;
                    while(rs.next()){
                        name =rs.getString("name");
                        special=rs.getString("Specialization");
                        rank=rs.getInt("Rank");
                        gender=rs.getString("Gender");
                        avail=rs.getBoolean("Availability");
                        
                        String [] rowData={name,special,rank.toString(),gender,avail.toString()};
                        tbl.addRow(rowData);
                    }
                if(tbl.getRowCount()*50<535){
                    jsp.setBounds(300, 110, 500,(tbl.getRowCount()*30)+25);
                }
                 else{
                      jsp.setBounds(300,110,500,550);
                 }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
                
    }

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {
        Pdoc.setVisible(true);
        PRegPane4.setVisible(false);
        jsp.setVisible(false);
        LmakePresTitle.setText("Search Patient ");
        BmakePrescript.setVisible(true);
        LPatId.setVisible(true); 
        TpatId.setVisible(true);
        BmakePrescript.setText("Search");
        BmakePrescript.setActionCommand("search");
    }
    private void BappoimentsActionPerformed(java.awt.event.ActionEvent evt) {
        jsp.setVisible(true);
        SP_search.setVisible(false);
        LmakePresTitle.setText(" Appoinments ");
        BmakePrescript.setVisible(false);
        LPatId.setVisible(false); 
        TpatId.setVisible(false);
        
        Disptable.setBackground(new java.awt.Color(102, 255, 255));
        Disptable.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        Disptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Appoinment No.", "Id", "Name", "Problem"
            }
        ));
        Disptable.setGridColor(new java.awt.Color(153, 255, 255));
        Disptable.setIntercellSpacing(new java.awt.Dimension(2, 2));
        Disptable.setRowHeight(100);
        Disptable.setShowHorizontalLines(true);
        Pdoc.add(jsp);
        String query="SELECT AppointNo,PatientID,PatientName,problem FROM `appointments` WHERE DoctorName='"+DocName+"';";
            
            DefaultTableModel tbl=(DefaultTableModel) Disptable.getModel();
            tbl.setRowCount(0);
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
                    String patName,problem;
                    Integer no,patId;
                    while(rs.next()){
                        no =rs.getInt("AppointNo");
                        patId=rs.getInt("PatientID");
                        patName=rs.getString("PatientName");
                        problem=rs.getString("problem");                     
                        String [] rowData={no.toString(),patId.toString(),patName,problem};
                        tbl.addRow(rowData);
                    }
                if(tbl.getRowCount()*50<535){
                    jsp.setBounds(200, 110, 700,(tbl.getRowCount()*100)+25);
                }
                 else{
                      jsp.setBounds(200,110,700,550);
                 }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        
    }

    private void BeditFacActionPerformed(java.awt.event.ActionEvent evt) {
        Pdoc.setVisible(false);
        SP_search.setVisible(false);
        LmakePresTitle.setText("My Profile");
        PRegPane4.setBounds(390, 90, 1090, 680);
        PRegPane4.setVisible(true);
        String query="SELECT * FROM `Doctor` WHERE DoctorId="+DocId+";";
        try {

            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if(rs.next()){
                TName1.setText(rs.getString("Name"));
                Tdate1.setText(rs.getDate("DOB").toString());
                TPhone1.setText(Long.valueOf(rs.getLong("Phone")).toString());
                Tadhaar1.setText(Long.valueOf(rs.getLong("Aadhaar_No")).toString());
                Tusrname1.setText(rs.getString("Username"));
                Tgender.setText(rs.getString("Gender"));
                Tlic.setText(rs.getString("LICid"));
                Tblood.setText(rs.getString("blood"));
                Temail.setText(rs.getString("email"));
                Tspec.setText(rs.getString("specilization"));
                
                Blob blob = (Blob) rs.getBlob("image");
                byte[] imageData = blob.getBytes(1, (int) blob.length());
                ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
                Image image = ImageIO.read(bis);
                if(image!=null){
                var imageIcon = new ImageIcon(image);
                Icon i2=new ImageIcon(imageIcon.getImage().getScaledInstance(Limage.getWidth(),Limage.getHeight(), WIDTH));
                Limage.setIcon(i2);
                }
                else{
                  JOptionPane.showMessageDialog(null,"Image Not Available", "Message", JOptionPane.OK_OPTION);  
                
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DocPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DocPage d=new DocPage(10003,"peter");
                d.setExtendedState(JFrame.MAXIMIZED_BOTH);
                d.setVisible(true);
            }
        });
    }

    private javax.swing.JButton B_Logout;
    private javax.swing.JButton Bappoiments;
    private javax.swing.JButton Bback;
    private javax.swing.JButton BdispNurse;
    private javax.swing.JButton BeditFac;
    private javax.swing.JButton BmakePresc;
    private javax.swing.JButton BmakePrescript;
    private javax.swing.JButton Bsearch;
    private javax.swing.JLabel LBlood1;
    private javax.swing.JLabel LGender1;
    private javax.swing.JLabel LMakeAppwarn;
    private javax.swing.JLabel LPatId;
    private javax.swing.JLabel LPhone1;
    private javax.swing.JLabel Ladd5;
    private javax.swing.JLabel Ladd6;
    private javax.swing.JLabel Ladd7;
    private javax.swing.JLabel Ladhaar1;
    private javax.swing.JLabel Lback;
    private javax.swing.JLabel Ldob1;
    private javax.swing.JLabel Limage;
    private javax.swing.JLabel LmakePresTitle;
    private javax.swing.JLabel Lname1;
    private javax.swing.JLabel Lusrname1;
    private javax.swing.JLabel Lwarn1;
    private javax.swing.JPanel PRegPane4;
    private javax.swing.JPanel P_BorderPane;
    private javax.swing.JPanel Pdoc;
    private javax.swing.JPanel Pnavigation;
    private javax.swing.JScrollPane SP_search;
    private javax.swing.JTextField TName1;
    private javax.swing.JTextField TPhone1;
    private javax.swing.JLabel TRegTitle1;
    private javax.swing.JTextField Tadhaar1;
    private javax.swing.JTextField Tblood;
    private javax.swing.JTextField Tdate1;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField Tgender;
    private javax.swing.JTextField Tlic;
    private javax.swing.JTextField TpatId;
    private javax.swing.JTextField Tspec;
    private javax.swing.JTextField Tusrname1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable searchTable;
    private javax.swing.JLabel title;
}
