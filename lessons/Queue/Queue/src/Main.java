import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Marya");
        queue.add("Oleg");
        queue.add("Igor");
        queue.add("Sasha");
        //add - выбрасывает exception, offer - не выбрасывает exception
        System.out.println(queue);
        System.out.println(queue.remove());
        //remove - выбрасывает exception, poll - не выбрасывает exception(Если в очереди нет элемента, вернет null)
        //element - посмотреть верхний элемент
        //element - выбрасывает exception, peek - не выбрасывает exception(Если в очереди нет элемента, вернет null)
        System.out.println(queue);
    }
}