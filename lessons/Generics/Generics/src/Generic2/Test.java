package Generic2;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void copy(List<? extends Product<Product>> src, List<? super Product<Product>> dst){
        for (Product<Product> pr : src){
            dst.add(pr);
        }
    }

    public static void main(String[] args) {
        List<Product<Product>> products1 = new ArrayList<>();
        List<Product<Product>> products2 = new ArrayList<>();

        products1.add(new Product<Product>());
        products1.add(new Product<Product>());

        List<Phone> phones1 = new ArrayList<>();
        List<Phone> phones2 = new ArrayList<>();

        copy(products1, products2);
        System.out.println(products1);
        System.out.println(products2);
    }
}
