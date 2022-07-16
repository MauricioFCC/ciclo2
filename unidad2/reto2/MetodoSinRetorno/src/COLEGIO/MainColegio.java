public class MainColegio {
    public static void main(String[] args) throws Exception{
        Estudiante student1 = new Estudiante("Mauricio", "Carvajal", 33, 999, 5.0f);
        student1.showData();
        Estudiante student2 = new Estudiante("Estefania", "Vargas", 28, 777, 1.8f);
        student2.showData();
    }
}
