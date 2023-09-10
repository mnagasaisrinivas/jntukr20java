import java.util.*;

class bubble{

    public static void main(String[] args) {
        
        int arr[] = new int[10];
       

        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter " + (i+1) + " Element into the array : ");
            arr[i] = obj.nextInt();

        }

        bubble.mergeSort(arr);


        System.out.println("Sorted Array");

        for (int i =0 ; i < 10 ; i++){
            System.out.print(arr[i] + " ");
            
        }

    }


    static void mergeSort(int array[]) {

        int size = array.length;
    
   
        for (int i = 0; i < size - 1; i++){
    
      
            for (int j = 0; j < size - i - 1; j++){

       
                if (array[j] > array[j + 1]) {

          
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }
    }
    
}






    

