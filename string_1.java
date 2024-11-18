
import java.util.Scanner;

public class string_1 {
    public static void main(String[] args) {
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
        String fullName = firstName + " " + secondName;
        System.out.println(fullName.length());

}
}