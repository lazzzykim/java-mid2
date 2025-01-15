package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<E> {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println("상품명: " + item.getName() + ", 합계 : " + item.getTotalPrice());
        }
        System.out.println("전체 가격의 합: " + calculateTotalPrice());
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
