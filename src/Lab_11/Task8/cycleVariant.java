package Lab_11.Task8;

import Lab_11.Primer_6.Node;

import java.util.Scanner;

public class cycleVariant {
    public static void main(String[] args) {
        Node head = null;
        int sizeList = initCycleVariant();
        Node headNodeList = createFromHead(sizeList);
        toString(headNodeList);
        Node addFromHeadNode = AddLast(headNodeList);
        toString(addFromHeadNode);
        Node addFromFooterNode = AddFirst(addFromHeadNode);
        toString(addFromFooterNode);
        Node addCustomPositionNode = Insert(addFromFooterNode);
        toString(addCustomPositionNode);
        Node removeLastElement = RemoveLast(addCustomPositionNode);
        toString(removeLastElement);
        Node removeFirstElement = RemoveFirst(removeLastElement);
        toString(removeFirstElement);
        Node removeCustomPositionNode = Remove(removeFirstElement);
        toString(removeCustomPositionNode);



    }
    // Создаем однонаправленный список с головы
    public static Node createFromHead(int sizeList) {
        // Ввод с головы
        Node head = null;
        for (int i = 0; i < sizeList; i++){
//            System.out.println(i);
            head = new Node(i, head);
        }
        return head;
    }

    static Integer initCycleVariant() {     // Определяем размер массива
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int sizeList = 0;
        try {
            sizeList = in.nextInt();
        } catch (Exception e){
            System.out.println("Ошибка: введено не число");
        }
        return sizeList;
    }

    static void toString(Node headNodeList){
        String resultString = "";
        while (headNodeList != null){
            resultString = resultString + headNodeList.value + ", ";
            headNodeList = headNodeList.next;
        }
        System.out.println(resultString.substring(0, resultString.length() - 2) + ".");
    }

    static Node AddFirst(Node HeadNodeList){
        Scanner in = new Scanner(System.in);
        System.out.println("Добавим новый элемент в начало списка");
        System.out.println("Введите значение для нового элемента в списке: ");
        int newValueForNode = in.nextInt();
        Node newNode = new Node(newValueForNode, HeadNodeList);

        return newNode;
    }
    
    static Node AddLast(Node headNodeList){
        Scanner in = new Scanner(System.in);
        System.out.println("Добавим новый элемент в конец списка");
        System.out.println("Введите значение для нового элемента в списке: ");
        int newValueForNode = in.nextInt();
        Node newNode = new Node(newValueForNode, null);
        Node head = headNodeList;
        while (headNodeList.next != null){
            headNodeList = headNodeList.next;
        }
        headNodeList.next = newNode;


        return head;
    }

    static Node Insert(Node nodeList){
        Scanner in = new Scanner(System.in);
        int sizeList = numberFromList(nodeList);
        System.out.println("Введите на какую позицию вставить новый элемент от 0 до " + sizeList);
        int numberPosition = in.nextInt();
        System.out.println("Введите значения для переменной которую вставляем:");
        int newValueForNode = in.nextInt();
        Node head = nodeList;
        int k = 1;

        while ((nodeList.next != null) && (k < (numberPosition - 1) )){
            nodeList = nodeList.next;
            k++;
        }
        Node newNode = new Node(newValueForNode, null);

        newNode.next = nodeList.next.next;

        nodeList.next = newNode;

        nodeList = head;
        return nodeList;
    }

    static int numberFromList(Node nodeList){
        int i = 0;

        while (nodeList.next != null){
            i++;
            nodeList = nodeList.next;
        }

        return i;
    }

    public static Node RemoveLast(Node nodeList){
        Node head = nodeList;
        System.out.println("Удаление последнего элемента в спике: ");

        while (nodeList.next.next != null){
            nodeList = nodeList.next;
        }

        nodeList.next = null;
        nodeList = head;
        return nodeList;
    }

    public static Node RemoveFirst(Node nodeList){
        System.out.println("Удаление первого элемента в списке");
        nodeList = nodeList.next;
        return nodeList;
    }

    public static Node Remove(Node nodeList){
        Scanner in = new Scanner(System.in);
        int sizeList = numberFromList(nodeList);
        System.out.println("Введите номер элемент который будем удалять из списка от 0 до " + sizeList);
        int numberPosition = in.nextInt();
        Node head = nodeList;
        int k = 1;

        while ((nodeList.next != null) && (k < numberPosition)){
            nodeList = nodeList.next;
            k++;
        }

        nodeList.next = nodeList.next.next;

        nodeList = head;

        return nodeList;
    }
}
