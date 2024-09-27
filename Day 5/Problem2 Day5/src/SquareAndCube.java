import java.util.Scanner;

public  class SquareAndCube {
    public static double FindSquare(double number) {
        return number * number;
    }

    public static double FindCube(double number) {
        return number * number * number;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        double square = FindSquare(number);
        double cube = FindCube(number);

        System.out.println("Square of " + number + " is " + square);
        System.out.println("Cube of " + number + " is " + cube);
    }
}