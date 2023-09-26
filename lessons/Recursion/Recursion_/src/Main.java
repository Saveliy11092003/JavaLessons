public class Main {
    public static void main(String[] args) {
        count(3);
        System.out.println("------------------");
        System.out.println(factorial(5));
    }

    public static void count(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        count(n - 1);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}