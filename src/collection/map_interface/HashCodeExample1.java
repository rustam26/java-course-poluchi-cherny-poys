package collection.map_interface;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {

    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Rustam", "Kosimov", 4);
        Student st2 = new Student("Maria", "Sidorov", 4);
        Student st3 = new Student("Elena", "Ifimova", 4);

        map.put(st1 , 7.5);
        map.put(st2 , 5.5);
        map.put(st3 , 1.5);

        System.out.println(map);

        System.out.println(map.containsKey(st1));



//        Student st4 = new Student("Rustam", "Kosimov", 1);
//        Student st5 = new Student("Igorik", "Sidorov", 4);
//
//        boolean result = map.containsKey(st4);
//        System.out.println(result);
//
//        System.out.println(st1.hashCode());
//        System.out.println(st5.hashCode());
//
//        for (Map.Entry<Student , Double> m : map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
//
//        Map<Integer, String> map2 = new HashMap<>(16,0.75f);
//
    }
}

 final class Student implements Comparable{
    final String name;
    final String surname;
    final int course;


    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

     @Override
     public int compareTo(Object o) {
        Student student  = (Student) o;
        return this.name.compareTo(student.name);
     }
 }
