import java.util.*;


public class DIVISION_FUNC {

    public static int divide(int num1, int num2) {
        return (num1 / num2);
    }
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1 = rd.nextInt();
        System.out.println("Enter the 2nd Number: ");
        int num2 = rd.nextInt();
        int result = divide(num1, num2);
        System.out.println("The result is: " + result);
}
}