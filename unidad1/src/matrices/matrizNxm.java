
import java.util.Scanner;
public class matrizNxm {
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("Input the size of the matriz: ");
        int size = input.nextInt(); //n

        int matrizA [] [] = new int [size] [size];
        int matrizB [] [] = new int [size] [size];
        int matrizTotal [] [] = new int [size] [size];

        for(int i = 0; i < matrizA.length; i ++){
            for(int j = 0; j < matrizA[0].length; j ++){

                System.out.println("Type the worth for row: " + i + " Type the worth for colum: " + j + " matriz A");
                matrizA [i] [j] = input.nextInt();

                System.out.println("Type the worth for row: " + i + " Type the worth for colum: " + j + " matriz B");
                matrizB [i] [j] = input.nextInt();

                matrizTotal [i] [j] = matrizA [i] [j] + matrizB [i] [j];
            }
        } 
         System.out.println("MatrizA");
         showMatriz(matrizA);
         System.out.println("MatrizB");
         showMatriz(matrizB);
         System.out.println("MatrizTotal");
         showMatriz(matrizTotal);
    }
    //Metodo2
    public static void showMatriz(int matriz [] []){
        for(int i = 0; i < matriz.length; i ++){
            for(int j = 0; j < matriz[0].length; j ++){ //variable[0] por convencion
                matriz[i] [j] = (i * matriz.length) + (j + 1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}