/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import bd.conected;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

import com.itextpdf.text.pdf.PdfWriter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;




 
public class pdf {
      conected con=new conected();
    Connection cn=con.conect();
    private File ruta_destino=null;
String ruta;

    public File getRuta_destino() {
        return ruta_destino;
    }

    public void pdfTabla() throws SQLException, DocumentException, IOException{
        Colocar_Destino();
  Statement a=cn.createStatement();
        String query="SELECT * FROM seguimiento";
        ResultSet rs=a.executeQuery(query);
        
          try (OutputStream file = new FileOutputStream(new File(this.ruta_destino+".pdf"))) {
              Document document = new Document();
              PdfWriter.getInstance(document, file);
              document.open();
              PdfPTable tabla = new PdfPTable(6);
              Paragraph p = new Paragraph("Colegio San Alberto Magno\n\n", FontFactory.getFont("Arial",30,Font.ITALIC,BaseColor.BLACK));
             
              p.setAlignment(Element.ALIGN_CENTER);
              document.add(p);
             
              

              
              document.add(new Paragraph(""));
              
              
              
              float[] mediaCeldas ={3.30f,3.50f,3.50f,3.70f,3.70f,3.50f};
              
              tabla.setWidths(mediaCeldas);
              tabla.addCell(new Paragraph("id", FontFactory.getFont("Arial",12)));
              tabla.addCell(new Paragraph("Nombre estudiante", FontFactory.getFont("Arial",12)));
              tabla.addCell(new Paragraph("Maestro acompañante actual", FontFactory.getFont("Arial",12)));
              tabla.addCell(new Paragraph("Maestro acompañante anterior", FontFactory.getFont("Arial",12)));
              tabla.addCell(new Paragraph("fecha", FontFactory.getFont("Arial",12)));
              tabla.addCell(new Paragraph("grado", FontFactory.getFont("Arial",12)));
              
              while (rs.next()) {
                  int i;
                  
                  tabla.addCell(new Paragraph(rs.getString("id"), FontFactory.getFont("Arial",10)));
                  tabla.addCell(new Paragraph(rs.getString("nombre_e"), FontFactory.getFont("Arial",10)));
                  tabla.addCell(new Paragraph(rs.getString("maetro_acomp_actual"), FontFactory.getFont("Arial",10)));
                  tabla.addCell(new Paragraph(rs.getString("maestro_acomp_anterior"), FontFactory.getFont("Arial",10)));
                  tabla.addCell(new Paragraph(rs.getString("fecha"), FontFactory.getFont("Arial",10)));
                  tabla.addCell(new Paragraph(rs.getString("grado"), FontFactory.getFont("Arial",10)));
                  
                  
                  
              }
              document.add(tabla);
              document.close();
          }catch(Exception e){
              JOptionPane.showMessageDialog(null,"El arcivo ya existe");
          } 
               try{
          File faile;
      faile = new File(this.ruta_destino+".pdf");
          Desktop.getDesktop().open(faile);
       }   
      catch (Exception e){
        e.printStackTrace();
         }
    }
     public void Colocar_Destino(){
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF","pdf","PDF");
       JFileChooser fileChooser = new JFileChooser();       
       fileChooser.setFileFilter(filter);
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){   
           this.ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();
        }
    }    
     
     public void PdfArchivo(int id) throws SQLException{
     Colocar_Destino();
  Statement a=cn.createStatement();
        String query="SELECT * FROM seguimiento where id="+id;
        ResultSet rs=a.executeQuery(query);
        
          try (OutputStream file = new FileOutputStream(new File(this.ruta_destino+".pdf"))) {
              Document document = new Document();
              PdfWriter.getInstance(document, file);
              document.open();
            
              Paragraph p = new Paragraph("Seguimiento Estudiantil\n\n", FontFactory.getFont("Arial",16,Font.ITALIC,BaseColor.BLACK));
              
              p.setAlignment(Element.ALIGN_CENTER);
              document.add(p);
              
              document.add(new Paragraph(""));
              while (rs.next()) {
                  int i;
                  document.add(new Paragraph("Id:", FontFactory.getFont("Arial",12,Font.BOLD)));
                  document.add(new Paragraph(rs.getString("id"), FontFactory.getFont("Arial",10)));
                  document.add(new Paragraph("Nombre Estudiante", FontFactory.getFont("Arial",12,Font.BOLD)));
                  document.add(new Paragraph(rs.getString("nombre_e"), FontFactory.getFont("Arial",10)));
                  document.add(new Paragraph("Maestro Acompañante Actual", FontFactory.getFont("Arial",12,Font.BOLD)));
                  document.add(new Paragraph(rs.getString("maetro_acomp_actual"), FontFactory.getFont("Arial",10)));
                  document.add(new Paragraph("Maestro Acompañante Anterior", FontFactory.getFont("Arial",12,Font.BOLD)));
                  document.add(new Paragraph(rs.getString("maestro_acomp_anterior"), FontFactory.getFont("Arial",10)));
                  document.add(new Paragraph("Fecha", FontFactory.getFont("Arial",12,Font.BOLD)));
                  document.add(new Paragraph(rs.getString("fecha"), FontFactory.getFont("Arial",10)));
                  document.add(new Paragraph("Grado:", FontFactory.getFont("Arial",12,Font.BOLD)));
                  document.add(new Paragraph(rs.getString("grado"), FontFactory.getFont("Arial",10)));
                  document.add(new Paragraph("Motivo de remision :", FontFactory.getFont("Arial",12,Font.BOLD)));
                  document.add(new Paragraph(rs.getString("motivo_rem"), FontFactory.getFont("Arial",10)));
                  document.add(new Paragraph("Apoyo del Maestro:", FontFactory.getFont("Arial",12,Font.BOLD)));
                  document.add(new Paragraph(rs.getString("seguimiento_apoyo"), FontFactory.getFont("Arial",10)));
                  document.add(new Paragraph("Observaciones importante:", FontFactory.getFont("Arial",12,Font.BOLD)));
                  document.add(new Paragraph(rs.getString("observaciones_impor"), FontFactory.getFont("Arial",10)));
                  
                  
                  
              }

              document.close();
          }catch(Exception e){
              JOptionPane.showMessageDialog(null,"El arcivo ya existe");
          } 
               try{
          File faile;
      faile = new File(this.ruta_destino+".pdf");
          Desktop.getDesktop().open(faile);
       }   
      catch (Exception e){
        e.printStackTrace();
         }
     }
}
    
    



