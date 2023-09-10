import java.util.Arrays;
import java.util.Scanner;


class Binary{

    int binarySearch(int array[], int x, int low, int high) {

         if (high >= low) {
      int mid = low + (high - low) / 2;

      
      if (array[mid] == x)
        return mid;

      
      if (array[mid] > x)
        return binarySearch(array, x, low, mid - 1);

     
      return binarySearch(array, x, mid + 1, high);
    }

    return -1;

    } 


    public static void main(String[] args) {
        
        int arr[] = new int[10];
       

        Scanner obj = new Scanner(System.in);
        Binary ob = new Binary();

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


       
        

        int index = ob.binarySearch(arr, search, 0, 9);

        if (index == -1) {

            System.out.println("Element not found in array");

        }
        else{


        
        System.out.println("Element found at array index " + index);

        }
    }

        

}
