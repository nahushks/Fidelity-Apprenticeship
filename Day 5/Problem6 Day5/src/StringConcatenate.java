import java.util.Scanner;

public class StringConcatenate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;

        System.out.println("Full name: " + fullName);

    }
}
