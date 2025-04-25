package hospitalmanagementsystem;

import com.mysql.cj.jdbc.Blob;
import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NursePage extends javax.swing.JFrame {

    String NurseName;
    Integer NurseId;
    Statement stmt;
    ResultSet rs;
    Connection con;
    
    public NursePage(int NurseId,String NurseName) {
        this.NurseName=NurseName;
        this.NurseId=NurseId;
         try 
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root","");
            System.out.println("Connected to the database!");
        }
        catch(SQLException s){
            System.out.println(s);
        }
        initComponents();
    }

    private void initComponents() {

        P_BorderPane = new javax.swing.JPanel();
        Pnavigation = new javax.swing.JPanel();
        BaddInfo = new javax.swing.JButton();
        BdispNurse = new javax.swing.JButton();
        Bsearch = new javax.swing.JButton();
        BeditInfo = new javax.swing.JButton();
        BNurseMyProf = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Bback = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        Home_Nurse = new javax.swing.JTabbedPane();
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
        Lexp = new javax.swing.JLabel();
        Texp = new javax.swing.JTextField();
        Limage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Ltitle1 = new javax.swing.JLabel();
        B_search = new javax.swing.JButton();
        Lpatsearch = new javax.swing.JLabel();
        TsearchPat = new javax.swing.JTextField();
        SP_search = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        Lsearchwarn = new javax.swing.JLabel();
        LBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        P_BorderPane.setBackground(new java.awt.Color(51, 255, 255));
        P_BorderPane.setLayout(null);

        Pnavigation.setBackground(new java.awt.Color(0, 153, 255));
        Pnavigation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pnavigation.setLayout(null);

        BaddInfo.setBackground(new java.awt.Color(0, 204, 255));
        BaddInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BaddInfo.setForeground(new java.awt.Color(255, 255, 255));
        BaddInfo.setText("Search Prescription");
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
        BaddInfo.setBounds(14, 113, 251, 41);

        BdispNurse.setBackground(new java.awt.Color(0, 204, 255));
        BdispNurse.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BdispNurse.setForeground(new java.awt.Color(255, 255, 255));
        BdispNurse.setText("Display Doctor Availability");
        BdispNurse.setActionCommand("dispInfo");
        BdispNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdispNurseActionPerformed(evt);
            }
        });
        Pnavigation.add(BdispNurse);
        BdispNurse.setBounds(10, 200, 260, 41);

        Bsearch.setBackground(new java.awt.Color(0, 204, 255));
        Bsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
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

        BeditInfo.setBackground(new java.awt.Color(0, 204, 255));
        BeditInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BeditInfo.setForeground(new java.awt.Color(255, 255, 255));
        BeditInfo.setText("Patient Details");
        BeditInfo.setActionCommand("editInfo");
        BeditInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditInfoActionPerformed(evt);
            }
        });
        Pnavigation.add(BeditInfo);
        BeditInfo.setBounds(14, 358, 251, 41);

        BNurseMyProf.setBackground(new java.awt.Color(0, 204, 255));
        BNurseMyProf.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        BNurseMyProf.setForeground(new java.awt.Color(255, 255, 255));
        BNurseMyProf.setText("My Profile");
        BNurseMyProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNurseMyProfActionPerformed(evt);
            }
        });
        Pnavigation.add(BNurseMyProf);
        BNurseMyProf.setBounds(14, 438, 251, 41);

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

        PRegPane4.setBackground(new java.awt.Color(255, 153, 153));
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

        TName1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TName1.setFocusable(false);
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
        Lremark.setBounds(570, 290, 92, 32);

        Temail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Temail.setFocusable(false);
        PRegPane4.add(Temail);
        Temail.setBounds(700, 340, 256, 32);

        Tremark.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tremark.setFocusable(false);
        PRegPane4.add(Tremark);
        Tremark.setBounds(700, 290, 256, 32);

        TPhone1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TPhone1.setFocusable(false);
        PRegPane4.add(TPhone1);
        TPhone1.setBounds(200, 290, 282, 32);

        Tadhaar1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tadhaar1.setFocusable(false);
        PRegPane4.add(Tadhaar1);
        Tadhaar1.setBounds(200, 340, 283, 32);

        TRegTitle1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); 
        TRegTitle1.setForeground(new java.awt.Color(255, 255, 255));
        TRegTitle1.setText("My Profile");
        PRegPane4.add(TRegTitle1);
        TRegTitle1.setBounds(80, 50, 260, 54);

        Tusrname1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tusrname1.setFocusable(false);
        PRegPane4.add(Tusrname1);
        Tusrname1.setBounds(200, 390, 282, 32);

        Tspec.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tspec.setFocusable(false);
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
        Lusrname1.setBounds(80, 390, 92, 30);

        Ladd7.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ladd7.setForeground(new java.awt.Color(255, 255, 255));
        Ladd7.setText("Specilization :");
        PRegPane4.add(Ladd7);
        Ladd7.setBounds(570, 390, 109, 30);

        Lwarn1.setFont(new java.awt.Font("Segoe UI", 0, 20)); 
        Lwarn1.setForeground(new java.awt.Color(255, 0, 0));
        Lwarn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRegPane4.add(Lwarn1);
        Lwarn1.setBounds(320, 500, 397, 46);

        LPhone1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LPhone1.setForeground(new java.awt.Color(255, 255, 255));
        LPhone1.setText("Phone No, :");
        PRegPane4.add(LPhone1);
        LPhone1.setBounds(80, 290, 92, 32);

        Tdate1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tdate1.setFocusable(false);
        Tdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tdate1ActionPerformed(evt);
            }
        });
        PRegPane4.add(Tdate1);
        Tdate1.setBounds(200, 240, 280, 30);

        Tgender.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tgender.setFocusable(false);
        PRegPane4.add(Tgender);
        Tgender.setBounds(700, 200, 80, 30);

        Tblood.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tblood.setFocusable(false);
        PRegPane4.add(Tblood);
        Tblood.setBounds(700, 240, 80, 30);

        Lexp.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Lexp.setForeground(new java.awt.Color(255, 255, 255));
        Lexp.setText("Experience :");
        PRegPane4.add(Lexp);
        Lexp.setBounds(570, 440, 92, 32);

        Texp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Texp.setFocusable(false);
        PRegPane4.add(Texp);
        Texp.setBounds(700, 440, 256, 32);

        Limage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PRegPane4.add(Limage);
        Limage.setBounds(860, 50, 160, 190);

        Home_Nurse.addTab("", PRegPane4);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        Ltitle1.setFont(new java.awt.Font("Segoe UI", 0, 36)); 
        Ltitle1.setText("Search Presciptions :");
        jPanel1.add(Ltitle1);
        Ltitle1.setBounds(30, 30, 440, 60);

        B_search.setText("Search");
        B_search.setActionCommand("searchPat");
        B_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_searchActionPerformed(evt);
            }
        });
        jPanel1.add(B_search);
        B_search.setBounds(490, 230, 130, 40);
        B_search.getAccessibleContext().setAccessibleName("searchPat");

        Lpatsearch.setFont(new java.awt.Font("Segoe UI", 0, 24)); 
        Lpatsearch.setText("Enter Patient Name :");
        jPanel1.add(Lpatsearch);
        Lpatsearch.setBounds(270, 150, 240, 40);

        TsearchPat.setFont(new java.awt.Font("Segoe UI", 0, 16)); 
        jPanel1.add(TsearchPat);
        TsearchPat.setBounds(520, 150, 340, 40);

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        SP_search.setViewportView(searchTable);
        SP_search.setVisible(false);

        jPanel1.add(SP_search);
        SP_search.setBounds(100, 320, 900, 230);

        Lsearchwarn.setBackground(new java.awt.Color(255, 51, 51));
        Lsearchwarn.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        Lsearchwarn.setForeground(new java.awt.Color(255, 51, 51));
        Lsearchwarn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Lsearchwarn);
        Lsearchwarn.setBounds(340, 560, 450, 50);

        Home_Nurse.addTab("", jPanel1);

        getContentPane().add(Home_Nurse);
        Home_Nurse.setBounds(400, 70, 1120, 700);

        LBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/back.jpg"))); 
        LBackground.setText("jLabel1");
        getContentPane().add(LBackground);
        LBackground.setBounds(-10, -20, 1610, 840);

        setBounds(0, 0, 1773, 793);
    }

    private void BaddInfoActionPerformed(java.awt.event.ActionEvent evt) {
        Lpatsearch.setVisible(true);
        TsearchPat.setVisible(true);
        B_search.setVisible(true);
        Ltitle1.setText("Search Prescription :");
        B_search.setActionCommand("searchPresc");
        Home_Nurse.setSelectedIndex(1);

    }
    
    private void B_LogoutActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        LoginForm l=new LoginForm();
        l.generateCaptcha();
        l.setExtendedState(JFrame.MAXIMIZED_BOTH);
        l.setVisible(true);
    }
    
    private void BNurseMyProfActionPerformed(java.awt.event.ActionEvent evt) {
        Pdoc.setVisible(false);
        Home_Nurse.setSelectedIndex(0);
        //PRegPane4.setVisible(true);
        String query="SELECT * FROM `Nurse` WHERE NurseID="+NurseId+";";
        try {

            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if(rs.first()){
                Home_Nurse.setSelectedIndex(0);
                TName1.setText(rs.getString("Name"));
                Tdate1.setText(rs.getDate("DOB").toString());
                TPhone1.setText(Integer.valueOf(rs.getInt("PhoneNo")).toString());
                Tadhaar1.setText(Integer.valueOf(rs.getInt("AadhaarNo")).toString());
                Tusrname1.setText(rs.getString("Username"));
                Tgender.setText(rs.getString("Gender"));
                Tblood.setText(rs.getString("blood"));
                Temail.setText(rs.getString("email"));
                Tspec.setText(rs.getString("specialization"));
                Tremark.setText(rs.getString("remark"));
                Texp.setText(Integer.valueOf(rs.getInt("experience")).toString());
                
                Blob blob = (Blob) rs.getBlob("image");
                
                byte[] imageData = blob.getBytes(1, (int) blob.length());
                ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
                Image image = ImageIO.read(bis);
                if(image!=null){
                var imageIcon = new ImageIcon(image);
                Icon i2=new ImageIcon(imageIcon.getImage().getScaledInstance(Limage.getWidth(),Limage.getHeight(), WIDTH));
                Limage.setIcon(i2);
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Error");
            }
        }catch(Exception ex)
        {
             ex.printStackTrace();
        }
                
    }
    
    private void B_searchActionPerformed(java.awt.event.ActionEvent evt) {
         System.out.print(evt.getActionCommand());
        if(evt.getActionCommand()=="searchPresc"){
        boolean flag=false;
        String query="SELECT * FROM `prescription` WHERE PatientName = '"+TsearchPat.getText()+"';";
            ResultSet rs = null;           
            searchTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                    new String [] {
                    "Prescript Id", "Doctor Name", "PatientName","Patient_ Id", "Problem","Solution","Date"
                }
                ));
            DefaultTableModel tbl=(DefaultTableModel) searchTable.getModel();
            searchTable.setRowHeight(30);
            tbl.setRowCount(0);
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                while (rs.next()){
                    String id=rs.getString("Pres_ID");
                    String docName=rs.getString("DoctorName");
                    String patname=rs.getString("PatientName");
                    String prob=rs.getString("Problem");
                    String patId=Integer.valueOf(rs.getInt("PatientId")).toString();
                    String soln=rs.getString("Solution");
                    String date=rs.getDate("Date").toString();
                    String [] rowData={id,docName,patname,patId,prob,soln,date};
                    tbl.addRow(rowData);
                    //System.out.print(id+docName+patname+patId+prob+soln+date);
                    Lsearchwarn.setText("");
                    SP_search.setVisible(true);
                    SP_search.setBounds(100, 320, 900, 230);
                    flag=true;
                }
                if(!flag){
                    SP_search.setVisible(false);
                    Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                ex.printStackTrace();
                Lsearchwarn.setText("!!! Not Found !!!!");
            }
        }
        else if(evt.getActionCommand()=="searchPat"){
           
            String query="SELECT OP_Name,Gender,PatientID,DOB FROM patient_OUT WHERE OP_Name = '"+TsearchPat.getText()+"';";
            ResultSet rs = null;
            searchTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {null,null,null,null},
                    new String [] {
                    "Patient Name", "Gender","Patient_ Id","DOB"
                }
                ));
            searchTable.setRowHeight(50);
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                if(rs.first()){
                    searchTable.setValueAt(rs.getString("OP_Name"), 0, 0);
                    searchTable.setValueAt(rs.getString("Gender"), 0, 1);
                    searchTable.setValueAt(rs.getInt("PatientID"), 0, 2);
                    searchTable.setValueAt(rs.getString("DOB"), 0, 3);
                    Lsearchwarn.setText("");
                    SP_search.setBounds(100, 320, 900, 80);
                    SP_search.setVisible(true);
                }
                else{
                    SP_search.setVisible(false);
                    Lsearchwarn.setText("!!! Not Found !!!!");
                }
            }
            catch (SQLException ex) {
                Lsearchwarn.setText("!!! Not Found !!!!");
            }
        }
    }

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {
        Lpatsearch.setVisible(true);
        TsearchPat.setVisible(true);
        B_search.setVisible(true);
        Ltitle1.setText("Search Patient :");
        B_search.setActionCommand("searchPat");
        Home_Nurse.setSelectedIndex(1);
        System.out.print(Bsearch.getActionCommand());
    }

    private void BdispNurseActionPerformed(java.awt.event.ActionEvent evt) {
        boolean flag=false;
        Home_Nurse.setSelectedIndex(1);
        Lpatsearch.setVisible(false);
        TsearchPat.setVisible(false);
        B_search.setVisible(false);
        Ltitle1.setText("Available Doctors :");
        
        String query="SELECT * FROM `doctor` WHERE Available=1";
            ResultSet rs = null;           
            searchTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                    new String [] {
                    "Doctor Id", "Doctor Name","Specialization", "Gender","Experience"}
                ));
            DefaultTableModel tbl=(DefaultTableModel) searchTable.getModel();
            searchTable.setRowHeight(30);
            tbl.setRowCount(0);
            try {
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                while (rs.next()){
                    String id=rs.getString("DoctorId");
                    String docName=rs.getString("Name");
                    String patname=rs.getString("Specilization");
                    String prob=rs.getString("Gender");
                    String patId=Integer.valueOf(rs.getInt("Experience")).toString();
                    String [] rowData={id,docName,patname,patId,prob};
                    tbl.addRow(rowData);
                    Lsearchwarn.setText("");
                    SP_search.setVisible(true);
                    //SP_search.setBounds(100, 100, 900, 630);
                    flag=true;
                }
                if(!flag){
                    SP_search.setVisible(false);
                    Lsearchwarn.setText("!!! Not Found !!!!");
                }
                else{
                    SP_search.setBounds(100, 100, 900, 530);
                }
            }
            catch (SQLException ex) {
                ex.printStackTrace();
                Lsearchwarn.setText("!!! Not Found !!!!");
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
            java.util.logging.Logger.getLogger(NursePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NursePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NursePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NursePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NursePage(3,"Monalisa").setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton BNurseMyProf;
    private javax.swing.JButton B_Logout;
    private javax.swing.JButton B_search;
    private javax.swing.JButton BaddInfo;
    private javax.swing.JButton Bback;
    private javax.swing.JButton BdispNurse;
    private javax.swing.JButton BeditInfo;
    private javax.swing.JButton Bsearch;
    private javax.swing.JTabbedPane Home_Nurse;
    private javax.swing.JLabel LBackground;
    private javax.swing.JLabel LBlood1;
    private javax.swing.JLabel LGender1;
    private javax.swing.JLabel LPhone1;
    private javax.swing.JLabel Ladd5;
    private javax.swing.JLabel Ladd7;
    private javax.swing.JLabel Ladhaar1;
    private javax.swing.JLabel Ldob1;
    private javax.swing.JLabel Lexp;
    private javax.swing.JLabel Limage;
    private javax.swing.JLabel Lname1;
    private javax.swing.JLabel Lpatsearch;
    private javax.swing.JLabel Lremark;
    private javax.swing.JLabel Lsearchwarn;
    private javax.swing.JLabel Ltitle1;
    private javax.swing.JLabel Lusrname1;
    private javax.swing.JLabel Lwarn1;
    private javax.swing.JPanel PRegPane4;
    private javax.swing.JPanel P_BorderPane;
    private javax.swing.JPanel Pnavigation;
    private javax.swing.JScrollPane SP_search;
    private javax.swing.JTextField TName1;
    private javax.swing.JTextField TPhone1;
    private javax.swing.JLabel TRegTitle1;
    private javax.swing.JTextField Tadhaar1;
    private javax.swing.JTextField Tblood;
    private javax.swing.JTextField Tdate1;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField Texp;
    private javax.swing.JTextField Tgender;
    private javax.swing.JTextField Tremark;
    private javax.swing.JTextField TsearchPat;
    private javax.swing.JTextField Tspec;
    private javax.swing.JTextField Tusrname1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable searchTable;
    private javax.swing.JLabel title;
    
}
