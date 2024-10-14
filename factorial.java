import java.util.*; 
public class factorial {
    public static  int factorial_val(int n) {
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        //System.out.println(fact);
        return fact; 
    }        

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        factorial_val(n); //function call
        System.out.println("Factorial of " + n + " is: " + factorial_val(n));


}
}
