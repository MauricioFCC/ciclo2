/*
valor = (condicion) ? valor: valor2
 */
import javax.swing.JOptionPane;
public class condicionalTernario {
    public static void main(String[] args) throws Exception{
        int number;
        String mesaje;

        number = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));

        mesaje = (number % 2 == 0) ? "It is even" : "It is not even ";
        JOptionPane.showMessageDialog(null, mesaje);
    }
}
