package Lab_7.Example_4;

public class Example_4 {
    public static void main(String[] args) {
        FirstClass firstObject = new FirstClass('A');
        FirstClass copyFirstObject = new FirstClass(firstObject);
        copyFirstObject.openChar = 'B';

        SecondClass secondObject = new SecondClass('D', "hello");
        SecondClass copySecondObject = new SecondClass(secondObject);
        copySecondObject.openString = "world";
        copySecondObject.openChar = 'E';

        ThirdClass thirdObject = new ThirdClass('F', "good", 13 );
        ThirdClass copyThirdObject = new ThirdClass(thirdObject);
        copyThirdObject.openString = "day";
        copyThirdObject.openInt = 666;
        copyThirdObject.openChar = 'G';

        printMethod("Первый класс", "с символьным полем", firstObject, copyFirstObject);
        printMethod("Второй класс", "с текстовым и символьным полем", secondObject,
                copySecondObject);
        printMethod("Третий класс", "с символьным, текстовым, числовым полем", thirdObject,
                copyThirdObject);
    }

    public static void printMethod(String numberClass, String typeClass, Object originalObject, Object copyObject){
        System.out.printf("Создаем 'оригинальный' %s класс, %s \n", numberClass, typeClass);
        System.out.println(originalObject.toString());
        System.out.println();

        System.out.printf("Создадим копию объекта %s класса \n", numberClass);
        System.out.println(copyObject.toString());
        System.out.println();

    }
}


//        Напишите программу, в которой использована цепочка наследования из трех
//        классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//        открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//        каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//        значений полей, переданных аргументами конструктору, а также конструктор создания
//        копии.