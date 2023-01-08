//69. Sqrt(x) find int type sqrt of any value
package mainjava;

public class Problem_15_leet_69 {
    public static void main(String[] args){
        int value = 4;
        int start = 1;
        int end = value,ans = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if(mid <= value/mid){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
