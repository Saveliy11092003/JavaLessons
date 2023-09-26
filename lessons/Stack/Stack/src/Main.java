import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Steve");
        stack.push("Kolya");
        stack.push("Kot");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("---------------------");
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println("---------------------");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}