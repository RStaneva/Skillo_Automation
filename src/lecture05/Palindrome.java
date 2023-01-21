package lecture05;

import java.util.Scanner;

public class Palindrome {
    //Write a program which validate whether given string is palindrome (A palindrome is a sequence of characters which reads
    //the same backward as forward, such as madam or racecar)

    public static void main(String args []){
        Scanner scan=new Scanner(System.in);
        String word= scan.nextLine();

        String reversedWord = "";
        boolean isPalindrome = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
            //reversedword=""(i=4=m)= "m"
            //reversedword="m"+(i=3=a)="ma"
            //reversedword="ma"+(i=2=d)="mad"...
        }
        // Checking if both the strings are equal
        if (word.equals(reversedWord)) {
            isPalindrome = true;
        }

        System.out.println("The String is palindrome: " + isPalindrome);
    }
}
