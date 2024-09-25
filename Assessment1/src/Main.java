import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter details for Permanent Employee:");
        System.out.print("Employee Id: ");
        int permId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Employee Name: ");
        String permName = scanner.nextLine();
        System.out.print("Basic Salary: ");
        float permBasicSalary = scanner.nextFloat();
        System.out.print("PF: ");
        int permPf = scanner.nextInt();

        PermanentEmployee permanentEmployee = new PermanentEmployee(permId, permName, permBasicSalary, permPf);
        System.out.println("\nThe details are:");
        permanentEmployee.displayDetails();


        System.out.println("\nEnter details for Temporary Employee:");
        System.out.print("Employee Id: ");
        int tempId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Employee Name: ");
        String tempName = scanner.nextLine();
        System.out.print("Daily Wages: ");
        int tempDailyWages = scanner.nextInt();
        System.out.print("No. of Days Worked: ");
        int tempNoOfDays = scanner.nextInt();

        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(tempId, tempName, tempDailyWages, tempNoOfDays);
        System.out.println("\nThe details are:");
        temporaryEmployee.displayDetails();


    }
}
