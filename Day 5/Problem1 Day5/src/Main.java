import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        String country;
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your country: ");
        country = sc.nextLine();
        System.out.println("Welcome "+name+". Your age is "+age+ " and you are from "+country);
    }
}