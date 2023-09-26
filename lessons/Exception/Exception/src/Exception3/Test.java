package Exception3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Checked exception (Compile time exception) = исключительные случаи в работе программы

        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //Unchecked exception (Runtime exception) = ошибка в работе программы

        //int v = 1/0; //Arithmetical exception

        /*String str = null;
        str.length();
        NullPointerException
         */

        /*int[] array = new int[2];
        System.out.println(array[2]);
        ArrayIndexOutOfBoundsException
         */
    }
}
