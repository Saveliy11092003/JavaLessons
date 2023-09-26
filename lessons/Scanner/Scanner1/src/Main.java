import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, что-нибудь");
        String string = scanner.nextLine();
        System.out.println("Вы ввели " + string);

        System.out.println("Введите, пожалуйста, число");
        int x = scanner.nextInt();
        System.out.println("Вы ввели число " + x);
    }
}