package lecture06;

import java.util.Scanner;

    public class Methods {
        public static void main(String[] args) {

        }

        ////Write a Java method to find the smallest number among three numbers
        private static int findSmallestNum(int num1,int num2, int num3){
            int smallestNum=num1;
            if (smallestNum>num2){
                smallestNum=num2;
            }
            if (smallestNum>num3){
                smallestNum=num3;
            }
            return smallestNum;
        }

        //Write a Java method to compute the average of three numbers.
        private static double computeAverageNum( int num1, double num2, int num3){
            double sum=num1+num2+num3;
            return sum/3;
        }

        //Write a Java method to display the middle character of a string.
        //Note:
        //a) If the length of the string is even there will be two middle characters.
        //b) If the length of the string is odd there will be one middle character.
        private static void returnMiddleChar(String word){
            int size=word.length();
            boolean isEven= size%2==0;
            boolean isOdd=size%2!=0;
            if (isOdd){
                char letter=word.charAt(size/2);
                System.out.println(letter);;
            }else{
                char letter1=word.charAt(size/2-1);
                char letter2=word.charAt(size/2);
                System.out.printf("%c%c", letter1, letter2);
            }

            //Втори вариант с text.substring:
            /*private static void returnMiddleChar(String word){
            int position;
            int size;

            //If the length of the string is even there will be two middle characters.
            if (word.length() % 2 == 0) {
                position = word.length() / 2 - 1;
                length = 2;

            } else {
                //If the length of the string is odd there will be one middle character.
                position = value.length() / 2;
                length = 1;
            }

            System.out.println(value.substring(position, position + length));*/

        }

        //Write a Java method to count all words in a string.
        private static int countWords(String sentance) {
            sentance = sentance.trim();   //за да махнем всички празни места в началото и края, както и дублирани.
            int countSpaces = 0;
            int countWords = 0;
            for (int i = 0; i < sentance.length(); i++) {
                if (sentance.charAt(i) == ' ') {
                    countSpaces++;
                    countWords=countSpaces + 1;
                }
            }
            return countWords;
        }

        //Write a method named isEven that accepts an int argument. The method should return true if the
        //argument is even, or false otherwise
        private static boolean isEven(int num){
            //return num % 2 == 0;  //Този един ред замества целия код долу.

            boolean isEven=true;
            if (num%2==0){
                return isEven;
            }else{
                return !isEven;
            }
        }


        //A takes as input a non-negative integer and returns true if the number is a palindrome;
        //Non-negative integer is called a palindrome if it reads forward and backward in the same way. For
        //example, the numbers 5, 121, 3443, and 123454321 are palindromes

        private static boolean isPalindrome(){
            int remainder;
            int sum = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number ");

            int num = scanner.nextInt();

            if (num >= 0) {                               //Валидация за положително число
                int palindrome = num;                     //Създаваме променлива палиндром, на която присвояваме числото, подадено през конзолата

                while (palindrome > 0) {
                    remainder = palindrome % 10;           //Започваме да делим на 10 с остатък, защото така достъпваме всяка последна цифра
                    sum = (sum * 10) + remainder;
                    palindrome = palindrome / 10;
                }
                return num == sum;
            } else {
                System.out.println("The integer must be non-negative!");
                return false;
            }
        }


    }


