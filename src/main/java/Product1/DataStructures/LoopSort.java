package Product1.DataStructures;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LoopSort {
    public static void main(String args[]) throws IOException, URISyntaxException {
        URL file_path = LoopSort.class.getClassLoader().getResource("sort_me.txt");
        List<String> words = Files.readAllLines(Paths.get(file_path.toURI()));

        words = removeabc(words);
        System.out.println("########################################################");
        countDs(words);
        System.out.println("########################################################");

        System.out.println("Sorting and printing the list...");
        System.out.println("########################################################");
        java.util.Collections.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static List<String> removeabc(List<String> words) {
        List<String> filtered = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            if ((word.startsWith("a")) || (word.startsWith("b")) || (word.startsWith("c"))) {
                System.out.println("Removing word " + word);
            } else {
                filtered.add(word);
            }
        }

        System.out.println("After removing the letters 'a', 'b' and 'c' we now have " + filtered.size() + " words left");
        return filtered;
    }

    private static void countDs(List<String> words) {
        int countOfD = 0;
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.startsWith("d")) {
                countOfD++;
            }
        }

        System.out.println("We also have " + countOfD + " letters starting with 'd' in the list");
    }
}
