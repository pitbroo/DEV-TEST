package ReaderAndParser;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputReader {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger("Task1");

    public static String input() {

        System.out.println("enter values");
            String listString = scanner.nextLine();
            return  listString;
    }
}
