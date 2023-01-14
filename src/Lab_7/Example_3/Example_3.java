package Lab_7.Example_3;

public class Example_3 {
    public static void main(String[] args) {
        System.out.println("Создаем объект суперкласс с помощью конструктора с значением '3' и выведем его");
        SuperClassTest superClassObject = new SuperClassTest(3);
        System.out.println(superClassObject.toString());
        System.out.println();


        System.out.println("Проверяем работу метода для присваивания значения полю, изменим поле на 5 и выведем его");
        superClassObject.setOpenValue(5);
        System.out.println(superClassObject.toString());
        System.out.println();

        System.out.println("Создаем объект подкласса суперкласса с  числовым значением '10' и символьным 'A' и выведем его");
        SubClassTest subClassTest = new SubClassTest(10, 'A');
        System.out.println(subClassTest.toString());
        System.out.println();

        System.out.println("Проверяем работу метода по присваиванию значений объекту сабкласса и выводим его ");
        subClassTest.setOpenValue(20, 'L');
        System.out.println(subClassTest.toString());
        System.out.println();

        System.out.println("Создаем объект подкласса подкласса с  числовым значением '100' и символьным 'F' " +
                " строковым 'Мир' и выведем его");
        DoubleSubClassTest doubleSubClassObject = new DoubleSubClassTest(100, 'F', "Мир");
        System.out.println(doubleSubClassObject.toString());
        System.out.println();

        System.out.println("Проверяем работу метода по присваиванию значений объекту сабкласса и выводим его ");
        doubleSubClassObject.setOpenValue(200, 'N', "жвачка");
        System.out.println(doubleSubClassObject.toString());
        System.out.println();

    }
}
//        Напишите программу, в которой на основе суперкласса создается подкласс, а на
//        основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//        классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//        параметром для присваивания значения полю и конструктор с одним параметром. Во
//        втором классе появляется открытое символьное поле, метод с двумя параметрами для
//        присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//        параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//        аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//        конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//        чтобы он возвращал строку с названием класса и значениями всех полей объекта.