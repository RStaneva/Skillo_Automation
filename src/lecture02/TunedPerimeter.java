package lecture02;

import java.util.Scanner;

public class TunedPerimeter {
    public static void main (String args[]){
        Scanner scanner= new Scanner(System.in);
        int a= Integer.parseInt(scanner.nextLine());
        double b= Double.parseDouble(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        double perimeter= a+b+c;
        System.out.println(perimeter);
    }
}
