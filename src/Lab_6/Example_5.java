package Lab_6;

import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа вычесляет сумму квадратов натуральных чисел.");
        System.out.println("Введите число для которого мы рассчитаем сумму квадратов: ");
        int inputValue = in.nextInt();
        System.out.println("Сумма квадрата натуральных чисел " + inputValue + "равна: " + summSquare(inputValue));
    }

    static int summSquare(int a){
        int result = 0;
        for (int i = 1; i <= a; i++){
            result = result + (i * i);
        }
        return result;
    }
}


//        Напишите программу со статическим методом, которым вычисляется сумма
//        квадратов натуральных чисел 12 + 22 + 32 + ... + п2. Число п передается аргументом методу.
//        Для проверки результата можно использовать формулу 12 + 22 +32+...+n2 = (n+l) (2 n + 1)/6