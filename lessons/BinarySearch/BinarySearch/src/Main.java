import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(100, "Zaur");
        Employee employee2 = new Employee(15, "Ivan");
        Employee employee3 = new Employee(123, "Petr");
        Employee employee4 = new Employee(15, "Mariya");
        Employee employee5 = new Employee(182, "Kolya");
        Employee employee6 = new Employee(15, "Sasha");
        Employee employee7 = new Employee(250, "Elena");
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);
        arrayList.add(employee5);
        arrayList.add(employee6);
        arrayList.add(employee7);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        int index = Collections.binarySearch(arrayList, new Employee(123,"Petr"));
        System.out.println(index);

        int[] array = {-3,8,12,-8,0,5,10,1,150,-30,19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index2 = Arrays.binarySearch(array, 150);
        System.out.println(index2);

    }
}

class Employee implements Comparable<Employee>{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if(result == 0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}