package anonimusClass;

public class Main {
    public static void main(String[] args) {
        Math m = new Math() {
            int v = 10;
            static void abc(){
                System.out.println("dadada");
            }
            @Override
            public int doOperation(int a, int b) {
                abc();
                return a+b;
            }
        };
        System.out.println(m.doOperation(5,7));
    }
}

interface Math{
    int doOperation(int a, int b);
}
