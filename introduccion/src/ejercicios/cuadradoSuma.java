
import java.util.Scanner;
import static java.lang.Math. *;

public class cuadradoSuma {
    public static void main(String[] args) throws Exception {
        Scanner square = new Scanner(System.in);
        double varA, varB, squareA, squareB, exponent, total;

        exponent = 2;
        System.out.println("Type a number: ");
        varA = square.nextInt();
        System.out.println("Type a number: ");
        varB = square.nextInt();
        squareA = Math.pow(varA, exponent);
        squareB = Math.pow(varB, exponent);
        total = (squareA + squareB) + (exponent * varA * varB);
        System.out.println("The square is: " + total);

    }
}
