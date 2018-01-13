package Product2.NestedClasses;

public class CarParts {
    public CarParts() {
        System.out.println("Car Parts object created!");
    }

    public static class Wheel {
        public Wheel() {
            System.out.println("Wheel created!");
        }
    }
}
