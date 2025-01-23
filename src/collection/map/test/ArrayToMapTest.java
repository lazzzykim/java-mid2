package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        System.out.println(Arrays.toString(productArr[0]));

        Map<String, Integer> mapArr = new HashMap<>();
        for (String[] product : productArr) {
            mapArr.put(product[0], Integer.valueOf(product[1]));
        }

        for (String key : mapArr.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + mapArr.get(key));
        }
    }
}
