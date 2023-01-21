package lecture04;

import java.util.Scanner;

public class Revenue {

    /*Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product
    input by the user. The discount rate is 15% for the quantity purchased between 100 and 120 units, and 20% for
    the quantity purchased greater than 120 units. If the quantity purchased is less than 100 units, the discount rate
    is 0%. See the example output as shown below:
    Еnter unit price: 25
    Enter quantity: 110
    The revenue from sale: 2337.5$
    Discount: 412.5$(15.0%)*/
    public static void main(String[]Args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter unite price : ");
        double unitPrice= scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity= scanner.nextInt();
        char dollar='$';
        double amount=unitPrice*quantity;
        double revenue=0;
        double discount=0;
        String percent="";
        if (quantity>120){
            percent= "(20.0%)";
            discount=amount*0.2;
            revenue=amount- discount;
            System.out.println("The revenue from sale: " +revenue + "$");
        }else if (quantity >=100 && quantity <=120){
            percent= "(15.0%)";
            discount= amount*0.15;
            revenue=amount-discount;
        }else{
            percent= "(0%)";
            revenue=amount;
        }
        System.out.println("The revenue from sale: " +revenue + "$");
        System.out.println("Discount: "+ discount+ dollar +percent);
    }
}
