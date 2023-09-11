package Classes;

import abstractClass.Car;

public class BMW extends Car {
    public BMW(String model) {
        super(model);
        this.brand="BMW";
    }

    @Override
    public String movement() {
        return "br-br-br";
    }

    @Override
    public String service() {
        return "repare";
    }

    @Override
    public String gearShifting() {
        return "they switched gears";
    }

    @Override
    public String toggleTheHeadlights() {
        return "they switched headlights";
    }

    @Override
    public String toggleTheWipers() {
        return "they switched wipers";
    }
    @Override
    public String sweeping(){
        return  "shik-shik";
    }
}
