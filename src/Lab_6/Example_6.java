package Lab_6;

import java.util.Arrays;

public class Example_6 {
    public static void main(String[] args) {
        System.out.println("В данном задании мы создаем статистический метод, которому передается целочисленный \n" +
                "массив и число.");
        int[] taskArray = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        int taskInt = 6;
        String result = Arrays.toString(taskArray(taskArray, taskInt));
        System.out.println("Результат: " + result);
        System.out.println("Ссылка на массив: " + taskArray(taskArray, taskInt));
    }

    static int[] taskArray(int[] someArray, int someInt){
        int[] resultArray;
        if (someArray.length >= someInt){
            resultArray = new int[someInt];
            for (int i = 0; i < resultArray.length; i++){
                resultArray[i] = someArray[i];
            }
        }
        else resultArray = someArray;
        return resultArray;
    }
}


//        Напишите программу со статическим методом, которому аргументом передается
//        целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//        массив, который получается из исходного массива (переданного первым аргументом
//        методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//        нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//        аргумент метода больше длины массива, переданного первым аргументом, то методом
//        создается копия исходного массива и возвращается ссылка на эту копию.