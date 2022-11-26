package Lab_1;

import java.time.Year;
import java.util.Scanner;


public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int yearNow = Year.now().getValue();

        System.out.println("Введите ваше имя: ");
        String userName = in.nextLine();


        System.out.printf("%s,для того что бы определить ваш возраст\n" +
                "введите год вашего рожденья (например 1990): ", userName);

        int  birthdayYear = in.nextInt();

        int youAge = yearNow - birthdayYear;

        System.out.println(userName + ", вам " + youAge);

    }
}
