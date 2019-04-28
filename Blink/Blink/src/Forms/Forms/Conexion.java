
package Forms.Forms;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author marlon
 */
public class Conexion {
    
    public static Conexion Datos = new Conexion();
    public static Connection con;
    private String URL = "jdbc:sqlite:C:\\Blink\\DataBase.db";
    private String Consulta;
    private PreparedStatement Control;
    private Statement inicio;
    
    private Conexion (){
        
    }
    
    public void Inicio (){
        boolean error = false;
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
            error = true;
        }
        
    }
    
    private boolean CrearTablas (){
        boolean error = false;
        try{
            //se crea la tabla Cliente si no existe
            Consulta = "CREATE TABLE IF NOT EXISTS Cliente("
                    + "Numero integer PRIMARY KEY AUTOINCREMENT, "
                    + "MAC text NOT NULL, "
                    + "Nombre text NOT NULL UNIQUE, "
                    + "Contraseña text NOT NULL"
                    + ");";
            inicio = con.createStatement();
            inicio.execute(Consulta);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            error = true;
        }
        return error;
    }
    
    public boolean Guardar(Cliente cliente){
        boolean error = false;
        try{
            Consulta = "INSERT INTO Cliente ("
                    + "MAC,"
                    + "Nombre,"
                    + "Contraseña"
                    + ")"
                    + "VALUES (?,?,?)";
            Control = con.prepareStatement(Consulta);
            Control.setString(1, cliente.MAC);
            Control.setString(2,cliente.Nombre);
            Control.setString(3,cliente.Contraseña);
            Control.executeUpdate();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            error = true;
        }
        return error;
    }  
    
    public Cliente Buscar (String nombre, String contraseña){
        Cliente cliente = new Cliente();
        try{
            Consulta = "SELECT * FROM Cliente WHERE Nombre = ? AND Contraseña = ?";
            Control = con.prepareStatement(Consulta);
            Control.setString(1, nombre);
            Control.setString(2, contraseña);
            ResultSet result = Control.executeQuery();
            cliente.Nombre = result.getString("Nombre");
            cliente.Contraseña = result.getString("Contraseña");
            cliente.MAC = result.getString("MAC");
            cliente.numero = result.getInt("Numero");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            cliente.Error = true;
        }
        return cliente;
    }
    
    public ArrayList<String> BuscarClientesGuardados (){
        ArrayList<String> result = new ArrayList<>();
        try{
            Consulta = "SELECT Nombre FROM Cliente";
            Control = con.prepareStatement(Consulta);
            ResultSet r = Control.executeQuery();
            
            while (r.next()){
                result.add(r.getString("Nombre"));
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return result;
    }
    
    public boolean Modificar (Cliente cliente){
        boolean error = false;
        try{
            Consulta = "UPDATE Cliente SET "
                    + "Nombre = ?, "
                    + "Contraseña = ?, "
                    + "MAC = ? "
                    + "WHERE Numero = ?";
            Control = con.prepareStatement(Consulta);
            Control.setString(1, cliente.Nombre);
            Control.setString(2, cliente.Contraseña);
            Control.setString(3, cliente.MAC);
            Control.setInt(4, cliente.numero);
            Control.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            error = true;
        }
        return error;
    }
    
    
    public void Sincronizacion (){
        
    }
}
