package Polymorfi;

import java.awt.*;

public abstract class Car {

    private String _color;

    public void  setColor(String color){
        _color = color;
    }

    public String getColor(){
        return _color;
    }


    public abstract void CarModel();
    public abstract void carFuel();
    public  abstract void carSound();
}
;