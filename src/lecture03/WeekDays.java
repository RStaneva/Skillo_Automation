package lecture03;

import java.util.Scanner;

public class WeekDays {
        public static void main (String[] Args){
            //Write a program to print the days of the week based on the user digit 1-7 input. The message should be “The
            //[user input digit]-st/nd/rd/th day of the week is [the day of the week]” Hint: Use switch-case.

            System.out.println("Enter a number for the week day between 1 to 7");
            Scanner scanner= new Scanner(System.in);
            int day= scanner.nextInt();

            switch (day)
            {
                case 1:
                    System.out.printf ("The %d-st day of the week is Monday", day);
                    break;
                case 2:
                    System.out.printf ("The %d-nd day of the week is Tuesday", day);
                    break;
                case 3:
                    System.out.printf ("The %d-rd day of the week is Wednesday", day);
                    break;
                case 4:
                    System.out.printf ("The %d-th day of the week is Thursday", day);
                    break;
                case 5:
                    System.out.printf ("The %d-th day of the week is Friday", day);
                    break;
                case 6:
                    System.out.printf ("The %d-th day of the week is Saturday", day);
                case 7:
                    System.out.printf ("The %d-th day of the week is Sunday" , day);
                    break;
                default:
                    System.out.println ("Invalid number. Please enter a number between 1 to 7");
                    break;
            }

        }
    }


