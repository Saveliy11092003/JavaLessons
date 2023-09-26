import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            x = scanner.nextInt();
            System.out.println("Введи 5");
        } while (x != 5);
        System.out.println("Ура!!! Вы ввели " + x);
    }
}