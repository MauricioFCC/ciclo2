import javax.swing.JOptionPane;
import java.util.Scanner;
public class arreglo10 {
    public static void main(String[] args) throws Exception{
       final int size = 10; //final = constante

        int numbers[] = new int[size];
        //invocar o instanciar
        fillArray(numbers);
        showArray(numbers);
    }
    // Metodo1
    public static void fillArray(int array[]){
        for(int i = 0; i < array.length; i++){
            String text = JOptionPane.showInputDialog("Type a number of array: " + (i + 1));
            array[i] = Integer.parseInt(text);
        } 
    }
    // Metodo 2
    public static void showArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.println("The index " + i + " It is found a number: " + array[i]);
        }
    }
}
