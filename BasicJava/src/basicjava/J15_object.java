package basicjava;

public class J15_object {
    public static void main(String[] srgs) {
        object();
        System.out.println("\nReturn value 5 + 10 = "+value(5));
        System.out.println("\nReturn String is: "+str("Hello World"));
    }

    public static void object() {
        for (int x = 1; x <= 5; x++) {
            System.out.println("Rayhan Khan "+x);
        }
    }
    public static int value(int x){
        return x+10;
    }
    public static String str(String message){
        return message + "!!\n";
    }
}
