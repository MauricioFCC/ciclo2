//A student has the following marks in the exams: 5.25, 7.85, 3.4 Calculate what is the average of this quarter
import javax.swing.JOptionPane;
public class calculaMedia {
    public static void main(String[] args) throws Exception {
        
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digit a marks 1: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digit a marks 2: "));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digit a marks 3: "));
        
        float average = (n1 + n2 + n3) / 3;

        JOptionPane.showMessageDialog(null, "The marks average is: " + average);
    }
}
