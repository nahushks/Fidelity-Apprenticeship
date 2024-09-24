import java.util.Scanner;

public class Problem6{


    public static int sumOfEvenNumbers(int[] numbers) {
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int[] numbers = new int[size];


        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }


        int sum = sumOfEvenNumbers(numbers);
        System.out.println("The sum of even numbers is: " + sum);

    }
}

