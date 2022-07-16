
public class Estudiante extends Persona {
    //Atributos
    private int estudentCode;
    private float finalNote;

    //Contructor
    public Estudiante(String name, String lastName, int age, int estudentCode, float finalNote){
        super(name, lastName, age);
        //this.variable = Atributo
        //variable = Parametro
        this.estudentCode = estudentCode;
        this.finalNote = finalNote;
    
    }
    public int getEstudentCode(){
        return estudentCode;
    }
    public float getFinalCode(){
        return finalNote;
    }
    public void showData(){
        System.out.println("The estudent name is: " + getName());
        System.out.println("The estudent last name is: " + getLastName());
        System.out.println("The estudent age is: " + getAge());
        System.out.println("The estudent code is: " + estudentCode); //locales
        System.out.println("The estudent note is: " + finalNote); //locales
        System.out.println("-------------------------------------------------");
    }
}
