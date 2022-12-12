package Lab_3;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        String dayOfWeek;
        int numberDay;
        Scanner in = new Scanner(System.in);

        System.out.println("Программа преобразовывает числовое обозначение дня недели в слово");
        System.out.println("Например, при вводе 1 выведет 'понедельник'");
        System.out.println("Введите целое число в диапазоне от 1 до 7.");

        numberDay = in.nextInt();

        switch (numberDay){
            case 1: dayOfWeek = "понедельник";
                    break;
            case 2: dayOfWeek = "вторник";
                    break;
            case 3: dayOfWeek = "среда";
                    break;
            case 4: dayOfWeek = "четверг";
                    break;
            case 5: dayOfWeek = "пятница";
                    break;
            case 6: dayOfWeek = "суббота";
                    break;
            case 7: dayOfWeek = "воскресенье";
                    break;
            default: dayOfWeek = "Введено не корректное значение";
        }

        System.out.println(dayOfWeek);
    }

}

//        Напишите программу, в которой пользователь вводит целое число
//        в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//        Если введенное пользователем число выходит за допустимый диапазон,
//        выводится сообщение о том, что введено некорректное значение. Используйте
//        оператор выбора switch.