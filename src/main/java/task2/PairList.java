package task2;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static utils.AplicationState.shouldContinue;

public class PairList {
    private static final Logger logger = Logger.getLogger("PairList");

    public static void findPairWithSum(List<Integer> numbers, int sum) {
        if (!numbers.isEmpty()) {
            HashMap<Integer, Integer> pairList = new HashMap<Integer, Integer>();
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = 0; j < numbers.size(); j++) {
                    if ((numbers.get(i) + numbers.get(j) == sum) && (numbers.get(i) < numbers.get(j))) {
                        pairList.put(numbers.get(i), numbers.get(j));
                    }
                }
            }
            pairList.forEach((num1, num2) -> {
                System.out.println(num1 + " " + num2);
            });
        } else {
            shouldContinue = true;
            logger.log(Level.SEVERE, "List of numbers is Empty!");
        }
    }
}
