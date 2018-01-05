package Product1.DataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapSet {
    public static void main(String args[]) {
        Set<String> set = new HashSet<>();

        set.add("Ford");
        set.add("Toyota");
        set.add("Range Rover");

        System.out.println("Is Ford in the set? " + set.contains("Ford"));

        Map<String, String> map = new HashMap<>();
        map.put("Ford", "Fiesta");
        map.put("Ford", "F150");
        map.put("Chrysler", "F150");
        map.put("Toyota", "Hilux");

        System.out.println("What Ford is in the map? " + map.get("Ford"));
    }
}
