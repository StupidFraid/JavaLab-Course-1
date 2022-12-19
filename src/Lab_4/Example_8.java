package Lab_4;

import java.util.Scanner;


public class Example_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Encrypt encrypt = new Encrypt();
        System.out.println("Введите текст для шифрования: ");
        String mainString = in.nextLine();
        System.out.println("Введите ключ: ");
        int shift = in.nextInt();

        String encryptString = encrypt.getEncryptString(mainString, shift);
        System.out.println("Зашифрованная строка: " + encryptString);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String  selectPoint = in.next();
        switch (selectPoint){
            case "y": String decryptString = encrypt.getDecryptString(encryptString, shift);
                      System.out.println(decryptString);
                      break;
            case "n": System.out.println("Выход из программы...");
                      break;
            default:  System.out.println("Выбран не существующий вариант.");
        }
    }
}

//    Напишите программу «Шифр Цезаря», которая зашифровывает
//    введенный текст. Используете кодовую таблицу символов. При запуске
//    программы в консоль необходимо вывести сообщение: «Введите текст для
//    шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//    После того как введены все данные, необходимо вывести преобразованную
//    строку с сообщением «Текст после преобразования: ». Далее необходимо
//    задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//    если пользователь вводит «y», тогда выполнить обратное преобразование.
//    Если пользователь вводит «n», того программа выводит сообщение «До
//    свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//    то программа ему выводит сообщение: «Введите корректный ответ».