package Lab_6;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вычеслим двойной факториал числа.");
        System.out.println("Введите положительное число, для которого будет производить вычесление: ");
        int inputValue = in.nextInt();

        System.out.println("Двойной факториал числа: "+ inputValue + "!! равен: " + doubleFactorial(inputValue));

    }

    static int doubleFactorial(int a){
        int result;
        result = a;
        while (a > 0){
            if(a <= 2) break;
            a = a - 2;
            result = result * a;
        }
        return result;
    }
}
//         Напишите программу, в которой описан статический метод для вычисления
//        двойного факториала числа, переданного аргументом методу. По определению, двойной
//        факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//        больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//        нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.