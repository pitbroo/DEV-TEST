package pl.pbrodziak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //input
        list.add(4);
        list.add(9);
        list.add(14);
        list.add(7);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(5);
        System.out.println(list);
        //output
        Collections.sort(list);
        System.out.println("sorted list: "+list);

        System.out.println("size: "+list.size());
        System.out.println("MIN: "+list.get(0));
        System.out.println("MAX: "+(list.get(list.size()-1)));
        ListDistinct.printDistinct(list);


    }
}
