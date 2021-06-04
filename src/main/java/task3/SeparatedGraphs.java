package task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeparatedGraphs {


    static void count(List<Point> pointList) {
        if (!pointList.isEmpty()) {

                List<Point> sortedPointList = pointList.stream()
                        .sorted(Comparator.comparing(Point::getA))
                        .collect(Collectors.toList());
                int separatedGraphs = 1;
                for (int i = 0; i < sortedPointList.size() - 1; i++) {
                    if (pointList.get(i) == sortedPointList.get(i++)) {
                        separatedGraphs++;
                    }
                }
                System.out.println("Separated graphs: " + separatedGraphs);
                Task3.shouldContinue = false;

        }
    }
}
