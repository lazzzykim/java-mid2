package generic.ex1;

public class GenericBox<T> {
    private T value;

    public GenericBox() {
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }
}

