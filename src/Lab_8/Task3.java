package Lab_8;

import java.io.*;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(
                     new InputStreamReader(
                             new FileInputStream("Programming_Git/test_Folder/Task3/template.txt"), "utf8"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("Programming_Git/test_Folder/Task3/targetFile.txt"), "utf8"));

            int lineCount = 0;
            String s;
            char[] consonantChar = {'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х',
                    'Ц', 'Ч', 'Ш', 'Щ'};
            while ((s = br.readLine()) != null){
                int countWord = 0;
                lineCount++;
                String tempLine = "";
                String[] lineArray = s.split("-|,| |\"|\\.");
                for (String wordInArray : lineArray){
                    if (wordInArray.length() != 0) {
                        char[] wordCharArray = wordInArray.toCharArray();
                        for (char checkConsonantChar : consonantChar)
                        {
                            if (checkConsonantChar == Character.toUpperCase(wordCharArray[0])){
                                countWord++;
                                tempLine += wordInArray + ", ";
                            }
                        }
                    }
                    }
                tempLine = "В строке " + lineCount + ", найденно " + countWord + " слов(а) начинающихся с " +
                    "согласных(русских) букв: " + tempLine;
                tempLine = tempLine.replaceAll(", $", ";");
                System.out.println(tempLine);
                bw.write(tempLine);
                bw.newLine();
            }

        } catch (IOException e){
            System.out.println("Error ! ! ! !");
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
