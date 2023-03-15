package Lab_8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/// не совсем понимаю как прочитать данные в test_Folder/My/numIsh.txt без использования потоков
public class checkPrimer4 {
    public static void main(String[] args) throws IOException {
        DataInputStream rd = new DataInputStream(new FileInputStream("test_Folder/My/numIsh.txt"));
        try {
            while (true){
                float number = rd.readFloat();
                System.out.println("Число: " + number);
            }
        } catch (EOFException e) {
            System.out.println("Конец файла");
        }
    }
}
