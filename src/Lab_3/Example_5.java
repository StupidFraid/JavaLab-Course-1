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
        int tempValue;
        tempValue = 0;
        System.out.println("Введите интересующее вас количество чисел: ");
        Scanner in = new Scanner(System.in);
        int numberValues = in.nextInt();
        int[] array = new int[numberValues];

        for (int i = 0; i < array.length; i++) {
            for (int l = (tempValue + 1); ; l++ )
                if ((l % 5 == 2) & (l % 3 == 1)){
                    array[i] = l;
                    tempValue = l;
                    break;
            }
        }
        printArray(array);
    }

    public static void whileOption(){
        Scanner in = new Scanner(System.in);
        int index = 0;
        int tempValue = 0;
        System.out.println("Введите интересующее вас количество чисел: ");
        int numberValues = in.nextInt();
        int[] array =  new int[numberValues];
        while (index < array.length){
            tempValue++;
            while (true){
              if ((tempValue % 5 == 2) & (tempValue % 3 == 1)) {
                  array[index] = tempValue;
                  break;
              }
              tempValue++;
            }
            index++;
        }
        printArray(array);
    }

    public static void printArray(int[] args){
        String resultLine = "";
        int tempValue = 0;
        for (int i = 0 ; i < args.length ; i++ ){
            if (i == 0){
                resultLine = String.valueOf(args[i]);

            }
            else resultLine = resultLine + "+" + args[i];
            tempValue = tempValue + args[i];
        }

            resultLine = resultLine + "=" + tempValue;
        System.out.println(resultLine);
    }

}



//        Напишите программу, в которой вычисляется сумма чисел,
//        удовлетворяющих таким критериям: при делении числа на 5 в остатке получа-
//        ется 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
//        вводится пользователем. Программа отображает числа, которые
//        суммируются, и значение суммы. Предложите версии программы,
//        использующие разные операторы цикла.