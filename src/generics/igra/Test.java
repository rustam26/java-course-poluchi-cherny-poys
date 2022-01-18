package generics.igra;

public class Test {

    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 12);

        Schoolar schoolar3 = new Schoolar("Sergey", 15);
        Schoolar schoolar4 = new Schoolar("Oly", 13);


        Student student1 = new Student("Nikolya", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee( "Rustam", 23);
        Employee employee2 = new Employee( "Misha", 30);

        Team<Schoolar> schoolarTeam = new Team<>("Drakoni");
        Team<Schoolar> schoolarTeam2 = new Team<>("Mudrerci");
        Team<Student> studentTeam = new Team<>("Vpered");
        Team<Employee> employeeTeam = new Team<>("Rabota");


        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
//        schoolarTeam.addNewParticipant(student2);

        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
//        schoolarTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String> employeeTeam = new Team<>("Rabota");

        schoolarTeam.playWith(schoolarTeam2);


    }
}
