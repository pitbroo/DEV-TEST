package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static utils.AplicationState.shouldContinue;

public class IntegerParser {
    private static final Logger logger = Logger.getLogger("IntegerParser");

    public static List<Integer> parse(String input) {
        List<Integer> numbers = new ArrayList<>();
        try {
            Arrays.stream(input.split(" ")).forEach(s -> numbers.add(Integer.valueOf(s)));
            Collections.sort(numbers);
            shouldContinue = false;
        } catch (NumberFormatException e) {
            logger.log(Level.SEVERE, "ERROR: Wrong input! Entered character is not a number");
        }
        return numbers;
    }
}
