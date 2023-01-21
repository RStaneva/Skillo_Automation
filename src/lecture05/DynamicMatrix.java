package lecture05;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicMatrix {
    public static void main (String args []){
        //Print elements of a given 2-d matrix with dynamic rows and columns taken from user input

        Scanner scanner=new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows= scanner.nextInt();
        System.out.print("Number of columns: ");
        int cols= scanner.nextInt();

        int [][] matrix= new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("matrix[%d,%d] = ", row, col);
                matrix[row][col] = scanner.nextInt();
            }
        }
        System.out.println("The matrix is created: " + Arrays.deepToString(matrix));

    }
}
