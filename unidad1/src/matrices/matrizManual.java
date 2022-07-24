import java.util.Scanner;
public class matrizManual {
    public static void main(String[] args)throws Exception{

        int matriz [] [] = new int [3] [3];
        
        // Asignacion manual
        matriz [0] [0] = 5;
        matriz [0] [1] = 13;
        matriz [0] [2] = 96;
        matriz [1] [0] = 35;
        matriz [1] [1] = 33;
        matriz [1] [2] = 71;
        matriz [2] [0] = 446;
        matriz [2] [1] = 228;
        matriz [2] [2] = 24;

        for(int i = 0; i < matriz.length; i ++ ){
            for (int j = 0; j < matriz.length; j ++){
                System.out.println("The position value row: " + i + ", column: " + j);//filas y columnas
                System.out.println(" is a: " + matriz[i][j]);
            }
        }
    }
}
