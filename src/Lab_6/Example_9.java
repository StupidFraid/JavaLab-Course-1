package Lab_6;

import java.util.Arrays;

public class Example_9 {
    public static void main(String[] args) {
        System.out.println("На вход подаем одномерный символьный массив, на выходе получаем другой массив: ");
        char[] charArray = {'G', 'o', 'o',  'g', 'l', 'e'};
        System.out.println("На вход подаем массив: " + Arrays.toString(charArray));
        System.out.println("На выходе получим: " + Arrays.toString(hangOutArray(charArray)));

    }
    static char[] hangOutArray(char[] someArray){
        int lengthArray = someArray.length;
        char[] resultArray = new char[lengthArray];
        for (int i = 0; i <= ((lengthArray) / 2); i++){
            resultArray[lengthArray - 1] = someArray[i];
            resultArray[i] = someArray[lengthArray - 1];
            lengthArray--;
        }
        return resultArray;
    }
}


//        Напишите программу со статическим методом, аргументом которому передается
//        одномерный символьный массив. В результате вызова метода элементы массива попарно
//        меняются местами: первый — с последним, второй — с предпоследним и так далее.