package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {

            if (pr.test(s)) {

                System.out.println(s);
            }

        }

    }

}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Marina", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();



//        System.out.println(students     );
//        info.testStudents(students, (Student s) -> {
//            return s.avgGrade > 8;
//        });
//
//        info.testStudents(students, s -> {return s.avgGrade > 8;});
//        info.testStudents(students, (Student s) ->  s.avgGrade > 8);
//
//        info.testStudents(students, s -> s.avgGrade > 8);

//        Predicate<Student> p1= student ->student.avgGrade > 7.5;
//        Predicate<Student> p2= student -> student.sex == 'm';
//
//
//        info.testStudents(students,p1.negate());
//
//        System.out.println("---------------------------");
//
//        info.testStudents(students, (Student s) -> {
//            return s.age < 30;
//        });
//        System.out.println("---------------------------");

//        info.testStudents(students, (Student s) -> {
//            return s.age < 20 && s.avgGrade < 9.3 && s.sex == 'f';
//        });
//        System.out.println("---------------------------");


        Function<Student, Double> f = student -> student.avgGrade;

        double res =avgOgSmth(students, student -> (double)student.age);
        System.out.println(res);
    }

    private static double avgOgSmth(List<Student> list,Function <Student, Double>  f){

        double result = 0;

        for (Student st:list){
            result+=f.apply(st);
        }

        result = result/ list.size();
        return  result;
    }
}

interface StudentsChecks {

    boolean check(Student s);
}

class CheckOverGrade implements StudentsChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}