public class MainColegio {
    public static void main(String[] args) throws Exception{
        Estudiante student1 = new Estudiante("Mauricio", "Carvajal", 33, 999, 5.0f);
        student1.showData();
        Estudiante student2 = new Estudiante("Estefania", "Vargas", 28, 777, 1.8f);
        student2.showData();

        Docente teacher1 = new Docente("Emilia", "Rubio", 45, 9991, 2000000f);
        teacher1.showData();

        Administrativo employee1 = new Administrativo("Juan", "Sabina", 33, 2345, 1500000f);
        employee1.showData();

        Colegio school1 = new Colegio("Juan manuel", "Cordoba", 22, "Mision TIC", 2022);
        school1.showData();
    }
}
