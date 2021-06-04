package ReaderAndParser;

import task1.Task1;
import task2.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IntegerParser {

    public static List<Integer> parse(String input) {
        List<Integer> numbers = new ArrayList<>();
            Arrays.stream(input.split(" ")).forEach(s -> numbers.add(Integer.valueOf(s)));
            Collections.sort(numbers);
            Task1.shouldContinue = false;
            Task2.shouldContinue = false;

        return numbers;
    }
}
