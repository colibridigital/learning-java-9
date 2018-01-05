package Product1.OOP;

public class Main {
    public static void main(String args[]) {
        Car car = new Car("Aston Martin", "Vanquish", "Silver", true);
        Motorbike bike = new Motorbike("Harley Davidson", "Fat Boy", "Black", false);

        System.out.println("Parent method make " + car.getMake());
        System.out.println("Child method is convertible " + car.isConvertible());
        System.out.println("Parent method vehicle type " + car.getVehicleType());

        System.out.println("Overriden parent method vehicle type " + bike.getVehicleType());
    }
}
