import java.util.*;
public class getGreater {
    public static int GreatNO(int a,int b){
        if(a<b){
            return a;
        }
        else;
        {
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = rd.nextInt();
        System.out.print("Enter number b : ");
        int b = rd.nextInt();

        int res=GreatNO(a, b);
        System.out.print("the greater no is " +res);
    }

}
