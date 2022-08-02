
public class Empresa {
    //ATRIBUTOS
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String nit;

    public empresa(String nombre, String telefono, String direccion, String emal, String nti){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nit = nit;
        
    }

    public empresa(String nombre, String direccion, String nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = "";
        this.email = "";
    }

    public empresa(){
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
        this.email = "";
        this.nit = "";
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

        
        
        

}

