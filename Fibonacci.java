import java.util.*;


public class Fibonacci {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("ENter n number ");
       int n = sc.nextInt();
      
       int first_number= 0, second_number=1;
       int next_num;

       for(int i=1;i<=n;i++){
        System.out.print(first_number +",");
        next_num=first_number+second_number;
        first_number=second_number;
        second_number= next_num;

       }
                     
       }
}   
