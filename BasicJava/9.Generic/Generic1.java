class Gen<T>{//simple generic class here T is a type parameter that will be
    //replaced by a real type when an object of type Gen() is created
    T ob;//declare an object of type T
    //pass the constructor a reference to an object of type T
    Gen(T o){
        this.ob = o;
    }

    T getob(){//return ob
        return ob;
    }

    void showType(){
        System.out.println("Type of T is: "+ob.getClass().getName());
    }
}

class Generic1{
    public static void main(String[] args) {
        //create an GEN object for int
        Gen<Integer> iob = new Gen<Integer>(100);
        iob.showType();
        //int result = iob.getob();
        System.out.println("The value is: "+iob.getob());
        System.out.println();
        //create an GEN obj for String
        Gen<String> str = new Gen<String>("generic Type");
        str.showType();
        System.out.println("Test: "+str.getob());
    }
}