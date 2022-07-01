
import java.util.Scanner;
public class operadoresAritmeticos {
    public static void main(String[] args) throws Exception{
        Scanner intDates = new Scanner(System.in);
        float number1, number2, addition, subtraction, multiplication, division, rest;

        System.out.println("Type 2 numbers: ");
        number1 = intDates.nextFloat();
        number2 = intDates.nextFloat();

        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;
        rest = number1 % number2;

        System.out.println("The addition is: " + addition);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The division is: " + division);
        System.out.println("The rest is: " + rest);
    }
}
