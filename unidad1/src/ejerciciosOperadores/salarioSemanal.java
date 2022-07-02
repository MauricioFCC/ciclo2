package ejerciciosOperadores;
//Make a program that calculates and prints an employee's weekly salary from their weekly hours worked and their hourly wage.
import java.util.Scanner;
public class salarioSemanal {
    public static void main(String[] args) throws Exception {
        Scanner salaryWeek = new Scanner(System.in);
        float salary, hoursEmploye, forHours;

        System.out.println("Enter salary per mounth: ");
        salary = salaryWeek.nextFloat();

        System.out.println("Enter hours employe: ");
        hoursEmploye = salaryWeek.nextFloat();

        forHours = hoursEmploye * ((salary / 30) / 8);

        System.out.println("the hourly wage is: " + forHours);
    }
}
