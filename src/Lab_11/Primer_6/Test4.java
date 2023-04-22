package Lab_11.Primer_6;

// Добавление нового элемента в список в указанное место
public class  Test4 {
    public static void main(String[] args) {
        Node head = null;

        // Создадим начальное значение с сылкой на голову
        // Создадим линейный односвязный список
        for (int i = 5; i >= 0; i--){
            head = new Node(i, head);
        }
        // Выведем начальный односвязаный список
        Node ref = head;
        System.out.println("Выведем изначальный список: ");
        while (ref.next != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }

        // создается новый элемент со значением 44 - для вставки
        Node newNode = new Node(44, null);

        ref = head; // используем временную переменную
        int k = 1; // счетчик элементов
        while (ref.next != null && (k<2)){
            ref = ref.next;
            k++;
        }

        // переброска ссылок при вставке элемента
        newNode.next = ref.next.next;
        ref.next = newNode;

        ref = head; // возвращаемся в начало
        System.out.println("Выведем список после добавления нового элемента");
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }

}
