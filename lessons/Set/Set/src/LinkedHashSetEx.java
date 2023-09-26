import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        //Запоминает в каком порядке добавлены элементы
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(2);
        lhs.add(3);
        lhs.add(10);
        lhs.add(11);
        System.out.println(lhs);
    }
}
