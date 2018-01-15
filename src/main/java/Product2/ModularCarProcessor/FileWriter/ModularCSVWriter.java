package Product2.ModularCarProcessor.FileWriter;

import Product2.ModularCarProcessor.Models.ModularCar;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ModularCSVWriter {
    private final String destinationPath;

    public ModularCSVWriter(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    public void writeToCSV(List<ModularCar> carsList) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(destinationPath));
        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Make", "Model", "Colour", "Engine Size"));

        carsList
            .forEach(x -> {
                try {
                    printer.printRecord(x.toCSVString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        printer.flush();
        printer.close();
    }
}
