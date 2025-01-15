package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요. 종료 0");

        int input;
        while ((input = scanner.nextInt()) != 0) {
            number.add(input);
        }

        System.out.println("출력");

        for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i));
            if (i < number.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
