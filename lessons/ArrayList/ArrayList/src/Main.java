import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> arrayList1 = new ArrayList<>(3);
        arrayList1.add("chto");
        arrayList1.add("chto");
        arrayList1.add("chto");
        arrayList1.add("chto");
        System.out.println(arrayList1);
        System.out.println("-----------------------------------");
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        //methods of ArrayList

        //add
        List<String> list = new ArrayList<>();
        list.add("vova");
        list.add("goga");
        list.add("store");
        list.add(2,"kepka");
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(34);


        //get
        System.out.println(list.get(0));

        //set - меняем объект с указанным индексом на указанный объект\
        list.set(1,"pety");
        System.out.println(list.get(1));

        //remove
        list.remove(2);
        System.out.println(list);
        list.remove("pety");
        System.out.println(list);

        //addAll
        System.out.println("--------------------");
        List<String> list3 = new ArrayList<>();
        list3.add("vova");
        list3.add("goga");
        list3.add("store");

        List<String> list4 = new ArrayList<>();
        list4.add("ski");
        list4.add("food");

        list3.addAll(2,list4);
        list3.add("food");
        System.out.println(list3);

        System.out.println("---------------------------");

        //indexOf
        System.out.println(list3.indexOf("food"));

        System.out.println("---------------------------");
        //lastIndexOf
        System.out.println(list3.lastIndexOf("food"));

        //size
        System.out.println("--------------------------------");
        System.out.println(list3.size());

        //contains - проверка, есть ли такой объект на основе метода equals
        System.out.println("--------------------------------");
        System.out.println("есть ли элемент store - " + list3.contains("store"));

        //clear
        list3.clear();
        System.out.println(list3);

        System.out.println("--------------------------------");
        System.out.println("пуст ли лист - " + list3.isEmpty());

        //----------------------------------МЕТОДЫ СВЯЗАННЫЕ С ARRRAY LIST--------------------------------------------

        //Arrays.asList
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder [] stringBuilders = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list5 = Arrays.asList(stringBuilders);
        sb1.append("#@$");
        StringBuilder sb5 = new StringBuilder("E");
        System.out.println(list5.get(3));
        System.out.println(list5);

        //removeAll

        System.out.println("----------------------");

        List<String> list6 = new ArrayList<>();
        list6.add("vova");
        list6.add("goga");
        list6.add("store");
        list6.add(2,"kepka");
        System.out.println(list6);

        List<String> list7 = new ArrayList<>();
        list7.add("vova");
        list7.add("store");

        list6.removeAll(list7);
        System.out.println(list6);
        System.out.println("----------------------");

        //retainAll
        List<String> list8 = new ArrayList<>();
        list8.add("vova");
        list8.add("goga");
        list8.add("store");
        list8.add(2,"kepka");
        System.out.println(list8);

        List<String> list9 = new ArrayList<>();
        list9.add("vova");
        list9.add("store");

        list8.retainAll(list9);
        System.out.println(list8);
        System.out.println("----------------------");

        //containsAll
        List<String> list10 = new ArrayList<>();
        list10.add("vova");
        list10.add("goga");
        list10.add("store");
        list10.add(2,"kepka");
        System.out.println(list8);

        List<String> list11 = new ArrayList<>();
        list11.add("vova");
        list11.add("store");

        System.out.println(list10.containsAll(list11));
        System.out.println("----------------------");

        //sublist

        List<String> list12 = new ArrayList<>();
        list12.add("vova");
        list12.add("goga");
        list12.add("store");
        list12.add(2,"kepka");
        System.out.println("List = " + list12);
        List<String> list13 = list12.subList(1,3);
        list13.add("Erampa");
        System.out.println("Sub List = " + list13);
        System.out.println("List = " + list12);
   //     list12.add("dkjfal"); ---------------------  Нельзя так делать!!!!!!
        System.out.println("-------------------------");

        List<String> list14 = new ArrayList<>();
        list14.add("vova");
        list14.add("goga");
        list14.add("store");
        list14.add(2,"kepka");

        //toArray
        Object [] arrayObject = list14.toArray();
        String [] arrayString = list14.toArray(new String[0]);
        for(String str:arrayString){
            System.out.println(str);
        }
        System.out.println("--------------------");

        //List.of - получаются неизменяемые листы в результате
        List<Integer> list15 = List.of(1,34,22);
        System.out.println(list15);

        System.out.println("------------------------");
        //List.copyOf
        List<Integer> list16 = List.copyOf(list15);
        System.out.println(list15);
    }
}

class Person{
    int a;
    int b;
    String c;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return a == person.a && b == person.b && Objects.equals(c, person.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}