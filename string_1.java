
import java.util.Scanner;

public class string_1 {
    public static void main(String[] args) {
        
        ///ALWAYS REMEMBER : Java Strings are Immutable.

        // string declaration
        // String s1="hello";
        // String s2="hello";
        // String sentence="hello world WHO ARE YOU ?";

        //string input

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name ");
        String name = sc.next();
        //String name1 = sc.nextLine();
        System.out.println("Hello "+name);

        //concatination
        String s1="hello";
        String s2="world";
        System.out.println(s1+s2);

        //Print length of a String
        String firstName = "Tony";
        String secondName = "Stark";
        String fullName = firstName + "@" + secondName;
        System.out.println(fullName.length());


        //Access characters of a string
        String firstName1 = "Tony";
        String secondName2 = "Stark";
        String fullName2 = firstName1+ "@" + secondName2;

        for(int i=0; i<fullName2.length(); i++) {
        System.out.println(fullName2.charAt(i));
        }

        //Compare String
        String nam1="Tony";
        String nam2="Tony";

        if (nam1.compareTo(nam2)==0){
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }

        //this is case sensitive some time it is not working
        // if (nam1 == nam2){
        //     System.out.println("Same");
        // }else{
        //     System.out.println("Not same");
        // }
        // //example of above case
        // if(new String("titan")==new String("titan")){
        //     System.out.println("Same");
        // }else{
        //     System.out.println("Not same");
        // }

        //substring
        String sentence="My name is Devang";
        System.out.println(sentence.substring(11));
        System.out.println(sentence.substring(11,15));
        System.out.println(sentence.substring(3, sentence.length()));
        String name1 = sentence.substring(11);
        System.out.println(name1);

        //ParseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //ParseDouble Method of Double class
        String str1 = "123.45";
        double number1 = Double.parseDouble(str1);
        System.out.println(number1);

        //ToString Method of String class (INT TO STRING)
        int numb = 123;
        String strs = Integer.toString(numb);
        System.out.println(strs.length());




}
}