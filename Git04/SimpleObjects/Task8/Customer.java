package Git04.SimpleObjects.Task8;

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String secondName;
    private String address;
    private long creditCard;
    private int accountNumber;

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer(int id, String lastName, String firstName, String secondName, String address, long creditCard, int accountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.creditCard = creditCard;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", creditCard=" + creditCard +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
