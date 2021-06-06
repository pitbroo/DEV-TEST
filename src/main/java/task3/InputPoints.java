package task3;

import utils.AplicationState;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InputPoints {
    private static final Logger logger = Logger.getLogger("InputPoints");

    static Integer getPointNumber() {

        try {
            Scanner scanner = new Scanner(System.in);
            Integer number =scanner.nextInt();
            return number;
        } catch (InputMismatchException exception) {
            logger.log(Level.SEVERE, "ERROR: Wrong input! Entered character is not a number");
        }
        return null;

    }

    static List<Point> inputPoints(Integer n) {
        List<Point> points = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
            if (n != null) {
                for (int i = 0; i < n; i++) {
                    Integer a = scanner.nextInt();
                    Integer b = scanner.nextInt();;
                    if (a == null || b ==null) {
                        throw new IllegalArgumentException("User input is not a number!");
                    }
                    Point point = new Point(a, b);
                    points.add(point);
                }
                AplicationState.shouldContinue = false;
                System.out.println(points);
            }
        } catch (IllegalArgumentException e) {
            points = Collections.emptyList();
        }

        return points;
    }
}
