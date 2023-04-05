class Stats<T extends Number> {
    T[] array;// array of number of subclass
    // constructor

    Stats(T[] objT) {
        this.array = objT;
    }

    // raeturn type double for all cases
    double average() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        return sum/array.length;
    }
}

public class Generic3_BoundedType {
    public static void main(String[] args) {
        //here cant use String cause  State<T> is bounded bt Number
        Integer IntArrayValue[] = {1,2,3,4,5,6,7};
        Stats<Integer> result1 = new Stats<Integer>(IntArrayValue);
        System.out.println("Integer average: "+result1.average());

        Double DoubleArrayValue[] = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Stats<Double> result2 = new Stats<Double>(DoubleArrayValue);
        System.out.println("Double average: "+result2.average());
    }

}
