package Product2.CarProcessor;

import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) throws IOException, ParseException {
        URL file_path = Main.class.getClassLoader().getResource("cars.json");
        JSONProcessor jsonProcessor = new JSONProcessor(file_path.getPath());
        List<Car> cars = jsonProcessor.parseFile();

        cars = cars.stream()
            .filter(x -> !x.getMake().equals("Ford") && !x.getMake().equals("Mercedes"))
            .sorted(Comparator.comparing(Car::getEngine_size))
            .collect(Collectors.toList());

        CSVWriter csvWriter = new CSVWriter(new File("src/main/resources/cars.csv").getAbsolutePath());
        csvWriter.writeToCSV(cars);
    }
}
