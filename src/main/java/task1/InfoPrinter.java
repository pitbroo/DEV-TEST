package task1;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class InfoPrinter {
    private static final Logger logger = Logger.getLogger("Task1");
    static void print(List<Integer> numbers){
            System.out.println("sorted list: " + numbers);
            System.out.println("size: " + numbers.size());
            System.out.println("MIN: " + numbers.get(0));
            System.out.println("MAX: " + (numbers.get(numbers.size() - 1)));
            ListDistinct.printDistinct(numbers);
        }
}
