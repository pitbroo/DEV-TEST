package task3;

import java.util.List;

import static utils.AplicationState.shouldContinue;

public class Task3 {
    public static void main(String[] args) {
        List<Point> pointList;
        Integer n;
        while (shouldContinue) {
            System.out.println("Enter n and values: ");
            n = InputPoints.getPointNumber();
            pointList = InputPoints.inputPoints(n);
            SeparatedGraphs.count(pointList);
        }
    }
}
