// Class math
import java.util.Scanner;

public class claseMath {
    public static void main(String[] args) throws Exception{
        
        double root = Math.sqrt(12); //Raiz cuadrada
        System.out.println(root);

        double base = 5, exponent = 12; 
        double root2 = Math.pow(base, exponent); //Exponenciacion
        System.out.println(root2);

        double number = 5.73;
        long result = Math.round(number); //Redonde de numeros
        System.out.println(result);

        float numbers = 8.88f;
        int results = Math.round(numbers);
        System.out.println(results);

        double numberr = Math.random(); //Numeros aleatorios
        System.out.println(numberr);
    }
}
