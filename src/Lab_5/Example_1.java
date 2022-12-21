package Lab_5;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {

        Example_1_SuppClass newChar = new Example_1_SuppClass();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите один символ (тип данных char): ");
        char someChar = in.next().charAt(0);

        System.out.println("Присвоем значение первого символа в предыдущей строке, нашему новому объекту 'newChar'");
        newChar.setCharField(someChar);

        System.out.println("Проверяем метод 'getCharField' который возвращает код символа: " + newChar.getCharField());
        System.out.println("А теперь выведем с помощью 3его метода символ присвоенный ранее и его код");
        newChar.printCharAndCode();

    }
//    Напишите программу с классом, в котором есть закрытое символьное поле
//    и три открытых метода. Один из методов позволяет присвоить значение полю.
//    Еще один метод при вызове возвращает результатом код символа. Третий
//    метод позволяет вывести в консольное окно символ (значение поля) и его код.
}
