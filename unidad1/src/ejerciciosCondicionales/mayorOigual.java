//Hacer un programa que pida dos numeros y decir cual es el mayor o si son iguales.

//Make a program that asks for two numbers and says which is the greater or if they are equal.

import javax.swing.JOptionPane;
public class mayorOigual {
    public static void main(String[] args){
        int numberA, numberB;

        numberA = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
        numberB = Integer.parseInt(JOptionPane.showInputDialog("Type an other number: "));
        if (numberA > numberB){
            JOptionPane.showMessageDialog(null, "The number "+ numberA +" is greater");
        }
        else if (numberA == numberB){
            JOptionPane.showMessageDialog(null, "both number "+ numberA + " and " + numberB +" are the same");
        }
        else{
            JOptionPane.showMessageDialog(null, "The number "+ numberB +" is greater");
        }
    }
}
