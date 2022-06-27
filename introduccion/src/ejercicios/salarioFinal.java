// Un usuario de un banco tiene un sueldo de 1000 $, ha hecho los siguientes gastos: 234$, 34.45$, 12,99$. Calcula cuál es su saldo final.
import java.util.Scanner;

public class salarioFinal {
    public static void main(String[] args) throws Exception {
        Scanner balance = new Scanner(System.in);

        System.out.println("Digite el salario: ");
        float salario = balance.nextFloat();

        System.out.println("Digite el gasto 1: ");
        float gasto1 = balance.nextFloat();
        float gasto1 -= gasto1;
        System.out.println("El saldo actual es: "+ gasto1);
    }
}
