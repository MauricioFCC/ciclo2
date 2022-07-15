
import javax.swing.JOptionPane;
import java.util.Scanner;
public class arreglo100 {
    public static void main(String[] args) throws Exception{
        int numbers[] = new int [100];
        int addition = 0;
        double media;

        //recorrer el arrglo, asigno valores y los suma
        for(int i = 0; i < numbers.length; i ++){
            numbers[i] = i + 1;
            addition += numbers[i];
        }
        //mostrar la suma
        System.out.println("The addition of the values is: " + addition );
    }
}
