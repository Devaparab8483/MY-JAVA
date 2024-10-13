import java.util.*;
public class sum_N_natural {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.println("enter N natural no.:");
        int a= read.nextInt();
        int sum=0;
        int i =0;
        for(i=0;i<=a;i++){
            sum=sum +i;
        }
        System.out.println("The sum of " +a+ " naturals no. is " +sum);

    }
}
