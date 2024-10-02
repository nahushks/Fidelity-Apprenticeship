import java.util.Scanner;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;

    }
}
class LinkedList {
    Node head;
    public LinkedList() {
        head=null;
    }
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;


        }
    }
    public void reverseList() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current !=null) {

            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        head=prev;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }
}
class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        int n;
        System.out.println("Enter the no. of elements:");
        n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++) {
            int value=scanner.nextInt();
            linkedList.insertAtTail(value);
        }
        linkedList.reverseList();
        linkedList.printList();
        scanner.close();

    }
}