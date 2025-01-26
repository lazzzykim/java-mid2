package collection.map.test2;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, int count) {
        if (cartMap.containsKey(product)) {
            cartMap.put(product, cartMap.get(product) + count);
        } else {
            cartMap.put(product, count);
        }
    }

    public void minus(Product product, int count) {
        Integer nowCount = cartMap.getOrDefault(product, 0);
        int newCount = nowCount - count;
        if (newCount <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newCount);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품 : " + entry.getKey() + ", 수량: " + entry.getValue());
        }
    }
}
