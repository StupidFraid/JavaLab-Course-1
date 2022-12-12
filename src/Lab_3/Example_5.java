package Lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class Example_5 {
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
                mainMenu();
            case 2:
                whileOption();
                mainMenu();
            case 3: System.exit(0);
            default:
                System.out.println("Введено не корректное значение");
        }
    }
    public static void forOption(){
        Scanner in = new Scanner(System.in);
        int numberValues = in.nextInt();
        int[] array = new int[numberValues];
        for (int i = array[0]; i <= array.length; i++) {
            if ((i % 5 == 2) & (i % 3 == 1)){
            }
        }
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

}



//        Напишите программу, в которой вычисляется сумма чисел,
//        удовлетворяющих таким критериям: при делении числа на 5 в остатке получа-
//        ется 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
//        вводится пользователем. Программа отображает числа, которые
//        суммируются, и значение суммы. Предложите версии программы,
//        использующие разные операторы цикла.