
package sistema.empleadosDAL;
//Importamos libreria para la base de datos SQL
import java.sql.*;

public class conexion {
    //Ruta de la base de datos
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
    //Ejecutar sentencia (Set) para enviar datos
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
    //Trae los datos de la base de datos
    public ResultSet consultaRegistros(String strSentenciaSQL){
        try{
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
