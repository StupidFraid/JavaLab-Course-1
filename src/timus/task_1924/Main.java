package timus.task_1924;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int result = 1;
        int i = 1;

        while (i < a){
            if (i % 2 != 0) result += (i + 1);
            else result -= (i + 1);
            i++;
        }

        if (result % 2 == 0) System.out.println("black");
        else System.out.println("grimy");

    }
}
