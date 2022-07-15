
import javax.swing.JOptionPane;
import java.util.Scanner;
public class arregloAleatorio {
    public static void main(String[] args){
    String text = JOptionPane.showInputDialog("Input a array size: ");
    int numbers[] = new int [Integer.parseInt(text)];
    // Instanciar metodos
    randomArray(numbers, 0, 9); //Aleatorio
    showArray(numbers); //Mostrar
    }
    //Metodo1 aleatorio
    public static void randomArray(int array[], int a, int b){
        for(int i = 0; i < array.length; i ++){
            //Generar numeros aleatorios del 0 al 9
            array[i] = ((int)Math.floor(Math.random()*(a - b) + b));
        }
    }
    //Metodo2 Mostrar
    public static void showArray(int array[]){
        for(int i = 0; i < array.length; i ++){
            System.out.println("The index " + i + " It is found a number: " + array[i]);
        }

    }
}
