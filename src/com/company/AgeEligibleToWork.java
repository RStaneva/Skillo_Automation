package com.company;

import java.util.Scanner;

public class AgeEligibleToWork {
    public static void main (String Args[]){
        //2. Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible
        //to work. A person who is eligible to work must be older than or equal to 16 years old.
        //Example:
        //Enter your age: 16
        //You are eligible to work.

        System.out.println("Enter your age");
        Scanner scanner=new Scanner(System.in);
        int age= scanner.nextInt();
if (age<16) {
    System.out.println("You are not eligible to work");
}else {
    System.out.println("You are eligible to work");
}


    }
}
