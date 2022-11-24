package Lab_1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите какой сегодян день недели (понедельник, вторник и т.д.):");
        String dayWeek = in.nextLine();

        System.out.println("Введите какой сейчас месяц:");
        String monthToDay = in.nextLine();

        System.out.println("И последний вопрос, какая сегодня дата?");
        int dateToMonth = in.nextInt();

        System.out.printf("Сегодня: %s %d %s", dayWeek, dateToMonth, monthToDay);

    }
}
