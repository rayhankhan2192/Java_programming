package mainstring;

import java.util.ArrayList;
import java.util.StringJoiner;

public class String_5 {
    public static void main(String[] args){
        ArrayList <String> str= new ArrayList<>();

        str.add("JAVA");
        str.add("WORLD");
        System.out.println(str);

        //string joiner main concept
        StringJoiner str1 = new StringJoiner(",");
        str1.setEmptyValue("str1 is empty");
        System.out.println(str1);

        str1.add(str.get(0));
        str1.add(str.get(1));
        System.out.println(str1);

        System.out.println("Length: "+str1.length());

        //string joiner concept
        StringJoiner str2 = new StringJoiner(":");
        str2.add(str.get(0)).add(str.get(1));
        System.out.println(str2);
        str1.merge(str2);//merge two array list

        System.out.println(str1.toString());
        System.out.println("Length: "+str1.length());
    }
}

