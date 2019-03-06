package project;

/**
 *
 * @author aa_na
 */
public class Bike extends TwoWheel implements Vehicle {

    private String bodyType;
    private int engineDescription;

    public Bike(String bodyType, int engineDescription, String vehicleName, String model, String year, double baseRent) {
        super(vehicleName, model, year, baseRent);
        this.bodyType = bodyType;
        this.engineDescription = engineDescription;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getEngineDiscription() {
        return engineDescription;
    }

    @Override
       public String getInfo() {
        String format = " Bike Make: %s\nBody Type: %s\nYear: %d\n Engine Capacity";
        return String.format(format, getMake(), bodyType, getYear(), engineDescription);
    }


}
