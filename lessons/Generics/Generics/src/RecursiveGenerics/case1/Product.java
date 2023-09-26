package RecursiveGenerics.case1;

public class Product<T extends Product<T>> implements Comparable<T>{
    String name;
    protected Integer price;

    @Override
    public int compareTo(T o) {
        return this.price.compareTo(o.price);
    }

    public Product(Integer price) {
        this.price = price;
    }
}
