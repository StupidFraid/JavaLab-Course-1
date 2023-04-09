//В кругу стоят N человек, пронумерованных от 1 до N.
//При ведении счета по кругу вычеркивается каждый второй человек, пока не останется один.
//Составить две программы, моделирующие процесс.
//Одна из программ должна использовать класс ArrayList, а вторая — LinkedList
package Lab_11.Task7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество людей в кругу");
        int numberPeople = in.nextInt();

        arraysListCounting(numberPeople);
    }

    public static void arraysListCounting(int numberPeople){
        ArrayList<People> peopleArrayList= new ArrayList<People>();
        People people = null;

        for (int i = 0; i < numberPeople; i++){
            people = new People(i);
            peopleArrayList.add(people);
        }

        while (peopleArrayList.size() > 1){
            for (int i = 0; i < peopleArrayList.size(); i++){
                if (i % 2 == 0){
                    peopleArrayList.remove(i);
                }
            }
            System.out.println("Длина списка после выбывания равна " + peopleArrayList.size());
        }
    }


}
