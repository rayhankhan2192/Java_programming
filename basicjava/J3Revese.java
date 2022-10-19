package basicjava;

public class J3Revese {

    public static void main(String[] srgs) {
        int i, a[] = {100, 200, 300, 400, 500};
        System.out.print("Before reverse:");
        for (i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.print("\nAfter reverse :");
        for (i = a.length-1; i >= 0; i--) {
            System.out.print("\t" + a[i]);
        }
        System.out.print("\n");
    }
}
