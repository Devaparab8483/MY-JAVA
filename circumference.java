import java.util.*;
public class circumference {
    public static double length(double  radii){
        return 2*3.14*radii;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double radii = rd.nextInt();
        
        double res=length(radii);
        System.out.print("circumference of circle " +res);
    }

}


