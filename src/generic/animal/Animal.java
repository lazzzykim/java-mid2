//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package generic.animal;

public class Animal {
    private String name;
    private int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }

    public void sound() {
        System.out.println("동물 울음소리");
    }

    @Override
    public String toString() {
        return "Animal{name='" + this.name + "', size=" + this.size + "}";
    }
}
