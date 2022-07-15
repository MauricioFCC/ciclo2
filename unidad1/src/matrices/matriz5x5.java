import java.util.Scanner;
public class matriz5x5 {
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("Input the files of the matrix: ");
        int files = input.nextInt(); //n

        System.out.println("Input the colums of the matrix: ");
        int colums = input.nextInt(); //m

        int matrix[] [] = new int [files] [colums]; // n x m

        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[0].length; j ++){ //variable[0] por convencion
                matrix[i] [j] = ramdomNumber(0, 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    //metodo1
    public static int ramdomNumber(int min, int max){
        return ((int)Math.floor(Math.random()*(min - (max + 1)) + (max + 1)));
    }
}
