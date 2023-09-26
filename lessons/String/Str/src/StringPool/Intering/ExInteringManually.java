package StringPool.Intering;

public class ExInteringManually {

    public static void main(String[] args) {
        String string1 = "Yes";
        String string2 = new String("Yes").intern();//Не рекомендуется использовать
        String string3 = new String("Yes");

        System.out.println(string1 == string2);
        System.out.println(string1 == string3);



    }
}
