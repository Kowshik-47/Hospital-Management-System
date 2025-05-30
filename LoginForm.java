package hospitalmanagementsystem;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginForm extends javax.swing.JFrame {

    Connection con;
    public LoginForm() {
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

        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titlelog = new javax.swing.JLabel();
        luname = new javax.swing.JLabel();
        passwd = new javax.swing.JLabel();
        tuname = new javax.swing.JTextField();
        tpasswd = new javax.swing.JPasswordField();
        loginb = new javax.swing.JButton();
        Tcapt = new javax.swing.JTextField();
        Tcapt1 = new javax.swing.JTextField();
        Bcaptgen = new javax.swing.JButton();
        Lwarn = new javax.swing.JLabel();
        Hcredlogo = new javax.swing.JLabel();
        Lloginas = new javax.swing.JLabel();
        ComB_Loginas = new javax.swing.JComboBox<>();
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        LBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/Hlogo.jpg"))); 
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 570, 400));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlelog.setFont(new java.awt.Font("Arial Narrow", 0, 36)); 
        titlelog.setForeground(new java.awt.Color(255, 255, 255));
        titlelog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlelog.setText("Enter User Credentials");
        jPanel1.add(titlelog, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 342, -1));

        luname.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        luname.setForeground(new java.awt.Color(255, 255, 255));
        luname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/userLOGO.jpg"))); 
        luname.setText("Username :");
        jPanel1.add(luname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 34));

        passwd.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        passwd.setForeground(new java.awt.Color(255, 255, 255));
        passwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/passLOGO.jpg"))); 
        passwd.setText("Password :");
        jPanel1.add(passwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 293, 130, 34));

        tuname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tunameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tunameMouseExited(evt);
            }
        });
        tuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunameActionPerformed(evt);
            }
        });
        jPanel1.add(tuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 181, 34));

        tpasswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tpasswdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tpasswdMouseExited(evt);
            }
        });
        jPanel1.add(tpasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 181, 34));

        loginb.setFont(new java.awt.Font("Verdana Pro Cond", 0, 18)); 
        loginb.setForeground(new java.awt.Color(0, 51, 204));
        loginb.setText("LOGIN");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbActionPerformed(evt);
            }
        });
        jPanel1.add(loginb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 143, 42));

        Tcapt.setForeground(new java.awt.Color(153, 153, 153));
        Tcapt.setText("Enter Captcha");
        Tcapt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TcaptMouseClicked(evt);
            }
        });
        Tcapt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcaptActionPerformed(evt);
            }
        });
        jPanel1.add(Tcapt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 353, 161, 34));

        Tcapt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        Tcapt1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tcapt1.setEnabled(false);
        Tcapt1.setSelectionEnd(10);
        Tcapt1.setSelectionStart(20);
        Tcapt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tcapt1ActionPerformed(evt);
            }
        });
        jPanel1.add(Tcapt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 353, 151, 34));

        Bcaptgen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/cap2.png"))); 
        Bcaptgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcaptgenActionPerformed(evt);
            }
        });
        jPanel1.add(Bcaptgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 353, -1, -1));

        Lwarn.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Lwarn.setForeground(new java.awt.Color(255, 255, 255));
        Lwarn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Lwarn, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 402, 333, 30));

        Hcredlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/HcredLOGO.jpg"))); 
        jPanel1.add(Hcredlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 78, -1, -1));

        Lloginas.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); 
        Lloginas.setForeground(new java.awt.Color(255, 255, 255));
        Lloginas.setText("    Login As :");
        jPanel1.add(Lloginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 200, 100, 40));

        ComB_Loginas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Login", "Admin", "Doctor", "Nurse", "Patient", " " }));
        jPanel1.add(ComB_Loginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 460, 550));

        title.setBackground(new java.awt.Color(102, 255, 102));
        title.setFont(new java.awt.Font("Stencil", 0, 48)); 
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("H o s p i t a l     m a n a g e m e n t     s y s t e m");
        jPanel2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 1141, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, -1, 590));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("!! Welcomes You !!");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 470, 50));

        LBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/back.jpg"))); 
        jPanel2.add(LBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
        LBackground.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void tunameMouseExited(java.awt.event.MouseEvent evt) {
        tuname.setBackground(Color.white);
    }

    private void tpasswdMouseEntered(java.awt.event.MouseEvent evt) {
        tpasswd.setBackground(new Color(204,255,204));
    }

    private void tpasswdMouseExited(java.awt.event.MouseEvent evt) {
        tpasswd.setBackground(Color.white);
    }

    private void tunameMouseEntered(java.awt.event.MouseEvent evt) {
        tuname.setBackground(new Color(204,255,204));
    }

    private void TcaptMouseClicked(java.awt.event.MouseEvent evt) {
        Tcapt.setText("");
        Tcapt.setForeground(Color.black);
    }

    private void BcaptgenActionPerformed(java.awt.event.ActionEvent evt) {
        Tcapt.setText("Enter Captcha");
        Tcapt.setForeground(new Color(153,153,153));
        generateCaptcha();
    }
    
    public void generateCaptcha(){
        Random rand = new Random(62); 
        int n=6;
        String chrs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      
        String captcha = "";
        while (n-- >0){
            int index = (int)(Math.random()*62);
            captcha+=chrs.charAt(index);
        }
        Tcapt1.setText(captcha);
    }
    
    private void loginbActionPerformed(java.awt.event.ActionEvent evt) {
        if(ComB_Loginas.getSelectedIndex()==0){
            Lwarn.setText("!!!!! Select Login As!!!!!");
            Lwarn.setForeground(Color.red);
        }
        else if(Tcapt.getText().equals(Tcapt1.getText()) ){
            if(ComB_Loginas.getSelectedIndex()==1){
                String pass=new String(tpasswd.getText());
                String query="SELECT * FROM `admin` WHERE name='"+tuname.getText()+"' and Password='"+pass+"';";
                java.sql.Statement stmt = null;
                ResultSet rs = null;
                try {
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(query);
                    if(rs.first()){
                        setVisible(false);
                         Registration a=new Registration(rs.getInt("Id"),rs.getString("Name"));
                         a.getContentPane().setBackground(Color.white);
                         a.setExtendedState(JFrame.MAXIMIZED_BOTH);
                         a.setVisible(true);
                    }
                     else{
                         Lwarn.setText("!!!!! Login Invalid !!!!!");
                         Lwarn.setForeground(Color.red);
                     }
                 }catch(Exception e){
                     e.printStackTrace();
                 }
            }
            else if (ComB_Loginas.getSelectedIndex()==2){
                String pass=new String(tpasswd.getText());
                String query="SELECT * FROM `doctor` WHERE username='"+tuname.getText()+"' and Password='"+pass+"';";
                java.sql.Statement stmt = null;
                ResultSet rs ;
                try {
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(query);
                    if(rs.first()){
                        setVisible(false);
                        DocPage d=new DocPage(rs.getInt("DoctorId"),rs.getString("Name"));
                        d.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        d.setVisible(true);
                    }
                     else{
                         Lwarn.setText("!!!!! Login Invalid !!!!!");
                         Lwarn.setForeground(Color.red);
                     }
                 }catch(Exception e){
                     e.printStackTrace();
                 }
            }
            else if(ComB_Loginas.getSelectedIndex()==3){
                String pass=new String(tpasswd.getText());
                String query="SELECT * FROM `nurse` WHERE username='"+tuname.getText()+"' and Password='"+pass+"';";
                java.sql.Statement stmt = null;
                ResultSet rs = null;
                try {
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(query);
                    if(rs.first()){
                        setVisible(false);
                         NursePage n=new NursePage(rs.getInt("NurseId"),rs.getString("Name"));
                         n.getContentPane().setBackground(Color.white);
                         n.setExtendedState(JFrame.MAXIMIZED_BOTH);
                         n.setVisible(true);
                    }
                     else{
                         Lwarn.setText("!!!!! Login Invalid !!!!!");
                         Lwarn.setForeground(Color.red);
                     }
                 }catch(Exception e){
                     e.printStackTrace();
                 }
            }
            else if(ComB_Loginas.getSelectedIndex()==4){
                System.out.print("esdrftghj");
                String pass=new String(tpasswd.getText());
                String query="SELECT * FROM `patient_out` WHERE username='"+tuname.getText()+"' and Password='"+pass+"';";
                java.sql.Statement stmt = null;
                ResultSet rs = null;
                try {
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(query);
                    if(rs.first()){
                        setVisible(false);
                         Patient_PAGE o=new Patient_PAGE(rs.getInt("PatientId"),rs.getString("OP_Name"));
                         o.getContentPane().setBackground(Color.white);
                         o.setExtendedState(JFrame.MAXIMIZED_BOTH);
                         o.setVisible(true);
                    }
                     else{
                         Lwarn.setText("!!!!! Login Invalid !!!!!");
                         Lwarn.setForeground(Color.red);
                     }
                 }catch(Exception e){
                     e.printStackTrace();
                 }
            }
        }
        else{
            Lwarn.setText("!!!!! Invalid Captcha !!!!!");
            Lwarn.setForeground(Color.red);
        }     
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        int x=JOptionPane.showConfirmDialog(null,"Do You Want to exit?","",JOptionPane.YES_NO_OPTION);
        if(x==0){
            System.exit(0);
        }
        else
            try {
                wait();
               
            }       
            catch (InterruptedException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginForm l=new LoginForm();
           //   ImageIcon i=new ImageIcon("C:\\Users\\Gopisaran\\OneDrive\\Pictures\\HMS\\white-line-medical-hospital-building-with-cross-icon-isolated-on-blue-background-medical-center-health-care-long-shadow-vector-700-276461768.jpg");
                l.setExtendedState(JFrame.MAXIMIZED_BOTH);
          //    l.setIconImage(i);
                l.generateCaptcha();
                l.setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton Bcaptgen;
    private javax.swing.JComboBox<String> ComB_Loginas;
    private javax.swing.JLabel Hcredlogo;
    private javax.swing.JLabel LBackground;
    private javax.swing.JLabel Lloginas;
    private javax.swing.JLabel Lwarn;
    private javax.swing.JTextField Tcapt;
    private javax.swing.JTextField Tcapt1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginb;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel luname;
    private javax.swing.JLabel passwd;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titlelog;
    private javax.swing.JPasswordField tpasswd;
    private javax.swing.JTextField tuname;
    
}
