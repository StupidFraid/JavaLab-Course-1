package Lab_6;

public class Example_1 {
    public static void main(String[] args) {
        System.out.println("Создадим объект, и с помощью перегруженного метода присвоим ему значения");
        Example_1_SuppClass someClass = new Example_1_SuppClass();
        System.out.println("Для начала заполним переменную с символьным полем");
        char l = 'T';
        someClass.setValue(l);
        someClass.printValue();

        System.out.println("Теперь присвоим значение текстовой переменной");
        String thisIsString = "Happy new Year?";
        someClass.setValue(thisIsString);
        someClass.printValue();

        System.out.println("Передадим в метод символьный массив из 1 елемента," +
                " и проверим что изменилась символьная переменная");
        char[] firstArray = {'D'};
        someClass.setValue(firstArray);
        someClass.printValue();

        System.out.println("Передадим в метод символьный массив");
        char[] secondArray = {'p', 'e', 'a', 'c', 'e'};
        someClass.setValue(secondArray);
        someClass.printValue();

    }
}


//        Напишите программу с классом, в котором есть два поля: символьное и текстовое.
//        В классе должен быть перегруженный метод для присваивания значений полям. Если метод
//        вызывается с символьным аргументом, то соответствующее значение присваивается
//        символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
//        значение текстового поля. Методу аргументом также может передаваться символьный
//        массив. Если массив состоит из одного элемента, то он определяет значение символьного
//        поля. В противном случае (если в массиве больше одного элемента) из символов массива
//        формируется текстовая строка и присваивается значением текстовому полю.