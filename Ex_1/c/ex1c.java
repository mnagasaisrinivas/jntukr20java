import java.util.*;

class Speed{

    public static void main(String[] args) {

     int i=0, a[];

     Scanner obj = new Scanner(System.in);



     while(i < 5){

        System.out.println("Enter " + (i+1) + " speed : ");
        a[i] = obj.nextInt();


     }


     double avg_speed = ( ( a[0] + a[1] + a[2] + a[3] + a[4] ) / 5 );
        
    }
}