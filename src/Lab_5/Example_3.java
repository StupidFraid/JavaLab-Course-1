package Lab_5;

public class Example_3 {
    public static void main(String[] args) {
        Example_3_SuppClass noArgument = new Example_3_SuppClass();
        Example_3_SuppClass oneArgument = new Example_3_SuppClass(2);
        Example_3_SuppClass twoArgument = new Example_3_SuppClass(2, 3);
    }
}


// Напишите программу с классом, у которого есть два целочисленных поля.
// В классе должны быть описаны конструкторы, позволяющие создавать
// объекты без передачи аргументов, с передачей одного аргумента и с передачей
// двух аргументов.