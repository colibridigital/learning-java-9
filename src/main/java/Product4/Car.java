package Product4;


import javax.persistence.*;

@Entity
@Table(name = "colibri.cars")
public class Car {
    @Column(name = "make")
    private final String make;
    @Column(name = "model")
    private final String model;
    @Column(name = "colour")
    private final String colour;
    @Column(name = "engine_size")
    private final double engine_size;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
