package lecture04;

import java.util.Scanner;

public class Vacation {
    public static void main(String args[]){
        /*Write a program which advices the user where to go to a vacation based on the type of the vacation and the
        budget. There should be two options – Beach, Mountain. If the user put a different value then the program
        should print a message that there is no information about this type of vacation. Budgets are considered per
        day per person. If the budget per day for Beach type vacation is smaller than 50 then the program should
        advise Bulgaria as a destination, otherwise Outside Bulgaria. If the budget per day for Mountain type vacation
        is smaller than 30 then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria*/

Scanner scanner=new Scanner(System.in);
        System.out.println("Type of vacation: Beach or Mountain: ");
        String typeOfVacation= scanner.nextLine();
        System.out.println("Type how many days you'd like to spend: ");
        int dayQuantity= scanner.nextInt();
        System.out.println("Type how many persons will go: ");
        int personQuantity= scanner.nextInt();
        System.out.println("Type what is the budget per day per a person: ");
        int dayBudget= scanner.nextInt();

        switch(typeOfVacation){
            case "Beach":
                String result=dayBudget<50? "Bulgaria": "Outside Bulgaria";
                System.out.println(result);
                break;
            case "Mountain":
                String result2=dayBudget<30? "Bulgaria": "Outside Bulgaria";
                System.out.println(result2);
                break;
            default:
                System.out.println("There is no information about this type of vacation.");
            }
        }
    }

