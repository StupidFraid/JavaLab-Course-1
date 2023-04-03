package Lab_11.Primer_6;

public class Test3_NOT_WORKING {

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
        // создаем новый элемент со значением 123 - будующий хвост
        Node newtail = new Node(123, null);
        System.out.println("Значение последнего элемента: " + ref.value);

        //         указателю последнего элемента присваиваем новый "хвост" (элемент)
        ref.next = newtail;
        System.out.println("Выведем список после добавления нового элемента");
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }

    }
}
