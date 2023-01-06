package mainstring;

public class String_2 {
    public static void main(String[] args) {
        // character to string
        char char_arr[] = { 'J', 'A', 'V', 'a' };
        String s = new String(char_arr);
        System.out.println("\n1. Character to String: " + s);

        // offset = index[0++] && count = array.length - offset[will print count total]
        // String(char[] char_array, int start_index, int count)
        char char_arr2[] = { 'G', 'e', 'r', 'm', 'a', 'n' };
        String s1 = new String(char_arr2, 2, 4);// rman
        System.out.println(s1);

        // String(StringBuffer s_buffer) Allocates a new string from the string in s_buffer
        StringBuffer s_buffer = new StringBuffer("Rayhan Khan");
        String s2 = new String(s_buffer);
        System.out.println("String Buffer: " + s2);

        //String(StringBuilder s_builder) – Allocates a new string from the string in s_builder
        StringBuilder s_builder = new StringBuilder("Sofware");
        String s3 = new String(s_builder);
        System.out.println("String Builder: "+s3);

    }
}
