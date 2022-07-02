//Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula.

//Make a program that reads a character from the keyboard and checks if it is an uppercase letter.

import  javax.swing.JOptionPane;
public class esMayuscula {
    public static void main(String[] args)throws Exception{
        char letter;

        letter = JOptionPane.showInputDialog("Type a letter: ").charAt(0);

        if(Character.isUpperCase(letter)){
            JOptionPane.showMessageDialog(null, "The letter is a upper case!.");
        }
        else{
            JOptionPane.showMessageDialog(null,"The letter is a lower case!.");
        }
    }
}
