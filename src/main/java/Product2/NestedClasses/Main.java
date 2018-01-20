package Product2.NestedClasses;

public class Main {
    public static void main(String args[]) {
        //Nested inner class example
        PersonNested personNested = new PersonNested();
        System.out.println(personNested.getSalary());
        System.out.println(personNested.getSkillNames());

        //Instantiating a normal implementation
        AgeClass ageClass = new AgeClass();
        ageClass.printAge();

        //Creating our own anonymous class to override the default implementation
        Age age = new Age() {
            @Override
            public void printAge() {
                System.out.println("Actually, my age is 26!");
            }
        };

        age.printAge();

        //Static nested class
        CarParts carPart = new CarParts();
        CarParts.Wheel wheel = new CarParts.Wheel();
    }
}
