import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

class Quad{

    public static void main(String[] args){

        int a,b,c;
        double D,r1,r2;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a value :");
        a = obj.nextInt();

        System.out.println("Enter b value :");
        b = obj.nextInt();

        System.out.println("Enter c value :");
        c = obj.nextInt();

        D = b * b - 4 * a * c;

        if(D > 0) {
            System.out.println("Roots are real and unequal");
            r1 = ( - b + Math.sqrt(D))/(2*a);
            r2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("First root is:"+r1);
            System.out.println("Second root is:"+r2);
        }

        else if(D == 0) {
            System.out.println("Roots are real and equal");
            r1 = (-b+Math.sqrt(D))/(2*a);
            System.out.println("Root:"+r1);
        }

        else {
            System.out.println("Roots are imaginary");
        }

        
        





    }
}