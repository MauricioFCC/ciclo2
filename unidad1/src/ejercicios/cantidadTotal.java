//Guillermo tiene N dolares, Luis tiene la mitad de lo que posee Guillermo, Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.

//Guillermo has N dollars, Luis has half of what Guillermo owns, Juan has half of what Luis and Guillermo together have. Make a program that calculates and prints the amount of money that the three of them have.
import java.util.Scanner;
public class cantidadTotal {
    public static void main(String[] args){
        Scanner total = new Scanner(System.in);
        float guillermo, luis, juan, allTotal;

        System.out.println("Type a Guillermo dollars : ");
        guillermo = total.nextFloat();
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        allTotal = guillermo + luis + juan;

        System.out.println("Guillermo is dollars: "+ guillermo);
        System.out.println("Luis is dollars: "+ luis);
        System.out.println("Juan is dollars: "+ juan);
        System.out.println("All total dollrs is: "+ allTotal);
    }
}
