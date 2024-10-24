import java.util.*;


public class LCM {
    public static int Findgcd(int n1,int n2){
        int gcd=1;
        for (int i=1;i<=n1 && i<=n2;i++){
            if (n1 % i==0 && n2 % i==0){
            gcd=i;
            }
        }
        return gcd;
    }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first number ");
       int n1 = sc.nextInt();
       System.out.print("enter Second number ");
       int n2 = sc.nextInt();

       int ans=(n1*n2)/Findgcd(n1, n2);                 //LCM = (a*b)/gcd
       System.out.println("LCM is : " +ans);
   }   
}
