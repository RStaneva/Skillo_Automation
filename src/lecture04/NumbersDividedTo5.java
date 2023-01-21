package lecture04;

public class NumbersDividedTo5 {
    public static void main(String args[]){
        //Given a list iterate it and display numbers which are divisible by 5 and if you find number greater than 150 stop
        //the loop iteration list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200]

        int arr[] ={12, 15, 32, 42, 55, 75, 122, 160, 151,15, 180, 200};

        for (int i=0; i<arr.length; i++){
            int currentNum=arr[i];
            if (currentNum%5==0 && currentNum<150) {
                System.out.println(currentNum);
            }else if (currentNum>150){
                break;
            }
        }
    }
}
