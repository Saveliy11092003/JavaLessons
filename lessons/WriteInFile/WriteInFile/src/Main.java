import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("first line");
        printWriter.println("second line");
        printWriter.close();
    }
}