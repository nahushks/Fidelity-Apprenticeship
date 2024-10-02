import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
        System.out.println("Enter numbers of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " +n+ " elements: ");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());

        }
        System.out.println("Enter the element to insert: ");
        int element = sc.nextInt();
        System.out.println("Enter the index to insert the element: ");
        int index = sc.nextInt();
        numbers.add(index, element);
        System.out.println("Updated list: ");
        for(int num: numbers) {
            System.out.println(num + " ");
        }
    }
}
