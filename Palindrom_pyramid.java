import java.util.Scanner;

public class Palindrom_pyramid {
     public static void main(String args[]){
        Scanner rd = new Scanner(System.in);
            System.out.print("Enter n no.");
            int n =rd.nextInt();
            
            for(int i=1;i<=n;i++){

                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // ****** 1st half numbers****
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                // 2nd half number
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
            System.out.println("");

            }


            }

    }


