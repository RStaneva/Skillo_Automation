package lecture05;

public class BiggestNumInArray {
    public static void main(String args[]) {
        //Find biggest element of an array and print it in the console
        int [] arr = {-12, -100, -52, -41,-999, 0};
        int currentNum=0;
        for(int i: arr){
            if (i>currentNum){
                currentNum=i;
            }
        }
        System.out.println("The Biggest number is: "+ currentNum);
    }
}