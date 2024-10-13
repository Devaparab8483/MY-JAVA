import java.util.*;
public class elseif {
    public static void main (String[] args){
    Scanner read = new Scanner(System.in);
    System.out.println("Enter value of a");
    int a =read.nextInt();
    System.out.println("Enter value of b");
    int b = read.nextInt();
    if(a==b)
        System.out.println("a and b are equal");
    else if(a<b)
        System.out.println("A is lesser than B");
    else{
        System.out.println("A is greter than B");
    }

}
}
