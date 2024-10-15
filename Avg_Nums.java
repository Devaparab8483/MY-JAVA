
import java.util.*;
public class Avg_Nums {
    public static int avg(int a, int b, int c){
        int avg= (a+b+c)/3;
        return avg;

    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = read.nextInt();
        System.err.print("Enter 2nd number ");
        int b= read.nextInt();
        System.out.print("enter 3rd Number: ");
        int c= read.nextInt();

        int result=avg(a,b,c);
        System.out.print("The avg  of " +a+ "," +b+ " and " +c+ " is " + result);



        
    }


}
