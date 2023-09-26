import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsEx5 {
    public static void main(String[] args) {
        int[] array = {3,212,54,65,4,632,23};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        Student st1 = new Student("Zaur", 'm', 19, 3, 6.4);
        Student st2 = new Student("Mariya", 'f', 23, 1, 7.8);
        Student st3 = new Student("Nikolay", 'm', 22, 2, 2.3);
        Student st4 = new Student("Kobek", 'm', 20, 4, 9.0);
        Student st5 = new Student("Sasha", 'f', 26, 2, 8.9);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        list = list.stream().sorted((x,y) -> {return x.getName().compareTo(y.getName());}).toList();
        System.out.println(list);
    }
}
