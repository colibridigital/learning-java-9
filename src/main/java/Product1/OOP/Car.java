package Product1.OOP;

public class Car extends Vehicle {
    private boolean isConvertible;

    public Car(String make, String model, String colour, boolean isConvertible) {
        super(make, model, colour);
        this.isConvertible = isConvertible;
    }

    public int getMaxPassengers() {
        return 4;
    }

    public int getMaxSpeed() {
        return 150;
    }

    public int getNumberOfWheels() {
        return 4;
    }

    public boolean isConvertible() {
        return this.isConvertible;
    }
}
