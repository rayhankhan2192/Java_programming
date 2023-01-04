package basicjava;

public class J16_Class_1 {
    protected static int count = 0;//to count total person
    protected String name;
    protected int age;

    public J16_Class_1(String name, int age) {
        this.name = name;
        this.age = age;
        J16_Class_1.count += 1;
    }

    public void function() {
        System.out.println("\nMy name is " + this.name + ". I am " + this.age + " years old.");
    }
}

