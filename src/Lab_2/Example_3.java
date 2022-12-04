package Lab_2;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Проверим что введенное число делится на 4 и не меньше 10");
        System.out.println("Введите число");

        int a = in.nextInt();

        if (a < 10){
            System.out.printf("%s - меньше 10, необходимости ввести число больше 10", a);
        } else if (a%4!=0) {
            System.out.printf("%s - не делится на 4 без остатка", a);
        }
        else {
            System.out.printf("%s - соответствует обоим критериям (больше 10 и делится на 4 без остатка)", a);
        }
    }
}
