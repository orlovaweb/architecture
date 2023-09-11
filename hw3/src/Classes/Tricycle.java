package Classes;

import abstractClass.Car;

public class Tricycle extends Car {

    public Tricycle(String model) {
        super(model);
        this.countOfWheels=3;
    }

    @Override
    public String movement() {
        return null;
    }

    @Override
    public String service() {
        return null;
    }

    @Override
    public String gearShifting() {
        return null;
    }

    @Override
    public String toggleTheHeadlights() {
        return null;
    }

    @Override
    public String toggleTheWipers() {
        return null;
    }

    @Override
    public String sweeping() {
        return null;
    }
}
