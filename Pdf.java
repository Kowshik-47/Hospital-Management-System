package hospitalmanagementsystem;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.Connection;
import java.io.FileOutputStream;
import java.io.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Pdf extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    ResultSet result;
    
    public Pdf() {
         try 
        {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root","");
            System.out.println("Connected to the database!");
        }
        catch(SQLException s){
            System.out.println(s);
        }
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Amount", "1000", "300"},
                {"GST", "180", "54"},
                {"Total", "1180", "354"}
            },
            new String [] {
                "             ", "    ", "    "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dubai Medium", 1, 14)); 
        jButton1.setText("Download the policy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(602, 602, 602)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(567, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButton1)
                .addContainerGap(456, Short.MAX_VALUE))
        );

        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String path="";
        Statement stmt;

        try 
        {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root","");
            System.out.println("Connected to the database!");
        }
        catch(SQLException s){
        
        }
        JFileChooser j =new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();
            Document doc = new Document();
            try
            {
                String filename=JOptionPane.showInputDialog(null, "Create New File (.pdf)"," Download PDF", JOptionPane.OK_OPTION);
                if(!filename.endsWith(".pdf")){
                    filename=JOptionPane.showInputDialog(null, "Create Correct File Format (.pdf)"," Download PDF", JOptionPane.OK_OPTION);
                }
                        
                PdfWriter.getInstance(doc,new FileOutputStream(filename));
                doc.open();
                PdfPTable tb1=new PdfPTable(3);
                tb1.addCell("     ");
                tb1.addCell("Third-Party");
                tb1.addCell("Own Damge");
                Paragraph p = new Paragraph();
                p.add("Mepco Hospital");
                p.setAlignment(Element.TITLE);
                doc.add(p);
                
                String bill="SELECT * FROM `bills` WHERE Bill_id=14533;";
                String pres="SELECT * FROM `prescription` WHERE pres_id= 373720;";
                try{
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(bill);
                }catch(Exception e){
                    
                }
                try{
                    Statement smt = con.createStatement();
                    result = smt.executeQuery(pres);
                }catch(Exception e){
                    
                }
                int count=0;
                PdfWriter.getInstance(doc,new FileOutputStream(filename));
                doc.open();
                PdfPTable tbl=new PdfPTable(3);
                
                tbl.addCell("S.No.:");
                tbl.addCell("Medicines");
                tbl.addCell("Price");
                Paragraph pr = new Paragraph();
                pr.add("Mepco Hospital");
                pr.setAlignment(Element.TITLE);
                doc.add(pr);
                tbl.setSpacingBefore(100);
                if(result.first() && rs.next()){
                    if(result.getBoolean("para")){
                        tbl.addCell(++count+".");
                        tbl.addCell("Paracetomol");
                        tbl.addCell("50");
                    }
                    if(result.getBoolean("Strep")){
                        tbl.addCell(++count+".");
                        tbl.addCell("Strepsils");
                        tbl.addCell("100");
                    }
                    if(result.getBoolean("vit")){
                        tbl.addCell(++count+".");
                        tbl.addCell("Vitamin Tablets");
                        tbl.addCell("200");
                    }
                    if(result.getBoolean("cal")){
                        tbl.addCell(++count+".");
                        tbl.addCell("Calcium Tablets");
                        tbl.addCell("500");
                    }
                    if(result.getBoolean("Irn")){
                        tbl.addCell(++count+".");
                        tbl.addCell("Iron Tablets");
                        tbl.addCell("80");
                    }
                    if(result.getBoolean("Min")){
                        tbl.addCell(++count+".");
                        tbl.addCell("Mineral Tablets");
                        tbl.addCell("150");
                    }
                    if(result.getBoolean("Ors")){
                        tbl.addCell((++count)+".");
                        tbl.addCell("ORS");
                        tbl.addCell("350");
                    }
                    if(result.getBoolean("Cro")){
                        tbl.addCell((++count)+".");
                        tbl.addCell("Crocin");
                        tbl.addCell("450");
                    }
                    if(result.getString("Additional_med")!=""){
                        tbl.addCell((++count)+".");
                        tbl.addCell(result.getString("Additional_med"));
                        tbl.addCell("50");
                    }
                      tbl.addCell("");
                        tbl.addCell("Total amount :");
                        tbl.addCell(rs.getString("amount"));
                }
                
                
                doc.add(tbl);
                
                int a = Integer.parseInt(jTable1.getValueAt(2,1).toString())+  Integer.parseInt(jTable1.getValueAt(2,2).toString());
                String b = String.valueOf(a);
                Paragraph p1 = new Paragraph();
                p1.add("Prescription Written By");
                p1.setSpacingBefore(100);
                p1.setAlignment(Element.ALIGN_RIGHT);
                doc.add(p1);
                Paragraph p2 = new Paragraph();
                p2.add(result.getString("DoctorName"));
                p2.setSpacingBefore(5);
                p2.setAlignment(Element.ALIGN_RIGHT);
                doc.add(p2);
                Paragraph p4 =new Paragraph();
                p4.add("Doctor");
                p4.setSpacingBefore(5);
                p4.setAlignment(Element.ALIGN_RIGHT);
                doc.add(p4);
                JOptionPane.showMessageDialog(null, "Policy Downloaded SucessFully");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "PDF Not Generated");
            }
            
            doc.close();
            
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
            java.util.logging.Logger.getLogger(Pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pdf().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
}
