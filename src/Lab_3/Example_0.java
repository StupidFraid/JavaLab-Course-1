package Lab_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_0 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для считывания числа введенного в консоль
        Scanner in = new Scanner(System.in);
        // Сообщение пользователю "для красоты и понимая
        System.out.println("Введите размер массива");
        // Запись в переменную size  (нужна для того что бы задать размер массива)
        int size = in.nextInt();
        // значение введенного в консоль
        System.out.println("Размер массива равен" + size);
        // Создание массива с рамером введенным из консоли
        int[] nums = new int[size];
        // Создание обхектов класса Random для генерации "случайного числа"
        Random random = new Random();

        for (int i = 0 ; i < nums.length ; i++ ){
            // Присвоение i-тому элементу массива случайного значения
            nums[i] = random.nextInt(200);
            System.out.println("Элеммент массива ["+i+"] = " + nums[i]);
        }
        // Сортировка массива по возрастанию его элементов
        Arrays.sort(nums);
        // Сообщение пользователю "для красоты и понимания"
        System.out.println("Произведена сортировка массива");
        for (int i = 0 ; i < nums.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
    }
}
