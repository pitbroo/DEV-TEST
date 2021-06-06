package task1;


import utils.InputReader;
import utils.IntegerParser;

import java.util.List;

import static utils.AplicationState.shouldContinue;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> numbers;
        while (shouldContinue) {
            System.out.println("enter values");
            String input = InputReader.input();
            numbers = IntegerParser.parse(input);
            InfoPrinter.print(numbers);
        }

    }
}