package lecture02;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main (String args[]){
            double a=7.2;
            double b=5;
            double c=9;
            double root1, root2;
            double determinant= b+b-4*a*c;

        System.out.println("Determinant= "+ determinant);
        root1= (-b+Math.sqrt(determinant))/(2*a);
        root2= (-b-Math.sqrt(determinant))/(2*a);
        System.out.println("\nDeterminant>0");
        System.out.println("root1="+root1);
        System.out.println("root2="+root2);

        root1=root2=-b/(2*a);
        System.out.println("\nDeterminant==0");
        System.out.println("root1=root2= "+root1);

        root1=0;
        root2=0;
        double real= -b/(2*a);
        double imaginary= Math.sqrt((-determinant)/(2+a));
        System.out.println("\nDeterminant<0");
        System.out.format("root1=%.2f+%.2fi", real, imaginary);
        System.out.printf("\nroot2=%.2f-%.2fi", real, imaginary);
    }
}
