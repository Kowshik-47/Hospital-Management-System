package hospitalmanagementsystem;


import java.awt.Color;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;

public class Presc extends javax.swing.JFrame {

    String PatId;
    String date=java.time.LocalDate.now().toString(); 
    
    public Presc(String Patientid,String DocName,String PatName) {
        PatId=Patientid;
        try 
        {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root","");
            System.out.println("Connected to the database!");
        }
        catch(SQLException s){
            System.out.pritnln(s);   
        }
        
        Panel = new javax.swing.JPanel();
        LPresc = new javax.swing.JLabel();
        Ldate = new javax.swing.JLabel();
        Tdate = new javax.swing.JTextField();
        TdocName = new javax.swing.JTextField();
        LdocName = new javax.swing.JLabel();
        TpatId = new javax.swing.JTextField();
        LpatName = new javax.swing.JLabel();
        Tsoln = new javax.swing.JTextArea();
        Jsoln = new javax.swing.JLabel();
        Lprob = new javax.swing.JLabel();
        Tprob = new javax.swing.JTextArea();
        TpatName = new javax.swing.JTextField();
        LpatId = new javax.swing.JLabel();
        Bsubmit = new javax.swing.JButton();
        Ckpara = new javax.swing.JCheckBox();
        CkVit = new javax.swing.JCheckBox();
        ckIrn = new javax.swing.JCheckBox();
        ckOrs = new javax.swing.JCheckBox();
        Ckstrep = new javax.swing.JCheckBox();
        ckCal = new javax.swing.JCheckBox();
        CkMin = new javax.swing.JCheckBox();
        ckCro = new javax.swing.JCheckBox();
        Ltablets = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tadditional = new javax.swing.JTextArea();

        setBounds(new java.awt.Rectangle(500, 400, 0, 0));
        setLocation(new java.awt.Point(500, 500));
        setSize(new java.awt.Dimension(500, 700));
        setState(javax.swing.JFrame.MAXIMIZED_BOTH
        );
        getContentPane().setLayout(null);

        Panel.setBackground(new java.awt.Color(204, 255, 255));
        Panel.setLayout(null);
        setResizable(false);

        LPresc.setBackground(new java.awt.Color(0, 0, 255));
        LPresc.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        LPresc.setForeground(new java.awt.Color(0, 51, 255));
        LPresc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LPresc.setText("Prescription");
        Panel.add(LPresc);
        LPresc.setBounds(270, 30, 222, 48);

        Ldate.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Ldate.setForeground(new java.awt.Color(51, 51, 255));
        Ldate.setText("Date :");
        Panel.add(Ldate);
        Ldate.setBounds(75, 128, 101, 30);

        Tdate.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tdate.setEnabled(false);
        
        Tdate.setText(date);
        Panel.add(Tdate);
        Tdate.setBounds(203, 129, 176, 30);
        
        TdocName.setText(DocName);
        TdocName.setEnabled(false);
        TdocName.setDisabledTextColor(Color.black);
        Panel.add(TdocName);
        TdocName.setBounds(203, 172, 176, 30);

        LdocName.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LdocName.setForeground(new java.awt.Color(51, 51, 255));
        LdocName.setText("Doctor Name :");
        Panel.add(LdocName);
        LdocName.setBounds(75, 171, 101, 30);

        TpatId.setText(Patientid);
        TpatId.setEnabled(false);
        TpatId.setDisabledTextColor(Color.black);
        Panel.add(TpatId);
        TpatId.setBounds(203, 215, 176, 30);

        LpatName.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LpatName.setForeground(new java.awt.Color(51, 51, 255));
        LpatName.setText("Patient Name :");
        Panel.add(LpatName);
        LpatName.setBounds(75, 257, 110, 30);
        Panel.add(Tsoln);
        Tsoln.setBounds(203, 378, 176, 65);

        Jsoln.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Jsoln.setForeground(new java.awt.Color(51, 51, 255));
        Jsoln.setText("Solution :");
        Panel.add(Jsoln);
        Jsoln.setBounds(75, 394, 101, 30);

        Lprob.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Lprob.setForeground(new java.awt.Color(51, 51, 255));
        Lprob.setText("Problem :");
        Panel.add(Lprob);
        Lprob.setBounds(75, 300, 101, 30);

        Panel.add(Tprob);
        Tprob.setBounds(203, 301, 176, 59);
        
        TpatName.setText(PatName);
        TpatName.setDisabledTextColor(Color.black);
        TpatName.setEnabled(false);
        TpatName.setEditable(false);
        Panel.add(TpatName);
        TpatName.setBounds(203, 258, 176, 30);

        LpatId.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        LpatId.setForeground(new java.awt.Color(51, 51, 255));
        LpatId.setText("Patient ID :");
        Panel.add(LpatId);
        LpatId.setBounds(75, 214, 101, 30);

        Bsubmit.setBackground(new java.awt.Color(0, 51, 255));
        Bsubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        Bsubmit.setForeground(new java.awt.Color(204, 255, 255));
        Bsubmit.setText("Submit");
        Bsubmit.setMnemonic('S');
        Bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsubmitActionPerformed(evt);
            }
        });
        Panel.add(Bsubmit);
        Bsubmit.setBounds(330, 490, 121, 40);

        Ckpara.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        Ckpara.setText("Paracetomol");
       
        Panel.add(Ckpara);
        Ckpara.setBounds(450, 170, 130, 40);

        CkVit.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        CkVit.setText("Vitamin Tablets");
        Panel.add(CkVit);
        CkVit.setBounds(450, 220, 130, 30);

        ckIrn.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        ckIrn.setText("Iron Tablets");
       
        Panel.add(ckIrn);
        ckIrn.setBounds(450, 270, 110, 20);

        ckOrs.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        ckOrs.setText("Ors");
        Panel.add(ckOrs);
        ckOrs.setBounds(450, 310, 110, 30);

        Ckstrep.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        Ckstrep.setText("Strepsils");
        Panel.add(Ckstrep);
        Ckstrep.setBounds(610, 170, 100, 40);

        ckCal.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        ckCal.setText("Calcium Tablets");
        Panel.add(ckCal);
        ckCal.setBounds(600, 220, 130, 30);

        CkMin.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        CkMin.setText("Mineral Tablets");
        Panel.add(CkMin);
        CkMin.setBounds(610, 270, 120, 30);

        ckCro.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        ckCro.setText("Crocin");
         Panel.add(ckCro);
        ckCro.setBounds(610, 310, 90, 30);

        Ltablets.setFont(new java.awt.Font("Segoe UI", 0, 24)); 
        Ltablets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ltablets.setText("Tablets");
        Panel.add(Ltablets);
        Ltablets.setBounds(500, 110, 160, 40);

        Tadditional.setColumns(20);
        Tadditional.setForeground(new java.awt.Color(153, 153, 153));
        Tadditional.setRows(5);
        Tadditional.setText("Enter Additional Medicines\n");
        Tadditional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TadditionalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tadditional);

        Panel.add(jScrollPane1);
        jScrollPane1.setBounds(450, 370, 234, 86);

        getContentPane().add(Panel);
        Panel.setBounds(10, 10, 760, 590);

        setSize(new java.awt.Dimension(787, 618));
        setLocationRelativeTo(null);
    }                  

    private void TadditionalMouseClicked(java.awt.event.MouseEvent evt) {                                         
        Tadditional.setText("");
        Tadditional.setForeground(Color.BLACK);
    }                                        

    private void BsubmitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(!(Tprob.getText().equals("")) && !(Tsoln.getText().equals("")))
        {
            try
            {
            String date=Tdate.getText();
            String dname =TdocName.getText();
            String patid=TpatId.getText();
            String patname =TpatName.getText(); 
            String prob=Tprob.getText();
            String sol=Tsoln.getText();
            String insertQuery = "INSERT INTO prescription(DoctorName,PatientName,PatientID,Problem,Solution,Date,para,strep,vit,cal,Irn,Min,Ors,cro,Additional_med,Pres_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

            PreparedStatement preparedStatement = con.prepareStatement(insertQuery);
            Random rand = new Random(62); 
            int n=6;
            String chrs = "0123456789";
            String id = "";
            while (n-- >0){
                int index = (int)(Math.random()*62);
                id+=chrs.charAt(index%10);
            }
                preparedStatement.setString(6, date);
                preparedStatement.setString(1, dname);
                preparedStatement.setString(3, patid);
                preparedStatement.setString(2, patname);
                preparedStatement.setString(4, prob);
                preparedStatement.setString(5, sol);
                preparedStatement.setBoolean(7, Ckpara.isSelected());
                preparedStatement.setBoolean(8, Ckstrep.isSelected());
                preparedStatement.setBoolean(9, CkVit.isSelected());
                preparedStatement.setBoolean(10, ckCal.isSelected());
                preparedStatement.setBoolean(11, ckIrn.isSelected());
                preparedStatement.setBoolean(12, CkMin.isSelected());
                preparedStatement.setBoolean(13, ckOrs.isSelected());
                preparedStatement.setBoolean(14, ckCro.isSelected());
                preparedStatement.setString(15, Tadditional.getText());
                preparedStatement.setString(16,id);
                int x= preparedStatement.executeUpdate();
                Integer bill=0;
                if(x==1){
                    if(Ckpara.isSelected()){bill+=50;}
                    if(Ckstrep.isSelected()){bill+=100;}
                    if(CkVit.isSelected()){bill+=200;}
                    if(ckCal.isSelected()){bill+=500;}
                    if(ckIrn.isSelected()){bill+=80;}
                    if(CkMin.isSelected()){bill+=150;}
                    if(ckOrs.isSelected()){bill+=350;}
                    if(ckCro.isSelected()){bill+=400;}
                    String query = "INSERT INTO `bills`(pat_name,date,amount,Prescript_id,Pat_Id) VALUES (?,?,?,?,?);";
                    PreparedStatement statement = con.prepareStatement(query);
                    statement.setString(1, patname);
                    statement.setString(2, LocalDate.now().toString());
                    statement.setString(3, bill.toString());
                    statement.setString(4, id);
                    statement.setString(5, PatId);
                    int y= statement.executeUpdate();
                    if(y==1){
                        JOptionPane.showMessageDialog(null, "Successfully Prescription Uploaded\n\t Bill Amount is : "+bill, "Prescription", JOptionPane.INFORMATION_MESSAGE);
                     }
                }
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Fill All Fields", "Warning !", JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(Presc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Presc("p","p","p").setVisible(true);
            }
        });
    }
    
    Connection con;                  
    private javax.swing.JButton Bsubmit;
    private javax.swing.JCheckBox CkMin;
    private javax.swing.JCheckBox CkVit;
    private javax.swing.JCheckBox Ckpara;
    private javax.swing.JCheckBox Ckstrep;
    private javax.swing.JLabel Jsoln;
    private javax.swing.JLabel LPresc;
    private javax.swing.JLabel Ldate;
    private javax.swing.JLabel LdocName;
    private javax.swing.JLabel LpatId;
    private javax.swing.JLabel LpatName;
    private javax.swing.JLabel Lprob;
    private javax.swing.JLabel Ltablets;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextArea Tadditional;
    private javax.swing.JTextField Tdate;
    private javax.swing.JTextField TdocName;
    private javax.swing.JTextField TpatId;
    private javax.swing.JTextField TpatName;
    private javax.swing.JTextArea Tprob;
    private javax.swing.JTextArea Tsoln;
    private javax.swing.JCheckBox ckCal;
    private javax.swing.JCheckBox ckCro;
    private javax.swing.JCheckBox ckIrn;
    private javax.swing.JCheckBox ckOrs;
    private javax.swing.JScrollPane jScrollPane1;               
}
