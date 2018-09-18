/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import bd.conected;
import clases.pdf;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BRANDON
 */
public class estudiantes_seguimiento extends javax.swing.JFrame {
    conected con=new conected();
    Connection cn=con.conect();
    DefaultTableModel mode;

        
    /**
     * Creates new form estudiantes_seguimiento
     */
    public estudiantes_seguimiento() throws SQLException {
       
        initComponents();
        showdatos();
                setIconImage (new ImageIcon(getClass().getResource("../imagenes/pnj.png")).getImage());//cambiar imagen de icono

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        text = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre estudiante", "Maestro acompañante actual", "Maetro acompañante anterior", "Fecha", "Grado", "Antiguedad del estudiante "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 971, 357));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/refresh-button.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setAutoscrolls(true);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusCycleRoot(true);
        jButton1.setFocusTraversalPolicyProvider(true);
        jButton1.setHideActionText(true);
        jButton1.setInheritsPopupMenu(true);
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 78, 65));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon.png"))); // NOI18N
        jButton2.setAutoscrolls(true);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 87, 65));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add-button-inside-black-circle.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, 100, 65));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pnj.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 368, 251));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pencil.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 116, -1));

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 170, 90, 35));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nombre estudiante", "grado" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 120, 39));
        jPanel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 130, 38));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 110, 70));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/2exit.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 110, 70));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/google-drive-pdf-file (1).png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 120, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fonfo from 2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 690));

        jMenu1.setText("opciones");

        jMenuItem1.setText("modificar usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiartabla();
        try {
            showdatos();
        } catch (SQLException ex) {
            Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        text.setText("");
     
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        int a=jComboBox1.getSelectedIndex();
        Statement st;
        try {
            st = cn.createStatement();
             
              if(a==0){
             limpiartabla();
              String sql ="SELECT * FROM `seguimiento` WHERE nombre_e = \""+text.getText()+"\"";
               ResultSet rs=st.executeQuery(sql);
                       while (rs.next()) {
            int i;
            mode.addRow( new Object[]{
            rs.getInt("id"),
            rs.getString("nombre_e"),
            rs.getString("maetro_acomp_actual"),
            rs.getString("maestro_acomp_anterior"),
            rs.getString("fecha"),
            rs.getInt("grado"),
            rs.getString("antiguedad_estudiante")
            });
            
        }
              }else{
              limpiartabla();
              String sql ="SELECT * FROM `seguimiento` WHERE grado = \""+text.getText()+"\"";
               ResultSet rs=st.executeQuery(sql);
                       while (rs.next()) {
            int i;
            mode.addRow( new Object[]{
            rs.getInt("id"),
            rs.getString("nombre_e"),
            rs.getString("maetro_acomp_actual"),
            rs.getString("maestro_acomp_anterior"),
            rs.getString("fecha"),
            rs.getInt("grado"),
            rs.getString("antiguedad_estudiante")
            });
            
        }
        }
                 
          
        } catch (SQLException ex) {
            Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i=jTable1.getSelectedRow();
        int id = (int) mode.getValueAt(i, 0);
        try {
            Statement st=cn.createStatement();
            boolean rs=st.execute("DELETE FROM `seguimiento` WHERE id="+id);
            mode.removeRow(i);
        } catch (SQLException ex) {
            Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         edit ventana = null;
        try {
               int i=jTable1.getSelectedRow();
        int id = (int) mode.getValueAt(i, 0);
            ventana = new edit(id);
        } catch (SQLException ex) {
            Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
         ventana.setVisible(false);
      
      
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        edit lo=new edit();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        mod_u a=new mod_u();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < mode.getRowCount(); i++) {
            for (int j = 0; j < mode.getColumnCount(); j++) {
               int lasd=Integer.parseInt(String.valueOf(mode.getValueAt(i,5)));
                System.out.println(Integer.parseInt(String.valueOf(mode.getValueAt(i,5))));
                String sql="UPDATE `seguimiento` SET `nombre_e`=?,`maetro_acomp_actual`=?,`maestro_acomp_anterior`=?,`grado`=?,`antiguedad_estudiante`=? WHERE  id=?";
                try {
                    PreparedStatement ca= cn.prepareStatement(sql);
                    
                    ca.setString(1, String.valueOf(mode.getValueAt(i,1)));
                     ca.setString(2,String.valueOf(mode.getValueAt(i,2)));
                      ca.setString(3,String.valueOf(mode.getValueAt(i,3)));
                   
                        ca.setInt(4, lasd);
                         ca.setString(5,String.valueOf(mode.getValueAt(i,6)));
                           ca.setString(6,String.valueOf(mode.getValueAt(i,0)));
                           ca.execute();
                          
                } catch (SQLException ex) {
                    Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
    
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          login a=new login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         String nombrea=JOptionPane.showInputDialog("Ingresar nombre del archivo");
      pdf tab=new pdf();
        try {
            tab.pdfTabla(nombrea);
        } catch (SQLException ex) {
            Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(mod_u.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mod_u.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mod_u.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mod_u.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new estudiantes_seguimiento().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(estudiantes_seguimiento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public void showdatos() throws SQLException{
         this.mode = (DefaultTableModel) jTable1.getModel();
        Statement a=cn.createStatement();
        String query="SELECT * FROM seguimiento  ";
        ResultSet rs=a.executeQuery(query);
        while (rs.next()) {
            int i;
            mode.addRow( new Object[]{
            rs.getInt("id"),
            rs.getString("nombre_e"),
            rs.getString("maetro_acomp_actual"),
            rs.getString("maestro_acomp_anterior"),
            rs.getString("fecha"),
            rs.getInt("grado"),
            rs.getString("antiguedad_estudiante")
            });
            
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
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables

    private String toString(Object valueAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
