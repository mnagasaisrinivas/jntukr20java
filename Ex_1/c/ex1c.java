import java.util.*;

class Speed{

    public static void main(String[] args) {

     int i=0 , j=0;
     int a[] = new int[5];

     Scanner obj = new Scanner(System.in);



     while(i < 5){

        System.out.println("Enter " + (i+1) + " speed : ");
        a[i] = obj.nextInt();

        i++;


     }


     double avg_speed = ( ( a[0] + a[1] + a[2] + a[3] + a[4] ) / 5 );

     System.out.println("Average speed is : " + avg_speed);

     for(j=0; j<5; j++){

        if(a[j] > avg_speed){

            System.out.println("Player " + (j+1) + " has qualified the race with speed of " + a[j]);
        }
     }
        
    }
}