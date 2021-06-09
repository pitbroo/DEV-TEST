package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;

class InfoPrinterTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldPrintCorrectInfo() {
        List<Integer> numbers = List.of(1, 2, 5, 10, 20, 20);

        InfoPrinter.print(numbers);

        String output = outputStreamCaptor.toString().trim();
        Assertions.assertEquals(mock(), output);
    }

    @Test
    void shouldNotPrintAnythink() {
        List<Integer> numbers = Collections.emptyList();

        InfoPrinter.print(numbers);

        String output = outputStreamCaptor.toString().trim();
        Assertions.assertEquals("", output);

    }

    private String mock() {
        return "sorted list: [1, 2, 5, 10, 20, 20]\r\nsize: 6\r\nMIN: 1\r\nMAX: 20\r\nUnique values: 5";
    }
}