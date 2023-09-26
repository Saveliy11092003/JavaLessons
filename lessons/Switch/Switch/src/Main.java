import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerForInt = new Scanner(System.in);
        int age = scannerForInt.nextInt();
        switch (age) {
            case 0:
                System.out.println("Тебе 0 лет");
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Тебе 7 лет");
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Тебе 18 лет");
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Не понял сколько тебе лет, сорри");
        }
        Scanner scannerForString = new Scanner(System.in);
        String ageToString = scannerForString.nextLine();
        switch (ageToString) {
            case "ноль":
                System.out.println("Тебе 0 лет");
                System.out.println("Ты родился");
                break;
            case "семь":
                System.out.println("Тебе 7 лет");
                System.out.println("Ты пошел в школу");
                break;
            case "восемнадцать":
                System.out.println("Тебе 18 лет");
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Не понял сколько тебе лет, сорри чел");
        }
    }
}