//UN hobrero necesita calcular su salario semanal, el cual se obtiene de la sigionte foram: Si trabaja 40 horas o menos, se le paga $16 por hora. Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. 

//A worker needs to calculate his weekly wage, which is obtained from the following formula: If he works 40 hours or less, he is paid $16 per hour. If you work more than 40 hours, you are paid $16 for each of the first 40 hours and $20 for each overtime hour.

import javax.swing.JOptionPane;

public class pagoXhoras {
    public static void main(String[] args)throws Exception{
        float weekPay, payPlus, totalPay;
        
        weekPay = Float.parseFloat(JOptionPane.showInputDialog("Enter hours worked: "));
        if(weekPay > 40){
            payPlus = (weekPay % 40 * 20) + 640;
            JOptionPane.showMessageDialog(null, "The total pay and bonus is: " + payPlus);
        }
        else{
            totalPay = weekPay * 16;
            JOptionPane.showMessageDialog(null, "The total pay is: " + totalPay);
        }
    }
}
