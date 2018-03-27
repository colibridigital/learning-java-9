package Product4;

public class Car {
    private final String make;
    private final String model;
    private final String colour;
    private final double engine_size;

    public Car(String make, String model, String colour, double engine_size) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.engine_size = engine_size;
    }

    public Double getEngine_size() {
        return engine_size;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String toCSVString() {
        return make + ", " + model + ", " + colour + ", " + engine_size;
    }
}
