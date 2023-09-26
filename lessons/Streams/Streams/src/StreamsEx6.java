import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsEx6 {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 'm', 19, 5, 6.4);
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

        Map<Integer, List<Student>> map = list.stream().collect(Collectors.groupingBy(el -> el.getCource()));

        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()){
            System.out.println(entry);
        }

        System.out.println("----------------------------------");

        Map<Boolean, List<Student>> map1 = list.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade()>7));

        for (Map.Entry<Boolean, List<Student>> entry : map1.entrySet()){
            System.out.println(entry);
        }

        System.out.println("--------------------------------");
        Student st = list.stream().filter(student -> student.getSex() == 'f').findFirst().get();
        System.out.println(st);

        System.out.println("--------------------------------");
        Student stOld = list.stream().max((x,y)-> x.getAge()-y.getAge()).get();
        Student stYoung = list.stream().min((x,y)-> x.getAge()-y.getAge()).get();
        System.out.println(stOld);
        System.out.println(stYoung);

        System.out.println("--------------------------------");
        list.stream().filter(student -> student.getAge()>19).forEach(System.out::println);
        System.out.println("--------------------------------");
        list.stream().filter(student -> student.getAge()>19).limit(2).forEach(System.out::println);
        System.out.println("--------------------------------");
        list.stream().filter(student -> student.getAge()>19).skip(2).forEach(System.out::println);
    }
}
