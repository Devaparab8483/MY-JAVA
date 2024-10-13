import java.util.*;
public class Pattern_5 {
    public static void main(String args[]){
        Scanner rd = new Scanner(System.in);
            System.out.print("Enter n no.");
            int n =rd.nextInt();
           
            for(int i=1;i<=n;i++){
                // this for loop is for space print
                for(int j=1;j<=n-i;j++){
                    System.out.print("_");
                }
                //for loop is for * print
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println("");

        }
    }
}