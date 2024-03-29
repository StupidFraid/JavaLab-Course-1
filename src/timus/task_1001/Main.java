package timus.task_1001;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        // Все не так явно, сломал голову пока думал как обработать все эти строки

        String inputFileName = "src/timus/task_1001/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;


        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            String readLine = "";
            double resultString;
            List<Long> listInput;
            listInput = new ArrayList<>();

            while ((readLine = bufferedReader.readLine()) != null){
                String[] tempLine = readLine.split("\\D"); //
                for (String i : tempLine){
                    try {
                        listInput.add((Long.parseLong(i)));
                    }
                    catch (NumberFormatException e) {
                        continue;
                    }
                }

            }

            for (int valueInList = (listInput.size()-1); valueInList >= 0; valueInList--){
                resultString = Math.sqrt(listInput.get(valueInList));
                System.out.println(String.format("%.4f", resultString));
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
