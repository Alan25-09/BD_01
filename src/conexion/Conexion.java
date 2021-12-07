/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Alan
 */
public class Conexion {
Connection conexion;

public Conexion (){
    try {
        conexion= DriverManager.getConnection("jdbc:mysql://localhost:3307/poo_ventas?useSSL=false","root","");
                                            
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Error","Error de conexion",JOptionPane.ERROR_MESSAGE);
    }

}

    public Connection getConexion() {
        return conexion;
    }

    
}
