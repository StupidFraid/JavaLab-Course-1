package Lab_1;

import java.util.Scanner;

public class Example15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Посчитаем сумма и разницу двех чисел");


        System.out.println("Введите первое число:");
        int a = in.nextInt();

        System.out.println("Введите второе число:");
        int b = in.nextInt();

        System.out.printf("%s+%s=%s\n", a, b, a+b);
        System.out.printf("%s-%s=%s\n", a, b, a-b);
    }

}
