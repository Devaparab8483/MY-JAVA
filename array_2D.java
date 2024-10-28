import java.util.*;


public class array_2D {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number of rows: ");
       int rows = sc.nextInt();
       System.out.print("Enter Number of columns: ");
       int cols = sc.nextInt();


       int[][] numbers = new int[rows][cols];


       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           System.out.println("Enter the " + (i+1) + " rows number: ");
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }

       System.out.print("2D matrix : ");
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                   System.out.print(numbers[i][j]+" ");
               }
               System.out.println();
           }
   }
}
