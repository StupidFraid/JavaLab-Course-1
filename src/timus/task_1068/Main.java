package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;

        int a = in.nextInt();

        if (a > 0){
            while(a >= 1){
                result += a;
                a--;
            }
        }
        else{
            while (a <= 1){
                result += a;
                a++;
            }
        }
        System.out.println(result);
    }
}
