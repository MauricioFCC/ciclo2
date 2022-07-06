//En un supermercado se hace un descuento de 20% a los clientes cuya conpra supere los $300. Cual sera la cantidad que pagara una persona por su compra?

//In a supermarket, a 20% discount is given to customers whose purchase exceeds $300. What will be the amount that a person will pay for their purchase?

import  javax.swing.JOptionPane;
public class pagarXcompra {
    public static void main(String[] args)throws Exception{
      double buy, percentage, buyStop, total;

      buy = Double.parseDouble(JOptionPane.showInputDialog("Type the buy total: "));
      percentage = 0.20;
      buyStop = 300;
      total = buy - (buy * percentage);
      if (buy >= buyStop){
         JOptionPane.showMessageDialog(null,"The total + the discount is: " + total);               
      }
      else{
        JOptionPane.showMessageDialog(null, "The discount does not apply, the total is: " + buy);
      }
    }
}