
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
