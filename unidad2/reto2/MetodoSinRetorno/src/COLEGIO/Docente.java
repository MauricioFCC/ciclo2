public class Docente {
    //Atributos
    private int teacherCode;
    private float salary;

    //Contructor
    public teacher(String name, String lastName, int age, int teacherCode, float salary){
        super(name, lastName, age);
        //this.variable = Atributo
        //variable = Parametro
        this.teacherCode = teacherCode;
        this.salary = salary;
    }
    public int getTeacherCode(){
        return teacherCode;
    }
    public float getSalary(){
        return salary;
    }
    //Imprimir los datos
    public void showData(){
        System.out.println("The teacher name is: " + getName());
        System.out.println("The teacher last name is: " + getLastName());
        System.out.println("The teacher age is: " + getAge());
        System.out.println("The teacher code is: " + teacherCode); //locales
        System.out.println("The teacher salary is: " + salary); //locales
        System.out.println("-------------------------------------------------");
    }
}
