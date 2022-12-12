package Lab_3;

import java.util.Arrays;

public class Example_7 {
    public static void main(String[] args) {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        System.out.println("Дана строка: "+alphabet);
        System.out.println("Необходимо вывести массив из 10 элементов, в массив пападет каждая 2ая буква.");
        System.out.println("Так же необходимо вывести обратный массив.");

        String[] stringArray = new String[10];

        taskGetArray(stringArray, alphabet);
    }
    static void taskGetArray(String[] array,String str){
        int s = 0;
        for (int i = 0; i < array.length; i++){
            while (s < str.length()){
                if ((s % 2) != 1) {
                    array[i] = String.valueOf(str.charAt(s));
                    break;
                }
                s++;
            }
            s++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(backArray(array)));
    }

    static String[] backArray(String[] array){
        String[] returnArray = new String[array.length];
        for (int i = (array.length - 1); i >= 0; i--){
            returnArray[array.length-(i + 1)] = array[i];
        }
        return returnArray;
    }


}


//        Напишите программу, в которой создается одномерный
//        символьный массив из 10 элементов. Массив заполняется буквами «через
//        одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//        ' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//        порядке. Размер массива задается переменной