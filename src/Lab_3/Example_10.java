package Lab_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        System.out.println("Создаем целочисленный массив, заполняем его случайными данными.\n" +
                "Следом сортируем его в порядке убывания.");
        int[] mainArr = createArr();
        mainArr = genValueArr(mainArr);
        mainArr = decSortArr(mainArr);
        System.out.println(Arrays.toString(mainArr));

    }

    static int[] createArr(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int arrLen = in.nextInt();
        int[] array = new int[arrLen];

        return array;
    }

    static int[] genValueArr(int[] array){
        Random genValue = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите до какого числа будут генерироваться случайные числа в массиве: ");
        int sizeRange = in.nextInt();
        for (int i = 0; i < array.length; i++){
            array[i] = genValue.nextInt(sizeRange);
        }
        System.out.println("Сгенерировали массив, его значениея: ");
        System.out.println(Arrays.toString(array));
        return array;
    }

    static int[] decSortArr(int[] array){
        int tempInt = array[0];
        int i = 0;
        while (i < array.length-1){
            if (array[i] > array[i+1]) {
                tempInt = array[i];
                array[i] = array[i+1];
                array[i+1] = tempInt;
                decSortArr(array);
            }
            i++;
        }
        return array;
    }
}


//        Напишите программу, в которой создается целочисленный
//        массив, заполняется случайными числами и после этого значения элементов в
//        массиве сортируются в порядке убывания значений.