package core;

import data.Crop;

public class ProfitCalculator {
    public void calculate(Crop crop, double acres) {
        double totalYield = crop.getExpectedYield() * acres;
        double grossRevenue = totalYield * crop.getMarketPrice();
        double totalCost = crop.getCost() * acres;
        double netProfit = grossRevenue - totalCost;

        System.out.println("Crop Selected: " + crop.getName());
        System.out.println("Total Yield (Quintals): " + totalYield);
        System.out.println("Gross Revenue (INR): " + grossRevenue);
        System.out.println("Total Cost (INR): " + totalCost);
        System.out.println("Net Profit (INR): " + netProfit);
    }
}