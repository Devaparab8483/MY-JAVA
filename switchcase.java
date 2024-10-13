import java.util.*;
public class switchcase {
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Button No.");
        int button =read.nextInt();
        switch(button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("welcome");
            break;
            default:System.out.println("Invalid input");
        }
    
}
}
