public class Method_dispatch {
    public static void main(String[] args) {
        //object of A,B,C
    A a = new A();
    B b = new B();
    C c = new C();
    // a.callMe();
    // b.callMe();
    // c.callMe();
    
    A r;//obtain a reference of type A
    r=a;//r refers to an A object
    r.callMe();//call A version of callme() methid
    r=b;
    r.callMe();
    r=c;
    c.callMe();

    }
    
}
