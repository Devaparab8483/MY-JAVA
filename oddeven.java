import java.util.*;
public class oddeven {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether no. is odd or even");
        System.out.println("Enter Number:");
        int no = sc.nextInt();
        if(no % 2 == 0)
            System.out.println( +no+ " is Even");
        
        else
            System.out.println( +no+ " is odd");
        
    }
}
