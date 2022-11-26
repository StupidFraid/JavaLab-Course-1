package Lab_1;

import java.time.Year;
import java.util.Scanner;


public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int yearNow = Year.now().getValue();


        System.out.printf("Для того что бы определить ваш возраст\n" +
                "введите год вашего рожденья (например 1990): ");

        int  birthdayYear = in.nextInt();

        int youAge = yearNow - birthdayYear;

        System.out.println("Вам " + youAge);

    }
}
