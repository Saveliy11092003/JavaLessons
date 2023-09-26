import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double,Student> treeMap = new TreeMap<>();

        Student st1 = new Student("AZaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Drozdov", 4);
        Student st4 = new Student("Kepka", "Tregulov", 3);
        Student st5 = new Student("dfkj","dkj",3);

        treeMap.put(3.2, st1);
        treeMap.put(4.0, st2);
        treeMap.put(6.0, st3);
        treeMap.put(3.2, st4);
        treeMap.put(1.9, st5);
        System.out.println(treeMap.get(4.0));

        System.out.println(treeMap);
        treeMap.remove(6.0);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(3.2));
        System.out.println(treeMap.headMap(3.2));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());

        TreeMap<Student,Double> treeMap2 = new TreeMap<>();


        treeMap2.put(st1, 3.2);
        treeMap2.put(st2, 4.0);
        treeMap2.put(st3, 6.0);
        treeMap2.put(st4, 3.2);
        treeMap2.put(st5, 1.9);

        System.out.println(treeMap2);
    }
}
