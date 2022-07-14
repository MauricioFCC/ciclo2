
public class arregloUnidimencionales {
    public static void main(String[] args) throws Exception{
    // Tipo_variable Nombre_Array[] = new Tipo_variable[dimencion]
    // int edad[] = new int[3]; todas manejan posicion

        String utils[] = {"Pencils", "Books", "Eraser", "Colors"};
        Double prices[] = {2.5, 10.6, 3.7, 8.9};
        System.out.println("Lists of price and utils: ");
        for(int i = 0; i < utils.length; i ++){ //length = Recorre todos los elementos
            System.out.println(utils[i] + " = " + prices[i]);
        }
    }
}
