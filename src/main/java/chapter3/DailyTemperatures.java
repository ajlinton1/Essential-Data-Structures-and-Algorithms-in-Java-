package chapter3;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temps) {
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
    }
}
