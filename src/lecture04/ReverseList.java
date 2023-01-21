package lecture04;

public class ReverseList {
    public static void main (String args[]){
        //Reverse the following list using for loop list1 = [10, 20, 30, 40, 50]

        int arr[]={10, 20, 30, 40, 50};
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
