import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Mariya");
        set.add("Oleg");
        set.add(null);
        set.add("Igor");
        set.add("Igor");
        set.add("Igor");
        set.add("Igor");


        System.out.println(set);

        System.out.println("--------------------");
        set.remove("Zaur");

        for (String s : set){
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Mishalka"));
    }
}
