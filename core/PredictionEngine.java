package core;

import data.Crop;
import java.util.ArrayList;
import java.util.List;

public class PredictionEngine {
    public List<Crop> predictCrops(String location, String season) {
        List<Crop> suitableCrops = new ArrayList<>();
        
        if (season.equalsIgnoreCase("Kharif")) {
            suitableCrops.add(new Crop("Rice", 20.5, 2500, 15000));
            suitableCrops.add(new Crop("Cotton", 15.0, 6000, 20000));
        } else if (season.equalsIgnoreCase("Rabi")) {
            suitableCrops.add(new Crop("Wheat", 18.0, 2200, 12000));
            suitableCrops.add(new Crop("Mustard", 12.0, 5000, 10000));
        } else {
            suitableCrops.add(new Crop("Vegetables", 25.0, 3000, 18000));
        }
        
        return suitableCrops;
    }
}