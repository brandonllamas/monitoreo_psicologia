/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bd.conected;
import clases.pdf;
import java.awt.HeadlessException;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author BRANDON
 */


public class edit extends javax.swing.JFrame {
conected con=new conected ();
Connection cn=con.conect();
int id3;
    /**
     * Creates new form edit

*/

    public edit() throws HeadlessException {
        initComponents();
                               try {
               Image img=ImageIO.read(new File("psychored.png"));
               this.setIconImage(img);
           } catch (IOException ex) {
               Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
           }
        this.setTitle("PSYCHORED");
    }

    public edit(int id2) throws SQLException {
        initComponents();
        System.out.println(id2);
        jLabel13.setText(String.valueOf(id2));
        id3=id2;
        if(id2==0){
     
        
        }else{
            cargar(id2);
            
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nombre_e = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        maetro_actual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        maestro_anterior = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        grado = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        antiguedad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remision = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        apoyo = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        obvserva = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(760, 840));
        setPreferredSize(new java.awt.Dimension(760, 840));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre del estudiante :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, 20));

        nombre_e.setToolTipText("Ingrese nombre de estudiante");
        jPanel1.add(nombre_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 220, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 10, 150));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 560, 10));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 10, 150));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 580, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 30, 150));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Maestro Acompañante actual:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        maetro_actual.setText(" ");
        maetro_actual.setToolTipText("Ingrese nombre de maestro acompañante actual");
        jPanel1.add(maetro_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Maestro Acompañante anterior:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        maestro_anterior.setToolTipText("Ingrese nombre de maestro acompañante anterior");
        jPanel1.add(maestro_anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 180, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        fecha.setToolTipText("Ingrese fecha actual");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 120, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 170, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Grado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        grado.setToolTipText("Ingrese grado ");
        grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoActionPerformed(evt);
            }
        });
        grado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gradoKeyTyped(evt);
            }
        });
        jPanel1.add(grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 110, -1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Antiguedad del estudiante:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        antiguedad.setToolTipText("Nuemro de años del estudiante en la institución");
        antiguedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                antiguedadKeyTyped(evt);
            }
        });
        jPanel1.add(antiguedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 110, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Motivo  Remisión:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        remision.setColumns(20);
        remision.setRows(5);
        remision.setToolTipText("Motivo por el cual fue remitido el estudiante");
        jScrollPane1.setViewportView(remision);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 690, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Seguimiento y apoyo realizado:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        apoyo.setColumns(20);
        apoyo.setRows(5);
        apoyo.setToolTipText("Seguimiento y apoyo realizado");
        jScrollPane2.setViewportView(apoyo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 700, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Observaciones importantes:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        obvserva.setColumns(20);
        obvserva.setRows(5);
        obvserva.setToolTipText("Observaciones importantes");
        jScrollPane3.setViewportView(obvserva);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 690, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reply.png"))); // NOI18N
        jButton2.setToolTipText("Volver a tabla de seguimiento ");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 120, 70));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/2exit.png"))); // NOI18N
        jButton3.setToolTipText("Volver a menú principal");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, 100, 70));

        jLabel13.setText("0");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 700, 60, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/loupe.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tarjeta de Identidad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 20));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo edit.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 780));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 790);

        jMenu2.setText("Edit");

        jMenuItem2.setText("guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("nuevo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Pdf");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jLabel13.getText());
        if(id==0){
            try {
                PreparedStatement psr=cn.prepareStatement("INSERT INTO `seguimiento`( `nombre_e`, `maetro_acomp_actual`, `maestro_acomp_anterior`, `fecha`, `grado`, `antiguedad_estudiante`, `motivo_rem`, `seguimiento_apoyo`, `observaciones_impor`, `TI`) VALUES (?,?,?,?,?,?,?,?,?,?)");
                            psr.setString(1,nombre_e.getText());
            psr.setString(2,maetro_actual.getText());
            psr.setString(3,maestro_anterior.getText());
            psr.setString(4,fecha.getText());
            psr.setString(5,grado.getText());
            psr.setString(6,antiguedad.getText());
            psr.setString(7,remision.getText());
            psr.setString(8,apoyo.getText());
            psr.setString(9,obvserva.getText());
            psr.setInt(id, id);
            
            psr.executeUpdate();
            estudiantes_seguimiento a=new estudiantes_seguimiento();
            a.setVisible(true);
            dispose();
                    
            } catch (SQLException ex) {
                Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            
             
                   try {
                PreparedStatement psr=cn.prepareStatement("UPDATE `seguimiento` SET `nombre_e`=?,`maetro_acomp_actual`=?,`maestro_acomp_anterior`=?,`fecha`=?,`grado`=?,`antiguedad_estudiante`=?,`motivo_rem`=?,`seguimiento_apoyo`=?,`observaciones_impor`=? WHERE  id=?");
                            psr.setString(1,nombre_e.getText());
            psr.setString(2,maetro_actual.getText());
            psr.setString(3,maestro_anterior.getText());
            psr.setString(4,fecha.getText());
            psr.setString(5,grado.getText());
            psr.setString(6,antiguedad.getText());
            psr.setString(7,remision.getText());
            psr.setString(8,apoyo.getText());
            psr.setString(9,obvserva.getText());
            psr.setInt(10, id);
            psr.executeUpdate();
            estudiantes_seguimiento a=new estudiantes_seguimiento();
            a.setVisible(true);
            dispose();
                    
            } catch (SQLException ex) {
                Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void gradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradoKeyTyped
        // TODO add your handling code here:
             char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);               
          } 
    }//GEN-LAST:event_gradoKeyTyped

    private void antiguedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_antiguedadKeyTyped
        // TODO add your handling code here:
             char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);               
          } 
    }//GEN-LAST:event_antiguedadKeyTyped

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        nombre_e.setText("");
        maetro_actual.setText("");
        maestro_anterior.setText("");
        fecha.setText("");
        grado.setText("");
        antiguedad.setText("");
        remision.setText("");
        apoyo.setText("");
        obvserva.setText("");
        jLabel13.setText("0");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        // TODO add your handling code here:
        estudiantes_seguimiento fr= new estudiantes_seguimiento();
        fr.setVisible(true);
        dispose();
    } catch (SQLException ex) {
        Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          login a=new login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        pdf pd= new  pdf();
    try {
        pd.PdfArchivo(id3);
    } catch (SQLException ex) {
        Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        // TODO add your handling code here:
        maestro_anterior.setText("");
        maetro_actual.setText("");
        grado.setText("");
        antiguedad.setText("");
        String nombre=nombre_e.getText();
   
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM `seguimiento` WHERE nombre_e = \""+nombre+"\"");
        while(rs.next()){
            maestro_anterior.setText(rs.getString("maestro_acomp_anterior"));
            maetro_actual.setText(rs.getString("maetro_acomp_actual"));
            grado.setText(rs.getString("grado"));
            antiguedad.setText(rs.getString("antiguedad_estudiante"));
            
        }
    } catch (SQLException ex) {
        Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println(ex);
    }
        
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
                     char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
                                getToolkit().beep(); 
               
              evt.consume(); 
            JOptionPane.showMessageDialog(null,"No puede ingresar letras !!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);     
          } 
  
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit().setVisible(true);
            }
        });
     
        
        
        
    }
       private void cargar(int id) throws SQLException{
           
           
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM seguimiento WHERE id="+id);
           while (rs.next()) {
               nombre_e.setText(rs.getString("nombre_e"));
               fecha.setText(rs.getString("fecha"));
               maestro_anterior.setText(rs.getString("maestro_acomp_anterior"));
               maetro_actual.setText(rs.getString("maetro_acomp_actual"));
                grado.setText(rs.getString("grado"));
                 antiguedad.setText(rs.getString("antiguedad_estudiante"));
                 remision.setText(rs.getString("motivo_rem"));
                 apoyo.setText(rs.getString("seguimiento_apoyo"));
                 obvserva.setText(rs.getString("observaciones_impor"));
                 
           }
        }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antiguedad;
    private javax.swing.JTextArea apoyo;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField grado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField maestro_anterior;
    private javax.swing.JTextField maetro_actual;
    private javax.swing.JTextField nombre_e;
    private javax.swing.JTextArea obvserva;
    private javax.swing.JTextArea remision;
    // End of variables declaration//GEN-END:variables
}
