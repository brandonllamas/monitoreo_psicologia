/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author colsam-docente
 */
public class conected {
    static String db = "psicologia"; //nombre de la base de datos
    String url="jdbc:mysql://localhost/"+db; //url de conexión
    String user="root"; 
    String pass=""; 
    
    public Connection conect()
    {
        Connection link = null;
        
        try
        {
            //Cargamos el Driver MySQL
            Class.forName("org.gjt.mm.mysql.Driver");
            //Creamos un enlace hacia la base de datos
            link = DriverManager.getConnection(this.url,this.user,this.pass);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "no se  pudo conectar a la base de datos ");
        }
        
        return link;
    }
}
