public class Account {
    private int id;
    private String accountType;
    private double balance;


    public Account() {
    }

    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;

    }

    public String getAccountType() {
        return accountType;

    }
    public void setAccountType(String accountType) {

    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }
    public boolean withdraw(double amount) {
        if (balance <= amount) {
            balance -= amount;
            return true;

        }
        return false;

    }
    public String GetDetails() {
        return "Account ID: " + id + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}