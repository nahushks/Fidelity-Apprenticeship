import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        System.out.println("Enter the value of y");
        y = sc.nextInt();
        boolean result = x<y;

        System.out.println("the result of whether x is less than y is " + result);

    }
}
