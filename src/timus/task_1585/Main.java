package timus.task_1585;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1585/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        PrintWriter out = new PrintWriter(System.out);

        int size = Integer.parseInt(bufferedReader.readLine());
        String[] strings = new String[size];
        int countE = 0, countM = 0, countL = 0;

        for (int i = 0; i < size; i++){
            strings[i] = bufferedReader.readLine();
        }

        for (String i : strings){
            if (Objects.equals(i, "Emperor Penguin")) countE += 1;
            else if (Objects.equals(i, "Macaroni Penguin")) countM += 1;
            else if (Objects.equals(i, "Little Penguin")) countL += 1;
        }

        String result;
        int max = Math.max(countE, Math.max(countM, countL));

        if (countE == max ) result = "Emperor Penguin";
        else if (countL == max ) result = "Little Penguin";
        else result = "Macaroni Penguin";

        System.out.println(result);

        out.flush();
    }
}
