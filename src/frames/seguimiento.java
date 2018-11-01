/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bd.conected;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brandon Llamas
 */
public class seguimiento extends javax.swing.JFrame {
    conected con=new conected();
    Connection cn=con.conect();
    DefaultTableModel mode;
    int ti2;
    String nombre;
    /**
     * Creates new form seguimiento
     */
    public seguimiento() {
        initComponents();
    }
    public seguimiento(int ti,String name) throws SQLException{
    initComponents();
    String to=Integer.toString(ti);
   subtituilo.setText(Integer.toString(ti));
        System.out.println(to+" hola");
    titulo.setText(name);
        System.out.println(ti);
        showdatos(ti);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        subtituilo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(512, 485));
        setMinimumSize(new java.awt.Dimension(512, 485));
        setSize(new java.awt.Dimension(512, 485));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha", "Grado", "motivo "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(58, 136, 375, 275);

        titulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(titulo);
        titulo.setBounds(10, 24, 492, 60);

        jButton2.setText("editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 420, 120, 50);

        jButton3.setText("agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 420, 106, 49);

        subtituilo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(subtituilo);
        subtituilo.setBounds(60, 90, 400, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                 acompañamiento ventana = null;
        try {
               int i=jTable1.getSelectedRow();
        int id = (int) mode.getValueAt(i, 0);
            ventana = new acompañamiento(id,ti2,nombre);
        } catch (SQLException ex) {
            Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
         ventana.setVisible(false);
      
      
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int id=0;
        acompañamiento ventana=null;
        String vnombre=titulo.getText();
        try {
            ventana = new acompañamiento(0,ti2,vnombre);
        } catch (SQLException ex) {
            Logger.getLogger(seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventana.setVisible(false);
   
      
      
        ventana.setVisible(true);
        dispose();
        
        System.out.println(nombre);
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(seguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seguimiento().setVisible(true);
            }
        });
    }
    public void showdatos(int id) throws SQLException{
         this.mode = (DefaultTableModel) jTable1.getModel();
        Statement a=cn.createStatement();
        String query="SELECT * FROM seguimiento where TI="+id;
        ResultSet rs=a.executeQuery(query);
        while (rs.next()) {
            int i;
                        //rs.getString("nombre_e"),
            mode.addRow( new Object[]{
            rs.getInt("id"),
            rs.getString("fecha"),
            rs.getInt("grado"),
            rs.getString("motivo_rem")
            });

            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel subtituilo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
