package Product1.OOP;

public abstract class Vehicle implements TransportInterface {
    private String make;
    private String model;
    private String colour;

    public Vehicle(String make, String model, String colour) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

    public String getMake() {
        return this.make;
    }

    public String model() {
        return this.model;
    }

    public String colour() {
        return this.colour;
    }

    public String getVehicleType() {
        return "Car";
    }
}
