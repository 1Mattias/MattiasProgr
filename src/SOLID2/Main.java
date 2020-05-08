package SOLID2;

import javax.xml.namespace.QName;

public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black", "It´s a dgo"),
                new Hedgehog("Pink", "It´s a hedgehog"),
                new Bird("Yellow", "It´s a bird"),
                new Snake("Black and Yellow", "Oh darn! It´s a snake")};

        System.out.println("###############");
        System.out.println();

        for (Animal animal : animals) {
            activateAnimal(animal);
        }
    }

    private static void activateAnimal(Animal animal) {
        System.out.println();

        animal.eat();
        animal.sleep();
        animal.speak();
        animal.walk();

        System.out.println(animal.get_name());

        System.out.println("###############");
        System.out.println();
    }


}