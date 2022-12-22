package Lab_5;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сначала воспользуемся конструктором в который передаем int и char.");
        System.out.println("Введете целочисленное значение");
        int intArg = in.nextInt();
        System.out.println("Введите символ: ");
        char charArg = in.next().charAt(0);
        Example_4_SuppClass charIntObject = new Example_4_SuppClass(intArg, charArg);
        System.out.println("Получим свойства объекта \"charIntObject\", значение int: " + charIntObject.getIntegerArg() +
                " значение char: " + charIntObject.getCharArg() + ".");
        System.out.println("Теперь воспользуемся конструктором в который передаем double.");
        System.out.println("Введите значение double аргумента: ");
        double doubleArg = in.nextDouble();

        Example_4_SuppClass doubleObject = new Example_4_SuppClass(doubleArg);
        System.out.println("Получим свойства объекта \"doubleObject\", значение int (учитываем только десятые и " +
                "десятиченые: " + doubleObject.getIntegerArg() + ", значение char: " + doubleObject.getCharArg());

    }
}


//        Напишите программу с классом, у которого есть символьное и
//        целочисленное поле. В классе должны быть описаны версии конструктора с
//        двумя аргументами (целое число и символ – определяют значения полей), а
//        также с одним аргументом типа double. В последнем случае действительная
//        часть аргумента определяет код символа (значение символьного поля), а
//        дробная часть (с учетом десятых и сотых) определяет значение
//        целочисленного поля. Например, если аргументом передается число 65.1267,
//        то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
//        поле получит значение 12 (в дробной части учитываются только десятые и
//        сотые).