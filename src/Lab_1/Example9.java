package Lab_1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца:");
        String month = in.nextLine();

        System.out.println("Введите количество дней в этом месяце:");
        int dayOfMonth = in.nextInt();

        System.out.printf("В %s - %d день", month, dayOfMonth);
    }
}