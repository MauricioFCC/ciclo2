import java.util.Scanner;
public class entradaDatos {
    public static void main(String[] args) throws Exception{
        //Enteros
        Scanner entrada = new Scanner(System.in);
        int numero;
    
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();

        System.out.println("El numero es: " + numero);

        //Flotantes
        Scanner entradaFlotante = new Scanner(System.in);
        float flotante;
    
        System.out.print("Digite un numero Flotante: ");
        flotante = entradaFlotante.nextFloat(); //En la estrada de datos colocar el numero con coma

        System.out.println("El numero flotantes es: " + flotante);

        //String
        Scanner caracteres = new Scanner(System.in);
        Character caracter;
    
        System.out.print("Digite un caracter: ");
        caracter = caracteres.nextLine() .charAt(0); //En la estrada de datos colocar el numero con coma

        System.out.println("El cadena es: " + caracter);

    }

}
