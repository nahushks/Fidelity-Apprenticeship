import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list.insertAtHead(element);
        }


        System.out.println("Linked list after inserting elements at the head:");
        list.displayList();

        sc.close();
    }
}
