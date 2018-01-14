package Product2.MavenDependencies;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String args[]) throws IOException {
        Reader in = new FileReader("path/to/file.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);

        JSONObject jsonObject = new JSONObject();
    }
}
