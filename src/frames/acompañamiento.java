/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bd.conected;
import com.sun.jmx.snmp.BerDecoder;
import frames.imagenes.tabla_imagen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon Llamas
 */
public class acompañamiento extends javax.swing.JFrame {
conected con=new conected ();
Connection cn=con.conect();
String maetro_actual,maestro_anterior,grado,antiguedad,remision,apoyo,obvserva,estructura;
    /**
     * Creates new form acompañamiento
     */
    public acompañamiento() {
        initComponents();
    }
    public acompañamiento(int id,int ti,String nombre,int suid) throws SQLException{
    initComponents();
    if(id==0){
        showdatosid2(suid);
        subid.setText(Integer.toString(suid));
        jLabel1.setText(Integer.toString(id));
    txt_nombre.setText(nombre);
    txt_tarjeta.setText(Integer.toString(ti));
    }else{
        showdatosid2(id);
         subid.setText(Integer.toString(suid));
        jLabel1.setText(Integer.toString(id));
    txt_nombre.setText(nombre);
    txt_tarjeta.setText(Integer.toString(ti));
        showdatosid(id);
    }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        txt_nombre = new javax.swing.JLabel();
        txt_tarjeta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_seguimiento = new javax.swing.JTextPane();
        jt_fecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        subid = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(477, 488));
        setMinimumSize(new java.awt.Dimension(477, 488));
        setSize(new java.awt.Dimension(477, 488));
        getContentPane().setLayout(null);

        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nombre.setText("Nombre estudiante");
        getContentPane().add(txt_nombre);
        txt_nombre.setBounds(3, 0, 470, 92);

        txt_tarjeta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_tarjeta.setForeground(new java.awt.Color(255, 255, 255));
        txt_tarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tarjeta.setText("Tarjeta de identidad");
        getContentPane().add(txt_tarjeta);
        txt_tarjeta.setBounds(0, 100, 480, 80);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 210, 50, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seguimiento y apoyo realizado :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 250, 190, 14);

        jScrollPane1.setViewportView(jt_seguimiento);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 440, 150);
        getContentPane().add(jt_fecha);
        jt_fecha.setBounds(90, 210, 110, 20);

        jLabel1.setText("0");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 430, 100, 60);

        subid.setText("0");
        getContentPane().add(subid);
        subid.setBounds(70, 450, 30, 30);

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
        jButton7.setBounds(0, 0, 97, 73);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo tabla imagen.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 480, 470);

        jMenu1.setText("File");

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("imagenes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("nuevo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
                int id=Integer.parseInt(jLabel1.getText());
        String keyns=jt_fecha.getText();
        if(keyns.contains("-")){
        
        if(id==0){
            try {
                PreparedStatement psr=cn.prepareStatement("INSERT INTO `seguimiento`( `nombre_e`, `maetro_acomp_actual`, `maestro_acomp_anterior`, `fecha`, `grado`, `antiguedad_estudiante`, `motivo_rem`, `seguimiento_apoyo`, `observaciones_impor`, `TI`, `estruc_familiar`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
                            psr.setString(1,txt_nombre.getText());
            psr.setString(2,maetro_actual);
            psr.setString(3,maestro_anterior);
            psr.setString(4,jt_fecha.getText());
            psr.setString(5,grado);
            psr.setString(6,antiguedad);
            psr.setString(7,remision);
            psr.setString(8,apoyo);
            psr.setString(9,obvserva);
            psr.setInt(10,Integer.parseInt(txt_tarjeta.getText()));
            psr.setString(11,estructura);
            int tar=Integer.parseInt(txt_tarjeta.getText());
            psr.executeUpdate();
            seguimiento a=new seguimiento(tar,txt_nombre.getText(),Integer.parseInt(subid.getText()));
            a.setVisible(true);
            dispose();
                    
            } catch (SQLException ex) {
                Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            
             
                   try {
                PreparedStatement psr=cn.prepareStatement("UPDATE `seguimiento` SET `fecha`=?,`seguimiento_apoyo`=?, WHERE  id=?");
                            psr.setString(1,keyns);
                            psr.setString(2,jt_seguimiento.getText());
                            psr.setInt(3,Integer.parseInt(jLabel1.getText()));
                            
            
                     
            
            int tar=Integer.parseInt(txt_tarjeta.getText());
            psr.executeUpdate();
            seguimiento a=new seguimiento(tar,txt_nombre.getText(),Integer.parseInt(jLabel1.getText()));
            a.setVisible(true);
            dispose();
                    
            } catch (SQLException ex) {
                Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }}else{
    JOptionPane.showMessageDialog(rootPane,"Formato de fecha no aceptada<br> formato: DAY-MONTH-YEAR");
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        jt_fecha.setText("");
        jt_seguimiento.setText("");
        jLabel1.setText("0");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    try {
        // TODO add your handling code here:
        tabla_imagen s=new tabla_imagen(Integer.parseInt(txt_tarjeta.getText()));
        s.setVisible(true);
        dispose();
    } catch (SQLException ex) {
        Logger.getLogger(acompañamiento.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(acompañamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acompañamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acompañamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acompañamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acompañamiento().setVisible(true);
            }
        });
    }
    private void showdatosid(int id) throws SQLException{
        Statement st= cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM seguimiento where id="+id);
        while(rs.next()){

            jt_fecha.setText(rs.getString("fecha"));
            jt_seguimiento.setText(rs.getString("seguimiento_apoyo"));
            
        }
    
    }
      private void showdatosid2(int id) throws SQLException{
        Statement st= cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM seguimiento where id="+id);
        while(rs.next()){
            maetro_actual=rs.getString("maetro_acomp_actual");
           maestro_anterior=rs.getString("maestro_acomp_anterior");
         grado=rs.getString("grado");
         antiguedad=rs.getString("antiguedad_estudiante");
         remision=rs.getString("motivo_rem");
         apoyo=rs.getString("seguimiento_apoyo");
         obvserva=rs.getString("observaciones_impor");
         estructura=rs.getString("estruc_familiar");
         
        
            
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jt_fecha;
    private javax.swing.JTextPane jt_seguimiento;
    private javax.swing.JLabel subid;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_tarjeta;
    // End of variables declaration//GEN-END:variables
}
