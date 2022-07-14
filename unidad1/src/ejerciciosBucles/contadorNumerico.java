
import java.util.Scanner;;
public class contadorNumerico {
    public static void main(String[] args){
        int counter = 0;
        for(int i = 0; i <= 10000; i += 1 ){ //i++ tambie funcionaria pero solo con 1
            if(i % 20 == 0){
                counter ++;
        }
    }
    System.out.println("the multiples is: " + counter);
    }
}
