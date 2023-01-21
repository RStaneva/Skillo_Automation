package lecture05;

public class DiagonalOfMatrix {
    public static void main(String args[]){
       // Find sum of the diagonal of a given 2d matrix with 4 rows and 4 columns

        int [][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
    };
        int principalDiagonal = 0, secondaryDiagonal = 0;
       for (int row=0; row< matrix.length; row++){
            for (int col=0; col< matrix.length; col++){
              if (row == col)
                    principalDiagonal += matrix[row][col];
                if ((row + col) == (matrix.length - 1))
                    secondaryDiagonal += matrix[row][col];
            }
        }
       System.out.println(" The sum of principal diagonal is: " + principalDiagonal);
       System.out.println(" The sum of secondary diagonal is: " + secondaryDiagonal);
            }
        }
