package lecture02;

import java.util.Scanner;

public class TunedArea {
    public static void main (String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write a base value");
        int base=scanner.nextInt();
        System.out.println("Write a height value");
        double height=scanner.nextDouble();

        double area= 0.5*base*height;
        System.out.println("The area of a triangle is: "+area);
    }
}
