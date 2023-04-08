package Lab_11.Primer_6;

public class Test1 {
    // Создание несвязанных узлов с помощью конструкторов
    public static void main(String[] args) {
        Node node0 = new Node(0, null); // головной список
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null); // хвост в списке

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        //Вывод списка с использованием вспомогательной переменной ref
        //Соотвествующей текущему значению ссылки при прохождение по списку
        Node ref= node0; //Для прохождения по списку достаточно знать только "голову"
        while (ref != null){
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
