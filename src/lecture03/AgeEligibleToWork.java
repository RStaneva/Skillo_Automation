package lecture03;

import java.util.Scanner;

public class AgeEligibleToWork {
        public static void main (String Args[]){
            /*
            2. Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible
            to work. A person who is eligible to work must be older than or equal to 16 years old.
            Example:
            Enter your age: 16
            You are eligible to work.
            System.out.print("Enter your age: ");
            */

 Scanner scanner=new Scanner(System.in);
            System.out.print("Write your age: ");
 int age= scanner.nextInt();

 // Decision 1 with else if construction:
 /*
 if (age<16) {
     System.out.println("You are not eligible to work");
 }else {
     System.out.println("You are eligible to work");
 }
*/

            /* Decision 2 with booleans:
            boolean isEligibleToWork=age>=16;
            boolean isNotEligibleToWork= age<=16;
            String eligibleToWork= "You are eligible to work";
            String notEligibleToWork= "You are not eligible to work";
            if (isEligibleToWork){
                System.out.println(eligibleToWork);
            }else{
                System.out.println(notEligibleToWork);
            } */



            //Decision 3 with Ternary operator:

            boolean isEligible=age>=16;
            String eligibleToWork= "You are eligible to work";
            String notEligibleToWork= "You are not eligible to work";
            String result=(isEligible)?eligibleToWork:notEligibleToWork;
            System.out.println(result);

        }}
