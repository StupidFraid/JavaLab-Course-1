package Lab_5;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("В рамках задачи необходимо ввести два символа");
        System.out.println("Введите первый символ");
        char firstInChar = in.next().charAt(0);
        System.out.println("Введите второй символ");
        char secondInChar = in.next().charAt(0);
        Example_2_SuppClass taskObject = new Example_2_SuppClass(firstInChar, secondInChar);
        taskObject.showListChar();
    }
}


//        Напишите программу с классом, у которого есть два символьных поля и
//        метод. Он возвращает результат, и у него нет аргументов. При вызове метод
//        выводит в консольное окно все символы из кодовой таблицы, которые
//        находятся «между» символами, являющимися значениями полей объекта (из
//        которого вызывается метод). Например, если полям объекта присвоены
//        значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//        выводиться все символы от ‘A’ до ‘D’ включительно.