import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /////////////////// Java 5 ///////////////////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("mouse");
        String animal = (String) animals.get(1);
        System.out.println(animal);
        System.out.println("----------------------------");
        ///////////////// С появлением дженериков ///////////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("mouse");
        String animal2 = animals2.get(0);
        System.out.println(animal2);
        ////////////////// Java 7 ////////////////////////////////
        List<String> animals3 = new ArrayList<>();
    }
}