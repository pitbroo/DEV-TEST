package task1;

import java.util.ArrayList;
import java.util.List;

public class ListDistinct {
    List<Integer> list;

    public ListDistinct(List<Integer> list) {
        this.list = list;
    }

    public static void printDistinct(List<Integer> list) {
        List<Integer> newUniqueList = new ArrayList<>();
        list.forEach(item -> {
            if (!newUniqueList.contains(item)) {
                newUniqueList.add(item);
            }
        });
        System.out.println("Unique values: " + newUniqueList.size());
    }
}
