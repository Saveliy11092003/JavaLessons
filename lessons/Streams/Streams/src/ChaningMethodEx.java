import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChaningMethodEx {
    public static void main(String[] args) {
        Integer[] array = {3,8,1,5,9,12,4,21,81,7,18};
        Optional<Integer> opt = Arrays.stream(array).filter((element)->{return element % 2 == 1;}).map((element) ->{if(element%3==0){return element/3;}
            else{return element;}})
                .reduce((ac,el) ->ac + el);
        if(opt.isPresent()){
            System.out.println(opt.get());
        }
        else {
            System.out.println("not present");
        }
        System.out.println("-----------------");

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

        list.stream().map((element) ->{
            element.setName(element.getName().toUpperCase());
            return element;}).filter((element) -> element.getSex() == 'f')
                .sorted((el1,el2) ->el1.getAge()- el2.getAge()).forEach((el)->{
                    System.out.println(el);
                });

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);

        System.out.println("----------------------");

        Stream<Integer> stream4 = Stream.of(6,7,8,9,10,5,4,6,7,8);
        stream4.distinct().forEach(System.out::println);

        Stream<Integer> stream5 = Stream.of(6,7,8,9,10,5,4,6,7,8);
        System.out.println("--------------------");
        System.out.println(stream5.distinct().peek(System.out::println).count());
    }

}
