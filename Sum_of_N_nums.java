import java.util.*;
public class Sum_of_N_nums {
    public static int Print_sums(int n){
    int sum=0;
    for(int i =1;i<=n;i++){
        //if(i%2 != 0){      Even odd condtion 
        sum= sum +i;
        //}
    }
    return sum;
    }
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = rd.nextInt();
        int sol = Print_sums(n);
        System.out.print("The sum of 1 to " + n + " is " +sol);
        
    }


}
