/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames.imagenes;

import bd.conected;
import clases.VerTabla;
import frames.login;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
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
         VerTabla v = new VerTabla();
        v.visualizar_tabla(tabla,1002092830);
   
    jLabel3.setText(Integer.toString(1002092830));
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
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jScrollPane1.setBounds(10, 10, 444, 310);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/loupe.png"))); // NOI18N
        jButton1.setAutoscrolls(true);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 160, 120, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 140, 340, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(462, 220, 97, 70);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eye.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 220, 120, 70);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(487, 11, 360, 105);

        jLabel3.setText("10");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 290, 220, 14);

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
        jButton7.setBounds(740, 220, 97, 73);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tabla imagen.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 860, 340);

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Atras");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           JFileChooser j = new JFileChooser();
           FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
           j.setFileFilter(fil);
        
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
        guardar(ruta,Integer.parseInt(jLabel3.getText()));
    
        
       VerTabla v = new VerTabla();
        v.visualizar_tabla(tabla,Integer.parseInt(jLabel3.getText()));
        jLabel2.setText("");
        jLabel1.setText("RUTA");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         int i=tabla.getSelectedRow();
        int id = (int) tabla.getValueAt(i,0);
        System.out.println(id);
        try {
            imagenes im= new imagenes(id,Integer.parseInt(jLabel3.getText()));
            im.setVisible(true);
            dispose();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(tabla_imagen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(tabla_imagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        login a=new login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
