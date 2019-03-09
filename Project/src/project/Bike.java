package project;

/**
 *
 * @author aa_na
 */
public class Bike extends TwoWheel implements Vehicle {

    private enum BODY {
        Cruiser, dirt, motorbike
    };
    private final BODY BODY;
    private int engineDescription;

    public Bike(String make, int engineDescription, String model, String year, double baseRent, BODY body) {
        super(make, model, year, baseRent);
        this.engineDescription = engineDescription;
        this.BODY = body;
    }

    public BODY getBody() {
        return BODY;
    }

    public int getEngineDiscription() {
        return engineDescription;
    }

    @Override
    public String getInfo() {
        String format = " Bike Make: %s\nBody Type: %s\nYear: %d\n Engine Capacity";
        return String.format(format, getMake(), getBody(), getYear(), engineDescription);
    }

}
