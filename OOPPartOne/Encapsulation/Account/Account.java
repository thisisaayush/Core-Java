package OOPPartOne.Encapsulation.Account;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("$ " + depositAmount + " has been deposited. \n New balance is $" + balance + "." );
    }

    public void withdrawFunds(double withdrawalFund){
        if (this.balance - withdrawalFund < 0){
            System.out.println("Insufficient funds! You have $" + this.balance);
        }
        else{
            this.balance -= withdrawalFund;
            System.out.println("Withdrawal fund $"+ withdrawalFund + ". Available balance: $" + this.balance +".");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number){
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
