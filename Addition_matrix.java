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
    for(int i = 0; i < rows; i++){
        System.out.println("Enter the " + (i+1) + " rows number: ");
        for(int j = 0; j < cols; j++){
            matrix1[i][j] = sc.nextInt();
        }
    }

    for(int i = 0; i < rows; i++){
        System.out.println("Enter the " + (i+1) + " rows number: ");
        for(int j = 0; j < cols; j++){
            matrix2[i][j] = sc.nextInt();
        }
    }
       
        
    //creating another matrix to store the sum of two matrices    
    int matrix3[][]=new int[rows][cols];  //3 rows and 3 columns  
        
    //adding and printing addition of 2 matrices    
    for(int i=0;i<rows;i++){    
    for(int j=0;j<cols;j++){    
    matrix3[i][j]=matrix1[i][j]+matrix2[i][j];    //use - for subtraction  
    System.out.print(matrix3[i][j]+" ");    
    }    
    System.out.println();//new line    
    }    
    }}  