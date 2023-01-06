package mainstring;

public class String_1 {
    public static void main(String[] args){
        String str_1 = new  String("Rayhan");
        String str_2 = "Khan";
        System.out.println("String-1 : "+str_1);
        System.out.println("String-2 : "+str_2);
        StringBuffer str = new StringBuffer("Rayhan Khan");
        System.out.println(str.toString().trim());
        StringBuilder strr = new StringBuilder("Rayhan Khan");
        strr.append("!!");
        System.out.println(strr);
    }
}
