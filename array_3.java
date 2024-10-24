/// same code as array .. this file is for practice
import java.util.*;
public class array_3 {
    public static void main(String[] args) {
        Scanner rd =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=rd.nextInt();

        String names[]=new String[size];

        //input
        System.out.print("Enter names: ");
        for(int i=0;i<size;i++){
            names[i]=rd.next();
        }

        for(int i=0;i<size;i++){
            System.out.println("name "+(i+1)+" is "+names[i]);
        }
    }

}
