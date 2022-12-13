package Lab_3;

import java.util.Arrays;
import java.util.Random;

public class Example_9 {
    public static void main(String[] args) {
        System.out.println("Данная программа генерирует числовой массив случайной длины (до 30 элементов).\n" +
                "Массив выводится, после чего выводится элемент с минимальным значением и его индекс\n" +
                "Если их несколько, то должны выводиться индексы всех элементов.");
        int[] mainArray = genArray();

        String stringArray = Arrays.toString(mainArray);
        System.out.println(stringArray);
        getMinimal(mainArray);

    }

    static int[] genArray(){
        Random random = new Random();
        int lenArray = 30;
        int[] array = new int[lenArray];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        return array;
    }
    
    static String getMinimal(int[] array){
        String minString = "";
        int tmpValue = array[0];
        String numMinElement = "";
        for (int i = 0; i < array.length; i++){
            if (array[i] <= tmpValue) {
                tmpValue = array[i];
                numMinElement = numMinElement + " " + i;
            }
        }
        minString = "Минимальный элемент равен: ["+tmpValue+"], а встречается в индексе(ах):" + numMinElement;
        System.out.println(minString);
        return minString;
    }
}

//        Напишите программу, в которой создается массив и заполняется
//        случайными числами. Массив отображается в консольном окне. В этом
//        массиве необходимо определить элемент с минимальным значением. В
//        частности, программа должна вывести значение элемента с минимальным
//        значением и индекс этого элемента. Если элементов с минимальным
//        значением несколько, должны быть выведены индексы всех этих элементов.