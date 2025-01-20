package collection.set.test2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        HashSet<Integer> retainAll = new HashSet<>(set1);
        retainAll.retainAll(set2);
        System.out.println(retainAll);

        HashSet<Integer> removeAll = new HashSet<>(set1);
        removeAll.removeAll(set2);
        System.out.println(removeAll);
    }
}
