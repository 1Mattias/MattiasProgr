package SOLID2;

public abstract class Animal {


    private String _name;

    public void set_name(String _main) {
        this._name = _main;
    }

    public String get_name() {
        return _name;
    }

    private String _color;

    public Animal(String color, String name) {
        _color = color;
        _name = name;
    }



    abstract void walk();

    abstract void speak();

    abstract void sleep();

    abstract void eat();

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }
}