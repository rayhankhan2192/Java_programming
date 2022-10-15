package basicjava;

public class J2Sum {

    public static void main(String[] srgs) {
        int array[] = {1, 2, 3, 4, 5};
        int i, sum = 0;
        for (i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);
    }
}
