//Demonstrate a method reference to a generic method

interface MyInterface<T> {
    int InterfaceFunction(T[] arras, T value);
}

public class Method_Generic3 {

    static <T> int Passvalue(MyInterface<T> interfaceObj, T[] arras, T value) {
        return interfaceObj.InterfaceFunction(arras, value);
    }

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 5, 4, 3, 2, 3, 2, 2, 1, 2 };
        String[] strArray = { "One", "Two", "One", "Three", "One" };
        int counter;

        // ClassName::Method
        counter = Passvalue(ArrayOperation::<Integer>countMatching, array, 2);
        System.out.println("Total 2's in array: " + counter);

        counter = Passvalue(ArrayOperation::<String>countMatching, strArray, "One");
        System.out.println("Total 'One' in array: " + counter);
    }

    // This class defines a method counterMatching() that retutns
    // the number of items in an array that are equal
    // Here counterMatching() is generic not the class ArrayOperation().
    class ArrayOperation {
        static <T> int countMatching(T[] arras, T value) {
            int count = 0;
            for (int i = 0; i < arras.length; i++) {
                if (arras[i] == value)
                    count++;
            }
            return count;
        }
    }

}
