package Lab_2;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишем программу которая \n" +
                "делит введеное в терминале число на 5 и получает в остатке 2, \n" +
                "а при деление на 7 в остатке получается 1");
        System.out.println("Введите число: ");
        int a = in.nextInt();

        if (((a%5)==2) & ((a%7)==1)) {
            System.out.printf("Число %d при делении на 5 имеет в остатке 2,а при деление на 7 остаток равен 1", a);
            System.out.println("Вы угадали необходимое число");
        } else {
            System.out.println(a + " - не соответствует заданым критериям");
        }
    }
}
