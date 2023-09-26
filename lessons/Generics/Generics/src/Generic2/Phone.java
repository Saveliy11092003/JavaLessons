package Generic2;

public class Phone extends Product<Product> {
    String model;
    public void greet(){
        System.out.println("Phone");
    }
}
