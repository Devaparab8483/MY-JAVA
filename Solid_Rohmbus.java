import java.util.*;
public class Solid_Rohmbus {
    public static void main(String args[]){
        Scanner rd = new Scanner(System.in);
            System.out.print("Enter n no.");
            int n =rd.nextInt();
            
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }

            System.out.println("");
            }

    }
}

