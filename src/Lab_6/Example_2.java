package Lab_6;

public class Example_2 {
    public static void main(String[] args) {
        System.out.println("Вызовем метод 'oneIteration' у класса 'Example_2_SuppClass'");
        Example_2_SuppClass.oneIteration();
        System.out.println("Вызовем метод 'oneIteration' второй раз у класса 'Example_2_SuppClass'");
        Example_2_SuppClass.oneIteration();
        System.out.println("Как видим с каждым вызовом функции значение закрытого статического приватного поля \n" +
                "увеличивается на 1.");
    }
}



//    Напишите программу с классом, в котором есть закрытое статическое
//    целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//    статический метод, при вызове которого отображается текущее значение статического
//    поля, после чего значение поля увеличивается на единицу.