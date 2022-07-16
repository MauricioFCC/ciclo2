public class Operacion{
    //Atributos
    float addition, subtract, multiplication, division;
    //metodos: get, set
    public float additions(float numberA, float numberB){
        addition = numberA + numberB;
        return addition;
    }
    public float subtration(float numberA, float numberB){
        subtract = numberA - numberB;
        return subtract;
    }
    public float multiplications(float numberA, float numberB){
        multiplication = numberA * numberB;
        return multiplication;
    }
    public float divisions(float numberA, float numberB){
        division = numberA / numberB;
        return division;
    }
    public void showData(float addition, float subtract, float multiplcation, float division){
        System.out.println("The addition is: " + addition);
        System.out.println("The subtration is: " + subtract);
        System.out.println("The multiplcation is: " + multiplication);
        System.out.println("The divition is: " + division);
    }
}