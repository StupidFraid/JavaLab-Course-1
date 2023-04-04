package Lab_11.Primer_6;

// Добавление нового элемента в конец списка

public class Test2 {
    public static void main(String[] args) {
        // добавление элементов с перемещением головы (наращивание с головы)
        Node head = null; // начальное значение ссылки на голову
        for (int i = 9; i >= 0; i--){
            head =  new Node(i, head);
        }

        // Вывод элементов на экран
        Node ref = head;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }

}
