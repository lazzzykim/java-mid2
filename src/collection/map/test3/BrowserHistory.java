package collection.map.test3;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> browser = new ArrayDeque<>();

    private String currentPage = null;

    public void visitPage(String address) {
        if (currentPage != null) {
            browser.push(currentPage);
        }
        currentPage = address;
        System.out.println("방문 : " + address);
    }


    public String goBack() {
        if (!browser.isEmpty()) {
            currentPage = browser.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
