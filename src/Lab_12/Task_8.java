package Lab_12;

import org.apache.commons.math3.random.RandomAdaptor;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//содержащий только те числа, которые больше заданного значения.
public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        Random random = new Random();
        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(300);
        }

        System.out.println("Массив arr: ");
        for (int i : arr){
            System.out.println(i);
        }

        System.out.println("Введите число, больше которого нам необходимо внести в новый массив");
        int valueInt = in.nextInt();

        System.out.println("Массив arrResult(возвращает значения которые больше " + valueInt + ") :");

        int[] arrResult = findMoreInt(arr, valueInt);
        for (int i : arrResult){
            System.out.println(i);
        }

    }

    public static int[] findMoreInt(int[] arr, int valueInt){
        return Arrays.stream(arr)
                .filter(x -> x > valueInt)
                .toArray();
    }
}
