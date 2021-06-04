package task1;


import ReaderAndParser.InputReader;
import ReaderAndParser.IntegerParser;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    public static boolean shouldContinue = true;
    private static final Logger logger = Logger.getLogger("Task1");

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        while (shouldContinue) {
            try{
            String input = InputReader.input();
            numbers = IntegerParser.parse(input);
            InfoPrinter.print(numbers);
            }catch (NumberFormatException exception){
                logger.log(Level.SEVERE, "ERROR: Wrong input! Entered character is not a number");
            }
        }
    }
}