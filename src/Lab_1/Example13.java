package Lab_1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Посчитаем сумму двух чисел");
        System.out.println("Введите первое число:");
        int a = in.nextInt();

        System.out.println("Введите второе число:");
        int b = in.nextInt();

        int c = a + b;

        System.out.printf("Сумма %d и %d равна %d", a, b, c);

    }
}
