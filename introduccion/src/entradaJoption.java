import javax.swing.JOptionPane;

public class entradaJoption {
    public static void main(String[] args) throws Exception{
    String cadena;
    int entero;
    char letra;
    double decimal;

    cadena = JOptionPane.showInputDialog("Digite una cadena: ");
    entero = Integer.parseInt(JOptionPane.showInputDialog("Digite uns numero: "));
    letra = JOptionPane.showInputDialog("Dijite una letra: ").charAt(0);
    decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

    JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
    JOptionPane.showMessageDialog(null, "El entero es: " + entero);
    JOptionPane.showMessageDialog(null, "La cletra es: " + letra);
    JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
    }
}
