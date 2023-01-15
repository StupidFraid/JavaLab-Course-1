package Lab_7.Example_5;


public class Example_5 {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass("Какой-то текстовый параметр");
        System.out.println(superClassObject.infoValues());

        FirstSubClass firstSubObject = new FirstSubClass("Какой-то текстовый параметр первого саб класса",
                10);
        System.out.println(firstSubObject.infoValues());

        SecondSubClass secondSubObject = new SecondSubClass("Какой-то текстовый параметр второго " +
                "саб класса",'A');
        System.out.println(secondSubObject.infoValues());

//        String testSuper = superClassObject.infoValues();
//        String testFirstSub = firstSubObject.infoValues();
//        String testSecondSub = secondSubObject.infoValues();
//        System.out.println(testSuper);
//        System.out.println(testFirstSub);
//        System.out.println(testSecondSub);
        SuperClass lastObject = new FirstSubClass("Зачем это?", 777);
        System.out.println(lastObject.infoValues());
    }
}
//        Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
//        конструктор с текстовым параметром и метод, при вызове которого в консольном окне
//        отображается название класса и значение поля. На основе суперкласса создаются два
//        подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
//        защищенное целочисленное поле, там есть конструктор с двумя параметрами и
//        переопределен метод для отображения значений полей объекта и названия класса. Во
//        втором подклассе появляется защищенное символьное поле, конструктор с двумя
//        параметрами и переопределен метод, отображающий в консоли название класса и значения
//        полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
//        отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
//        метод через объектную переменную суперкласса, которая ссылается на объект
//        производного класса.