package project;

/**
 *
 * @author aa_na
 */
public class Car extends FourWheel implements Vehicle {

    private final TRANSMISSION TRANSMISSION;
    private final BODY BODY;

    enum BODY {
        sedan, suv, caravan
    }
    private int noOfSeats;

    enum TRANSMISSION {
        automatic, manual
    }

    public Car(BODY body, int noOfSeats, int year, double baseRent, String make, TRANSMISSION transmission) {
        super(make, year, baseRent);
        this.noOfSeats = noOfSeats;
        this.BODY = body;
        this.TRANSMISSION = transmission;
    }

    public BODY getBody() {
        return BODY;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public TRANSMISSION getTransmission() {
        return TRANSMISSION;
    }

    @Override
    public String getInfo() {
        String format = " Car Make: %s\nBody Type: %s\nYear: %d\nNo. of Seats: %d\nTransmission: %s";
        return String.format(format, getMake(), BODY, getYear(), noOfSeats, TRANSMISSION);
    }

}
