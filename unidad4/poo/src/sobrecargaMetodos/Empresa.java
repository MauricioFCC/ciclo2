
public class Empresa{
    //ATRIBUTOS
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String nit;
    private Carro[] carros;

    public Empresa(String nombre, String telefono, String direccion, String emal, String nti){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nit = nit;
        carros = new Carro[50];
    }

    public Empresa(String nombre, String direccion, String nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = "";
        this.email = "";
        carros = new Carro[50];
    }

    public Empresa(){
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
        this.email = "";
        this.nit = "";
        carros = new Carro[50];
    }

    

    /**********************
     * METODOS CONSULTORES
     **********************/
    public String getNombre(){
        return nombre;
     }
     public String getTelefono(){
        return telefono;
     }
     public String getDireccion(){
        return direccion;
     }
     public String getEmail(){
        return email;
     }
     public String getNit(){
        return nit;
     }
     
     public Carro getCarro(int pos){
        return carros[pos];
     }

     //RETORNANDO EL TAMANIO DEL ARREGLO
    public int lengthCarro(){
        return carros.length;
    }
     /************************
     * METODOS MODIFICADORES
     ************************/
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }
    public void SetDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void SetTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void SetEmail(String email) {
        this.email = email;
    }
    public void setCarros(Carro carro, int pos){
        carros[pos] = carro;
    }
    public void clearCarros(){
        //Recorrer el arreglo
        int tamanio = carros.length;
        for(int i = 0; i < carros.length; i++){
            //Limpiar el arreglo
            carros[i] = null;
        }
    }   
    //ACCIONES
    public void fabrica_carro(String placa, String modelo){
        Carro carro = new Carro(placa, modelo);
        //Valida si la posicion esta vacia
        //----------Opcion 1------------------
        boolean flag = false;
        int pos = 0;
        do{
            if(carros[pos] == null){
                carros[pos] = carro;
                flag = true;
            }
            //Incrementa en una unidad
            ++pos;
        }while(flag == false && pos < carros.length);

        /*---------Opcion 2------------------
            
            bolean flag = false;
            int pos = 0;
                while(flag == false && pos < carros.length){
                    if(carros[pos] == null){
                    carros[pos] = carro;
                    flag = true;
                    }
                    ++pos;
                }
          ----------Opcion 3------------------

            for(int i = 0; i < carros.length; i++){
                if(carros[i] != null){
                    carros[i] = carro;
                    break;
                }
            }
        */

        
    }
    public void solicitar_datos_carros(){
        try(Scanner leer = new Scanner(System.in)){
            
            System.out.print("POr favor ingrese la placa del vehiculo: "); //Mostrar mensaje en pantalla
            String placa = leer.nexline(); //Capturar lo que ingrese el usuario

            System.out.println("Por favor ingrese el modelo del vehiculo: ");
            String modelo = leer.nexline();

            //Fabricar carro
            fabrica_carro(placa, modelo);
        }
        catch(Exception error){
            System.err.println(error.getMessage());
        }
    }
    // Mostrar la info de todos los carros
    public void mostrar_carros(){
        for(int i = 0; i < carros.length; i++){
            System.out.println(carros[i]);
        }
    }
    //Mostrar la info de un solo carro
    public void mostrar_carro(int pos){
        for(int i = 0; i < carros.length; i++){
            System.out.println(carros[pos]);
        }
    }
    public void menu(){
        String mensaje = "------------------FABRICA DE CARROS----------------------\n";
        mensaje += "1) Fabricar carro\n";
        mensaje += "2) Mostrar carro carros\n";
        mensaje += "3) Mostrar carro por posicion\n";
        mensaje += "-1) Salir\n";
        mensaje += ">>>";

        int opc = 0;
        while(opc !=)
    }

}

