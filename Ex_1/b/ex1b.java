import java.util.*;

class Quad{

    public static void main(String[] args){

        int a,b,c;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a value :");
        a = obj.nextInt();

        System.out.println("Enter b value :");
        b = obj.nextInt();

        System.out.println("Enter c value :");
        c = obj.nextInt();

        double result = (-b + Math.sqrt((Math.pow(b, 2)) - (4*(a*c))) / (2*a));

        System.out.println(result);







    }
}