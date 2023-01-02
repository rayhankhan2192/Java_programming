package basicjava;

public class J11_math {
    public static void main(String[] srgs){
       int result =  Math.round(1.1F);
       //this method return only integer from double/floating
       System.out.println(result);

       int result_1 = (int)Math.ceil(2.1F);
       //Math.ceil() return greater integer value of given double/floating number
       System.out.println(result_1);

       int result_2 = (int)Math.floor(2.1F);
       //Math.floor() return small integer value of given double/floating number
       System.out.println(result_2);

       int result_3 = Math.max(100,20);
       //Math.max() return max value between 2 number
       System.out.println(result_3);

       int result_4 = Math.min(100,20);
       //Math.min() return min value between 2 number
       System.out.println(result_4);

       double result_5 = Math.random();
       //Math.random() return random different value in every run
       System.out.println(result_5);

       int result_6 = (int)Math.round(Math.random()*100);
       //Math.round() return value without unnecessary number in floating value
       System.out.println(result_6);
    }
    
}
