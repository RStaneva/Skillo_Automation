package lecture05;

public class Matrix2d {
    public static void main(String args[]){


    //Print elements of a given 2-d matrix with 4 rows and 3 columns
    int [] [] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12},
    };
    for (int row=0; row< 4; row++){
        for (int column=0; column<3; column++){
            System.out.println(matrix[row][column]);
        }
    }

    /* for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
        }
        System.out.println();

        for (int[] row : matrix) {
            for (int column = 0; column < row.length; col++) {
                System.out.printf("%d ", row[column]);
            }
        }*/
    }
}


