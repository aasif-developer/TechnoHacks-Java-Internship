import java.util.*;

public class demo4
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF ARRAY ELEMENTS : ");
        int n = obj.nextInt();

        int[] arr = new int[n];

        System.out.println("ENTER THE ARRAY ELEMENTS");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = obj.nextInt();
        }

        System.out.println("THE ARRAY ELEMENTS ARE : ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        obj.close();
    }
}e