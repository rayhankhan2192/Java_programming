package basicjava;

import java.util.Arrays;

public class J9_array {
    public static void main(String[] srgs){
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println(Arrays.toString(numbers));//Arrays.toSorting used to print all element of the string

        int[] numbers_2 = {12,6,4,8,14,2,10};
        System.out.println("\nLength of 2nd array: "+numbers_2.length);
        System.out.println(Arrays.toString(numbers_2));
        Arrays.sort(numbers_2);//to sort the array in ascending order
        System.out.println(Arrays.toString(numbers_2));

        System.out.println("\n____2D ARRAY____\n");
        int[][] numbers_3 = new int[2][3];
        numbers_3[0][0] = 1;
        numbers_3[0][1] = 2;
        numbers_3[1][0] = 4;
        System.out.println(Arrays.deepToString(numbers_3));

        //we can also declared 2d arrays
        System.out.println("\n____2D ARRAY____\n");
        int[][] numbers_4 = {{1,2,3,4},{5,6,7,8}};
        System.out.println(Arrays.deepToString(numbers_4));
        //note
        //toString() for 1D array
        //deepToString() for 2D array
    }
}
