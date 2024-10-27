import java.util.*;
public class check_sorted_array {
    public static void main(String[] args) {
        Scanner rd= new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size=rd.nextInt();

        int[] numbers = new int[size];  

        System.out.print("Enter the number: ");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = rd.nextInt();
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false;
            }
            if (numbers[i] < numbers[i + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else if (isDescending) {
            System.out.println("The array is sorted in descending order.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
