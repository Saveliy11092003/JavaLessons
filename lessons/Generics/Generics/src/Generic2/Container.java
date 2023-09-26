package Generic2;

import java.util.List;

public class Container <T extends Product<Product>>{
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void greet(){
        System.out.println("Product");
    }

    public static boolean find(List<? extends Product<Product>> list, Product<Product> element){
        for(Product<Product> elOfList:list){
            if(elOfList.equals(element)){
                return true;
            }
        }
        return false;
    }

    public static void copy(List<? extends Product<Product>> src, List<? super Product<Product>> dst){
        for (Product<Product> product:src){
            dst.add(product);
        }
    }
}
