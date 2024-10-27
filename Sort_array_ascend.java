import java.util.*;

public class Sort_array_ascend {
   public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int number =rd.nextInt();

      int[] numbers = new int[number];

      System.out.print("Enter the number: ");
      for(int i=0; i<numbers.length; i++) {
         numbers[i] = rd.nextInt();
      }

      // Sort in ascending order
      Arrays.sort(numbers);
      String sortedArray = Arrays.toString(numbers);

      // Print sorted array
      
      System.out.println("Sorted array in ascending order: " + sortedArray);
   }
}
