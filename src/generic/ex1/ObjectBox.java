package generic.ex1;

public class ObjectBox {
    private Object value;

    public ObjectBox() {
    }

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return this.value;
    }
}

