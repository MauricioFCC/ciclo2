package ejerciciosOperadores;
//Build a program that, given a total number of hours, returns the number of equivalent weeks, days, and hours. For example, given a total of 1000 hours, it should show 5 weeks, 6 days and 16 hours.

// costruir un programa que, dado un numero total de horas, devuelve el numero de semanas, dias y horas equivalentes. pro ejemplo, dada un total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
import java.util.Scanner;

public class totalHoras{
    public static void main(String[] args) throws Exception {
        Scanner hours = new Scanner(System.in);
        int totalHours, weeks, days, hour;

        System.out.println("Type the total hours: ");
        totalHours = hours.nextInt();

        weeks = totalHours / 168;
        days = totalHours % 168 / 24;
        hour = totalHours % 24;

        System.out.println("The total is: ");
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
        System.out.println("Hour: " + hour);
        
    }
}