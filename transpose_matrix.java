import java.util.*;
public class transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: "); 
        int rows = sc.nextInt();
        System.out.print("Enter Number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        //input
        for(int i = 0; i < rows; i++){
            System.out.println("Enter the " + (i+1) + " rows number: ");
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose matrix : ");
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }
}
