package Lab_11.Task8;
import Lab_11.Primer_6.Node;

public class Main {
    public static void main(String[] args) {
    Node head = createFromHead();

    Node ref = head;
    while (ref != null){
        System.out.println(" " + ref.value);
        ref = ref.next;
        }
    }

    public static Node createFromHead() {
        Node head = null; // Ввод с головы
        for (int i = 0; i <= 10; i++){
            head = new Node(i, head);
        }
        return head;
    }
}
