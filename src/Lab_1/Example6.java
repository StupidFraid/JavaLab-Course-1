package Lab_1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите вашу фамилию: ");
        String surname = in.nextLine();

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваше отчество: ");
        String middle_name = in.nextLine();

        System.out.printf("Hello %s %s %s%n",  surname, name, middle_name);
    }
}
