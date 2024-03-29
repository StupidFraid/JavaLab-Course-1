package Lab_11.Task8;
import Lab_11.Primer_6.Node;

import java.util.Scanner;

public class recursionVariant {

    public static void main(String[] args) {
        toStringRec(createHeadRec());

        toStringRec(createTailRec());
    }
    public static Node createHeadRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение (для завершения введите 0): ");
        int value = scanner.nextInt();

        if (value == 0) {
            return null; // базовый случай - список пуст
        } else {
            Node nextNode = createHeadRec(); // рекурсивный вызов для создания следующего узла списка
            return new Node(value, nextNode); // создание текущего узла списка
        }
    }

    public static Node createTailRec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение (для завершения введите 0): ");
        int value = scanner.nextInt();

        if (value == 0) {
            return null; // базовый случай - список пуст
        } else {
            Node nextNode = createTailRec(); // рекурсивный вызов для создания следующего узла списка
            Node currentNode = new Node(value, null); // создание текущего узла списка с ссылкой на null
            if (nextNode == null) {
                return currentNode; // если следующий узел не существует, то текущий узел является последним в списке
            } else {
                nextNode.next = currentNode; // установка ссылки на следующий узел для предыдущего узла
                return currentNode; // возвращаем текущий узел
            }
        }
    }

    public static String toStringRec(Node node) {
        if (node == null) {
            return ""; // базовый случай - список пуст
        } else if (node.next == null) {
            return Integer.toString(node.value); // базовый случай - последний узел в списке
        } else {
            return node.value + " -> " + toStringRec(node.next); // рекурсивный вызов для следующего узла
        }
    }

}
