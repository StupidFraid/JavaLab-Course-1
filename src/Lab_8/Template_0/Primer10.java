package Lab_8.Template_0;

import java.io.*;

public class Primer10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            //создание потока
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("./Lab_8_Dir_My/MyFile1.txt"),"cp1251"));

            out = new PrintWriter("./Lab_8_Dir_My/MyFile2.txt", "cp1251");
            // Переписываем информация из одного файла в другой
            int lineCout = 0;
            String s;

            while ((s = br.readLine()) != null){
                lineCout++;
                out.println(lineCout + ": " + s);
            }

        } catch (IOException e){
            System.out.println("Ошибка !!!!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
