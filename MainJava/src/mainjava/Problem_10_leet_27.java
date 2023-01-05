package mainjava;

public class Problem_10_leet_27 {
    public static void main(String[] args) {

        int[] arrays = { 0, 1, 2, 2, 3, 4, 5, 2, 6, 7 };
        int lengthh = arrays.length;
        int element = 2;
        lengthh = RemoveDuplicate(arrays, element);
        for (int j = 0; j < lengthh; j++) {
            System.out.print(arrays[j] + " ");
        }
    }

    public static int RemoveDuplicate(int[] arrays, int element) {
        int newindex = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != element) {
                arrays[newindex] = arrays[i];
                ++newindex;
            }
        }
        return newindex;
    }
}
