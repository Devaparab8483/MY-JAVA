import java.util.Scanner;

public class function {
        //A METHOD to calculate sum of 2 numbers - a & b
        public static void sum(int a, int b) {
            int sum = a + b;
            System.out.println("total sum " +sum);
        }
       
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enterfirstnumber:" );
            int a = sc.nextInt();
            System.out.print("entersecondnumber:");
            int b = sc.nextInt();
            sum(a,b); // Function Call
     
        }
     }
     

