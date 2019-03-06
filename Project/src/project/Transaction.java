package project;

/**
 *
 * @author aa_na
 */
public class Transaction {

    private final String durationOfRent;
    private int pickupDate;
    private int pickupMonth;
    private int noOfDays;

    public Transaction(String durationOfRent, int pickupDate, int pickupMonth, int noOfDays) {
        this.durationOfRent = durationOfRent;
        this.pickupDate = pickupDate;
        this.pickupMonth = pickupMonth;
        this.noOfDays = noOfDays;
    }

    public int getPickupDate() {
        return pickupDate;
    }

    public int getPickupMonth() {
        return pickupMonth;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public String getDurationOfRent() {
        return durationOfRent;
    }

    public double calculateRent(double rent) {
        return rent * noOfDays + (0.13 * rent);
    }

}
