package data;

public class FarmerProfile {
    private String name;
    private String location;
    private double landSize;

    public FarmerProfile(String name, String location, double landSize) {
        this.name = name;
        this.location = location;
        this.landSize = landSize;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getLandSize() {
        return landSize;
    }
}