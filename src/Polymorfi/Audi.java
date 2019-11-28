package Polymorfi;

class Audi extends Car {

    @Override
    public void CarModel() {
        System.out.println(("This is an Audi"));

    }

    @Override
    public void carFuel() {
        System.out.println("Audi uses Diesel");
    }

    @Override
    public void carSound() {
        System.out.println("Audi goes brap-brap");
    }
}
