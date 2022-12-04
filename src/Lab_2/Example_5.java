package Lab_2;

import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Определим сколько тысяч в веденном числе \n" +
                "Например: в числе 123456 - 4 тысячи, а в числе 100000 4 цифра справа 0, значит и тысяч 0) \n" +
                "Введите какое-то число: ");

        double a = in.nextDouble();
        double b = 1000;
        // Возвожу в квадрат, а затем получаю корень для того что бы избавить от отрицательного введенного числа
        if ( Math.sqrt(a*a) < b ){
            System.out.println(a + " в данном числе нет даже одной тысячи");
        }
        else {
            int c = (int) ((Math.sqrt(a*a)/b)%10);
            System.out.printf("В числе: %s, %s тысяч(и).", a, c);
        }
    }
}
