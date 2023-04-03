public class Finally {
    static void procA(){//throw an acception out of the method
        try{
            System.out.println("inside A");
            throw new RuntimeException("demo");
        }finally{
            System.out.println("prosA finally");
        }
    }
    static void procB(){//return form within a try block
        try{
            System.out.println("Inside B");
            return;
        }finally{
            System.out.println("ProsB finaly");
        }
    }
    static void prosC(){//Execute try block norlmally
        try{
            System.out.println("Inside C");
        }finally{
            System.out.println("ProsC fianlly");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        }catch(Exception e){
            System.out.println("Exception caught: "+e);
        }
        procB();
        prosC();
    }
}
/*
 * In Java, the finally keyword is used in exception handling to specify a block of code that will be executed regardless of whether an exception is thrown or not.

The main purpose of the finally block is to ensure that important cleanup and release of resources, such as closing a file, database connections, or network sockets, are done properly.

The finally block is executed after the try and catch blocks, and even if a catch block is not present or does not catch the exception. This means that the finally block will always be executed, whether an exception is thrown or not.

In summary, the finally keyword is used to ensure that certain code is always executed, regardless of whether an exception is thrown or not, and is commonly used for releasing resources and performing cleanup tasks.
 */