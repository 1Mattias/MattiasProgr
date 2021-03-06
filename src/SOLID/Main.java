package SOLID;


public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black"),
                            new Hedgehog("Pink"),
                            new Bird("Yellow")};

        System.out.println("###############");
        System.out.println();

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.setColor("Grey");
            System.out.println(animal.getClass().getSimpleName() + " is " + animal.getColor());
            System.out.println();

            System.out.println("###############");
            System.out.println();
        }
    }
}
