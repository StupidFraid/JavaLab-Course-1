package Lab_7.Example_3;

public class SuperClassTest {
    public int openInteger;

    public void setOpenValue(int openIntegerX) {
        this.openInteger = openIntegerX;
    }

    public SuperClassTest(int openIntegerX) {
        this.openInteger = openIntegerX;
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super"  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " openInteger = " + this.openInteger;
        return superClassNameAndFieldValue;
    }

//        В первом суперклассе есть открытое целочисленное поле, метод с одним
//        параметром для присваивания значения полю и конструктор с одним параметром.
}
