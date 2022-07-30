public class poo {
    public static void main(String[] args) throws Exception {
        //Costruir un objeto tipo persona
        Persona objetoPersona = new Persona("Mauricio", "carvajal");
        //obtener el los metodos consultores
        String nombre = objetoPersona.getNombre();
        String apellido = objetoPersona.getApellido();


        System.out.println("Nombre: " + nombre + " Apellido: " + apellido);

        Persona objetoPersona2 = new Persona("Juan", "Fernandez" );
        Persona objetoPersona3 = new Persona("Pedro", "Arcila" );
        
        //set son los modificadores
        objetoPersona3.SetEdad(44);
        //get son los consultores
        int edad = objetoPersona3.getEdad();
        apellido = objetoPersona3.getApellido();
        System.out.println(apellido + " Tiene una edad de: " + edad);
    }


}
