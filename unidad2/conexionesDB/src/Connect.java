import java.sql.Connection;
import java.sql.DriverManager;
import java.net.ConnectException;
import java.util.Scanner;
public class Connect {
    public static void main(String[] args) throws Exception {
        connetDB();
    }

    // Se crea un objeto connetDB() que sirve como mediador.
    public static void connetDB(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:db.db");
            if(conn != null){
                System.out.println("Satisfactory connection... ");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
