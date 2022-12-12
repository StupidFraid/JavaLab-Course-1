package Lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        System.out.println("Задание подрузамевает 2 способа реализации, \n" +
                "Первая через цикл for, вторая while");
        mainMenu();
    }

    public static void mainMenu() {
        Scanner in = new Scanner(System.in);
        int selectOption;
        System.out.println("Выберете пункт меню");
        System.out.println("1 - Реализация через цикл for");
        System.out.println("2 - Реализация через while");
        System.out.println("3 - Выход из программы");

        selectOption = in.nextInt();

        switch (selectOption){
            case 1:
                forOption();
//                System.out.println(forOption());
                mainMenu();
            case 2:
                whileOption();
//                System.out.println(whileOption());
                mainMenu();
            case 3: System.exit(0);
            default:
                System.out.println("Введено не корректное значение");
        }

    }

    public static void forOption(){
        int[] array = initArray();
        Arrays.sort(array);
        for (int i = array[0]; i <= array[1]; i++) System.out.print(i + " ");
        System.out.println();
    }

    public static void whileOption(){
        int[] array = initArray();
        Arrays.sort(array);
        int i = array[0];

        while (i <= array[1]){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static int[] initArray(){
        int[] array = new int[2];
        for (int i = 0 ; i < array.length ; i ++){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите ["+i+"] значение");
            array[i] = in.nextInt();
        }
        return array;
    }


}

//        Напишите программу, в которой пользователем вводится два
//        целых числа. Программа выводит все целые числа — начиная с наименьшего
//        (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//        чисел). Предложите разные версии программы (с использованием разных
//        операторов цикла).