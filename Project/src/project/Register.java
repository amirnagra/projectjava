package project;

/**
 *
 * @author aa_na
 */
public class Register {

    private final int phoneNo;
    private final String customerName;
    private final String address;
    private final Transaction transaction;

    public Register(int phoneNo, String customerName, String address, Transaction transaction) {
        this.phoneNo = phoneNo;
        this.customerName = customerName;
        this.address = address;
        this.transaction = transaction;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    
    
}
