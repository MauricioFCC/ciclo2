
import javax.swing.JOptionPane;
import java.util.Scanner;
public class matriz3x3 {
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("Input the files of the matrix: ");
        int files = input.nextInt(); //n

        System.out.println("Input the colums of the matrix: ");
        int colums = input.nextInt(); //m

        int matrix[][] = new int [files] [colums]; // n x m

        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[0].length; j ++){ //variable[0] por convencion
                matrix[i] [j] = (i * matrix.length) + (j + 1);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
