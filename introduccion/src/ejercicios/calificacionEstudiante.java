//La calificacion final de un estudiante de informatica se calcula con base a calificaciones de cuatro aspectos de sus rendicminto academico: participacion, primer examen parcial, sugundo examen parcial y examen final. Sabiendo que las calificaciones anteriores entran a la calificacion final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante.

//The final grade of a computer science student is calculated based on grades of four aspects of their academic performance: participation, first partial exam, second partial exam and final exam. Knowing that the previous grades enter the final grade with weights of 10%, 25%, 25% and 40%, make a program that calculates and prints the final grade obtained by a student.

import java.util.Scanner;
public class calificacionEstudiante {
    public static void main(String[] args) throws Exception {
        Scanner score = new Scanner(System.in);
        float participation, exam1, exam2, exam3, total;

        System.out.println("Type the carticipation: ");
        participation = score.nextFloat();

        System.out.println("Type the test 1: ");
        exam1 = score.nextFloat();

        System.out.println("Type the test 2: ");
        exam2 = score.nextFloat();

        System.out.println("Type the test 3: ");
        exam3 = score.nextFloat();

        total = (participation * 0.10f) + (exam1 * 0.25f) + (exam2 * 0.25f) + (exam3 * 0.40f);
        System.out.println("The total score is: " + total);
    }
}