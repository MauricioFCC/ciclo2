
public class Carro {
    //ATRIBUTOS
    private String color;
    private Double vel_maxima;
    private String modelo;
    private String placa;

    public carro(String color, Double vel_maxima, String modelo, String placa){
        this.color = color;
        this.vel_maxima = vel_maxima;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Carro(String placa, String modelo){
        inicializar();
        this.placa = placa;
        this.modelo = modelo;
    }

    public Carro(){
        inicializar();
    }

    @Override
    public String toString(){
        //convierte a String
        String info = "-------------------------------CARRO-------------------------------\n";
        info += "Color: " + color;
        info += "\nVelocidad maxima: " + vel_maxima;
        info += "\nModelo: " + modelo;
        info += "\nPlaca: " + placa;
        info += "\n-----------------------------------------------------------------------";
        return info;
    }

    public void inicializar(){
        this.color = "";
        this.vel_maxima = 0.0;
        this.modelo = "";
        this.placa = "";
    }

    /**********************
     * METODOS CONSULTORES
     **********************/
    public String getColor() {
        return color;
    }

    public Double getVel_maxima() {
        return vel_maxima;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
    /************************
     * METODOS MODIFICADORES
     ************************/
    public void setColor(String color) {
        this.color = color;
    }

    public void setVel_maxima(Double vel_maxima) {
        this.vel_maxima = vel_maxima;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    //ACCIONES
    public void acelerar(){
        System.out.println("Ecelerando...");
    }
    public void fenar(){
        System.out.println("Frenando...");
    }
    public void girar_izquierda(){
        System.out.println("Girando a la izquierda...");
    }
    public void girar_derecha(){
        System.out.println("Girando a la derecha...");
    }
    
    
    
    
}
