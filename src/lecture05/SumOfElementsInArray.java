package lecture05;

public class SumOfElementsInArray {
    public static void main(String args []){
        //Write program to print sum of a given array elements

        int [] arr= {10, 55, 62,78, 3};
        int sum=0;
        for (int i=0; i< arr.length; i++){
           int currentNum=arr[i];
           sum=sum+currentNum;
        }
        System.out.println(sum);
    }
}
