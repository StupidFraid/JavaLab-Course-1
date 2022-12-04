package Lab_2;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Введите число от 5 до 10: ");
        double a = in.nextInt();

        if (5 <= a & a <= 10){
            System.out.printf("%s - соответсвует заданному условию", a);
        }
        else {
            System.out.printf("%s - не соотвествует заданному условию", a);
        }
    }
}
