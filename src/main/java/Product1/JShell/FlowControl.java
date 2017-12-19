package Product1.JShell;

public class FlowControl {
    public static void main(String args[]) {
        int[] myArray = {5, 12, 13, 17, 22, 39};

        for (int value : myArray) {
            if (value % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
