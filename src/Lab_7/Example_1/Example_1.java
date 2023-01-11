package Lab_7.Example_1;

public class Example_1 {
    public static void main(String[] args) {
        SuperClassTest superClassObject =
                new SuperClassTest("Передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClassTest subClassObject1 =
                new SubClassTest("Передал в конструктор подкласа");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        SubClassTest subClassObject2 =
                new SubClassTest("Передал в конструктор подкласа", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}



//        Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//        конструктором с текстовым параметром и где переопределен метод toString (). На основе
//        суперкласса путем наследования создается подкласс. У него появляется еще одно
//        приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
//        двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
//        В обоих классах метод toString () переопределяется так, что он возвращает строку с
//        названием класса и значение текстового поля или текстовых полей.
