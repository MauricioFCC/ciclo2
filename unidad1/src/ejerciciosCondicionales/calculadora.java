//Contruir un programa que simule una calculadora y relice las 4 operaciones aritmeticas basicas (Suma, Resta, producto y division) con valores numericos enteros. El usuario debe especificar la operacion con el primer caracter del primer parametro de la linea de comandos: S=suma, R = Resta, P o M = Producto y D = Division.

import javax.swing.JOptionPane;
public class calculadora {
    public static void main(String[] args)throws Exception{

        int numberA, numberB, s, r, p, d;
        char type;
        
        type = JOptionPane.showInputDialog("Enter a type of operation; 'S' for addition, 'R' for Substration, 'P' for preoduct and 'D' for Divition: ").charAt(0);

        numberA = Integer.parseInt(JOptionPane.showInputDialog("Type a first number: "));
        numberB = Integer.parseInt(JOptionPane.showInputDialog("Type a second number: "));
        
        s = numberA + numberB;
        r = numberA - numberB;
        p = numberA * numberB;
        d = numberA / numberB;
        if((type == 's') || (type == 'S')) { 
            JOptionPane.showMessageDialog(null,"The addition is:  " + s);
        }
        else if((type == 'r') || (type == 'R')) { 
            JOptionPane.showMessageDialog(null,"The subtration is:  " + r);
        }
        else if((type == 'p') || (type == 'P')) { 
            JOptionPane.showMessageDialog(null,"The multiplication is:  " + p);
        }
        else if((type == 'd') || (type == 'S')) { 
            JOptionPane.showMessageDialog(null,"The division is:  " + d);
        }
        else{
            JOptionPane.showMessageDialog(null,"Type a valid Character");
        }
    }
}
