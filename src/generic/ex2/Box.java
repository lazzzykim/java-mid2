package generic.ex2;

public class Box<T> {
    private T value;

    public Box() {
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }
}
