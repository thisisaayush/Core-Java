package BankingSystemDesign;
//AccountType class is a component - Composition - of BankAccount class.
public class AccountType {
    private String accountTypeName;
    private double accountTransactionLimit;

    //constructors.
    public AccountType(String accountTypeName, double accountTransactionLimit){
        this.accountTypeName = accountTypeName;
        this.accountTransactionLimit = accountTransactionLimit;
    }
    //get and set methods.
    public String getAccountTypeName(){
        return accountTypeName;
    }

    public double getTransactionLimit(){
        return accountTransactionLimit;
    }

    public void setAccountTypeName(String typeName){
        this.accountTypeName = typeName;
    }
    
    public boolean transactionLimit(double amount){
        // didn't implement the 24 hours features to limit transactions.
        if(amount <= this.accountTransactionLimit){
            System.out.println("Amount withdrew: $" + amount);
            return true;
        } 
        else {
            System.out.println("Transaction Limit: $5000.00 a day.");
            return false;
        }
    }
    
    
}
