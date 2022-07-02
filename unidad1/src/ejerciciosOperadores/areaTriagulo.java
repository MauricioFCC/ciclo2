package ejerciciosOperadores;
import java.util.Scanner;
public class areaTriagulo {
    public static void main(String[] args) throws Exception {
        Scanner triangulo = new Scanner(System.in);

        System.out.println("Digite la base: ");
        float base = triangulo.nextFloat();

        System.out.println("Digite la altura: ");
        float altura = triangulo.nextFloat();

        float area = (base * altura) / 2;
        System.out.println("El area del triangulo es: "+ area);
    }
}
