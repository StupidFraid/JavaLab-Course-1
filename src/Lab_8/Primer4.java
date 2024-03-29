package Lab_8;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Primer4 {
    public static void main(String[] args) {
        try {
            // Создание новой папки My на диске
            String mainFolder = "Programming_Git/test_Folder/My";
            File folder1 = new File(mainFolder);
            folder1.mkdir();
            // Создание исходного файла numIsh.txt и запись в него чисел типа float
            File f1 = new File(mainFolder + "/numIsh.txt");
            f1.createNewFile();

            Scanner sc = new Scanner(System.in, "cp1251");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();

            System.out.println("Введите числа: ");
            for (int i = 0; i < count; i++)
                wr.writeFloat(sc.nextFloat());

            wr.flush();
            wr.close();

            // Создание файла numRez.txt и переписывание в него чисел из numIsh.txt
            File f2 = new File(mainFolder + "/numRez.txt");
            f2.createNewFile();

            // Поток для чтения из исходного файла numIsh.txt
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            // поток для записи в результирующий файл numRez.txt
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true){ // Чтение-Запись из одного файла в другой
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println(" Число " + (float)number);
                }
            }catch (EOFException e) {}
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of line");
        }
    }
}

//Создать первый файл на диске и записать в него заданное
//количество вещественных чисел. Далее создать второй файл и переписать в него
//все числа из первого файла.
