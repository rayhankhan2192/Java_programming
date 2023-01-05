/*Remove Duplicates from Sorted Array */
package mainjava;

public class Problem_9_leet_26 {
    public static void main(String[] args) {

        int[] arrays = { 0, 0, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7 };
        int lengthh = arrays.length;
        lengthh = RemoveDuplicate(arrays);
        for (int i = 0; i < lengthh; i++) {
            System.out.print(+arrays[i] + " ");
        }
    }

    public static int RemoveDuplicate(int[] arrays) {
        int newindex = 0;
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] < arrays[i + 1]) {
                arrays[newindex++] = arrays[i + 1];
            }
        }
        return newindex;
    }
}
