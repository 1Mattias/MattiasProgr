package Polymorfi;

import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static void main(String[] args) {

        Volvo myVolvo = new Volvo();
        myVolvo.CarModel();
        myVolvo.carFuel();
        myVolvo.carSound();
        myVolvo.setColor("blue");
        System.out.println("The Audi is " + myVolvo.getColor());

        System.out.println("");

        Audi myAudi = new Audi();
        myAudi.CarModel();
        myAudi.carFuel();
        myAudi.carSound();
        myAudi.setColor("red");
        System.out.println("The Audi is " + myAudi.getColor());

        System.out.println("");

        Tesla myTesla = new Tesla();
        myTesla.CarModel();
        myTesla.carFuel();
        myTesla.carSound();
        myTesla.setColor("white");
        System.out.println("the tesla is " + myTesla.getColor());


    }
}
