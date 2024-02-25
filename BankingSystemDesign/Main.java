package BankingSystemDesign;

public class Main {
    public static void main(String[] args){
        AccountType accountType = new AccountType("Checking", 5000.00);
        BankAccount bobAccount = new BankAccount("089-54-22", "Bob White", "bobwhite@gmail.com", "85 South Street Dr, Luxburg, MO", 85000.00, accountType);

        System.out.println(bobAccount.getAccountAddress());
        bobAccount.currentBalance();
        bobAccount.deposit(6000.00);

        bobAccount.withDrawal(1300);
        accountType.getAccountTypeName();

        bobAccount.withDrawal(15000);
    }
}
