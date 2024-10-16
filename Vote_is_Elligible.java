import java.util.*;
public class Vote_is_Elligible {
    public static boolean is_Elligible(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }

    }
    
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("ENter your Age: ");
        int age = rd.nextInt();
        System.out.print("Eligible for Voting " +is_Elligible(age));

    }

}
