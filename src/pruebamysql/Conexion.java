/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author martinmelo
 */
public class Conexion {

    private static Connection cone;
    
    private static String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "cbtis2014$";
    private static String url = "jdbc:mysql://localhost:3306/tenis";
    
    public Conexion()
    {
        cone = null;
        try {
            Class.forName(driver);
            cone = DriverManager.getConnection(url, user, password);
            if(cone != null)
            {
                System.out.println("Conexion realizada correctamente");
            }
            
        }
        
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Error al conectar " + e);
        }
    }
    
    public Connection getConexion()
    {
        return cone;
    }
    
    public void closeConexion(){
        cone = null;
    }
    
    
}
