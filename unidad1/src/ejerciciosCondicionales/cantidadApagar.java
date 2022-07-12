//En un supermercado se hace un descuento de 20% a los clientes cuya conpra supere los $300. Cual sera la cantidad que pagara una persona por su compra?

//In a supermarket, a 20% discount is given to customers whose purchase exceeds $300. What will be the amount that a person will pay for their purchase?

import  javax.swing.JOptionPane;
public class cantidadApagar {
    public static void main(String[] args)throws Exception{
        double discount, pay;

        pay = Double.parseDouble(JOptionPane.showInputDialog("Type a payment: "));
        discount = pay - (pay * 0.20);
        if(pay > 300){
            JOptionPane.showMessageDialog(null, "The paiment + discount: " + discount);
        }
        else{
            JOptionPane.showMessageDialog(null, "The discount does't apply: "+ pay);
        }
    }
}