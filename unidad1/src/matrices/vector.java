
import java.util.Scanner;
public class vector {
    public static void main(String[] args) throws Exception{
    int vector [] = new int[4] ;

    vector[0] = 2; //en la posicion 0 esta 2
    vector[1] = 33; //en la posicion 1 esta 33
    vector[2] = 55; //en la posicion 2 esta 55
    vector[3] = 56; //en la posicion 3 esta 56
        //tambien se pueden agregar por entrada de teclado
    for (int i = 0; i < vector.length; i++){
        System.out.println("in the index: " + i);
        System.out.println("save the: " + vector[i]);
    }
    }
}
