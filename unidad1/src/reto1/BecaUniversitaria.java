
//Atributos
private Int pTiempo;
private Double pMonto;
private Double pInteres;

//Constructores
public BecaUniversitaria(Int pTiempo, Double pInteres, Double pMonto){
     //this.pTiempo = Atributo
    //pTiempo = Parametro
    this.pTiempo = pTiempo;
    this.pMonto = pMonto;
    this.Interes = pInterest;
}
public BecaUniversitaria(){
    this.pTiempo = 0;
    this.pMonto = 0.0;
    this.Interes = 0.0;
}
//Acciones/ Metodos
public class BecaUniversitaria {
    public String compararInversion(Int pTiempo, Double pInteres, Double pMonto){
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $";
    }

    public String compararInversion(){
        Double compararInversion = interesCompuesto() - interesSimple();
        return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }

    public Double calcularInteresSimple(){
        Double interesSimple = Math.round(pMonto * (interes /100) * pTiempo);
        return interesSimple;
    }

    public Double calcularInteresCompuesto(){
        Double interesCompuesto = Math.round(pMonto * Math.pow((1 + (pInteres / 100)), pTiempo - 1));
        return 0.0;
    }
}
