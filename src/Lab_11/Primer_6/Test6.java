package Lab_11.Primer_6;

public class Test6 {
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
        ref = head;
        int k = 1;

        // поиск положения узла, предшествующего удаляемому
        while (ref.next != null && (k < 2)){
            ref = ref.next;
            k++;
        }
        // переброска ссылки для исключения ненужного элемента из списка
        ref.next = ref.next.next;

        ref = head;
        System.out.println("Измененный односвязаный список: ");
        while (ref!= null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
