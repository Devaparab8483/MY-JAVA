///Taking an array as an input and printing its elements.
import java.util.*;
public class array_1 {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of array: ");
       int size = sc.nextInt();
       int numbers[] = new int[size];  // array declare

       //taking numbers in array
       System.out.print("Enter the number: ");
       for(int i=0; i<size; i++) {
           numbers[i] = sc.nextInt();
       }


       //print the numbers in array
       System.out.print("output: ");
       for(int i=0; i<numbers.length; i++) {
           System.out.print(numbers[i]+" ");
       }
   }
}
