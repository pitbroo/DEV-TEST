package pl.pbrodziak;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        //1 2 10 7 5 3 6 6 13 0
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(6);
        list.add(13);
        list.add(0);

        PairList.findPair13(list);
    }
}
