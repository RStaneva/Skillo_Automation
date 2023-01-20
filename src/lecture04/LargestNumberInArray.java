package lecture04;

public class LargestNumberInArray {
    //4. Find the largest number from a given array and print it in a console. Hint: use for loop
    public static void main(String args[]) {
        int arr[] = {-10,-35, -4, 0};
        // int arr[]={ -10, -35, -4, 0};

        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }
        System.out.println("The largest number in the array is: " + maxNum);
    }
}

        /*int arr[]= {-10,-35, -4, 0};
//да сетнем макс нъмбъра на най-малкото число сред всички интегер числа.
        int maxNum= Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
        if( arr[i]>maxNum){
        maxNum=arr[i];
        }
        }*/



