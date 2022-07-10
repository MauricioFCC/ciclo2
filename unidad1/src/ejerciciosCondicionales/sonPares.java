//Hacer un programa que tome dos numeros y diga si ambos son pares o impares.

//Make a program that takes two numbers and says if they are both even or odd.

import javax.swing.JOptionPane;
public class sonPares {
    public static void main(String[] args){
        int number1, number2 ;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Type and ather number: "));

        if((number1 % 2 == 0) && (number2 % 2 == 0)){
            JOptionPane.showMessageDialog(null, "The numbers " + number1 + " " + number2 + " are pair!..");
        }
        else if((number1 % 2 != 0) && (number2 % 2 != 0)){
            JOptionPane.showMessageDialog(null, "The numbers " + number1 +" " + number2 +" are odd!..");
        }
        else{
            JOptionPane.showMessageDialog(null, "The number is pair and other is odd!..");
        }
    } 
}
