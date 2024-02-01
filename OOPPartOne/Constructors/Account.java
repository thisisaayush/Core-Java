package OOPPartOne.Constructors;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String name, String email, String phoneNumber){
        System.out.println("Account constructor with parameters.");
        this.number = number;
        this.balance = balance;
        this.customerName = name;
        this.customerEmail = email;
        this.customerPhone = phoneNumber;
    }

    public void depositFunds(double depositAmount) {

        balance += depositAmount;
        System.out.println("Deposited $" + depositAmount + ". New balance: $" +
                balance);
    }

    public void withdrawFunds(double withdrawalAmount) {

        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance +
                    " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount +
                    " processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}