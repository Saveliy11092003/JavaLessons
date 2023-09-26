package Exception4;

import java.awt.print.PrinterException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | PrinterException e) {
            throw new RuntimeException(e);
        }
    }
    public static void run() throws IOException, PrinterException {

    }
}
