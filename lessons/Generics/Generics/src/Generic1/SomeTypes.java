package Generic1;

import java.util.Collection;
import java.util.List;

public class SomeTypes<T> {
    public <T> void test(Collection<T> collection){
        for (T el : collection){
            System.out.println(el);
        }
    }

    public void test(List<Integer> list){
        for (Integer integer : list){
            System.out.println(integer);
        }
    }
}
