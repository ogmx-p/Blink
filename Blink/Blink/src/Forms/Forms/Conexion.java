
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void CrearTabla (){
        try{
            Consulta = "IF NOT EXISTS ";
        }catch (Exception e){
            
        }
    }
    
    public void Guardar(Cliente cliente){
        
    }
    
    public void Guardar(Admin admin){
        
    }
    
    public int Escaner (String IP,String Contraseña,int Numero){ ///1-usuario, 0-admin, 2-error
        int result = 0;
        return result;
    }
    
    public Cliente Modificar (String Nombre,String Contraseña){
        Cliente result = null;
        return result;
    }
    
    public Admin Modificar (int Numero,String Contraseña){
        Admin result = null;
        return result;
    }
    
    public void Sincronizacion (){
        
    }
}
