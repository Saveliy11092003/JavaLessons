package Exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
