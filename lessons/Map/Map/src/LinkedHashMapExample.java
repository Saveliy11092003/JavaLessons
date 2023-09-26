import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16,0.75f, true);

        Student st1 = new Student("AZaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Drozdov", 4);
        Student st4 = new Student("Kepka", "Tregulov", 3);
        Student st5 = new Student("dfkj","dkj",3);

        lhm.put(3.2, st1);
        lhm.put(4.0, st2);
        lhm.put(6.0, st3);
        lhm.put(3.2, st4);
        lhm.put(1.9, st5);

        System.out.println(lhm.get(6.0));
        System.out.println(lhm);
    }
}
