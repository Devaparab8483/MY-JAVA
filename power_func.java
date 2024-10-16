import java.util.*;

// this is for X^n
public class power_func {
   public static void main(String args[]) {
       System.out.print("Enter x ");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.print("Enter n ");
       int n = sc.nextInt();


       int result = 1;
       //Please see that n is not too large or else result will exceed the size of int

       for(int i=0; i<n; i++) {
           result = result * x;
       }

        // double base = 2;
        // double exponent = 3;
        // Calculating 2 raised to the power of 3
        // double result = Math.pow(base, exponent);


       System.out.println("x to the power n is : "+ result);
   }   
}


