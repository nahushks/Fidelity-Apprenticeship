public class LinkedList {
    Node head;
    public LinkedList() {
        this.head = null;

    }
    public  void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if(current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> NULL");
    }
}
