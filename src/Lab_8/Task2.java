package Lab_8;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // Создаем поток для чтения и записи с нужной кодировкой
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("Programming_Git/test_Folder//Task2/outDocument.txt"), "utf8"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("Programming_Git/test_Folder/Task2/inDocument.txt"), "utf8"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                boolean checkString = checkNumber(s);
                if (checkString == true){
                    bw.write(s);
                    bw.newLine();

                } else if (lineCount == 2) {
                    bw.write(s);
                    bw.newLine();
                }

            }
        } catch (IOException e) {
            System.out.println("Error !!!!");
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }

    // С помощью данного метода разбиваем строку на символы, а затем смотрим на первый символ
    // если он не число, значит это строка и она нам не интересна.(- нам тоже не интересен)
    private static boolean checkNumber(String someString){
        char[] tempChar = someString.toCharArray();
        return Character.isDigit(tempChar[0]);
    }
}


//    Создать проект, позволяющий из одного, предварительно
//    созданного программными средствами файла, переписать данные,
//        соответствующие условию - в исходном файле содержится две строки в
//        формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
//        вторую строку и положительные числа.