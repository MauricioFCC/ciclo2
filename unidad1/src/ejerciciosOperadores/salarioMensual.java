package ejerciciosOperadores;
//Una campañia de venta de carros usados, paga a una persona de ventas un salario de $1000 mensuales, mas comision de $150 por cada carro vendido, mas 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora los datos pertinetes. Hecer un programa que calcule e imprima el salario mesual de un vendedor.

//A used car sales campaign pays a sales person a salary of $1,000 per month, plus a commission of $150 for each car sold, plus 5% of the value of the sale per car. Each month the company's data entry keyer enters the pertinent data into the computer. Write a program that calculates and prints the monthly salary of a salesman.

import java.util.Scanner;
public class salarioMensual {
    public static void main(String[] args) throws Exception {
        Scanner salary = new Scanner(System.in);
       
        final int salaryMonth = 1000;

        System.out.println("Enter the number of cars sold: ");
        int numberCars = salary.nextInt(); 

        System.out.println("Enter the price of the cars: ");
        float priceCar = salary.nextFloat();

        float total = salaryMonth + (numberCars * 150) + ((priceCar * 0.05f) * numberCars);
        System.out.println("The total salary is: "+ total);
    }

}
