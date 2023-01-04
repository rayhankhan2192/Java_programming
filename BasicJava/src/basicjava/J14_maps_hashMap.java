/*
package basicjava;

import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class J14_maps_hashMap {
    public static void main(String[] args){
        Map value = new HashMap<>();
        System.out.println("\n\t____HashMap____\n");
        value.put("ind_1",10);
        value.put("ind_2", 20);
        value.put("ind_3", 15);
        value.put(1000,300);//to access specific index
        //value.clear();// to clear all element of the map
        System.out.println(value.isEmpty());//is empty return true
        System.out.println(value.containsKey("ind_1"));//find the index if exist then return true either false
        System.out.println(value.containsValue(2000));//find the value if exist then retunr true either false
        System.out.println(value);
        System.out.println(value.get(1000));
        System.out.println(value.values());// to access all value of the map

        System.out.println("\n\t___TreeMap____\n");
        Map value_1 = new TreeMap<>();
        //follow an order based on index to arrange data;
        value_1.put("x", 30);
        value_1.put("a",10);
        value_1.put("b", 20);

        System.out.println(value_1);
        System.out.println(value_1.get("b"));//to access specific index

        System.out.println("\n\t____Linkedlist Map____\n");
        Map value_2 = new LinkedHashMap<>();
        //follow input sequence 
        value_2.put("x", 30);
        value_2.put("z", 10);
        value_2.put("y", 20);

        System.out.println(value_2);

    }
}
*/