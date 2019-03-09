package project;

/**
 *
 * @author aa_na
 */
public abstract class TwoWheel {

    private String make;
    private String model;
    private String year;
    private double baseRent;

    public TwoWheel(String make, String model, String year, double baseRent) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.baseRent = baseRent;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getBaseRent() {
        return baseRent;
    }

    public abstract String getInfo();

}
