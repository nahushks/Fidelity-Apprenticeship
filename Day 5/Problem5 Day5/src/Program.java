import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the account type: ");
        String accountType = sc.nextLine();

        System.out.println("Enter the account balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(id, accountType, balance);
        System.out.println(account.GetDetails());

        System.out.println("Enter the account to withdraw: ");
        double amount = sc.nextDouble();

        if(account.withdraw(amount)) {
            System.out.println("New balance: " + account.getBalance());
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
