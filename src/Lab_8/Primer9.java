package Lab_8;

import java.io.*;

public class Primer9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // создание потока для чтения и записи с нужной кодировкой
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("Programming_Git/test_Folder/MyFile1.txt"),"cp1251"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("Programming_Git/test_Folder/MyFile2.txt"),"cp1251"));
            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s); // запись без перевода строки
                bw.newLine(); // принудительный перевод строки
        }
    } catch (IOException e) {
            System.out.println("Ошибка !!!!");
        }
    finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
