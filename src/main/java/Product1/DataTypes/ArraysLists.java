package Product1.DataTypes;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists {
    public static void main(String args[]) {
        List<Integer> intList = new ArrayList<>();
        int[] intArray = new int[3];

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);

        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
//        intArray[3] = 40;

        System.out.println(intList.get(0));
        System.out.println(intArray[0]);
    }
}
