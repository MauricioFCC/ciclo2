
package sistema.empleadosDAL;
import java.sql.*;

public class conexion {
    String conexionBD = "jdbc:sqlite:C:/Users/Administrador/Documents/WorkSpace/ejercicios/java/ciclo2/unidad3/sistema/System.db";
    Connection conn = null;
    
    public conexion(){
        //Probar la conexion
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(conexionBD);
            System.out.println("Conexion Establecida");
        }
        catch(Exception e){
            System.out.println("Error en la conexion" + e);
        }
    }
    //Ejecutar sntencia (Set)
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try{
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        }
        catch(Exception e){
            System.out.println(e);
            return 0;
        }
    }
}
