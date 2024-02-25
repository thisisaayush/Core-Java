package BankingSystemDesign;
//Encapsulation Properties Implemented for binding data together and enabling access control.
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String accountEmail;
    private String accountAddress;
    private double accountBalance;
    private AccountType accountType;//Composition- BankAccount "HAS A" Account Type.

    //Constructor
    public BankAccount(String accountNumber, String accountHolderName, String accountEmail, String accountAddress, double accountBalance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountEmail = accountEmail;
        this.accountAddress = accountAddress;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }
    
    //Get and Set Methods.
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public String getAccountEmail(){
        return accountEmail;
    }

    public String getAccountAddress(){
        return accountAddress;
    }

    public double getAccountBalance(){
        return accountBalance;
    }
    public void currentBalance(){
        System.out.println("Current Balance: $" + this.accountBalance);
    }
    public void deposit(double amount){
        if(amount > 0){
            System.out.println("Amount Deposited: $" + amount);
            double newBalance = this.accountBalance + amount;
            System.out.println("New Balance: $" + newBalance);
        }
    }

    public void withDrawal(double amount) {
        // Check if the transaction limit is valid
        if (accountType.transactionLimit(amount)) {
            // Execute withdrawal
            accountType.transactionLimit(amount);
            this.accountBalance = this.accountBalance - amount;
            System.out.println("New Balance: $" + this.accountBalance);
        } else {
            System.out.println("Withdrawal failed. Transaction limit exceeded.");
        }
    }
    
    
}
