import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class withdraw extends javax.swing.JFrame {
    
double avilbal;
double tax;
public static double AccBal,amount,finalamount;
public static boolean withdraw=false;
Statement st;
   
    public withdraw() {
        initComponents();
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rs2000btn = new javax.swing.JButton();
        rs100btn = new javax.swing.JButton();
        rs500btn = new javax.swing.JButton();
        rs1000btn = new javax.swing.JButton();
        otherbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WITHDRAW");

        rs2000btn.setBackground(new java.awt.Color(0, 255, 204));
        rs2000btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rs2000btn.setText("Rs.2000");
        rs2000btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs2000btnActionPerformed(evt);
            }
        });

        rs100btn.setBackground(new java.awt.Color(0, 255, 204));
        rs100btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rs100btn.setText("Rs.100");
        rs100btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs100btnActionPerformed(evt);
            }
        });

        rs500btn.setBackground(new java.awt.Color(0, 255, 204));
        rs500btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rs500btn.setText("Rs.500");
        rs500btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs500btnActionPerformed(evt);
            }
        });

        rs1000btn.setBackground(new java.awt.Color(0, 255, 204));
        rs1000btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rs1000btn.setText("Rs.1000");
        rs1000btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs1000btnActionPerformed(evt);
            }
        });

        otherbtn.setBackground(new java.awt.Color(0, 255, 0));
        otherbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        otherbtn.setText("Other");
        otherbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(otherbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rs1000btn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rs2000btn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rs100btn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rs500btn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(242, 242, 242))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs100btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs500btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs2000btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs1000btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(otherbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rs100btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs100btnActionPerformed

 
//            List<String> list = Arrays.asList(NewA1.arr);
        
       

                    try {
                        if(LoginForm.balance>=100){
                           finalamount=LoginForm.balance-100;
                     tax=100*0.05;
                    avilbal=finalamount-tax;
                    String sqlUp="Update user set amount='"+avilbal+"' where accno='"+LoginForm.AccountNumber+"'";
                    st=DBConnection.getStatement();
                    st.executeUpdate(sqlUp);

                        JOptionPane.showMessageDialog(this,"succses");
            withdraw=true;
            AccBal=avilbal;
            amount=100;
            gotorecipt gore=new gotorecipt();
            gore.setVisible(true);
            this.dispose();
            }else{

                     JOptionPane.showMessageDialog(this,"error");
            }
                    } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
                    }

    }//GEN-LAST:event_rs100btnActionPerformed

    private void rs1000btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs1000btnActionPerformed



                try {
                     if(LoginForm.balance>=1000){
                        finalamount=LoginForm.balance-1000;
                  tax=1000*0.05;
                 avilbal=finalamount-tax;
                 String sqlUp="Update user set amount='"+avilbal+"' where accno='"+LoginForm.AccountNumber+"'";
                 st=DBConnection.getStatement();
                 st.executeUpdate(sqlUp);

                     JOptionPane.showMessageDialog(this,"succses");
         withdraw=true;
         AccBal=avilbal;
         amount=1000;
         gotorecipt gore=new gotorecipt();
         gore.setVisible(true);
         this.dispose();
         }else{

                  JOptionPane.showMessageDialog(this,"error");
         }
                 } catch (HeadlessException | SQLException e) {
                 }
    }//GEN-LAST:event_rs1000btnActionPerformed

    private void rs500btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs500btnActionPerformed



                    try {
                        if(LoginForm.balance>=500){
                           finalamount=LoginForm.balance-500;
                     tax=500*0.05;
                    avilbal=finalamount-tax;
                    String sqlUp="Update user set amount='"+avilbal+"' where accno='"+LoginForm.AccountNumber+"'";
                    st=DBConnection.getStatement();
                    st.executeUpdate(sqlUp);

                        JOptionPane.showMessageDialog(this,"succses");
            withdraw=true;
            AccBal=avilbal;
            amount=500;
            gotorecipt gore=new gotorecipt();
            gore.setVisible(true);
            this.dispose();
            }else{

                     JOptionPane.showMessageDialog(this,"error");
            }
                    } catch (HeadlessException | SQLException e) {
                    }
    }//GEN-LAST:event_rs500btnActionPerformed

    private void rs2000btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs2000btnActionPerformed



                    try {
                         if(LoginForm.balance>=2000){
                            finalamount=LoginForm.balance-2000;
                      tax=2000*0.05;
                     avilbal=finalamount-tax;
                     String sqlUp="Update user set amount='"+avilbal+"' where accno='"+LoginForm.AccountNumber+"'";
                     st=DBConnection.getStatement();
                     st.executeUpdate(sqlUp);

                         JOptionPane.showMessageDialog(this,"succses");
             withdraw=true;
             AccBal=avilbal;
             amount=2000;
             gotorecipt gore=new gotorecipt();
             gore.setVisible(true);
             this.dispose();
             }else{

                      JOptionPane.showMessageDialog(this,"error");
             }
                     } catch (HeadlessException | SQLException e) {
                     }
    }//GEN-LAST:event_rs2000btnActionPerformed

    private void otherbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherbtnActionPerformed
        otheramount oa=new otheramount();
        oa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_otherbtnActionPerformed

   
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
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton otherbtn;
    private javax.swing.JButton rs1000btn;
    private javax.swing.JButton rs100btn;
    private javax.swing.JButton rs2000btn;
    private javax.swing.JButton rs500btn;
    // End of variables declaration//GEN-END:variables
}
