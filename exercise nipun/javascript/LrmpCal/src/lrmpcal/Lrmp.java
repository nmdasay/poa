/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrmpcal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author MERC-LAB-01
 */
public class Lrmp extends javax.swing.JFrame {

    /**
     * Creates new form Lrmp
     */
    public Lrmp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lRMPFinal = new javax.swing.JLabel();
        eDDfinal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));
        setSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDD and POA Calculator");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 28, 290, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("Enter Your LRMP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(54, 81, 152, 34);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 230, 113, 23);

        lRMPFinal.setBackground(new java.awt.Color(51, 153, 0));
        lRMPFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lRMPFinal.setForeground(new java.awt.Color(255, 255, 51));
        lRMPFinal.setText("LRMP");
        getContentPane().add(lRMPFinal);
        lRMPFinal.setBounds(64, 126, 157, 44);

        eDDfinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eDDfinal.setForeground(new java.awt.Color(255, 255, 0));
        eDDfinal.setText("EDD");
        getContentPane().add(eDDfinal);
        eDDfinal.setBounds(64, 184, 400, 38);

        jButton2.setText("clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(335, 266, 80, 23);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(181, 90, 140, 30);

        jButton4.setText("exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(340, 320, 80, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lrmpcal/download (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // String lrmp =lrmpdate.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Date larmp = jDateChooser1.getDate();
       
       /* try {
            larmp = sdf.parse(lrmp);
        } catch (ParseException e) {            System.out.println(" wrong date");

        }*/
     
        
       try{ Date today = new Date();
           
        long diff =  today.getTime()-larmp.getTime();
      long days= TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
     long poa= days/7;
     String poa1= String.valueOf(poa);
     Date prg= new Date(24537600000l);
     long edd = larmp.getTime()+prg.getTime();
  Date    prg1 =new  Date(edd);
  String dateText = sdf.format(prg1);
   lRMPFinal.setText("Your POA is "+poa1+" weeks");
   eDDfinal.setText("Your EDD is "+dateText);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "error occored");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       lRMPFinal.setText("POA");
       eDDfinal.setText("EDD");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Lrmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lrmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lrmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lrmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lrmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eDDfinal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lRMPFinal;
    // End of variables declaration//GEN-END:variables
}
