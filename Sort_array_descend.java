import java.util.*;

public class Sort_array_descend {
   public static void main(String[] args) {
    Scanner rd = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int numb =rd.nextInt();

      Integer[] numbers = new Integer[numb];

      System.out.print("Enter the number: ");
      for(int i=0; i<numbers.length; i++) {
         numbers[i] = rd.nextInt();
      }

      // Sort in descending order
      Arrays.sort(numbers, Collections.reverseOrder());

      String sortedArray = Arrays.toString(numbers);  // convert it into string

      // Print sorted array
      
      System.out.println("Sorted array in descending order: " + sortedArray);
   }
}
