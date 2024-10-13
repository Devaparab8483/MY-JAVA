import java.util.*;
public class multiplication_table {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.println("enter N no. of table:");
        int n= read.nextInt();
        int i=0;
        for(i=1;i<=10;i++){
            System.out.println(n*i);
        }
        

    }
}