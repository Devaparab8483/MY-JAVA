import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner rd= new Scanner(System.in);
        System.out.print("Enter The Number ");
        int num = rd.nextInt();

        int reversed_num=0,temp=num;
        while (temp > 0) {
            int remainder = temp % 10;
            reversed_num = reversed_num * 10 + remainder;
            temp= temp/10;
        }
        System.out.println("The Reversed number is: "+reversed_num);
        if (num== reversed_num)
        System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not palindrome");


    }
}
