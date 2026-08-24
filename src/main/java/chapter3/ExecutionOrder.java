package chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExecutionOrder {

    private Stack<String> stack = new Stack<>();

    public ExecutionOrder() {
    }

    List<String> getExecutionOrder(String expression) {
        /*
        Input: "search(summarize(read_file(config.yaml)))"
        Output: ["read_file(config.yaml)",
        "summarize(read_file(config.yaml))",
        "search(summarize(read_file(config.yaml)))"]
         */

        stack.push(expression);
        var more = true;
        Pattern pattern = Pattern.compile("\\((.*)\\)");
        while (more) {
            Matcher matcher = pattern.matcher(expression);
            if (matcher.find()) {
                System.out.println(matcher.group(1));
                stack.push(matcher.group(1));
                expression = matcher.group(1);
            } else {
                more = false;
            }
        }
        List<String> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}
