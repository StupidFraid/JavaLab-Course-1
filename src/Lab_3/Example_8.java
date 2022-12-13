package Lab_3;

import java.util.Arrays;
/// In progress.
/// Получилось очень сложно, вероятно как то можно упростить метод deleteVocalic.
/// Но я отталкивался от того что массив может быть не жестко задан 10, а допустим
/// сделать его вариативным. И с таким решением размер массива возможен до 20 значений.
public class Example_8 {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] resultArray = new String[10];

        deleteVocalic(resultArray, alphabet);

    }

    static void deleteVocalic(String[] array, String alphabet){
        String[] vocalicArray = new String[]{"A","E","I","O","U","Y"};
        int i = 0, s = 0, vocalicCounter;
        while ( i < array.length){//проходимся по массиву который заполняем
            while (s < alphabet.length()){ //проходимся по строке из которой необходимо взять значение
                String tempChar = String.valueOf(alphabet.charAt(s));
                vocalicCounter = 0;
                for (String a : vocalicArray){
                    if (!a.equals(tempChar))vocalicCounter++;
                    if (vocalicCounter > (vocalicArray.length-1)){
                        array[i] = tempChar;
                        if (i == (array.length - 1)) break;
                        i++;
                        break;
                    }
                }
                s++;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}


//        Напишите программу, в которой создается символьный массив из
//        10 элементов. Массив заполнить большими (прописными) буквами
//        английского алфавита. Буквы берутся подряд, но только согласные (то есть
//        гласные буквы ’ А ' , ' Е ' и ' I ' при присваивании значений элементам массива
//        нужно пропустить). Отобразите содержимое созданного массива в консольном
//        окне


//        Количество букв 26
//        Из них согласных - 21 штука(B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z)
//        Гласных - 6 штук (A, E, I, O, U, Y)