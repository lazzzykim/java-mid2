package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    // MyArrayListV1을 생성할 때 사용하는 기본 배열의 크기
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;

    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    // 리스트에 데이터를 추가한다. 추가시 size 증가
    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    // 인덱스에 있는 항목을 조회
    public Object get(int index) {
        return elementData[index];
    }

    // 인덱스에 있는 항복을 변경
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 검색 메서드. 리스트를 순차 탐색해서 인수와 같은 데이터가 있는 인덱스 위치 반환
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                "size =" + size + ", capacity = " + elementData.length;
    }

}
