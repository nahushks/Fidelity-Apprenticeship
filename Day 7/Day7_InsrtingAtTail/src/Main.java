//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        int[] data_values = {141,302,164,530,474};
        for(int data : data_values){
            ll.insertAtTail(data);
            ll.printList();
        }
    }
}