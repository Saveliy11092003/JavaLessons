import java.util.*;
import java.util.stream.Collectors;

public class StreamsEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");
        List<Integer> list2 = list.stream().map(element -> element.length()).toList();
        System.out.println(list2);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }
        System.out.println(list);


        int[] array = {5,9,3,8,1};
        int[] arrayNew = Arrays.stream(array).map(element -> {
            if(element % 3 == 0){
                return element/3;
            }else{
                return element;
            }
        }).toArray();
        System.out.println(Arrays.toString(arrayNew));
        System.out.println("------------------");

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);
        Set<Integer> setNew = set.stream().map(element -> element.length()).collect(Collectors.toSet());
        List<Integer> listNew = set.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(setNew);
        System.out.println(listNew);
    }
}
