package Polymorfi;

class Tesla extends Car {

    @Override
    public void CarModel() {
        System.out.println("This is a Tesla");

    }

    @Override
    public void carFuel() {
        System.out.println("Tesla uses electricity");
    }

    @Override
    public void carSound() {
        System.out.println("Tesla goes mmmnnnnn");
    }
}
