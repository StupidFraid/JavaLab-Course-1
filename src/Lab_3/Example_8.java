package Lab_3;

import java.util.Arrays;
/// Not working
public class Example_8 {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] resultArray = new String[10];

        deleteVocalic(resultArray, alphabet);

    }

    static void deleteVocalic(String[] array, String alphabet){
        String[] vocalicArray = new String[]{"A","E","I","O","U","Y"};
        int s = 0;
        for(int i = 0; i < array.length; i++){
            while (s < alphabet.length()){
                String charValue = String.valueOf(alphabet.charAt(s));
                if (!charValue.equals(vocalicArray)){
                    array[i] = charValue;
                    break;
                }
                s++;
            }
            s++;
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