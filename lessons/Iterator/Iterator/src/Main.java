import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kto");
        list.add("ti");
        list.add("i?");
        list.add("da nu kto ti");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);
    }
}