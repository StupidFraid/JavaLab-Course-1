package Lab_4;

import java.util.Random;
import java.util.Scanner;

public class Example_7 {
    public static void main(String[] args) {
        String[][] mainArray = getArray();
        printArray(mainArray);
        mainArray = snakeWay(mainArray);
        printArray(mainArray);


    }

    static String[][] getArray(){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
//        System.out.println("Задайте размер массива (формат: 3 5)");
//        int size1 = in.nextInt();
//        int size2 = in.nextInt();
        int size1 = 5;
        int size2 = 10;
        String[][] mainArray = new String[size1][size2];
        for (int i = 0; i < mainArray.length; i++){
            for (int j = 0; j < mainArray[i].length; j++){
                mainArray[i][j] = " ";
            }
        }
        return mainArray;
    }
    static void printArray(String[][] someArray){
        for (String[] ints : someArray) {
            for (String anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    static String[][] snakeWay(String[][] someArray){
        int tempHeight, tempWidth;
        tempHeight = someArray.length;
        tempWidth = someArray[0].length;
        int numbers = tempHeight * tempWidth;
        for (int i = 0; i <= numbers; i++){
            if (tempHeight != 0){
                someArray[tempHeight][tempWidth] = "+";
                tempHeight--;
            }
        }
        System.out.println(numbers);
        return someArray;
    }
}


//        Напишите программу, в которой создается двумерный числовой массив
//        и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//        затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//        далее.