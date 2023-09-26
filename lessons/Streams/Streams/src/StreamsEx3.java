import java.util.Arrays;

public class StreamsEx3 {
    public static void main(String[] args) {
        int[] array = {3,2,43,4,7};
        Arrays.stream(array).forEach(element
                -> {element *= 2;
                    System.out.println(element);});
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------");
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("---------------------");
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils{
    public static void myMethod(int a) {
        a = a+5;
        System.out.println("Element = " + a);
    }
}
