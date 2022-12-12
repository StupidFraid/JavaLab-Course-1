package Lab_3;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        System.out.println("Задание подрузамевает 2 способа реализации, \n" +
                "Первая через if/else, вторая switch/case");
        mainMenu();
    }

    public static void mainMenu() {
        Scanner in = new Scanner(System.in);
        int selectOption;


        System.out.println("Выберете пункт меню");
        System.out.println("1 - Реализация через if/else");
        System.out.println("2 - Реализация через switch/case");
        System.out.println("3 - Выход из программы");

        selectOption = in.nextInt();

        switch (selectOption){
            case 1:
                System.out.println(ifElseOption());
                mainMenu();
            case 2:
                System.out.println(switchOption());
                mainMenu();
            case 3: System.exit(0);
            default:
                System.out.println("Введено не корректное значение");
        }
    }

    public static String switchOption(){
        System.out.println("Введите день недели на русском");
        String stringDay, resultDay;
        Scanner in = new Scanner(System.in);

        stringDay = in.next();

        switch (stringDay.toLowerCase()){
            case "понедельник": resultDay = "1";
                break;
            case "вторник": resultDay = "2";
                break;
            case "среда": resultDay = "3";
                break;
            case "четверг": resultDay = "4";
                break;
            case "пятница": resultDay = "5";
                break;
            case "суббота": resultDay = "6";
                break;
            case "воскресенье": resultDay = "7";
                break;
            default: resultDay = "Введено не корректное значение";
        }

        return resultDay;
    }

    public static String ifElseOption(){
        System.out.println("Введите день недели на русском");
        String stringDay, resultDay;
        Scanner in = new Scanner(System.in);

        stringDay = in.next().toLowerCase();
        
        if (stringDay.equals("понедельник")){
            resultDay = "1";
        } else if (stringDay.equals("вторник")) {
            resultDay = "2";
        } else if (stringDay.equals("среда")) {
            resultDay = "3";
        } else if (stringDay.equals("четверг")) {
            resultDay = "4";
        } else if (stringDay.equals("пятница")) {
            resultDay = "5";
        } else if (stringDay.equals("суббота")) {
            resultDay = "6";
        } else if (stringDay.equals("воскресенье")) {
            resultDay = "7";
        } else {
            resultDay = "Введено не корректное значение";
        }
        return resultDay;
    }

}



//        Напишите программу, в которой пользователю предлагается
//        ввести название дня недели. По введенному названию программа определяет
//        порядковый номер дня в неделе. Если пользователь вводит неправильное
//        название дня, программа выводит сообщение о том, что такого дня нет.
//        Предложите версию программы на основе вложенных условных операторов и
//        на основе оператора выбора switch