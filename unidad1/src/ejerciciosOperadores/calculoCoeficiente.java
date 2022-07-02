package ejerciciosOperadores;

import java.util.Scanner;

public class calculoCoeficiente {
    public static void main(String[] args)throws Exception{
        Scanner result = new Scanner(System.in);
        double total, totalB, intA, intB, intC;

        System.out.println("Type A: ");
        intA = result.nextDouble();

        System.out.println("Type B: ");
        intB = result.nextDouble();

        System.out.println("Type C:");
        intC = result.nextDouble();

        total = (-intB + Math.sqrt((Math.pow(intB, 2)) - (4 * intA * intC)) / (2 * intA));
        System.out.println("The coefficient is: " + total);
        totalB = (-intB - Math.sqrt((Math.pow(intB, 2)) - (4 * intA * intC)) / (2 * intA));
        System.out.println("The coefficient is: " + totalB);
    }
}
