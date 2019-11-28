package Polymorfi;

class Volvo  extends  Car{

    @Override
    public void CarModel() {
        System.out.println(("This is a Volvo"));

    }

    @Override
    public void carFuel() {
        System.out.println("Volvo uses Gasoline");
    }

    @Override
    public void carSound() {
        System.out.println("Volvo goes wroom");
    }
}
