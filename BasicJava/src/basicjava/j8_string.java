package basicjava;

public class j8_string {
    public static void main(String[] srgs){
        System.out.println("\n_____Lets play with String_____\n");
        String message = "Hello World"+"!!";//with + sign we can add multiple steing type in one variable
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        //if !! exists at the end of the string then return true either false
        System.out.println(message.startsWith("!!"));
        //if !! exists at the begging of the string then return true either false 
        System.out.println(message.length());
        //length of the string
        System.out.println(message.indexOf("H"));
        //find index of the character from string if character doesn't exists then return -1 [upper & lower case must be counted]
        System.out.println(message.replace("!","*"));
        //replace the targated character to replacenent character of the steing
        System.out.println(message.toLowerCase());
        // convert the string in lower case order
        System.out.println(message.toUpperCase());
        //convert the sting in upper case order
        System.out.println(message.trim());
        //trim unnecessary space used in at the begging or end
        String message_2 = "\nHello \"World\" \"Wide\"";
        //with that method we can use "" in targeted word in string
        System.out.println(message_2);
        String message_3 = "\nE:\\java\\basicjava...";
        //with that method we can use / in the string
        System.out.println(message_3);

    }
}
