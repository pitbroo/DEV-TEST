package task1;

import java.util.ArrayList;
import java.util.List;

public class ListDistinct {
    List<Integer> list;

    public ListDistinct(List<Integer> list) {
        this.list = list;
    }

    public static void printDistinct(List<Integer> list) {
        List<Integer> NewUniqueList = new ArrayList<>();
        list.forEach(item -> {
            if (!NewUniqueList.contains(item)) {
                NewUniqueList.add(item);
            }
        });
        System.out.println("Unique values: " + NewUniqueList.size());
    }
}
