import java.util.*;

public class search_element_2D {
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


       System.out.print("Enter the number to search: ");
       int x = sc.nextInt();

       
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
               //compare with x
               if(numbers[i][j] == x) {
                   System.out.println(+x+ " found at location (" + (i+1) + ", " + (j+1) + ")");
               }
           }
       }
   }
}
