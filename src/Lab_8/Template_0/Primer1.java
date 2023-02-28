package Lab_8.Template_0;

import java.io.File;

public class Primer1 {
    public static void main(String[] args) {
        try {
            // создаиние файла в текущей папке ( где расположен файл Primer1.java)
            File f1 = new File("MyFile.txt");
            f1.createNewFile();
            if(f1.exists()){
                System.out.println("создан!!!!");
                System.out.println("Полный путь 1: " + f1.getAbsolutePath());
            }

            // Создание файла в домашней директории пользователя, и вывод полного пути
            File f2 = new File("/Lab_8_Dir_My/MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2: " + f2.getAbsolutePath());

            // Создание нескольки вложенны папок
            File f3 = new File("/Lab_8_Dir_My/Java_Test/testMkdirs");
            f3.mkdirs();
            System.out.println("Полный путь 3: " + f3.getAbsolutePath());
        } catch (Exception e){
            System.out.println("Ошибка!!!! " + e);
        }
    }
}

//Создание файлов и папок
//!!! Команды где создается файл, необходимо обезательно помешать в блок try-catch