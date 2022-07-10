
import javax.swing.JOptionPane;
public class mayorAmenor {
    public static void main(String[] args)throws Exception{
        int number1, number2, number3;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Type a number 1: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Type a number 2: "));
        number3 = Integer.parseInt(JOptionPane.showInputDialog("Type a number 3: "));

        if((number1 > number2) && (number2 > number3)){
            JOptionPane.showMessageDialog(null, "Osrder: "+ number1 + " " + number2 + " " + number3);
        }
        else if((number1 > number3) && (number3 > number2)){
            JOptionPane.showMessageDialog(null, "Osrder: "+ number1 + " " + number3 + " " + number2);
        }
        else if((number2 > number1) && (number1 > number3)){
            JOptionPane.showMessageDialog(null, "Osrder: "+ number2 + " " + number1 + " " + number3);
        }
        else if((number2 > number3) && (number3 > number1)){
            JOptionPane.showMessageDialog(null, "Osrder: "+ number2 + " " + number3 + " " + number1);
        }
        else if((number3 > number1) && (number1 > number2)){
            JOptionPane.showMessageDialog(null, "Osrder: "+ number3 + " " + number1 + " " + number2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Osrder: "+ number3 + " " + number2 + " " + number1);
        }
    }
}
