package chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExecutionOrder {

    List<String> getExecutionOrder(String expression) {
        /*
        Input: "search(summarize(read_file(config.yaml)))"
        Output: ["read_file(config.yaml)",
        "summarize(read_file(config.yaml))",
        "search(summarize(read_file(config.yaml)))"]
         */

        var result = new ArrayList<String>();
        result.add(expression);
        var more = true;
        Pattern pattern = Pattern.compile("\\((.*)\\)");
        while (more) {
            Matcher matcher = pattern.matcher(expression);
            if (matcher.find()) {
                System.out.println(matcher.group(1));
                result.add(matcher.group(1));
                expression = matcher.group(1);
            } else {
                more = false;
            }
        }
        return result;
    }
}
