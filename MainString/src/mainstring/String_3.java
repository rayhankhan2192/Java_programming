package mainstring;

public class String_3 {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("HELLO");
        str.append(" JAVA");// HELLO JAVA
        //to add new string to the String bufer
        str.insert(str.length(), " WORLD ");
        //to insert new string to the string buffer
        System.out.println(str);// HELLO JAVA WORLD

        str.replace(1, 3, "el");
        //to replace() the given string from the specified beginIndex and endIndex-1.
        System.out.println(str);//HelLO JAVA WORLD

        str.delete(0, 6);
        //The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex-1
        System.out.println(str);//JAVA WORLD

        str.deleteCharAt(4);
        //delete specific index of the string
        System.out.println("Delete: "+str);//JAVAWORLD

        StringBuffer stri = new StringBuffer("RAYHAN");
        System.out.println(stri.reverse());// to reverse the string

        //fomd the string buffer capacity
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // now 16
        sb.append(" java is my favourite language");
        System.out.println(sb);
        System.out.println(sb.capacity());
        
    }
    
}
