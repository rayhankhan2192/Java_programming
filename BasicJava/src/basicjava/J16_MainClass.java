package basicjava;

public class J16_MainClass {
    public static void main(String[] srgs) {
       

        J16_Class_1 person_1 = new J16_Class_1("Rayhan Khan", 21);
        person_1.function();
        J16_Class_1 person_2 = new J16_Class_1("Shitol ", 22);
        person_2.function();
        J16_Class_1 person_3 = new J16_Class_1("Mashrafe", 23);
        person_3.function();
        System.out.print("\n");
        
        System.out.println("\n\t\tInheritence\n");
        J16_inheritence person_4 = new J16_inheritence("Rayhan Khan", 21, 14);
        person_4.function();
        J16_inheritence person_5 = new J16_inheritence("Mamun", 21, 13);
        person_5.function();
        J16_inheritence person_6 = new J16_inheritence("Abdullah", 20, 15);
        person_6.function();

        System.out.println("\nTotal person: "+counter());//total person
        System.out.print("\n");
    }
    public static int counter() {
        return  J16_Class_1.count; //static counter declared in J16_Class_1
    }
}
