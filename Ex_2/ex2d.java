import java.util.Scanner;


class Buffer {

    public static void main(String[] ags){

        StringBuffer str = new StringBuffer();
        int r, n;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a String or a word : ");
            str.append(s.nextLine());
            System.out.println();

            System.out.println(str);

            System.out.println("Enter index range of the characters you want to delete : ");
            r = s.nextInt();
            n = s.nextInt();
        }

        str.delete(r, n);


        System.out.println(str);







        


    }
    
}
