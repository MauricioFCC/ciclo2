public class Colegio extends Persona {
    //Atributos
    private String schoolName;
    private int schoolCode;

    //Constructor
    public Colegio(String name, String lastName, int age, String schoolName, int schoolCode){
        super(name, lastName, age);
        //this.variable = Atributo
        //variable = Parametro
        this.schoolName = schoolName;
        this.schoolCode = schoolCode;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public int getSchoolCode(){
        return schoolCode;
    }
    //Imprimir los datos
    public void showData(){
        System.out.println("The estudent name is: " + getName());
        System.out.println("The estudent last name is: " + getLastName());
        System.out.println("The estudent age is: " + getAge());
        System.out.println("The school name is: " + schoolName); //locales
        System.out.println("The school code is: " + schoolCode); //locales
        System.out.println("-------------------------------------------------");
    }
}
