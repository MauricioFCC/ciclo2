public class introduccion {
    public static void main(String[] args) throws Exception {
        //Esto es un comentario
        
        /*
         * Otra clase de comentario
         */
        
        /*Java es de tipado fuerte y estatico.
        * Se debe colocar : al final de cada sentencia
        */
        //Variables entero
        long cordenadas = 286645334; //long 64 bits con rango: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 
        int fecha = 31022022; //int 32 bits con rango: -2.147.483.648 a 2.147.483.647
        short anio = 2022; //short 16 bits con rango: -32.768 a 32.767
        byte edad = 33; //byte 16 bits con rango: -128 a 127

        //Variables flotantes
        double PI = 3.14159265358979323846; //double 64 bits con rango 4.9e-324 a 1.8e+308
        float PI_CORTO = 3.141592f; //float 32 bits con rango: 1.4e-045 a 3.4e+038, colocar f al final

        //Variables String
        char caracter = 't'; //char 


        //Variables booleanas
        boolean disicion = true; 

        //Variables no primitivas
        Integer numero = null; //almacena tanto numeros como datos vacios
        String nombre = "Elver Galarga"; //String  es un tipo no primitivo

        //Costantes
        final int VELOCIDAD_LUZ = 3000000; //Son inmutables, no se puede remplazar
        

    }
}
