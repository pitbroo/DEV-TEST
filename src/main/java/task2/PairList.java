package task2;

import java.util.HashMap;
import java.util.List;

public class PairList {
    public static void findPair13(List<Integer> numbers){
        if (numbers != null) {
        HashMap<Integer, Integer> pairList = new HashMap<Integer,Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() ; j++) {
                if ((numbers.get(i) + numbers.get(j) == 13) && (numbers.get(i)<numbers.get(j))){
                    pairList.put( numbers.get(i),numbers.get(j) );
                }
            }
        }
        pairList.forEach((num1, num2) ->{
            System.out.println(num1+" "+num2);
            });
        }
    }
}
