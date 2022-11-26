package Lab_1;

import java.time.Year;
import java.util.Scanner;


public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int yearNow = Year.now().getValue();

        System.out.println("Определим год вашего рождения.\n" +
                "Введите ваш возраст:");

        int  yourAge = in.nextInt();

        int birthdayYear = yearNow - yourAge;

        System.out.println("Вы родились в " + birthdayYear + " году.");

    }
}
