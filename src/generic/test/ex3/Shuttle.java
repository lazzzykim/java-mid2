package generic.test.ex3;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t1) {
        this.unit = t1;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
