/*
switch(dato){
    case 1: Instrucciones 1;
            break;
    case 2: Intricciones 2;
            break;
    case N: Intrucciones 3;
            break;
    default: CasoContrario;
            brak;
}
 */
import javax.swing.JOptionPane;
public class condicionalSwitch {
    public static void main(String[] args)throws Exception{
        int data;
        data = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1 and 5: "));
        switch(data){
            case 1: JOptionPane.showMessageDialog(null, "Is a number 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "Is a number 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Is a number 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "IS number 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "Is a number 5");
                    break;
            default: JOptionPane.showMessageDialog(null,"the number is not in the range 1 and 5");
        }
    }
}
