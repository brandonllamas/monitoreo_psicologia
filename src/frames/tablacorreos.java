/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bd.conected;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brandon Llamas
 */
public class tablacorreos extends javax.swing.JFrame {
    conected con=new conected();
    Connection cn=con.conect();
    DefaultTableModel mode;

    /**
     * Creates new form tablacorreos
     */
    public tablacorreos() throws SQLException {
        initComponents();
          showdatos();
        try {
               Image img=ImageIO.read(new File("psychored.png"));
               this.setIconImage(img);
           } catch (IOException ex) {
               Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
           }
        this.setTitle("PSYCHORED");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(759, 530));
        setMinimumSize(new java.awt.Dimension(759, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(759, 530));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CORREO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 739, 402);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        jButton6.setToolTipText("Guardar cambio de tabla");
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(70, 440, 97, 73);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon.png"))); // NOI18N
        jButton2.setToolTipText("Eliminar registro de la tabla");
        jButton2.setAutoscrolls(true);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 450, 97, 73);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/2exit.png"))); // NOI18N
        jButton7.setToolTipText("Volver al menú de inicio");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(600, 450, 97, 73);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reply.png"))); // NOI18N
        jButton11.setToolTipText("Volver a tabla");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(410, 450, 97, 73);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fonfo from 2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.out.println( mode.getColumnCount());
        for (int i = 0; i < mode.getRowCount(); i++) {
            for (int j = 0; j < mode.getColumnCount(); j++) {
                int lasd=Integer.parseInt(String.valueOf(mode.getValueAt(i,6)));
                System.out.println(Integer.parseInt(String.valueOf(mode.getValueAt(i,6))));
                String sql="UPDATE `correo` SET `correo`=? WHERE  `id`=?";
                try {
                    PreparedStatement ca= cn.prepareStatement(sql);
                   
                    ca.setString(1, String.valueOf(mode.getValueAt(i,1)));
                    ca.setInt(2,Integer.parseInt(String.valueOf(mode.getValueAt(i,0))));
                    ca.execute();

                } catch (SQLException ex) {
                    Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i=jTable1.getSelectedRow();
        int id = (int) mode.getValueAt(i, 0);
        try {
            Statement st=cn.createStatement();
            boolean rs=st.execute("DELETE FROM `correo` WHERE id="+id);
            mode.removeRow(i);
        } catch (SQLException ex) {
            Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        login a=new login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            estudiantes_seguimiento a=new estudiantes_seguimiento();
            a.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(mod_u.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(tablacorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablacorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablacorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablacorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new tablacorreos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(tablacorreos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
        public void showdatos() throws SQLException{
         this.mode = (DefaultTableModel) jTable1.getModel();
        Statement a=cn.createStatement();
        String query="SELECT * FROM correo  ";
        ResultSet rs=a.executeQuery(query);
        while (rs.next()) {
            int i;
            mode.addRow( new Object[]{
            rs.getInt("id"),
            rs.getString("correo")
        
            });
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}