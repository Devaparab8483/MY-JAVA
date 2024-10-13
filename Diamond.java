import java.util.Scanner;

public class Diamond {

     public static void main(String args[]){
        Scanner rd = new Scanner(System.in);
            System.out.print("Enter n no.");
            int n =rd.nextInt();

        for(int i=1;i<=n;i++){

        // this loop for spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }

        //alternate logic ..here direct odd no. satr print 2*n-1 formula use
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        // // 1st half
        // for(int j=1;j<=i;j++){
        //     System.out.print("*");
        // }
        // // second half
        // for(int j=2;j<=i;j++){
        //     System.out.print("*");
        // }

    System.out.println("");
    }

    // ulta pattern..180 degree niche print karnar...same vrch code khali copy.
    // only outer loop change karayche
    for(int i=n;i>=1;i--){

        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }

        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }

        // // 1st half
        // for(int j=1;j<=i;j++){
        //     System.out.print("*");
        // }
        // // second half
        // for(int j=2;j<=i;j++){
        //     System.out.print("*");
        // }

    System.out.println("");
    }


}
}
