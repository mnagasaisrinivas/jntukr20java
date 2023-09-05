import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

class Binary{

    public static void main(String[] args) {
        
        int arr[] = new int[10];

        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter " + (i+1) + " Element into the array : ");
            arr[i] = obj.nextInt();

        }

        Arrays.sort(arr);

        System.out.println("Enter Search Element");
        int search = obj.nextInt();


        System.out.println("Sorted Array");

        for (int i =0 ; i < 10 ; i++){
            System.out.print(arr[i] + " ");
            
        }

        System.out.println();


        int mid = 0;
        int low = 0;
        int high = 9;

        while(low <= high) {

            mid = Math.floorDiv((high - low) ,2);

            
            

            if (arr[mid] < search) {

                high = mid - 1;
            }

            if (arr[mid] > search) {

                low = mid + 1;
            }

            if (arr[mid] == search) {

                break;

            }    





        }

        System.out.println("Element found at array index " + mid);


    }
}