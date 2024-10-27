public class check_sorted_array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};  // Example array

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
