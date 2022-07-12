//Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. suponiendo que todos los meses son de 30 dias

//Request the day, month and year of a date and indicate if the date is correct. Assuming all months are 30 days
import  javax.swing.JOptionPane;
public class fechaCorrecta {
    public static void main(String[] args)throws Exception{
        int day, mont, year;

        day = Integer.parseInt(JOptionPane.showInputDialog("Type a day date: "));
        mont = Integer.parseInt(JOptionPane.showInputDialog("Type a mont date: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Type a year date: "));

        if((day <= 30) && (day >= 1) && (mont <= 12) && (mont >= 1) && (year > 1) &&(year < 3000)){
            JOptionPane.showMessageDialog(null, "the date is correct");
        }
        else{
            JOptionPane.showMessageDialog(null, "The date in't correct!..");
        }
    }
}