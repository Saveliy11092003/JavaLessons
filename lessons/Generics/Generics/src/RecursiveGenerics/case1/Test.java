package RecursiveGenerics.case1;

public class Test {
    public static void main(String[] args) {
        Camera camera1 = new Camera(4);
        Camera camera2 = new Camera(5);

        Product product1 = new Product(45);
        Product product2 = new Product(32);

        System.out.println(camera1.compareTo(camera2));
        System.out.println(product1.compareTo(product2));
    }
}
