import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(50, "Zaur", 45235242);
        Employee emp3 = new Employee(75, "Frank", 24);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        Collections.sort(list);
        System.out.println(list);
    }
}

class Employee implements Comparable<Employee>{
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
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        //return this.id - anotherEmp.id;
        //return this.name.compareTo(anotherEmp.name);
        int result = this.name.compareTo(anotherEmp.name);
        if(result == 0){
            result = this.id - anotherEmp.id;
        }
        return result;
    }
}