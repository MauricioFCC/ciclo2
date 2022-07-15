
import javax.swing.JOptionPane;
import java.util.Scanner;
public class arreglo100 {
    public static void main(String[] args) throws Exception{
        int numbers[] = new int [100];
        int addition = 0;
        double media;

        //recorrer el arreglo, asigno valores y los suma
        for(int i = 0; i < numbers.length; i ++){
            numbers[i] = i + 1;
            addition += numbers[i];
        }
        //mostrar la suma y la media
        System.out.println("The addition of the values is: " + addition );
        media = (double) addition / numbers.length;
        System.out.println("The media is: " + media);
    }
}
