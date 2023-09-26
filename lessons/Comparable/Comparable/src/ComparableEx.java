import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Abobik");
        list.add("kto-to");
        list.add("azazaz");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
