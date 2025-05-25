package algorithm.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DailyTemperatureTest {

    @Test
    void testSolution() {
        DailyTemperature dailyTemperature = new DailyTemperature();
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] expected = { 1, 1, 4, 2, 1, 1, 0, 0 };
        assertArrayEquals(dailyTemperature.solution(temperatures), expected);
    }
}
