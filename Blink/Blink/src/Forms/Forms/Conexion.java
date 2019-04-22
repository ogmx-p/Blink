
package Forms.Forms;
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author marlon
 */
public class Conexion {
    
    public Conexion Datos = new Conexion();
    private Connection con;
    private String URL = "jdbc:sqlite:C:\\Blink\\DataBase.db";
    private String Consulta;
    private PreparedStatement Control;
    private Statement inicio;
    
    private Conexion (){
        
    }
    
    public void Inicio (){
        try {
            File Adress = new File ("C:\\Blink\\");
            Adress.mkdir();
            if (con!=null){
                con.close();
            }
            con = DriverManager.getConnection(URL);
            CrearTablas();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void CrearTablas (){
        try{
            //se crea la tabla Cliente si no existe
            Consulta = "CREATE TABLE IF NOT EXISTS Cliente("
                    + "Numero integer PRIMARY KEY AUTOINCREMENT, "
                    + "IP text NOT NULL, "
                    + "Nombre text NOT NULL UNIQUE, "
                    + "Contraseña text NOT NULL"
                    + ");";
            inicio = con.createStatement();
            inicio.execute(Consulta);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Guardar(Cliente cliente){
        try{
            Consulta = "INSERT INTO Cliente ("
                    + "IP,"
                    + "Nombre,"
                    + "Contraseña"
                    + ")"
                    + "VALUES (?,?,?)";
            Control = con.prepareStatement(Consulta);
            Control.setString(1, cliente.IP);
            Control.setString(2,cliente.Nombre);
            Control.setString(3,cliente.Contraseña);
            Control.executeUpdate();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }  
    
    public Cliente Buscar (){
        Cliente cliente = new Cliente();
        return cliente;
    }
    
    public Cliente Modificar (String Nombre,String Contraseña){
        Cliente result = null;
        return result;
    }
    
    
    public void Sincronizacion (){
        
    }
}
