//Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10.

//Make a program that reads an integer and shows if the number is a multiple of 10.

import javax.swing.JOptionPane;
    
public class multiplo10 {
    public static void main(String[] args){
        int number;
        String mesaje;

        number = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));

        mesaje = (number % 10 == 0) ? "It is multiple of 10" : "It is not multiple of 10 ";
        JOptionPane.showMessageDialog(null, mesaje);
    }
}
