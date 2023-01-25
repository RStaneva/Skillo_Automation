package lecture07;

import java.util.Scanner;
public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        double num2 = scanner.nextDouble();
        System.out.println("Result after division: " + num1 / num2);
    }


    public static double divideNumbers(int num1, double num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException | NumberFormatException exception) {
            throw new RuntimeException("Incorrect input! Please enter only numbers bigger than 0!");
        }
    }

}
