package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);
        System.out.println(arrayList);
       // Collections.reverse(arrayList);
        System.out.println(arrayList);

        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1);

//        Employee emp1 = new Employee(100, "Rustam", 12345);
//        Employee emp2 = new Employee(15, "Oly", 155);
//        Employee emp3 = new Employee(123, "Aleksandr", 945);
//        Employee emp4 = new Employee(15, "Andrey", 1789);
//        Employee emp5 = new Employee(182, "Ivan", 156);
//        Employee emp6 = new Employee(15, "Misha", 8965);
//        Employee emp7 = new Employee(250, "Lena", 3451);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//
//        Collections.sort(employeeList);
//
//        System.out.println(employeeList);
//
//        int index2 = Collections.binarySearch( employeeList, new Employee(182, "Ivan", 156));
//
//        System.out.println(index2);

//        int[] array = {-3,8,12,-8,0,5,10,1,150,-30,19};
//
//        System.out.println(Arrays.toString(array));
//
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        int index3 = Arrays.binarySearch(array,150);
//        System.out.println(index3);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;


    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}' + "\n";
    }

    @Override
    public int compareTo(Employee anotherEmployee) {

        int result = this.id - anotherEmployee.id;

        if (result == 0) {
            result = this.name.compareTo(anotherEmployee.name);
        }
        return result;
    }
}
