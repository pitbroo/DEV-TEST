package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 {
    public static boolean shouldContinue = true;
    private static final Logger logger = Logger.getLogger("Task3");

    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<>();
        int n;
        try {
            while (shouldContinue) {

                n = InputPoints.getPointNumber();
                pointList = InputPoints.input(n);
                SeparatedGraphs.count(pointList);
            }
        } catch (NullPointerException exception) {
            logger.log(Level.SEVERE, "ERROR: Wrong input! Entered character is not a number");
        }
    }
}
