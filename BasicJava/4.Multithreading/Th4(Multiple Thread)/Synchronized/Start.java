public class Start {
    public static void main(String[] args) {
        MathUtils obj = new MathUtils();

        Thread_1 t1 = new Thread_1(obj);
        Thread t2 = new Thread(new Thread_2(obj));

        t1.start();
        t2.start();
         
    }
}
