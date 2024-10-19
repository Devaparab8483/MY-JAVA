import java.util.Scanner;

public class Prime_check {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = rd.nextInt();

        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;  // Not prime if divisible by i
                    break;  // No need to check further if it's already divisible
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

    }
}