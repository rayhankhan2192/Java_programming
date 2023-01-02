package basicjava;

import java.text.NumberFormat;

public class J12_number_formate {
    public static void main(String[] srgs){
       NumberFormat per =  NumberFormat.getPercentInstance();//convert value to percentage
       String result = per.format(0.2);
       System.out.println(result);

       NumberFormat currency =  NumberFormat.getCurrencyInstance();//get currenct formate
       String result1 = currency.format(14124.2311);
       System.out.println(result1);
    }
}
