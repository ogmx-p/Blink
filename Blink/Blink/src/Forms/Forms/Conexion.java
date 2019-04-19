
package Forms.Forms;
import java.sql.*;
/**
 *
 * @author marlon
 */
public class Conexion {
    
    public Conexion Datos = new Conexion();
    private Connection con;
    private String URL = "";
    private String Consulta;
    private PreparedStatement Control;
    private Statement inicio;
    
    private Conexion (){
        
    }
}
