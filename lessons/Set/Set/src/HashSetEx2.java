import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(90);
        set.add(76);
        set.add(42);

        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(7);
        set1.add(53);
        set1.add(98);
        set1.add(132);

        Set<Integer> union = new HashSet<>(set);
        union.addAll(set1);
        System.out.println(union);

        Set<Integer> intersect = new HashSet<>(set);
        intersect.retainAll(set1);
        System.out.println(intersect);

        Set<Integer> subtract = new HashSet<>(set);
        subtract.removeAll(set1);
        System.out.println(subtract);
    }
}
