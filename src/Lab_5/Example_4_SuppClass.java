package Lab_5;

import java.util.Scanner;

public class Example_4_SuppClass {
    int integerArg;
    char charArg;
    double doubleArg;


    public Example_4_SuppClass() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение int переменной: ");
        this.integerArg = in.nextInt();
        System.out.println("Введите значение char переменной: ");
        this.charArg = in.next().charAt(0);
    }

    public Example_4_SuppClass(double doubleArg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение double переменной: ");
        this.doubleArg = in.nextDouble();
    }

}