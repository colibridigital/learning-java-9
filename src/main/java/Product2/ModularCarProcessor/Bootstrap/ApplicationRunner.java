package Product2.ModularCarProcessor.Bootstrap;

import Product2.CarProcessor.Main;
import Product2.ModularCarProcessor.DataProcessor.ModularCarProcessor;
import Product2.ModularCarProcessor.FileReader.ModularJSONReader;
import Product2.ModularCarProcessor.FileWriter.ModularCSVWriter;
import Product2.ModularCarProcessor.Models.ModularCar;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class ApplicationRunner {
    public static void main(String args[]) throws IOException, ParseException {
        URL file_path = Main.class.getClassLoader().getResource("cars.json");

        ModularJSONReader jsonReader = new ModularJSONReader(file_path.getPath());
        List<ModularCar> cars = jsonReader.parseFile();

        ModularCarProcessor modularCarProcessor = new ModularCarProcessor(cars);
        List<ModularCar> fileredList = modularCarProcessor.processList("Ford", "Mercedes");

        ModularCSVWriter csvWriter = new ModularCSVWriter(new File("src/main/resources/cars.csv").getAbsolutePath());
        csvWriter.writeToCSV(fileredList);
    }
}
