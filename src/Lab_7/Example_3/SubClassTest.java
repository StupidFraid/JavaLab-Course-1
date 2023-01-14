package Lab_7.Example_3;

public class SubClassTest extends SuperClassTest {
    public char openChar;

    public void setOpenValue(int openIntegerX, char openCharX ) {
        super.setOpenValue(openIntegerX);
        this.openChar = openCharX;
    }

    public SubClassTest(int openIntegerX, char openChar) {
        super(openIntegerX);
        this.openChar = openChar;
    }

    @Override
    public String toString(){
        String subClassNameAndFieldValue;
        subClassNameAndFieldValue = "sub"  + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " openInteger = " + this.openInteger + "\n" +
                " openChar = " + this.openChar;
        return subClassNameAndFieldValue;
    }

    ////        Во втором классе появляется открытое символьное поле, метод с двумя параметрами для
    ////        присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
    ////        параметрами.
}
