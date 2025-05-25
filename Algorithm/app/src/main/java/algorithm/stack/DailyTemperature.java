package algorithm.stack;

import java.util.Stack;

/**
 * * Daily Temperature
 * Given a list of daily temperatures, produce a list that, for each day in the
 * input, indicates how many days you would have to wait until a warmer
 * temperature.
 * If there is no future day for which this is possible, put 0 instead.
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76,
 * 73]
 * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 */
public class DailyTemperature {

    public int[] solution(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }

}
