package basicjava;

public class J16_inheritence extends J16_Class_1 {
    //extends J16_Class_1 means access all public or procted variable from this class
    public int classes;

    public J16_inheritence(String name, int age, int classes) {
        super(name, age);
        this.classes = classes;
        //J16_inheritence.count += 1;
    }

    public void function() {
        System.out.println("\nMy name is " + this.name + ". I am " + this.age + " years old. My class is " + this.classes+".");
    }
}
