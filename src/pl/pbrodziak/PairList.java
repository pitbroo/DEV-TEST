package pl.pbrodziak;

import java.util.HashMap;
import java.util.List;

public class PairList {
    public static void findPair13(List<Integer> list){
        HashMap<Integer, Integer> pairList = new HashMap<Integer,Integer>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() ; j++) {
                if ((list.get(i) + list.get(j) == 13) && (list.get(i)<list.get(j))){
                    pairList.put( list.get(i),list.get(j) );
                }
            }
        }
        pairList.forEach((num1, num2) ->{
            System.out.println(num1+" "+num2);
        });
    }
}
