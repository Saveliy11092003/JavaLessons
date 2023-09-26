import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(3);
        list.add(2);
        int result = list.stream().reduce((accumulator, element) -> accumulator*element).get();
        System.out.println(result);

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((accumulator, element) -> accumulator*element);
        if(o.isPresent()){
            System.out.println(o.get());
        }else{
            System.out.println("Not present");
        }

        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator*element);
        System.out.println(result2);

        List<String> listStr = new ArrayList<>();
        listStr.add("privet");
        listStr.add(",");
        listStr.add("kak dela?");
        Optional str = listStr.stream().reduce((accumulator, element) -> accumulator+ " " + element);
        if(str.isPresent()){
            System.out.println(str.get());
        }else{
            System.out.println("Not present str");
        }
    }
}
