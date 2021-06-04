package task2;

import ReaderAndParser.InputReader;
import ReaderAndParser.IntegerParser;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static boolean shouldContinue = true;

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        //1 2 10 7 5 3 6 6 13 0
        while (shouldContinue) {
            String input = InputReader.input();
            numbers = IntegerParser.parse(input);
            PairList.findPair13(numbers);
        }
    }
}
