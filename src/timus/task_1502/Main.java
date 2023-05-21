package timus.task_1502;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        long s = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                s += i;
                s += j;
            }
        }
        System.out.println(s);
    }
}
