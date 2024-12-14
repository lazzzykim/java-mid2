package generic.ex;

public class Container<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public boolean isEmpty() {
        if (item == null) {
            return true;
        }
        return false;
    }
}

