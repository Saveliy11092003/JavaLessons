import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntEx {
    public static void main(String[] args) {
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

        List<Integer> list1 = list.stream().mapToInt(st -> st.getCource()).boxed().collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("----------------------");
        int sum = list.stream().mapToInt(st->st.getCource()).sum();
        System.out.println(sum);
        System.out.println("----------------------");
        double average = list.stream().mapToInt(st->st.getCource()).average().getAsDouble();
        System.out.println(average);
        System.out.println("----------------------");
        int min = list.stream().mapToInt(st->st.getCource()).min().getAsInt();
        System.out.println(min);
        System.out.println("----------------------");
        int max = list.stream().mapToInt(st->st.getCource()).max().getAsInt();
        System.out.println(max);
        System.out.println("----------------------");
    }
}
