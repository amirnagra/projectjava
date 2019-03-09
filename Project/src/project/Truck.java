package project;

/**
 *
 * @author aa_na
 */
public class Truck extends FourWheel implements Vehicle {

    private final LOADCAPACITY LOADCAPACITY;

    enum LOADCAPACITY {
        minitruck, cargo
    };

    public Truck(LOADCAPACITY loadcapacity, String make, int year, double baseRent) {
        super(make, year, baseRent);
        this.LOADCAPACITY = loadcapacity;
    }

    public LOADCAPACITY getLoadCapacity() {
        return LOADCAPACITY;
    }

    public String getInfo() {
        String format = " Car Make: %s\nYear: %d\nLoading Capacity: %s";
        return String.format(format, getMake(), getYear(), getLoadCapacity());
    }

}
