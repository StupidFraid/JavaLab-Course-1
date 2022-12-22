package Lab_5;

public class Example_6_SuppClass {
    private int max, min;

    public void setValue(int max) {
        int tempArg = 0;
        this.max = max;
        if (this.max < min){
            this.max = tempArg;
            this.max = min;
            min = tempArg;
        }
    }

    public void setValue(int max, int min){
        int tempArg = 0;
        this.max = max;
        this.min = min;
        if (this.max < this.min){
            this.max = tempArg;
            this.max = this.min;
            this.min = tempArg;
        }
    }

    public void printAllValues(){
        System.out.println("Значение max: " + max);
        System.out.println("Значение min: " + min);
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
