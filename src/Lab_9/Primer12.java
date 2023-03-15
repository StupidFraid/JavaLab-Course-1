package Lab_9;
// Исключение IllegalArgumentException – неве vg``рные аргументы.
public class Primer12 {
    public static void m (String str, double chislo) {
        if (str == null){
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }
}
