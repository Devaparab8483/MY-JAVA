import java.util.*;
public class Pattern_7 {
    public static void main(String args[]){
        Scanner rd = new Scanner(System.in);
            System.out.print("Enter n no.");
            int n =rd.nextInt();
           
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j+" ");
                   
                }
                System.out.println(" ");

        }
    }
}