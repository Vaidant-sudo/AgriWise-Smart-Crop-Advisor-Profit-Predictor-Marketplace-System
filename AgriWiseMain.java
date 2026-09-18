import core.PredictionEngine;
import core.AdvisoryGenerator;
import core.ProfitCalculator;
import data.Crop;
import data.FarmerProfile;
import java.util.List;
import java.util.Scanner;

public class AgriWiseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PredictionEngine predictionEngine = new PredictionEngine();
        AdvisoryGenerator advisoryGenerator = new AdvisoryGenerator();
        ProfitCalculator profitCalculator = new ProfitCalculator();

        System.out.println("===========================================");
        System.out.println(" AgriWise - Smart Crop Advisor & Predictor ");
        System.out.println("===========================================");
        
        System.out.print("Enter Farmer Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Location (e.g., MP, Punjab): ");
        String location = scanner.nextLine();
        
        System.out.print("Enter Land Size (in Acres): ");
        double landSize = scanner.nextDouble();
        scanner.nextLine();

        FarmerProfile profile = new FarmerProfile(name, location, landSize);

        System.out.print("Enter Season (Kharif / Rabi / Zaid): ");
        String season = scanner.nextLine();

        List<Crop> predictedCrops = predictionEngine.predictCrops(profile.getLocation(), season);

        System.out.println("\n[SYSTEM] Analyzing Data...");
        System.out.println("Recommended Crops for " + season + ":");
        for (int i = 0; i < predictedCrops.size(); i++) {
            System.out.println((i + 1) + ". " + predictedCrops.get(i).getName());
        }

        System.out.print("\nSelect a crop number for detailed SOP and Profit Analysis: ");
        int choice = scanner.nextInt();
        
        if (choice > 0 && choice <= predictedCrops.size()) {
            Crop selectedCrop = predictedCrops.get(choice - 1);
            
            System.out.println("\n--- CULTIVATION ADVISORY (SOP) ---");
            advisoryGenerator.generateSOP(selectedCrop);
            
            System.out.println("\n--- PROFIT PREDICTION ---");
            profitCalculator.calculate(selectedCrop, profile.getLandSize());
        } else {
            System.out.println("Invalid selection. Exiting...");
        }
        
        scanner.close();
    }
}
