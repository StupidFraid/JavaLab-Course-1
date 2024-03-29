package Lab_8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Primer2 {
    // метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) { //признак отсутствия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args) {
    try {
        // С потоком связан файл
        InputStream inFile = new FileInputStream("Programming_Git/test_Folder/templateText.txt");
        readAllByByte(inFile);
        System.out.print("\n\n\n");
        inFile.close();

        // С потоком связана интернет-страница
        InputStream inUrl = new URL("http://google.com").openStream();
        readAllByByte(inUrl);
        System.out.print("\n\n\n");
        inUrl.close();

        // С потоком связан массив типа byte
        InputStream inArray = new ByteArrayInputStream(new byte[] {84, 104, 105, 115, 32});
        readAllByByte(inArray);
        System.out.print("\n\n\n");
        inArray.close();
    } catch (IOException e) {
        System.out.println("Ошибка: " + e);
        }
    }

}

// Прочитать(использую общий алгоритмы для работы с потоками input) и вывести на экран информацию из трех
// источников: файла на диске, интернет-страницы и массива типа byte