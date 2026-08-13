package chapter2;

import java.util.ArrayList;
import java.util.List;

public class TokenWindow {

    private final int maxSize;;
    private String[] tokens;

    public TokenWindow(int maxSize) {
        this.maxSize = maxSize;
        this.tokens = new String[maxSize];
    }

    public void append(String token) {
        for (int i = maxSize - 1; i > 0; i--) {
            tokens[i] = tokens[i - 1];
        }
        tokens[0]  = token;
    }

    public List<String> getWindow() {
        List<String> tokenList = new ArrayList<>();
        for (int i = maxSize - 1; i >= 0; i--) {
            if (tokens[i] != null) {
                tokenList.add(tokens[i]);
            }
        }
        return tokenList;
    }
}
