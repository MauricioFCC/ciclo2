
import javax.print.attribute.standard.NumberOfInterveningJobs;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception{

        float numberA = Float.parseFloat(JOptionPane.showInputDialog("Input a number A: "));
        float numberB = Float.parseFloat(JOptionPane.showInputDialog("Input a number B: "));

        Operacion operationA = new Operacion();

        float addition = operationA.additions(numberA, numberB);
        float subtract = operationA.subtration(numberA, numberB);
        float multiplcation = operationA.multiplications(numberA, numberB);
        float division = operationA.divisions(numberA, numberB);

        operationA.showData(addition, subtract, multiplcation, division);
    }
}
