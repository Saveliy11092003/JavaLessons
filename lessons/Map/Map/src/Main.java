import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1000,"Zaur");
        map.put(784,"tri");
        map.put(926,"fto");
        map.put(253748,"fto");
        System.out.println(map);
        map.putIfAbsent(1000, "odin");
        System.out.println(map);
        System.out.println("------------------");
        System.out.println(map.get(1000));
        map.remove(784);
        System.out.println(map);
        System.out.println(map.containsValue("Zaur"));
        System.out.println(map.containsKey(3424));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}