package Lab_3;

import java.util.Scanner;

public class Example_3 {

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
                printArray(forOption());
//                System.out.println(forOption());
                mainMenu();
            case 2:
                printArray(whileOption());
//                System.out.println(whileOption());
                mainMenu();
            case 3: System.exit(0);
            default:
                System.out.println("Введено не корректное значение");
        }

    }

    public static int[] forOption(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину последовательности");
        int length = in.nextInt();
        int[] arrayFibonachi = new int[length];

        for (int i = 0 ; i < arrayFibonachi.length ; i++){
            if (i > 1) arrayFibonachi[i] = arrayFibonachi[i - 1] + arrayFibonachi[i - 2];
            else {
                arrayFibonachi[i] = 1;
            }
        }
        return arrayFibonachi;
    }

    public static int[] whileOption(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину последовательности");
        int length = in.nextInt();
        int i = 0;
        int[] arrayFibonachi = new int[length];

        while (i < arrayFibonachi.length){
            if (i > 1) arrayFibonachi[i] = arrayFibonachi[i - 1] + arrayFibonachi[i - 2];
            else {
                arrayFibonachi[i] = 1;
            }
            i++;
        }
        return arrayFibonachi;
    }

    public static void printArray(int[] args){
        String resultLine = "";
        for (int i = 0 ; i < args.length ; i++ ){
            resultLine = resultLine + " " +args[i];
        }
        System.out.println(resultLine);
    }

//    Напишите программу, которая выводит последовательность чисел
//    Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//    следующее число равно сумме двух предыдущих (получается
//    по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//    в последовательности вводится пользователем. Предложите версии
//    программы, использующие разные операторы цикла.
}
