package Product2.CarProcessor;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CSVWriter {
    private final String destinationPath;

    CSVWriter(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    public void writeToCSV(List<Car> carsList) throws IOException {
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
