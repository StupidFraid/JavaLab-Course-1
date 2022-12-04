package Lab_2;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Проверим делится число на 3 \n" +
                "Введите число: ");

        int a = (in.nextInt());

        if ((a%3) == 0){
            System.out.println("Число " + a + " делится на 3");
        } else  {
            System.out.println("Число "  + a + " не делится на 3");
        }
    }
}
