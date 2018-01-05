package Product1.DataStructures;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class StreamSort {
    public static void main(String args[]) throws IOException, URISyntaxException {
        URL file_path = LoopSort.class.getClassLoader().getResource("sort_me.txt");
        List<String> words = Files.readAllLines(Paths.get(file_path.toURI()));

        long filteredCount = words.stream()
            .filter(x -> !x.startsWith("a") && !x.startsWith("b") && !x.startsWith("c"))
            .count();

        System.out.println("After removing the letters 'a', 'b' and 'c' we now have " + filteredCount + " words left");

        long startsWithD = words.stream()
            .filter(x -> x.startsWith("d"))
            .count();

        System.out.println("We also have " + startsWithD + " letters starting with 'd' in the list");

        words.stream()
            .filter(x -> !x.startsWith("a") && !x.startsWith("b") && !x.startsWith("c"))
            .sorted(Comparator.naturalOrder())
            .forEach(x -> System.out.println(x));
    }
}
