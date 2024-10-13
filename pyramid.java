import java.util.Scanner;

public class pyramid {
     public static void main(String args[]){
        Scanner rd = new Scanner(System.in);
            System.out.print("Enter n no.");
            int n =rd.nextInt();
            
            for(int i=1;i<=n;i++){

                // this loop for spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }

                // loop for print number and space in row
                for(int j=1;j<=i;j++){
                    System.out.print(i +" ");
                }

            System.out.println("");
            }

    }
}
