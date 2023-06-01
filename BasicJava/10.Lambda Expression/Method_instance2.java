// //A functional interface for String operations
// //TO pass a reference to an imstance method on a specific object, use this syntax
// //Syntex-> objectReference:: methodName
// interface StringInterface{
//     String strFunction(String n);
// }
// class Method_instance2 {
//     static String stringOp(StringInterface s1, String s2){
//         return s1.strFunction(s2);
//     }

//     public static void main(String[] args) {
    
//         String inStr = "Ich bin Rayhan Khan!";
//         String outStr;

//         StringOperation objectRefs = new StringOperation();
    
//         outStr = stringOp(objectRefs::strReverse, inStr);

//         System.out.println("String before reverse: "+inStr);
//         System.out.println("String after  reverse: "+outStr);

//         StringUpper Up = new StringUpper();
//         outStr = stringOp(Up::StrUppercase, inStr);
//         System.out.println("String in UpperCase: "+outStr);
        
//     }

//     //This calss defines a static method called strReverse() for reverse
//    public class StringOperation{
//         //Static method that reverse a string
//        String strReverse(String str){
//             String result = "";
//             for(int i=str.length()-1; i>=0; i--){
//                 result += str.charAt(i);
//             }
//             return result;
//         }
//     }

//     //This calss defines a static method called StrUppercase() for Uppercase
//     public class StringUpper{
//         String StrUppercase(String str){
//             return str.toUpperCase();
//         }
//     }
// }
