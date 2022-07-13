//Pedir una nota de 0 a 10 y mostrar de la forma: Insuficiente, Suficiente, Bien, Notable, Sobresaliente.

//Ask for a grade from 0 to 10 and display in the form: Insufficient, Enough, Good, Remarkable, Outstanding.

import javax.swing.JOptionPane;

public class notaHasta10 {
    public static void main(String[] args){

        int note;

        note = Integer.parseInt(JOptionPane.showInputDialog("Type a note: "));

        if((note == 0) || (note == 1) || (note == 2)){
            JOptionPane.showMessageDialog(null, "Insufficient");
        }
        else if((note == 3) || (note == 4)){
            JOptionPane.showMessageDialog(null, "Enough");
        }
        else if((note == 5) || (note == 6)){
            JOptionPane.showMessageDialog(null, "Good");
        }
        else if((note == 7) || (note == 8)){
            JOptionPane.showMessageDialog(null, "Remarkable");
        }
        else if((note == 9) || (note == 10)){
            JOptionPane.showMessageDialog(null, "Outstanding");
        }
        else{
            JOptionPane.showMessageDialog(null, "Type a valid number");
        }
    }
}
