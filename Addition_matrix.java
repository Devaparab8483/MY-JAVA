import java.util.*;
public class Addition_matrix{  
    public static void main(String args[]){  
    //creating two matrices    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();

    int matrix1[][] = new int[rows][cols];
    int matrix2[][] = new int[rows][cols];

    //input
    System.out.println("1st matrix: ");
    for(int i = 0; i < rows; i++){
        System.out.println("Enter the " + (i+1) + " rows number: ");
        for(int j = 0; j < cols; j++){
            matrix1[i][j] = sc.nextInt();
        }
    }

    System.out.println("2nd matrix: ");
    for(int i = 0; i < rows; i++){
        System.out.println("Enter the " + (i+1) + " rows number: ");
        for(int j = 0; j < cols; j++){
            matrix2[i][j] = sc.nextInt();
        }
    }
       
        
    //creating another matrix to store the sum of two matrices    
    int matrix3[][]=new int[rows][cols]; 
        
    //adding and printing addition of 2 matrices
    System.out.println("Addition of two matrices: ");
    for(int i=0;i<rows;i++){    
    for(int j=0;j<cols;j++){    
    matrix3[i][j]=matrix1[i][j]+matrix2[i][j]; 
    System.out.print(matrix3[i][j]+" ");   //use - for subtraction  
    }    
    System.out.println();//new line    
    }    
    }}  