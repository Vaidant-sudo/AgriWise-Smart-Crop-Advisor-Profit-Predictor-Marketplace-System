package core;

import data.Crop;

public class AdvisoryGenerator {
    public void generateSOP(Crop crop) {
        System.out.println("SOP for: " + crop.getName());
        System.out.println("1. Soil Preparation: Plow 2 times and level.");
        System.out.println("2. Seed Rate: Optimal spacing required.");
        System.out.println("3. Fertilizer: Apply NPK in 4:2:1 ratio.");
        System.out.println("4. Irrigation: Maintain moisture at critical stages.");
        System.out.println("5. Harvest: Cut when moisture content drops.");
    }
}