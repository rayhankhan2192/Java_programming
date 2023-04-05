package Example;

public class IfTest {
    public static void main(String[] args) {
        FixedStack s1 = new FixedStack(5);
        FixedStack s2 = new FixedStack(8);

        for (int i = 0; i < 6; i++) {
            s1.push(i);
        }
        for (int i = 0; i < 10; i++) {
            s2.push(i);
        }
        System.out.println("My stack-1 ");
        for(int i=0; i<6; i++){
            System.out.println(s1.pop());
        }
        System.out.println("My stack-2 ");
        for(int i=0; i<10; i++){
            System.out.println(s2.pop());
        }
    }
}
