package tests;

import core.PredictionEngine;
import data.Crop;
import java.util.List;

public class AgriWiseTest {
    public static void main(String[] args) {
        PredictionEngine engine = new PredictionEngine();
        List<Crop> crops = engine.predictCrops("Punjab", "Rabi");
        
        if(crops.size() > 0 && crops.get(0).getName().equals("Wheat")) {
            System.out.println("[PASS] Core Logic Test: Wheat predicted for Rabi.");
        } else {
            System.out.println("[FAIL] Core Logic Test Failed.");
        }
    }
}