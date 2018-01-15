package Product2.ModularCarProcessor.DataProcessor;

import Product2.ModularCarProcessor.Models.ModularCar;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ModularCarProcessor {
    private final List<ModularCar> carList;

    public ModularCarProcessor(List<ModularCar> carList) {
        this.carList = carList;
    }

    public List<ModularCar> processList(String filter1, String filter2) {
        return carList.stream()
            .filter(x -> !x.getMake().equals(filter1) && !x.getMake().equals(filter2))
            .sorted(Comparator.comparing(ModularCar::getEngine_size))
            .collect(Collectors.toList());
    }
}
