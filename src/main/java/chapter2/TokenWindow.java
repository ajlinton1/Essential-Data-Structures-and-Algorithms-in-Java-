package chapter2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TokenWindow {

    private final int maxSize;
    private final LinkedList<String> tokenList;

    public TokenWindow(int maxSize) {
        this.maxSize = maxSize;
        this.tokenList = new LinkedList<>();
    }

    public void append(String token) {
        if (tokenList.size() == maxSize) {
            tokenList.removeFirst();
        }
        tokenList.addLast(token);
    }

    public List<String> getWindow() {
        return new ArrayList<>(tokenList);
    }
}
