import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Steve");
        vector.add("Kolya");
        vector.add("Kot");
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(0));
    }
}