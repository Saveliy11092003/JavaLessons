package Generic2;

import java.util.List;

public class Util {
    public static void copy(List<? extends Product<Product>> src, List<? super Product<Product>> dst){
        dst.addAll(src);
    }
}
