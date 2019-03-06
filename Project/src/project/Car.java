package project;

/**
 *
 * @author aa_na
 */
public class Car extends FourWheel implements Vehicle {

    private String bodyType;
    private int noOfSeats;
    private String transmission;
    private String fuelType;

    public Car(String bodyType, int noOfSeats, String transmission, String fuelType, String vehicleName, int year, double baseRent, String make) {
        super(make, year, baseRent);
        this.bodyType = bodyType;
        this.noOfSeats = noOfSeats;
        this.transmission = transmission;
        this.fuelType = fuelType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String getInfo() {
        String format = " Car Make: %s\nBody Type: %s\nYear: %d\nNo. of Seats: %d\nTransmission: %s\nFuel Type: %s";
        return String.format(format, getMake(), bodyType, getYear(), noOfSeats, transmission, fuelType);
    }

}
