package SOLID2;

public class Snake extends Animal {

    public Snake(String color,String name) {
        super(color,name);
    }

    void speak() {
        System.out.println("Snake is hissing!");
    }

    void sleep() {
        System.out.println("Snaek is sleeping!");
    }

    void eat() {
        System.out.println("Snaek is eating.");
    }

    void walk() {
        System.out.println("It´s slithering!");
    }
}