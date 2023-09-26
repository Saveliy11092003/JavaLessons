import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " my";
        String str3 = " friend";
        String strAll = str1 + str2 + str3;
        System.out.println(strAll);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" my").append(" friend");
        System.out.println(sb);

        System.out.println("--------------");
        System.out.print("dva");
        System.out.print("tri");
        System.out.println();
        System.out.printf("This is digit %d and %s and %f and %g", 398973, "Hello", 34.34f, 343.332);
        System.out.println("---------------");
        System.out.printf("This is digit - %-10d \n", 3453);
        System.out.printf("This is digit - %-10d \n", 1);
        System.out.printf("This is digit - %-10d \n", 34);
        System.out.println("---------------");
        System.out.printf("This is digit - %10.2f \n", 345544533423.34234324234);
        System.out.printf("This is digit - %10.2f \n", 1.342343);
        System.out.printf("This is digit - %10.2f \n", 34.34344);
    }
}