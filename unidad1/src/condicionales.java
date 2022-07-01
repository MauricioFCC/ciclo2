    /*
    * if (condicion){
        Instruccion;
    }
    else{
        instruccion;
    }
    */ 
import javax.swing.JOptionPane;
public class condicionales {
    public static void main(String[] args) throws Exception{
        int number, data = 5;

        number = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
        if (number == data){
        JOptionPane.showMessageDialog(null, "The number is 5");
        }
        else{
        JOptionPane.showMessageDialog(null,"The number is diferent of 5");
        }
    }
}
