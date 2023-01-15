package timus.Task_1005_nw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Все не так явно, сломал голову пока думал как обработать все эти строки

        String inputFileName = "src/timus/task_1005/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;


        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            String readLine = "";
            double resultString;
            String[] tempLine;
            List<Integer> stackOne = new ArrayList<>();
            List<Integer> stackTwo = new ArrayList<>();

//            stackOne = readLine;

            System.out.println(stackOne);
            System.out.println(stackTwo);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
