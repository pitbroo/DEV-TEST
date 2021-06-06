package task2;

import utils.InputReader;
import utils.IntegerParser;
import java.util.ArrayList;
import java.util.List;

import static utils.AplicationState.shouldContinue;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> numbers;
        //1 2 10 7 5 3 6 6 13 0
        while (shouldContinue) {
            System.out.println("Enter values");
            String input = InputReader.input();
            numbers = IntegerParser.parse(input);
            PairList.findPairWithSum(numbers, 13);
        }

    }
}
