package chapter3;

public class DailyTemperatures {

/*    public int[] dailyTemperatures(int[] temps) {
        int[] answers = new int[temps.length];
        for (int i = 0; i < temps.length; i++) {
            for (int j = i + 1; j < temps.length; j++) {
                if (temps[j] > temps[i]) {
                    answers[i] = j - i;
                    break;
                }
            }
        }
        return answers;
    } */

    public int[] dailyTemperatures(int[] temps) {
        int[] answers = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int index = stack.pop();
                answers[index] = i - index;
            }
            stack.push(i);
        }
        return answers;
    }

}
