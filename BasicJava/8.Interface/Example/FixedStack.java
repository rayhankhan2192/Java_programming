package Example;
import Example.Stack.inStack;

public class FixedStack implements inStack{
    private int stck[];
    private int tos;
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }
    public void push(int item){
        if(tos == stck.length-1){
            //System.out.println("Stack is full: ");
            int temp[] = new int [stck.length*2];
            for(int i=0; i<stck.length; i++){
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
        }else{
            stck[++tos] = item;
            
        }
    }
    public int pop(){
        if(tos < 0){
            System.out.println("Stak Underflow");
            return 0;
        }else{
            return stck[tos--];
        }
    }

}
