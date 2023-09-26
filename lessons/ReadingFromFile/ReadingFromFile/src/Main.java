import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       String separator = File.separator;
       String path = separator + "home" + separator + "user" + separator +"Рабочий стол" + separator + "file";
       File file = new File(path);
       Scanner scanner = new Scanner(file);
       while(scanner.hasNextLine()){
           System.out.println(scanner.nextLine());
       }
       scanner.close();

       File file1 = new File("/home/user/Рабочий стол/file1");
       Scanner scanner1 = new Scanner(file1);
       String line = scanner1.nextLine();
       String[] words = line.split(" ");
       System.out.println(Arrays.toString(words));

        File file2 = new File("test");
        Scanner scanner2 = new Scanner(file2);
        String line1 = scanner2.nextLine();
        String[] digits = line1.split(" ");
        int count = 0;
        int[] digitInt = new int[digits.length];
        for(String digit : digits){
            digitInt[count++] = Integer.parseInt(digit);
        }
        int sum = 0;
        for(int digit_ : digitInt){
            sum += digit_;
        }
        System.out.println(sum);
    }
}