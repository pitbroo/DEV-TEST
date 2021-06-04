package task3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InputPoints {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger("Task3");

    static int getPointNumber(){
        System.out.println("Enter values: ");
        try{
            int n = scanner.nextInt();
            return n;
        }catch (InputMismatchException exception){
            logger.log(Level.SEVERE, "ERROR: Wrong input! Entered character is not a number");
        }
        return 0;
    }

    static List<Point> input(int n) {
        if (n != -1) {
            try {
                List<Point> points = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    Point point = new Point(a, b);
                    points.add(point);
                }
                return points;
            } catch (InputMismatchException exception) {
                logger.log(Level.SEVERE, "ERROR: Wrong input! Entered character is not a number");
            }
        }
        return null;
    }
}
