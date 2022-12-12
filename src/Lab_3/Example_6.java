package Lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {


        System.out.println("Данная программа создает одномерный массив." +
                "Массив заполняется числа, которые при деление на 5 дают в остатке 2.");
        initArray();

    }

    public static void initArray() {
        Scanner in = new Scanner(System.in);
        int[] array;
        System.out.println("Введите размер массив: ");
        if (in.hasNextInt()) {
            int arrayLength = in.nextInt();
            if (arrayLength > 0){
                int tempValue = 0;
                array = new int[arrayLength];
                for (int i = 0; i < array.length; i++) {
                    while (true) {
                        tempValue++;
                        if ((tempValue % 5) == 2) {
                            array[i] = tempValue;
                            break;
                        }
                        tempValue++;

                    }
                }
                System.out.println(Arrays.toString(array));
            }
            else {
                System.out.println("Длина массива не может быть равно 0!");
                System.out.println("Попробуем снова.");
                initArray();
            }
        }
        else {
            System.out.println("Введено некоректное значение!");
            System.out.println("Попробуем снова.");
            initArray();
        }
    }
}


//        Напишите программу, в которой создается одномерный числовой
//        массив и заполняется числами, которые при делении на 5 дают в остатке 2
//        (числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//        Предусмотреть обработку ошибки, связанной с вводом некорректного
//        значения.