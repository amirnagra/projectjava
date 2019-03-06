package project;

/**
 *
 * @author aa_na
 */
public class Truck extends FourWheel implements Vehicle {

    private String loadingCapacity;

    public Truck(String loadingCapacity, String make, int year, double baseRent) {
        super(make, year, baseRent);
        this.loadingCapacity = loadingCapacity;
    }

    public String getLoadingCapacity() {
        return loadingCapacity;
    }

    public String getInfo() {
        String format = " Car Make: %s\nYear: %d\nLoading Capacity: %s";
        return String.format(format, getMake(), getYear(), loadingCapacity);
    }

}
