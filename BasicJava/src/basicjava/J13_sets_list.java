package basicjava;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class J13_sets_list {
    public static void main(String[] args){
        //Set<Integer> value = new LinkedHashSet<Integer>();//similar to Hashset && more faster
        System.out.println("\n\t____HashSet____\n");
        Set<Integer> value = new HashSet<Integer>();
        value.add(2);
        value.add(4);
        value.add(6);
        value.add(4);
        value.add(6);
        value.add(-3);
        value.remove(-3);//remove the value added in the list
        //value.clear();//delete all element of the set
        boolean check = value.contains(40);//check the value of the list
        System.out.println(check);
        System.out.println(value);
        System.out.println("Size of the HashSet: "+value.size());//check the size of the set multiple value will count one time

        
        
        System.out.println("\n\t____TreeSet____\n");
        Set<Integer> num = new TreeSet<Integer>();
        //follow sequence to arrange the value in ascending order
        num.add(3);
        num.add(-2);
        num.add(1);
        num.add(4);
        num.add(-1);
        num.add(0);
        num.add(-3);
        num.add(2);
        num.add(5);
        //num.clear();//delete all the element of the set
        System.out.println(num);
        System.out.println("Size Of the Tree Set: "+num.size());



        System.out.println("\n\t____ArrayList____\n");
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);//array element
        number.get(0);//array index
        number.add(20);
        number.get(1);
        number.add(30);
        number.add(40);
        
        number.set(2, 30);//(index,element)
        number.set(3, 400);
        System.out.println(number);
        System.out.println("Size of Array List: "+number.size());

        System.out.println("\n\t____Linked List____\n");

    }
    
}
