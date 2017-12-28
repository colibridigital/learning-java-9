package Product1.OOP;

public class Motorbike extends Vehicle {
    private boolean hasSideCar;

    public Motorbike(String make, String model, String colour, boolean hasSideCar) {
        super(make, model, colour);
        this.hasSideCar = hasSideCar;
    }

    public int getMaxPassengers() {
        return 2;
    }

    public int getMaxSpeed() {
        return 150;
    }

    public int getNumberOfWheels() {
        return 2;
    }

    public boolean hasSideCar() {
        return this.hasSideCar;
    }

    @Override
    public String getVehicleType() {
        return "Motorbike";
    }
}
