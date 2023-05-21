package timus.task_1131;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int k = x.nextInt();
        int time = 0, i = 1;
        long s = 1;
        while (s < k && s < n) {
            s += s;
            time++;
        }
        if (s < n) {
            time += Math.ceil(1. * (n - s) / k);
        }
        System.out.println(time);
    }
}
