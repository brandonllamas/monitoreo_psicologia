/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames.imagenes;

import bd.conected;
import clases.VerTabla;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brandon Llamas
 */
public class tabla_imagen extends javax.swing.JFrame {
    conected con=new conected();
    Connection cn=con.conect();
    DefaultTableModel mode;
      String ruta = null;

    /**
     * Creates new form tabla_imagen
     */
    public tabla_imagen() {
        initComponents();
     
    }
    public tabla_imagen(int Ti) throws SQLException{
    initComponents();
    VerTabla v = new VerTabla();
        v.visualizar_tabla(tabla,Ti);
   
    jLabel3.setText(Integer.toString(Ti));
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
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(777, 332));
        setMinimumSize(new java.awt.Dimension(777, 332));
        setResizable(false);
        getContentPane().setLayout(null);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IMAGEN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 11, 444, 310);

        jButton1.setText("FOTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(515, 175, 61, 23);

        jLabel1.setText("RUTA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 140, 340, 23);

        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(462, 240, 81, 23);

        jButton3.setText("VER");
        getContentPane().add(jButton3);
        jButton3.setBounds(616, 240, 51, 23);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(487, 11, 201, 105);

        jLabel3.setText("10");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 290, 220, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           JFileChooser j = new JFileChooser();
        j.setCurrentDirectory(new File("Imagenes/"));
        int ap = j.showOpenDialog(this);
        
        if(ap == JFileChooser.APPROVE_OPTION){
            ruta = j.getSelectedFile().getAbsolutePath();
            jLabel2.setIcon(new ImageIcon(ruta));
            jLabel1.setText(ruta);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        guardar(ruta,Integer.parseInt(jLabel1.getText()));
        limpiartabla();
       VerTabla v = new VerTabla();
        v.visualizar_tabla(tabla,Integer.parseInt(jLabel3.getText()));
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(tabla_imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla_imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla_imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla_imagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabla_imagen().setVisible(true);
            }
        });
    }
        public void showdatos(int ti) throws SQLException{
         this.mode = (DefaultTableModel) tabla.getModel();
        Statement a=cn.createStatement();
        String query="SELECT * FROM imagenes Where TI="+ti;
        ResultSet rs=a.executeQuery(query);
        while (rs.next()) {
            int i;
            mode.addRow( new Object[]{
            rs.getInt("id"),
            rs.getBinaryStream("img"),
                      });
            
        }
    }
            public void guardar(String ruta, int nombre){
        
        String insert = "insert into imagenes(TI,img) values(?,?)";
        FileInputStream fi = null;
        PreparedStatement ps = null;
        try{
            File file = new File(ruta);
            fi = new FileInputStream(file);
            
            ps = cn.prepareStatement(insert);
            ps.setInt(1, nombre);
            ps.setBinaryStream(2, fi);
            
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println("Error al agregar usuario "+ex.getMessage());
        }
    }
                void limpiartabla(){

int a =mode.getRowCount()-1;
System.out.println(a);
for(int i=a; i>=0; i--){
System.out.println(i);
mode.removeRow(i );
}}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
