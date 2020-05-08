package SOLID2;

public class Hedgehog extends Animal {

    public Hedgehog(String color, String name) {
        super(color, name);
    }

    void speak() {
        System.out.println("Hedgehog is squeeking!");
    }

    void sleep() {
        System.out.println("Hedgehog is napping!");
    }

    void eat() {
        System.out.println("Hedgehog is omnomnoming!");
    }

    void walk() {
        System.out.println("The hedgehog is is jumping");
    }
}