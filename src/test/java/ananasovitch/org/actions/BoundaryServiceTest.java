package ananasovitch.org.actions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoundaryServiceTest {

    private BoundaryService boundaryService;

    @BeforeEach
    public void setUp() {
        boundaryService = new BoundaryService();
    }

    @ParameterizedTest(name = "Проверка минимального значения в массиве: {0}, {1}, {2}, {3}, {4}")
    @CsvSource({"1, 2, 3, 4, 5", "10, 20, 30, 40, 50", "100, 200, 300, 400, 500"})
    public void testFindMin(int num1, int num2, int num3, int num4, int num5) {
        int[] marks = {num1, num2, num3, num4, num5};
        int min = boundaryService.findMin(marks);
        int expectedMin = Integer.MAX_VALUE;
        for (int num : marks) {
            expectedMin = Math.min(expectedMin, num);
        }
        assertEquals(expectedMin, min, "Минимальное значение неверно");
    }

    @ParameterizedTest(name = "Проверка минимального значения в массиве в убывающем порядке: {0}, {1}, {2}, {3}, {4}")
    @CsvSource({"5, 4, 3, 2, 1", "50, 40, 30, 20, 10", "500, 400, 300, 200, 100"})
    public void testFindMinDescending(int num1, int num2, int num3, int num4, int num5) {
        int[] marks = {num1, num2, num3, num4, num5};
        int min = boundaryService.findMin(marks);
        int expectedMin = Integer.MAX_VALUE;
        for (int num : marks) {
            expectedMin = Math.min(expectedMin, num);
        }
        assertEquals(expectedMin, min, "Минимальное значение неверно");
    }
}