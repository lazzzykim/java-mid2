package collection.map.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        boolean inputExit = false;

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 q): ");
            String word = scanner.nextLine();
            if (word.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String mean = scanner.nextLine();
            if (mean.equals("q")) {
                break;
            }
            dictionary.put(word, mean);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어단어를 입력하세요 (종료는 q): ");
            String word = scanner.nextLine();
            if (word.equals("q")) {
                break;
            }

            if (dictionary.containsKey(word)) {
                System.out.println(word + "의 뜻: " + dictionary.get(word));
            } else {
                System.out.println(word + "는 사전에 없는 단어입니다.");
            }
        }
    }
}
