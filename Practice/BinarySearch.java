import java.util.*;
public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        System.out.print("ENTER ELEMENT TO SEARCH : ");
        int key = obj.nextInt();
        int low = 0;
        int high = arr.length - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == key)
            {
                System.out.println("ELEMENT FOUND AT INDEX : " + mid);
                return;
            }
            else if(key < arr[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        System.out.println("ELEMENT NOT FOUND");
    }
}