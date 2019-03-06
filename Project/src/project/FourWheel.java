package project;

/**
 *
 * @author aa_na
 */
public abstract class FourWheel {

    private String make;
    private int year;
    private double baseRent;

    public FourWheel(String make, int year, double baseRent) {
        this.make = make;
        this.year = year;
        this.baseRent = baseRent;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public Double getBaseRent() {
        return baseRent;
    }

    public abstract String getInfo();

}
