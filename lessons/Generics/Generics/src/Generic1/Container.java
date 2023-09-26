package Generic1;

import java.util.ArrayList;
import java.util.List;

public class Container<T> {

    public static void main(String[] args){
        List list = new ArrayList<>();
        List<String> rowList = new ArrayList<>();

        rowList.add("Kto");
        rowList.add("Chto");

        list = rowList;
        System.out.println(list);


        System.out.println("*****************");

        List rowList1 = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        rowList1 = list1;
        rowList1.add(8);
        System.out.println(rowList1);

    }
    private T abc;

    <E> E process(E element){
        return element;
    }

    <V, K> K map(V element) {
        return null;
    }
}
