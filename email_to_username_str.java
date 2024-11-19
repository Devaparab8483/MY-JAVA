import java.util.*;
public class email_to_username_str {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Email ID : ");
    String email = sc.next();
    int atIndex = email.indexOf('@');
    String username = email.substring(0, atIndex);
    System.out.println("Username is : " + username);
}
}
