import java.util.*;
public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int[] arr = {10,20,30,40,50};

        System.out.print("ENTER ELEMENT TO SEARCH : ");
        int key = obj.nextInt();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                System.out.println("ELEMENT FOUND AT INDEX : " + i);
                return;
            }
        }

        System.out.println("ELEMENT NOT FOUND");
    }
}