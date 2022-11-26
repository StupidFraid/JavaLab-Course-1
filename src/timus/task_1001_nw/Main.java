package timus.task_1001_nw;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Все не так явно, пока не понимаю как обрабатывать новые строки

        Scanner in = new Scanner(System.in);
        ArrayList <Integer> inputList = new ArrayList<Integer>();

        while (in.hasNextInt()){
            int i = in.nextInt();
            inputList.add(i);
            System.out.println(inputList);
        }

        for (int i = inputList.size(); i == 0; i--){
            double A = Math.sqrt(inputList.get(i));
            System.out.printf("%.4f", A);
        }
    }
}
