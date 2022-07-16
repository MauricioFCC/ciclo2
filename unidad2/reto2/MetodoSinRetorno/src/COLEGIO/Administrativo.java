public class Administrativo extends Persona {
     //Atributos
    private int employeeCode;
    private float employeeSalary;

    //Constructor
    public Administrativo(String name, String lastName, int age, int employeeCode, float employeeSalary){
        super(name, lastName, age);
        //this.variable = Atributo
        //variable = Parametro
        this.employeeCode = employeeCode;
        this.employeeSalary = employeeSalary;
    }
    public int getEmployeeCode(){
        return employeeCode;
    }
    public float getEmployeeSalary(){
        return employeeSalary;
    }
    //Imprimir los datos
    public void showData(){
        System.out.println("The estudent name is: " + getName());
        System.out.println("The estudent last name is: " + getLastName());
        System.out.println("The estudent age is: " + getAge());
        System.out.println("The employee code is: " + employeeCode); //locales
        System.out.println("The employee salary is: " + employeeSalary); //locales
        System.out.println("-------------------------------------------------");
    }
}
