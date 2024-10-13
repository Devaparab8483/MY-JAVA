import java.util.*;
public class Pattern_9 {
    public static void main(String args[]){
        Scanner rd = new Scanner(System.in);
            System.out.print("Enter n no.");
            int n =rd.nextInt();
            // int num =1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                    int sum=i+j;
                    if(sum %2 ==0)
                        System.out.print("1");
                    else{
                        System.out.print("0");   
                    }

                }
                System.out.println(" ");

        }
    }
}
