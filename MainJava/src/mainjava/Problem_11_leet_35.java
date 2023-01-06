//35. Search Insert Position
package mainjava;

public class Problem_11_leet_35 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(result(array, target));
       
    }
    public static int result(int[] array, int target){
        int low = 0, high = array.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
       return low;//return index of !target value where its inserted
    }
}
