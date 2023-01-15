package timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int inputValue = in.nextInt();
        int calculation = 12 - inputValue;

        calculation = calculation * 45;

        if (calculation <= 240) System.out.println("YES");
        else System.out.println("NO");

    }
}
