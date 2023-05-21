package timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n + 1];
        a[0] = 2;
        a[1] = 2;
        for (int i = 2; i < a.length; i++) a[i] = a[i - 2] + a[i - 1];
        System.out.printf(String.valueOf(a[n - 1]));
    }
}
