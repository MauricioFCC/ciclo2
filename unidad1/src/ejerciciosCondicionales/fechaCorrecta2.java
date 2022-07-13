//Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. teniendo en cuenta los 

//Request the day, month and year of a date and indicate if the date is correct. taking into account the

import  javax.swing.JOptionPane;
public class fechaCorrecta2 {
    public static void main(String[] args)throws Exception{
        int day, mont, year;

       day = Integer.parseInt(JOptionPane.showInputDialog("Type a day: "));
       mont = Integer.parseInt(JOptionPane.showInputDialog("Type a mont: "));
       year = Integer.parseInt(JOptionPane.showInputDialog("Typea a year: "));
       
       if(year == 0){
        JOptionPane.showMessageDialog(null, "The date is incorrect!..");
       }
       else if((day <= 28) && (day > 1) && (mont == 2)){
        JOptionPane.showMessageDialog(null, "The date is correct");
       }
       else if((day <= 30) && (day > 1) && (mont == 4) || (mont == 6) || (mont == 9) || (mont == 11)){
        JOptionPane.showMessageDialog(null, "The date ins correct");
       }
       else if((day <= 31) && (mont == 1) || (mont == 3) || (mont == 5) || (mont == 7) || (mont == 8) || (mont == 10) || (mont == 12)){
        JOptionPane.showMessageDialog(null, "The date is correct!..");
       }
       else{
        JOptionPane.showMessageDialog(null, "The date is incorrect!..");
       }
    }
}