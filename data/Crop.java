package data;

public class Crop {
    private String name;
    private double expectedYield;
    private double marketPrice;
    private double cost;

    public Crop(String name, double expectedYield, double marketPrice, double cost) {
        this.name = name;
        this.expectedYield = expectedYield;
        this.marketPrice = marketPrice;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getExpectedYield() {
        return expectedYield;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public double getCost() {
        return cost;
    }
}